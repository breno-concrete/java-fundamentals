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

## Consigo explicar sem consultar (perguntas do diagnóstico)
- [x] Por que `array[i]` é O(1) *09/nov: memória contígua sem dica e a conta do endereço sozinho.*
- [ ] Por que usar `TreeMap` se ele é O(log n) *09/nov: "ordenado, red-black balanceada", mas não disse para que serve a ordem. Os caminhos de `ceilingKey` e `floorKey` saíram certos depois de explicado.*
- [ ] O que acontece no `add` quando o `DynamicArray` está cheio *09/nov: "cria um novo com o dobro da capacidade e copia os itens", mas na ordem trocada (disse copiar antes de criar) e sem a troca da referência.*

## Errei na página em branco
- (código do dia, não página em branco) `DynamicArray`:
  - `array = new int[size + 1]` a cada `add` sem copiar: array novo zerado, só o último elemento sobra
  - Capacidade 0: fez `size = 1` para conseguir dobrar → `size` mentindo e AIOOBE na cópia (`oldArray[0]` com tamanho 0). Misturou size e capacidade
  - Teste com `get(1)` repetido no lugar de `get(2)`
  - Teste de 100 elementos com valor = índice: não pega um `get` que devolve o índice
- Two Sum D+10 criado em `leetcode/arrayshashing/` (fora do `src`), sem `package` nem imports

## Dúvidas para levar ao tutor (IA)
- `int[]` ou `DynamicArray<T>`? Por que `new T[10]` não compila (fica para o dia 2)
