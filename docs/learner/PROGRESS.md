# Progresso

## Agora
- **Semana:** 1 de 52 (começou 18/out; recomeçou no dia 2 em 27/out, vai até 01/nov) · Java core
- **Deslocamento do plano:** 1 semana (semana de 19–24/out perdida, regra 4). Semana 2 começa seg 02/nov.
- **Última atualização:** 2026-11-04
- **Semana 2 começou em 04/nov (qua):** dia 7 da semana 1 fechado hoje (página em branco verde 3/3, explicação em voz alta, gravação em inglês). Parou na Fase 4 de `docs/days/2026-11-04.md`: chave mutável num HashMap. Teoria feita e as 4 previsões corrigidas → **retomar escrevendo a classe com setter em `labs/week02` e o teste** (e responder: sem `hashCode`, qual asserção muda?). Depois: fechar `week-01.md` e escrever `week-02.md` (tutor).
- **Pendências carregadas:** `notes/week01.md` (Breno) ainda sem o fechamento do dia 2. Jansenbot fica com ~45 min no dia 7: conferir se o `Member` terminou no outro chat, depois `Event` e `Attendance`. O que não couber, a regra de pontos e o total mensal vão para o primeiro bloco de Jansenbot da semana 2.
- **Próximas revisões de LeetCode:** Two Sum em 07/nov; #217 em 10/nov.
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
- Explicação do HashMap sem ajuda (30/out): árvore do Java 8 fechada em 04/nov (red-black, O(log n), sozinho). Ainda aberto: o papel do `equals` no `get` (por que o hash sozinho não basta) e por que o acesso ao array é O(1). Pulou a versão corrida em 04/nov. Fecha se explicar sozinho.
- `LinkedHashMap` (31/out): não soube o que garante, apesar do card de 28/out. Sabe agora só depois de explicado; revisar pelos flashcards de 31/out.
- Base de Java que apareceu no `SimpleHashMap` (29/out): generics (parâmetro de tipo vs campo, raw type), referência como "ponteiro", `static` vs `private` em classe aninhada, `==` vs `equals` (cache de `Integer`), ler campo de `null`. Revisar pelos flashcards de 29/out.

## Histórico semanal
<!-- Uma linha por semana: o que foi feito, o que ficou para trás. -->
- **Semana 1:** dia 1 feito em 18/out (repo, Effective Java Items 10–11, `Member` + teste do HashSet). Resto da semana perdido; recomeço do dia 2 em 27/out. Dia 2 (27/out): teoria + papel do HashMap feitos; código (Fase 3) adiado para o dia 4. Dia 3 (28/out): Two Sum sozinho, hash map, 3 testes verdes; #217 adiado para o dia 6. Dia 4 (29/out): 3h no `SimpleHashMap` test-first, 1.0–1.3 verdes e 1.4 quase; conteúdo do dia 4 não começou. Dia 5 (30/out): `SimpleHashMap` pronto, 8 testes verdes. Dia 6 (31/out): 3 perguntas e revisão do Two Sum, #217 sozinho; página em branco e gravação foram para o dia 7. Dia 7 (03 e 04/nov): revisão do #217 sozinho; página em branco com 6 bugs, todos consertados sozinho, 3/3 verdes; lacuna de sobrescrita/`size` fechada; gravação em inglês feita.
