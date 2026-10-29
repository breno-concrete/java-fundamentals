# Progresso

## Agora
- **Semana:** 1 de 52 (começou 18/out; recomeçou no dia 2 em 27/out, vai até 01/nov) · Java core
- **Deslocamento do plano:** 1 semana (semana de 19–24/out perdida, regra 4). Semana 2 começa seg 02/nov.
- **Última atualização:** 2026-10-29
- **Pendência do dia 3:** #217 Contains Duplicate + as 3 perguntas do Two Sum → **dia 6 (sáb 31/out), antes do #242**. Dia 6 ficou pesado: se não couber, o #242 cede o lugar.
- **Pendências carregadas:** `SimpleHashMap` parado no 1.4 em 29/out (1.0–1.3 verdes, 4 testes; falta o bug do `current.key` no `put` e 1.5–1.7) + fechamento do dia 2 + o conteúdo do dia 4 inteiro (Item 17, records, stack vs heap). **A remarcar** (proposta: 1.4–1.7 nos primeiros 45 min do dia 5; dia 4 → semana 2). Tem que estar pronto antes da página em branco do dia 6.

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
- Base de Java que apareceu no `SimpleHashMap` (29/out): generics (parâmetro de tipo vs campo, raw type), referência como "ponteiro", `static` vs `private` em classe aninhada, `==` vs `equals` (cache de `Integer`), ler campo de `null`. Revisar pelos flashcards de 29/out.

## Histórico semanal
<!-- Uma linha por semana: o que foi feito, o que ficou para trás. -->
- **Semana 1:** dia 1 feito em 18/out (repo, Effective Java Items 10–11, `Member` + teste do HashSet). Resto da semana perdido; recomeço do dia 2 em 27/out. Dia 2 (27/out): teoria + papel do HashMap feitos; código (Fase 3) adiado para o dia 4. Dia 3 (28/out): Two Sum sozinho, hash map, 3 testes verdes; #217 adiado para o dia 6. Dia 4 (29/out): 3h no `SimpleHashMap` test-first, 1.0–1.3 verdes e 1.4 quase; conteúdo do dia 4 não começou.
