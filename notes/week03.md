# Week 03 — Referências, coleções e generics

## O que estudei
- Seg 23/nov: sem estudo. Referências e o #49 com `Map` foram para o sábado 28/nov
- `HashSet` vs `TreeSet` (24/nov): `HashSet` usa `hashCode` + `equals`; `TreeSet` só o comparador, e 0 quer dizer "mesmo elemento". `BigDecimal` `1.0` e `1.00`: 2 no `HashSet` (`equals` compara valor e escala), 1 no `TreeSet` (`compareTo` compara só o valor)
- `Comparable` vs `Comparator` (24/nov)
  - `Comparable`: dentro da classe, `compareTo(other)`, uma ordem natural (`String`, `Integer`, `LocalDate`)
  - `Comparator`: fora, `compare(a, b)`, várias ordens, serve para classe que não dá para editar. `Person` não tem ordem natural única, então `Comparator`
  - Contrato: negativo = `a` antes, zero = empate, positivo = `a` depois. Só o sinal importa
  - `Integer.compare(a, b)` em vez de `a - b`: a subtração pode estourar o `int` e trocar o sinal
- API de comparadores (24/nov)
  - Desempate à mão: `if (r != 0) return r;` e senão compara a próxima chave
  - `Comparator.comparingInt(Person::getAge).thenComparing(Person::getName)`: `thenComparing` só roda quando o anterior deu 0; `comparingInt` evita boxing
  - `Person::getAge` é referência de método, atalho de `p -> p.getAge()`
  - `reversed()` inverte tudo o que vem antes dele e nada depois: no fim da cadeia inverte idade e nome; logo depois da idade, só a idade
  - `List.sort` é estável: quem empata mantém a ordem anterior
- `PersonComparatorTest` (24/nov), em `dev.breno.labs.week03`, 4 verdes: ordem por idade, desempate por nome, posição do `reversed()`, `TreeSet` com comparador só de idade (`size` 1, fica a Ana: o 2º `add` é ignorado, não substitui)
  - `getAge()` precisa ser `public`: o teste está em outro pacote, e sem modificador o método é *package-private*
  - Checar a ordem inteira, não só o 1º: `stream().map(Person::getName).toList()` contra `List.of(...)`
- Padrão: duplicata por grupo (24/nov)
  - `Set.add` devolve `false` se já estava: checa e insere num passo, sem `contains`
  - Divisão inteira agrupa posições: `day / 7`
  - Chave composta (`"Ana in week 0"`) com um set só, ou um set por grupo (`List<Set<...>>`)
- LeetCode #36 Valid Sudoku (24/nov): caixas sozinho (cantos 0, 3, 6, set novo por caixa); linhas e colunas com ajuda, em passadas separadas. 4 verdes
  - O set só lembra o que entrou enquanto viveu: criado dentro da caixa, vê 3 das 9 células de uma linha. Set de linha nasce uma vez por linha
  - Bug do dia: `if (board[j][i] != '.')` com `set.add(board[i][j])`: checava uma célula e somava outra, o `'.'` entrava duas vezes e o tabuleiro válido dava `false`

## Consigo explicar sem consultar (perguntas do diagnóstico)
- [x] O que o `TreeSet` usa para saber se dois elementos são iguais *24/nov: sozinho, com o `BigDecimal` (2 vs 1, `equals` vs `compareTo`).*
- [x] O que `reversed()` inverte numa cadeia *24/nov: previsão certa sozinho antes do teste.*
- [ ] Como montar a entrada de um teste de desempate *24/nov: errou 3 vezes (teste 2, teste 3, tabuleiros do #36); corrigiu o teste 2 depois de explicado.*
- [ ] Por que um set por caixa não acha a duplicata da linha *24/nov: planejou 3 sets de linha por caixa; explicado com o desenho da linha 0.*

## Errei na página em branco
- (prática, 24/nov) Teste de desempate com a entrada já na ordem esperada: passava sem `thenComparing` (sort estável). No teste 3, embaralhou a lista mas manteve Ana antes de Brandon
- (prática, 24/nov) Teste 1 só checava o 1º elemento; nome `hasToOverride...` para um `add` que é ignorado
- (#36, 24/nov) Checou só as caixas; test file vazio nos 30 min. Testes de linha e coluna montados sobre o exemplo 2, que já quebra a caixa e a coluna 0: passavam sem checar linhas. Plano de 3 sets de linha por caixa. `board[j][i]` no `if` e `board[i][j]` no `add`

## Dúvidas para levar ao tutor (IA)
- ~~Tem hora de projeto no cronograma de 4h?~~ *Respondida em 24/nov: a hora 4 é 10 min de fechamento + 50 de projeto (sábado: carreira).*
