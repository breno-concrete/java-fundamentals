# Progresso

## Agora
- **Semana:** 2 de 52 (sáb 07/nov – sex 13/nov, andando 2 dias: seg 09/nov – dom 15/nov) · Java core: Collections and their costs. Plano em `docs/weeks/week-02.md`
- **Deslocamento do plano:** ~2 semanas e 2 dias. A semana 1 do ROADMAP (18–24/out) perdeu 19–26/out (regra 4) e o Fundamentos dela foi até 06/nov (passou 2 a 3 dias do previsto). Sáb 07 e dom 08/nov sem estudo: o dia 1 da semana 2 foi em 09/nov e os dias seguintes andaram um dia.
- **Google Calendar (10/nov):** os eventos "Season · Sem N" (semanas de dom a sáb) andaram 1 semana para frente: Sem 2 em 08–14/nov, Sem 3 *Generics* a partir de 15/nov, Sem 6 (prova de fase) em 06–12/dez, Sem 52 em 24–30/out/2027. Sem 1 estendida até 07/nov. Breno estuda nos feriados, então as semanas de festas também andaram (Sem 9 virou "New Year week", Sem 10 "Catch-up week"; o aviso do Carnaval passou para a Sem 15 e o lançamento do penssay da Sem 46 para 18/set).
- **Última atualização:** 2026-11-10
- **10/nov (dia 2 da semana 2):** porquê das 4 linhas restantes da tabela (11 de 14; `HashSet` por dentro não lembrava), #217 D+10 do zero (3/3 verdes), amortizado O(1) no papel (dobrar 14 cópias sozinho; +1 = 120 fechado pelo tutor), `new T[10]` e o `Object[]` + cast do `ArrayList`, e a comparação com o resize do `SimpleHashMap` (gatilho e rehash certos sozinho). **Retomar no dia 3 (qua 11/nov):** LeetCode #242 e #49, 30 min sozinho cada, e registrar no `TRACKER.md`.
- **09/nov (dia 1 da semana 2):** aquecimento do `TreeMap` (`ceilingKey`/`floorKey` com ajuda, caminhos certos sozinho), porquê da tabela para `ArrayList`/`LinkedList` (8 de 8), Two Sum D+10 do zero, `DynamicArray` com crescimento (dobra e copia) e 5 testes verdes, adiantando o dia 2. **Retomar no dia 2 (ter 10/nov):** porquê das outras 4 linhas da tabela (5 min), revisão D+10 do #217, ajustes do teste de 100 elementos, `get` fora dos limites, `int[]` vs `<T>`, e o papel do amortizado O(1) (dobrar vs +1).
- **Semana 1 fechada em 06/nov:** chave mutável (`Person` + `PersonTest` verdes), `equals` no `get` e stack vs heap no papel. Bloco extra de 1h à noite: teoria e tabela de Big-O do dia 1 da semana 2 adiantadas. **Retomar no dia 1 (sáb 07/nov):** aquecimento "por que `TreeMap`", o porquê de cada célula da tabela (5 min), revisão do Two Sum e o `DynamicArray` test-first.
- **Pendências carregadas:** `notes/week01.md` (Breno) ainda sem o fechamento do dia 2. Jansenbot fica com ~45 min no dia 7: conferir se o `Member` terminou no outro chat, depois `Event` e `Attendance`. O que não couber, a regra de pontos e o total mensal vão para o primeiro bloco de Jansenbot da semana 2.
- **Próximas revisões de LeetCode:** nenhuma pendente (#217 D+10 feito em 10/nov; Two Sum D+10 em 09/nov). #242 entra no dia 3 (11/nov) e ganha D+3 no dia 6.
- **Levado para a semana 3 do ROADMAP** (*Generics*): converter o `DynamicArray` para `DynamicArray<T>` (`Object[]` + cast). O porquê foi visto em 10/nov.
- **Remarcado para a semana 2:** #242 no dia 3 (agora 11/nov); Jansenbot inteiro da semana 1 (repo, modelo, regra de pontos, total mensal) nos dias 5 e 7, antes do ranking.
- **Movido para a semana 4 do ROADMAP** (*Immutability, records and enums*, que já lê o Item 17): leitura do Item 17, versão `record` da chave com teste, previsão do `record` com `List<String>` + construtor compacto, e por que com `record` a chave não se perde. Decidido em 06/nov para não estudar duas vezes; anotado na semana 4 do `ROADMAP.md`.
- **Cortado:** teste extra com `containsKey` / `entrySet()` da chave mutável (só reforçava o teste principal).

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
- Explicação do HashMap sem ajuda (30/out): árvore do Java 8 fechada em 04/nov (red-black, O(log n), sozinho). Ainda aberto: o papel do `equals` no `get` (por que o hash sozinho não basta) e por que o acesso ao array é O(1). Pulou a versão corrida em 04/nov. Em 06/nov acertou as duas, mas com ajuda (pergunta reformulada; dica de memória contígua) e sem a conta do endereço (início + idx × tamanho). Fecha se explicar sozinho numa próxima checagem, sem dica. **09/nov: metade do array O(1) fechada** (memória contígua sem dica e a conta 1000 + 5 × 4 = 1020, fórmula início + i × bytes, sozinho). Fica aberto só o `equals` no `get`. **10/nov:** disse sozinho que o hash só escolhe o balde e a chave precisa ser comparada, mas respondeu pelo `put` (sobrescrever duplicata), não pelo `get`, e não falou em colisão nem `equals`. Fecha se explicar o `get`: chaves diferentes dividem o balde e o `equals` acha o nó da chave pedida.
- Referências e stack vs heap (06/nov): contou campos (`name`, `age`) como setas que chegam no objeto e disse que o nó aponta para a variável `person`. Entendeu com 3 perguntas-guia. Fecha se desenhar sozinho, com as setas certas, um caso novo (ex.: duas variáveis e uma lista). **10/nov:** chamou `oldArray = array` de "cópia do antigo"; corrigido (copia a referência) e já usou certo na explicação seguinte.
- Big-O das coleções (06/nov): 12 de 16 chutando. Não sabia o `TreeMap` (O(log n) pela altura da árvore) nem por que usá-lo; achou `HashMap.remove` O(n); confundiu `ArrayDeque` com lista ligada. Fecha se refizer a tabela sozinho, com o porquê de cada célula. **10/nov:** porquês feitos para as 6 linhas (8 de 8 e 11 de 14). Erro que repete: `HashMap.containsKey`, `HashSet.remove`/`contains` O(n) (acha que procurar/remover precisa varrer).
- `HashSet` por dentro (10/nov): achava que era "um array em que os números não se repetem", apesar do card de 06/nov. Explicado com o código do JDK (`HashMap`, elemento = chave, valor `PRESENT`). Fecha se explicar sozinho, na página em branco do dia 6, o que há dentro e por que `add`/`remove`/`contains` são O(1).
- Amortizado O(1) (10/nov): no papel contou redimensionamentos em vez de cópias; fez a conta do dobrar depois do desenho do laço, não fechou a do +1 e não explicou o amortizado no fechamento. Fecha se, em voz alta no dia 6, explicar sem notas por que dobrar dá O(1) amortizado e +1 dá O(n).
- `LinkedHashMap` (31/out): não soube o que garante, apesar do card de 28/out. Sabe agora só depois de explicado; revisar pelos flashcards de 31/out.
- Base de Java que apareceu no `SimpleHashMap` (29/out): generics (parâmetro de tipo vs campo, raw type), referência como "ponteiro", `static` vs `private` em classe aninhada, `==` vs `equals` (cache de `Integer`), ler campo de `null`. Revisar pelos flashcards de 29/out.

## Histórico semanal
<!-- Uma linha por semana: o que foi feito, o que ficou para trás. -->
- **Semana 1:** dia 1 feito em 18/out (repo, Effective Java Items 10–11, `Member` + teste do HashSet). Resto da semana perdido; recomeço do dia 2 em 27/out. Dia 2 (27/out): teoria + papel do HashMap feitos; código (Fase 3) adiado para o dia 4. Dia 3 (28/out): Two Sum sozinho, hash map, 3 testes verdes; #217 adiado para o dia 6. Dia 4 (29/out): 3h no `SimpleHashMap` test-first, 1.0–1.3 verdes e 1.4 quase; conteúdo do dia 4 não começou. Dia 5 (30/out): `SimpleHashMap` pronto, 8 testes verdes. Dia 6 (31/out): 3 perguntas e revisão do Two Sum, #217 sozinho; página em branco e gravação foram para o dia 7. Dia 7 (03 e 04/nov): revisão do #217 sozinho; página em branco com 6 bugs, todos consertados sozinho, 3/3 verdes; lacuna de sobrescrita/`size` fechada; gravação em inglês feita. Fechamento (05 e 06/nov): chave mutável test-first (`Person` + `PersonTest`), `equals` no `get` e array O(1) (com ajuda), stack vs heap no papel. Item 17 e records foram para a semana 4. Jansenbot não começou: foi para a semana 2. Semana fechada em 06/nov.
