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
- LeetCode #242 Valid Anagram (11/nov), sozinho em ~29 min
  - Tamanhos diferentes → `false`. Conta as letras de `s` num `HashMap<Character, Integer>`, desconta as de `t`; se a contagem já é 0, `false`
  - O `return true` no fim é seguro por causa do teste de tamanho: soma n, desconta n, nenhuma negativa → todas 0. Sem ele, `("aab", "ab")` daria `true`
  - `s.toLowerCase()` dentro do laço: `String` é imutável, cada chamada copia n letras → O(n²). Contar o custo das chamadas no laço
  - Espaço O(1): o mapa tem uma chave por letra distinta (no máximo 26), não cresce com n. Com qualquer Unicode, O(k)
  - Final: O(n) tempo, O(1) espaço. Ordenar as duas strings seria O(n log n)
- `getOrDefault(chave, padrao)` (11/nov): devolve o valor, ou o padrão se a chave não existe, sem inserir nada. `map.put(c, map.getOrDefault(c, 0) + 1)` troca o `if/else` com `containsKey`. Sem ele, `get` devolve `null` e `null + 1` lança NPE
- Testes (11/nov)
  - Teste que só espera `true` passa com `return true;`: precisa de um caso `false`
  - Vermelho depois de refatorar: o código quebrou, ou o contrato mudou (tirar o `toLowerCase()` fez `'B'` ≠ `'b'`; seguir o enunciado, só minúsculas, e trocar o teste)
  - Saída sem ordem (#49): normalizar os dois lados com um helper. Ordenar uma **cópia** de cada grupo (`List.of` é imutável) e pôr os grupos num `HashSet` (`List` tem `equals`/`hashCode` pelo conteúdo). Grupo não vira `Set`: `["", ""]` perderia o repetido
- Lab das 100k inserções (12/nov), `InsertLab` em `dev.breno.labs.week02`. 2ª rodada: fim `ArrayList` 5 ms / `LinkedList` 2 ms; começo 408 ms / 5 ms; meio 195 ms / 4.330 ms
  - Medir: `System.nanoTime()` antes e depois (feito para durações; `currentTimeMillis()` é relógio de parede e pode pular), dividir por 1.000.000 para ms
  - Aquecer antes (a JVM começa interpretando; o JIT compila o código quente depois) e usar o resultado (imprimir o `size()`), senão o JIT pode jogar o laço fora
  - `LinkedList.add` no meio é O(n): religar é O(1), mas antes precisa chegar no nó (o JDK anda da ponta mais perto, ~n/2). É duplamente ligada (`next` + `prev`)
  - `ArrayList` no meio ~metade do começo: desloca n/2 em vez de n
  - Mesmo Big-O, constante diferente: os dois fizeram ~2,5 bi de passos; `ArrayList` ~0,08 ns por elemento (cópia de bloco contíguo), `LinkedList` ~1,7 ns por nó (salta pela memória)
  - Por quê: a CPU lê 64 bytes por vez (linha de cache) e pré-carrega a próxima; cache ~1 ns, RAM ~100 ns. Na lista ligada só se sabe o próximo endereço depois de ler o nó atual (perseguir ponteiros)
  - Array do `ArrayList` e nós da `LinkedList`: os dois no heap. A diferença é contíguo vs espalhado
  - Escala: uma inserção simples custa dezenas de ns, não ms

## Consigo explicar sem consultar (perguntas do diagnóstico)
- [x] Por que `array[i]` é O(1) *09/nov: memória contígua sem dica e a conta do endereço sozinho.*
- [x] Por que o `HashMap.get` precisa do `equals` *12/nov: sozinho, pelo `get`: colisões dividem o balde, compara cada chave com `equals` (`==` compara referência).*
- [ ] Por que `LinkedList` perde do `ArrayList` no meio, sendo os dois O(n) *12/nov: "anda nó por nó"; o porquê da memória só depois de explicado.*
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
- (#242, 11/nov) 1º teste só com o caso `true`; `toLowerCase()` no laço chamado de O(n) (era O(n²)); espaço O(n) (era O(1)); não sabia usar `getOrDefault`
- (#49, 11/nov) Não sabia escrever um assert que ignora a ordem (normalizar)
- (checagem, 10/nov) Explicou o `equals` pelo `put` (sobrescrever) quando a pergunta era o `get` (achar o nó certo entre chaves que dividem o balde)
- (revisão, 12/nov) `LinkedList.add` no meio O(1): só contou a troca de ponteiros
- (lab, 12/nov) Previu 1 ms por inserção (é ~20 ns); previu `LinkedList` mais rápida no meio (foi ~22× mais lenta); disse "array na stack, lista no heap" (os dois no heap)

## Dúvidas para levar ao tutor (IA)
- ~~`int[]` ou `DynamicArray<T>`? Por que `new T[10]` não compila~~ *Respondida em 10/nov; a conversão do código fica para a semana 3.*
