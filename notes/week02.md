# Week 02 — Collections and their costs

## O que estudei
- Por que usar `TreeMap` (09/nov): ele responde perguntas de ordem (próximo, anterior, faixa, primeiro, último). O `HashMap` só acha chave exata; para "próximo evento a partir de hoje" teria de varrer tudo, O(n)
  - `ceilingKey(d)`: menor chave ≥ d ("arredonda para cima"). Na descida: chave ≥ d é candidata, vai para a esquerda; chave < d, vai para a direita
  - `floorKey(d)`: maior chave ≤ d; `lowerKey(d)`: maior chave < d; `higherKey(d)`: menor chave > d
  - Um nó por nível, altura ~log₂ n: O(log n)
- Porquê da tabela de Big-O, `ArrayList` e `LinkedList` (09/nov)
  - `ArrayList.get(i)` O(1): memória contígua, endereço = início + i × tamanho (ex.: 1000 + 5 × 4 = 1020), uma conta para qualquer i
  - `LinkedList.get(i)` O(n): cada nó aponta para o próximo, é preciso seguir os ponteiros
  - `add` no fim: `ArrayList` escreve na próxima posição livre (amortizado); `LinkedList` tem o campo `last`
  - `add(0, x)`: `ArrayList` desloca tudo para a direita, O(n); `LinkedList` faz o nó novo apontar para o primeiro, O(1)
  - `contains` O(n) nas duas: sem hash nem ordem, compara com `equals` um por um
- `DynamicArray` test-first (09/nov), em `dev.breno.labs.week02`
  - Campos: o array e o `size`. Capacidade = `array.length`
  - `size` decide quais `get` são válidos e é o índice do próximo `add`: `array[size] = x`, depois `size++`
  - Array Java tem tamanho fixo. Crescer = alocar um maior, copiar com `for` para o mesmo índice, apontar o campo para o novo
  - Cresce só quando cheio (`size == array.length`) e dobra. Capacidade 0 precisa de tratamento à parte, sem mexer no `size`
  - Mesmo padrão do resize do `SimpleHashMap`; diferença: no array o índice se mantém, no hash map o balde é recalculado
- JUnit 5 cria uma instância nova da classe de teste por método: campo na classe de teste não vaza estado
- LeetCode: #1 Two Sum revisado do zero em 09/nov (D+10). Guarda complemento → índice e checa antes do `put`. O(n) tempo, O(n) espaço
- Porquê da tabela de Big-O, as 4 linhas restantes (10/nov)
  - `HashMap`: hash da chave → índice do balde → poucos nós: O(1) em média. `containsKey` é o mesmo caminho do `get`; `containsValue` é O(n) (valor não tem hash)
  - `HashSet`: é um `HashMap` por dentro. Elemento = chave, valor = o mesmo objeto `PRESENT` para todos. `add` → `put`, `contains` → `containsKey`, `remove` → `remove`: O(1). "Não repete" vem de graça: chave de mapa é única; `add` repetido devolve `false` porque o `put` devolve o valor antigo
  - Checagem de coerência: se o `add` confere duplicata, ele não pode custar menos que o `contains`
  - `TreeMap`: balanceada, altura ~log₂ n, desce um nó por nível: O(log n)
  - `ArrayDeque`: array circular com índices `head`/`tail` que dão a volta; pontas O(1) (`addLast` amortizado, cresce), `contains` O(n) (sem hash nem ordem)
- LeetCode: #217 revisado do zero em 10/nov (D+10). O(n) porque são n `contains` de O(1); com `ArrayList` seria O(n²)
- Amortizado O(1) no papel (10/nov)
  - Custo de um redimensionamento = `size` cópias (o laço `i < size`), não 1
  - Dobrando, 16 `add`s: 2 + 4 + 8 = 14 cópias, < 1 por `add`. São ~log₂ n redimensionamentos, mas a soma 2 + 4 + … + n/2 = n − 2 < n
  - +1, 16 `add`s: 0 + 1 + … + 15 = 120 (8 pares de 15); em geral n(n−1)/2 ≈ n²/2, ou seja ≈ n/2 por `add`: O(n)
  - Intuição: depois de copiar k, sobram k posições livres, k `add`s baratos que pagam as cópias
  - Refatoração: o caso vazio não precisa de caminho próprio, o laço de cópia roda 0 vezes com `size` 0. Só a nova capacidade muda. Não é bug, é duplicação: toda mudança mexeria em 2 lugares
- `new T[10]` não compila (10/nov): array guarda o tipo do elemento em tempo de execução (`Object[] o = new String[3]; o[0] = 42;` → `ArrayStoreException`) e o `T` é apagado (*type erasure*). `ArrayList<E>` usa `Object[]` + cast `(E)` no `get`; o cast é seguro porque só o `add(E)` põe elementos. O `new Node[4]` do `SimpleHashMap` é o mesmo contorno (tipo cru)
- Resize do `DynamicArray` vs do `SimpleHashMap` (10/nov)
  - Igual: guarda a referência do antigo, aloca o dobro, move tudo, o campo aponta para o novo; os dois ficam O(1) amortizado
  - Gatilho: o array enche de verdade; o hash map nunca enche, só fica lento (baldes longos), por isso cresce a 75%
  - Movimento: o array copia para o mesmo índice; o hash map refaz o `put` (rehash), porque o índice depende da capacidade (`floorMod`)
  - `oldArray = array` copia a **referência**, não o array

## Consigo explicar sem consultar (perguntas do diagnóstico)
- [x] Por que `array[i]` é O(1) *09/nov: memória contígua sem dica e a conta do endereço sozinho.*
- [ ] Por que usar `TreeMap` se ele é O(log n) *09/nov: "ordenado, red-black balanceada", mas não disse para que serve a ordem. Os caminhos de `ceilingKey` e `floorKey` saíram certos depois de explicado.*
- [ ] O que acontece no `add` quando o `DynamicArray` está cheio *09/nov: "cria um novo com o dobro da capacidade e copia os itens", mas na ordem trocada (disse copiar antes de criar) e sem a troca da referência. 10/nov: ordem certa e com a troca da referência ("não uma cópia"), sem dizer "o dobro".*
- [ ] Por que o `add` é O(1) amortizado *10/nov: não saiu na explicação final. No papel, contou redimensionamentos em vez de cópias; com o desenho do laço, fez a conta do dobrar sozinho. Fecha no "em voz alta" do dia 6.*
- [ ] O que há dentro do `HashSet` *10/nov: "um array em que os números não se repetem". Explicado (`HashMap` + `PRESENT`); a checagem rápida saiu certa.*
- [x] Por que `new T[10]` não compila *10/nov: explicado; o porquê do cast seguro no `ArrayList` saiu sozinho.*

## Errei na página em branco
- (código do dia, não página em branco) `DynamicArray`:
  - `array = new int[size + 1]` a cada `add` sem copiar: array novo zerado, só o último elemento sobra
  - Capacidade 0: fez `size = 1` para conseguir dobrar → `size` mentindo e AIOOBE na cópia (`oldArray[0]` com tamanho 0). Misturou size e capacidade
  - Teste com `get(1)` repetido no lugar de `get(2)`
  - Teste de 100 elementos com valor = índice: não pega um `get` que devolve o índice
- Two Sum D+10 criado em `leetcode/arrayshashing/` (fora do `src`), sem `package` nem imports
- (aquecimento, 10/nov) `HashMap.containsKey` O(n); `HashSet.remove` e `contains` O(n): de novo o erro de 06/nov, achar que remover/procurar precisa varrer
- (papel, 10/nov) Contou redimensionamentos como custo 1, em vez das `size` cópias de cada um
- (checagem, 10/nov) Explicou o `equals` pelo `put` (sobrescrever) quando a pergunta era o `get` (achar o nó certo entre chaves que dividem o balde)

## Dúvidas para levar ao tutor (IA)
- ~~`int[]` ou `DynamicArray<T>`? Por que `new T[10]` não compila~~ *Respondida em 10/nov; a conversão do código fica para a semana 3.*
