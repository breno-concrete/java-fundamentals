# Week 01 — Object contracts, hashing and memory

## O que estudei
- Função equals e como utilizar ela da melhor forma (Effective Java Item 10)
  - Escolher campos que não mudam
  - Deve seguir as 5 propriedades (reflexiva, simétrica, transitiva, consistente e não nula)
- Função hashCode e como utilizar ela da melhor forma (Item 11)
  - Deve ser consistente com equals: se `equals` diz igual, o `hashCode` tem de ser igual
  - Deve distribuir uniformemente os objetos
  - `Member` + teste no `HashSet`: sem `hashCode`, dois iguais viram dois elementos
- HashMap por dentro (`SimpleHashMap`, test-first, e depois `SimpleHashMapBlank` na página em branco)
  - Array de baldes; índice = `floorMod(hashCode, capacidade)`; acesso ao array é O(1)
  - Colisão: lista encadeada no balde; `equals` decide qual nó é a chave certa
  - Sobrescrita da mesma chave troca o valor, não aumenta o `size`, não dispara resize
  - Resize quando `size > 75%` da capacidade: dobra o array e reposiciona os nós, mantendo os baldes curtos
  - Java 8: balde com mais de 8 nós vira árvore red-black → busca O(log n) no pior caso
- HashSet vs HashMap: o Set guarda só chaves (por dentro é um HashMap); o Map associa chave → valor
- `LinkedHashMap`: mantém a ordem de inserção
- Base de Java: generics (parâmetro de tipo vs raw type), referência como "ponteiro", classe aninhada `static`, `==` vs `equals` (cache de `Integer`), campo de `null` → NPE
- Chave mutável (`Person` + `PersonTest`, 05–06/nov, test-first)
  - Depois de `put` e `setName("Bia")`: `get(person)` dá `null` porque o hash novo cai em outro balde; `get(new Person("Ana"))` dá `null` porque o balde é o certo, mas o `equals` compara "Ana" com "Bia"
  - A entrada continua lá: `getSize()` segue 1. Ela existe, só não pode ser achada
  - Num map que não guarda o hash no nó, se o hash novo cair no mesmo balde, a chave **é** achada: só se perde se mudar de balde
  - `equals` e `hashCode` precisam tratar `null` do mesmo jeito (`Objects.hashCode` devolve 0 para `null`)
- Stack vs heap (06/nov, desenho em ASCII)
  - Stack: variáveis locais (`map`, `person`), que guardam primitivos ou referências. Heap: todo objeto com `new`
  - `put(person, 1)` copia a referência: `person` e `Node.key` são duas setas para o mesmo objeto. Seta nunca aponta para variável
  - `setName` muda o objeto, e todas as setas veem; `person = new Person(...)` só move a seta da stack, e o map não é afetado
- Array é O(1) porque é contíguo: endereço = início + idx × tamanho. Lista ligada precisa seguir k ponteiros
- Replanejamento em 06/nov: Item 17 e records foram para a semana 4 do ROADMAP
- LeetCode, Arrays & Hashing:
  - #1 Two Sum: HashMap complemento → índice, 1 passada. Força bruta O(n²)/O(1); hash map O(n)/O(n)
  - #217 Contains Duplicate: HashSet dos já vistos. Força bruta O(n²)/O(1); HashSet O(n)/O(n). Revisado do zero em 03/nov

## Consigo explicar sem consultar (perguntas do diagnóstico)
- [ ] 4.2a equals/hashCode *Gravação em inglês feita em 04/nov, ainda não revisada.*
- [ ] 4.1a HashMap O(1) *04/nov: árvore do Java 8 e resize saíram sozinhos; o `equals` no `get` ainda não. 06/nov: `equals` no `get` e array O(1) certos, mas os dois com ajuda (pergunta reformulada, dica de memória contígua).*
- [ ] Chave mutável: por que o `get` dá `null` nos dois casos *06/nov: previsões certas sozinho; o "por que" do segundo caso saiu como conclusão ("não existe mais Ana"), não como mecanismo.*
- [ ] Stack vs heap com o `PersonTest` *06/nov: saiu com 3 perguntas-guia (direção das setas; seta não aponta para variável). Checagem final do `person = new ...` corrigida sozinho.*

## Errei na página em branco
- Testes do `SimpleHashMapBlankTest` instanciavam o `SimpleHashMap` antigo: teste verde que não testava o código novo
- Escrevi num balde `null` (`buckets[idx].key = ...`) → NPE: é preciso criar o `Node` e guardar no slot
- O `while` do `put` não andava o ponteiro → loop infinito na colisão
- `resize()` só era chamado num ramo: tem de vir depois de todo `size++`
- O problema do último nó: o `put` precisa comparar todos os nós **e** parar no último
  - `while (current.nextNode != null)`: para no último, mas nunca compara ele → chave duplicada
  - `while (current != null)`: compara todos, mas sai com `current == null` → NPE ao encadear
  - passo condicional dentro de `while (current != null)` → loop infinito
  - Solução (04/nov): um `while (current != null)` que compara e, no último nó, encadeia e retorna
- Regra: todo loop precisa de uma condição que o próprio passo torne falsa

## Dúvidas para levar ao tutor (IA)
-
