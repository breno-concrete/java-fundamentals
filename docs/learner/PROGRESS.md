# Progresso

## Agora
- **Semana:** 1 de 52 (começou 18/out; recomeçou no dia 2 em 27/out, vai até 01/nov) · Java core
- **Deslocamento do plano:** 1 semana (semana de 19–24/out perdida, regra 4). Semana 2 começa seg 02/nov.
- **Última atualização:** 2026-10-30
- **Pendência do dia 3:** #217 Contains Duplicate + as 3 perguntas do Two Sum → **dia 6 (sáb 31/out)**. O #242 foi para a semana 2.
- **Pendências carregadas:** `SimpleHashMap` pronto em 30/out (8 testes verdes). Falta o fechamento do dia 2. Jansenbot: repo + `Member` no dia 5; `Event` e `Attendance` no início do dia 7, o que provavelmente empurra o total mensal para a semana 2.
- **Remarcado para a semana 2:** conteúdo do dia 4 (Item 17, records, stack vs heap, chave mutável) no primeiro bloco de Fundamentos; #242 no primeiro de LeetCode. Exceção à regra 4 (bloco perdido fica na mesma semana): não cabia nos 6h restantes.

## Provas de fase

| # | Matéria | Semana prevista | Data | Nota (/10) | Passou? | Arquivo |
|---|---|---|---|---|---|---|
| 1 | Java core | 6 | | | | |
| 2 | Databases | 13 | | | | |
| 3 | Spring + JPA | 17 | | | | |
| 4 | Operating systems | 20 | | | | |
| 5 | Concurrency | 24 | | | | |
| 6 | Networks | 27 | | | | |
| 7 | Docker, CI/CD, deploy | 31 | | | | |
| 8 | Design + architecture | 37 | | | | |
| 9 | System design | 41 | | | | |
| 10 | Applied AI | 48 | | | | |

## Lacunas abertas
<!-- O que errei na página em branco / prova e ainda não fechei. Remova quando fechar. -->
- Sobrescrita no `put` (mesma chave): não aumenta o `size`, então nunca dispara resize. Errou 2x no papel em 27/out; teste de sobrescrita com asserção de `size` verde em 29/out. Fecha de vez se acertar na página em branco do dia 6.
- Explicação do HashMap sem ajuda (30/out): esqueceu a árvore do Java 8 (balde lotado, busca O(log n)), e o papel do `equals` no `get` veio só com ajuda. Fecha se explicar sozinho no dia 6.
- Base de Java que apareceu no `SimpleHashMap` (29/out): generics (parâmetro de tipo vs campo, raw type), referência como "ponteiro", `static` vs `private` em classe aninhada, `==` vs `equals` (cache de `Integer`), ler campo de `null`. Revisar pelos flashcards de 29/out.

## Histórico semanal
<!-- Uma linha por semana: o que foi feito, o que ficou para trás. -->
- **Semana 1:** dia 1 feito em 18/out (repo, Effective Java Items 10–11, `Member` + teste do HashSet). Resto da semana perdido; recomeço do dia 2 em 27/out. Dia 2 (27/out): teoria + papel do HashMap feitos; código (Fase 3) adiado para o dia 4. Dia 3 (28/out): Two Sum sozinho, hash map, 3 testes verdes; #217 adiado para o dia 6. Dia 4 (29/out): 3h no `SimpleHashMap` test-first, 1.0–1.3 verdes e 1.4 quase; conteúdo do dia 4 não começou.
