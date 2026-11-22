# Caminho das Pedras

**De onde estou até uma grande empresa** · 18/out/2026 → formatura em jul/2030

- **Intensivo, 23/nov/2026 a 27/fev/2027:** 4h por dia, todos os dias (97 dias, 388h)
- **Depois, até 06/mai/2028:** 1h de estudo + 1h de projeto, de domingo a sexta
- **Fora dessas horas:** faculdade, estágio e HUB
- **Semanas:** de domingo a sábado. As semanas 1 e 2 já foram
- **Plano anterior:** `git show 036e8ee:docs/ROADMAP.md` (a versão ao vivo publicada ainda é a dele)

## Contents

1. [The map](#the-map)
2. [Monthly goals](#monthly-goals)
3. [The weekly blocks](#the-weekly-blocks)
4. [Week by week](#week-by-week)
5. [Depois do intensivo](#depois-do-intensivo)
6. [House rules](#house-rules)
7. [The goal](#the-goal)

## The map

**Onde estou:** com IA entrego sistemas com Spring, Postgres, Redis, Docker e LLM. À mão ainda estou firmando referências, generics, coleções e Big-O. O caminho fecha essa distância, por isso começa em Java.

| # | Etapa | Quando | No fim eu consigo | Leitura |
|--:|---|---|---|---|
| 1 | **Java de verdade** | 23/nov a 26/dez/26 | programar sem IA sabendo os porquês | *Effective Java* |
| 2 | **Banco de dados** | 27/dez a 16/jan/27 | modelar e acelerar queries | *Use The Index, Luke!*, docs do PostgreSQL |
| 3 | **Backend com Spring** | 17/jan a 30/jan/27 | fazer uma API segura e saber o que há por baixo | docs do Spring e do Hibernate |
| 4 | **Docker, CI e AWS** | 31/jan a 13/fev/27 | pôr no ar e investigar falhas | *Pro Git*, docs de Docker e AWS |
| 5 | **IA aplicada** | 14/fev a 27/fev/27 | construir e avaliar features de IA | *AI Engineering* |
| 6 | SO, concorrência, redes, mensageria | mar a jun/27 | corrigir corridas e integrar serviços | *OSTEP*, *JCIP*, *HPBN* |
| 7 | Preparação e seleções de estágio | jun a ago/27 | disputar grande empresa no Brasil | *System Design Interview* |
| 8 | Design e sistemas distribuídos | ago a nov/27 | melhorar código alheio e desenhar sistemas | *A Philosophy of Software Design*, *Refactoring*, *DDIA* |
| 9 | Acima da média | dez/27 a mar/28 | ter um mini banco, um benchmark e open source | *DDIA* |
| 10 | Big tech | mar a mai/28 | passar um loop de entrevistas em inglês | revisão |

## Monthly goals

| Até | Entregue | Candidatura |
|---|---|---|
| 30/nov | coleções fechadas, generics começados | primeiras candidaturas enviadas |
| 26/dez | **Java fechado**, programa integrador feito | candidaturas do mês, antes dos prazos |
| 16/jan | **banco fechado**, app Java + Postgres sem framework | LinkedIn e CV atualizados |
| 30/jan | **Spring fechado**, API segura sem IA | base pronta para entrevista de backend |
| 13/fev | **API na AWS com deploy contínuo** | AWS e CD entram no CV |
| 27/fev | **feature de IA com evals**, ~69 problemas resolvidos | IA com evals entra no CV |

## The weekly blocks

Intensivo, todo dia. A ordem é a prioridade: num dia ruim, corta de baixo para cima.

| Hora | Bloco | Como |
|--:|---|---|
| 1 | **Aprender** | 10 min relembrando · 20 de explicação e porquê · 20 de exemplo resolvido · 10 de dúvidas |
| 2 | **Praticar** | código à mão, teste primeiro, ajuda quando travar |
| 3 | **Algoritmos** | 15 min de padrão em outro exemplo · 30 sozinho · 15 de solução e revisão |
| 4 | **Projeto ou carreira** | domingo a sexta, projeto no repo dele · sábado, candidaturas, CV, LinkedIn, contatos |

- **Segunda:** sem teoria nova, as 2 primeiras horas são prática.
- **Sábado:** as 2 primeiras horas juntam a semana num programa.
- **Pausa:** 10 min entre as horas, que não precisam ser seguidas.
- **Fim do dia:** flashcards e plano de amanhã, dentro da última hora.

## Week by week

### Semana 3 · 23/nov a 28/nov/26 · Java de verdade

Algoritmos: arrays e hashing

| Dia | Aprender + praticar (2h) | Algoritmos (1h) |
|---|---|---|
| seg 23/nov | Referências: o que `a = b` copia (só nesta segunda há teoria nova) | #49 de novo, agora com `Map` |
| ter 24/nov | `Comparable` e `Comparator` com desempate (idade, nome, `reversed`) | #36 |
| qua 25/nov | `TreeSet` com `Comparator`: quando um elemento some | #347 |
| qui 26/nov | Generics: classes, `DynamicArray<T>` com crescimento num caminho só | #238 |
| sex 27/nov | Generics: métodos e tipos limitados | #128 |
| sáb 28/nov | Construir: `InMemoryRepository<T, ID>` | revisão do #242, misto com tempo |

### Semana 4 · 29/nov a 05/dez/26 · Java de verdade

Algoritmos: two pointers

| Dia | Aprender + praticar (2h) | Algoritmos (1h) |
|---|---|---|
| dom 29/nov | Wildcards: `? extends` e `? super` (PECS) | #125 |
| seg 30/nov | Praticar: um `copy` que só compila com o wildcard certo | revisões |
| ter 01/dez | Type erasure e seus limites | #167 |
| qua 02/dez | Imutabilidade e cópia defensiva | #283 |
| qui 03/dez | Records e construtor compacto | #11 |
| sex 04/dez | Value objects; a chave `Person` como record, com uma `List` dentro | #15 |
| sáb 05/dez | Construir: `TimeWindow` imutável que se valida | misto com tempo e revisões |

### Semana 5 · 06/dez a 12/dez/26 · Java de verdade

Algoritmos: sliding window

| Dia | Aprender + praticar (2h) | Algoritmos (1h) |
|---|---|---|
| dom 06/dez | Orientação a objetos: encapsulamento e interfaces | #121 |
| seg 07/dez | Praticar: programar para a interface no repositório | revisões |
| ter 08/dez | Polimorfismo | #3 |
| qua 09/dez | Composição ou herança | #209 |
| qui 10/dez | Enums com comportamento | #424 |
| sex 11/dez | Exceções: checked e unchecked | #567 |
| sáb 12/dez | Construir: um domínio pequeno com interfaces e enums | misto com tempo e revisões |

### Semana 6 · 13/dez a 19/dez/26 · Java de verdade

Algoritmos: stack

| Dia | Aprender + praticar (2h) | Algoritmos (1h) |
|---|---|---|
| dom 13/dez | Desenhar exceções de domínio | #20 |
| seg 14/dez | Praticar: testar caminhos de falha | revisões |
| ter 15/dez | `Optional` | #155 |
| qua 16/dez | Arquivos e try-with-resources | #150 |
| qui 17/dez | Lambdas | #739 |
| sex 18/dez | Interfaces funcionais e method references | #853 |
| sáb 19/dez | Construir: importador de CSV com erros tratados | misto com tempo e revisões |

### Semana 7 · 20/dez a 26/dez/26 · Java de verdade

Algoritmos: busca binária

| Dia | Aprender + praticar (2h) | Algoritmos (1h) |
|---|---|---|
| dom 20/dez | Streams: map, filter, reduce | #704 |
| seg 21/dez | Praticar: laços viram streams; testes e debugger | revisões |
| ter 22/dez | Collectors: groupingBy, toMap | #74 |
| qua 23/dez | JVM: stack, heap, garbage collection | #875 |
| qui 24/dez | *Feriado: revisão leve, o que der* | opcional |
| sex 25/dez | *Feriado: revisão leve, o que der* | opcional |
| sáb 26/dez | Construir: um programa que junta Java inteiro, do zero | misto com tempo e revisões |

### Semana 8 · 27/dez a 02/jan/27 · Banco de dados

Algoritmos: busca binária

| Dia | Aprender + praticar (2h) | Algoritmos (1h) |
|---|---|---|
| dom 27/dez | SQL: joins | #153 |
| seg 28/dez | Praticar: joins no pgexercises | revisões |
| ter 29/dez | GROUP BY e HAVING | #33 |
| qua 30/dez | Subqueries e CTEs | #981 |
| qui 31/dez | *Feriado: revisão leve, o que der* | opcional |
| sex 01/jan | *Feriado: revisão leve, o que der* | opcional |
| sáb 02/jan | Construir: relatórios em SQL | misto com tempo e revisões |

### Semana 9 · 03/jan a 09/jan/27 · Banco de dados

Algoritmos: lista ligada

| Dia | Aprender + praticar (2h) | Algoritmos (1h) |
|---|---|---|
| dom 03/jan | Window functions | #206 |
| seg 04/jan | Praticar: rankings em SQL | revisões |
| ter 05/jan | Modelagem, chaves e normalização | #21 |
| qua 06/jan | Migrations com Flyway | #141 |
| qui 07/jan | Índices e B-tree | #19 |
| sex 08/jan | `EXPLAIN ANALYZE` | #143 |
| sáb 09/jan | Construir: 1 milhão de linhas e uma query 10× mais rápida | misto com tempo e revisões |

### Semana 10 · 10/jan a 16/jan/27 · Banco de dados

Algoritmos: árvores

| Dia | Aprender + praticar (2h) | Algoritmos (1h) |
|---|---|---|
| dom 10/jan | Transações e ACID | #226 |
| seg 11/jan | Praticar: commit e rollback em duas sessões | revisões |
| ter 12/jan | Isolamento, anomalias e MVCC | #104 |
| qua 13/jan | Locks e lost update | #543 |
| qui 14/jan | JDBC e SQL injection | #110 |
| sex 15/jan | Pool de conexões e paginação | #100 |
| sáb 16/jan | Construir: biblioteca em Java + Postgres, sem framework | misto com tempo e revisões |

### Semana 11 · 17/jan a 23/jan/27 · Backend com Spring

Algoritmos: árvores de busca

| Dia | Aprender + praticar (2h) | Algoritmos (1h) |
|---|---|---|
| dom 17/jan | HTTP por dentro | #102 |
| seg 18/jan | Praticar: um pedido HTTP feito à mão | revisões |
| ter 19/jan | REST: recursos, status, erros | #199 |
| qua 20/jan | IoC e injeção de dependência | #235 |
| qui 21/jan | Auto-configuração | #98 |
| sex 22/jan | Proxies e AOP | #230 |
| sáb 23/jan | Construir: um container de injeção com reflexão | misto com tempo e revisões |

### Semana 12 · 24/jan a 30/jan/27 · Backend com Spring

Algoritmos: heap

| Dia | Aprender + praticar (2h) | Algoritmos (1h) |
|---|---|---|
| dom 24/jan | `@Transactional` e self-invocation | #1448 |
| seg 25/jan | Praticar: reproduzir e corrigir o self-invocation | revisões |
| ter 26/jan | Caminho do pedido, validação, erros | #572 |
| qua 27/jan | Spring Security, JWT, OWASP | #703 |
| qui 28/jan | JPA: persistence context e N+1 | #215 |
| sex 29/jan | Testes de integração com Testcontainers | #973 |
| sáb 30/jan | Construir: API segura do zero, sem IA | misto com tempo e revisões |

### Semana 13 · 31/jan a 06/fev/27 · Docker, CI e AWS

Algoritmos: backtracking

| Dia | Aprender + praticar (2h) | Algoritmos (1h) |
|---|---|---|
| dom 31/jan | Linux: processos, portas, logs | #78 |
| seg 01/fev | Praticar: investigar um app quebrado no WSL | revisões |
| ter 02/fev | Git: rebase, conflitos, bisect | #39 |
| qua 03/fev | Docker: imagem, camadas, multi-stage | #46 |
| qui 04/fev | Compose: rede, volume, healthcheck | #90 |
| sex 05/fev | CI com GitHub Actions | #79 |
| sáb 06/fev | Construir: clone, 1 comando, app no ar | misto com tempo e revisões |

### Semana 14 · 07/fev a 13/fev/27 · Docker, CI e AWS

Algoritmos: grafos

| Dia | Aprender + praticar (2h) | Algoritmos (1h) |
|---|---|---|
| dom 07/fev | AWS: IAM e alerta de custo | #208 |
| seg 08/fev | Praticar: permissões mínimas | revisões |
| ter 09/fev | Rede e RDS | #200 |
| qua 10/fev | ECR e ECS | #695 |
| qui 11/fev | Deploy contínuo | #133 |
| sex 12/fev | Logs, métricas, incidente | #994 |
| sáb 13/fev | Construir: API na AWS e uma falha investigada | misto com tempo e revisões |

### Semana 15 · 14/fev a 20/fev/27 · IA aplicada

Algoritmos: grafos e programação dinâmica

| Dia | Aprender + praticar (2h) | Algoritmos (1h) |
|---|---|---|
| dom 14/fev | LLM: tokens, contexto, temperatura | #207 |
| seg 15/fev | Praticar: chamar um modelo em Java | revisões |
| ter 16/fev | Saída estruturada e validação | #210 |
| qua 17/fev | Evals | #70 |
| qui 18/fev | Embeddings e pgvector | #198 |
| sex 19/fev | RAG | #322 |
| sáb 20/fev | Construir: busca com RAG e 20 casos de eval | misto com tempo e revisões |

### Semana 16 · 21/fev a 27/fev/27 · IA aplicada

Algoritmos: misto

| Dia | Aprender + praticar (2h) | Algoritmos (1h) |
|---|---|---|
| dom 21/fev | Tool calling | #53 |
| seg 22/fev | Praticar: um loop de ferramenta à mão | revisões |
| ter 23/fev | Agentes e MCP | #56 |
| qua 24/fev | Prompt injection, custo, limites | #55 |
| qui 25/fev | Como resolver um case com IA | #2 |
| sex 26/fev | Como funciona uma entrevista de código | #621 |
| sáb 27/fev | Construir: feature de IA completa; pacote de candidatura | misto com tempo e revisões |

## Depois do intensivo

1h de estudo + 1h de projeto. Domingo, terça e quinta: conceito. Quarta e sexta: algoritmos. Segunda: prática. Sábado: livre.
As semanas "Consolidar" existem porque o que se aprende rápido se esquece rápido.

| Semana | Domingo | Tema |
|--:|---|---|
| 17 | 28/fev/27 | Semana leve depois do intensivo; revisar Java |
| 18 | 07/mar/27 | SO: processos e threads |
| 19 | 14/mar/27 | SO: memória virtual e I/O |
| 20 | 21/mar/27 | Consolidar: Java |
| 21 | 28/mar/27 | Concorrência: corridas e Java Memory Model |
| 22 | 04/abr/27 | Concorrência: locks e deadlock |
| 23 | 11/abr/27 | Concorrência: executors e virtual threads |
| 24 | 18/abr/27 | Consolidar: banco |
| 25 | 25/abr/27 | Redes: TCP, UDP, DNS |
| 26 | 02/mai/27 | Redes: TLS e servidor HTTP do socket |
| 27 | 09/mai/27 | Kafka e SQS |
| 28 | 16/mai/27 | Idempotência e outbox |
| 29 | 23/mai/27 | Consolidar: Spring |
| 30 | 30/mai/27 | Cache com Redis |
| 31 | 06/jun/27 | Timeout, retry, circuit breaker |
| 32 | 13/jun/27 | *Margem: provas da UnB* |
| 33 | 20/jun/27 | System design: escala e estimativas |
| 34 | 27/jun/27 | System design: encurtador e rate limiter |
| 35 | 04/jul/27 | Consolidar: AWS |
| 36 | 11/jul/27 | Consolidar: IA |
| 37 | 18/jul/27 | Seleção: código |
| 38 | 25/jul/27 | Seleção: case com IA e inglês |
| 39 | 01/ago/27 | **Seleções de estágio** |
| 40 | 08/ago/27 | **Seleções de estágio** |
| 41 | 15/ago/27 | Coesão, acoplamento, SOLID |
| 42 | 22/ago/27 | *Margem: reta final do HUB* |
| 43 | 29/ago/27 | Patterns que o Spring usa |
| 44 | 05/set/27 | *Margem: reta final do HUB* |
| 45 | 12/set/27 | Refactoring sob testes |
| 46 | 19/set/27 | *Margem: fim do HUB* |
| 47 | 26/set/27 | Arquitetura hexagonal |
| 48 | 03/out/27 | DDD leve e estratégia de testes |
| 49 | 10/out/27 | ADR e C4 |
| 50 | 17/out/27 | Consolidar: design |
| 51 | 24/out/27 | Replicação e consistência |
| 52 | 31/out/27 | Particionamento |
| 53 | 07/nov/27 | Key-value replicado: réplica |
| 54 | 14/nov/27 | Key-value replicado: queda de um nó |
| 55 | 21/nov/27 | System design: notificação e chat |
| 56 | 28/nov/27 | *Margem: provas da UnB* |
| 57 | 05/dez/27 | Kotlin: linguagem |
| 58 | 12/dez/27 | Kotlin com Spring |
| 59 | 19/dez/27 | *Recesso* |
| 60 | 26/dez/27 | *Recesso* |
| 61 | 02/jan/28 | Mini banco: log |
| 62 | 09/jan/28 | Mini banco: recuperação de crash |
| 63 | 16/jan/28 | Mini banco: índice |
| 64 | 23/jan/28 | Mini banco: busca por faixa |
| 65 | 30/jan/28 | Mini banco: transação |
| 66 | 06/fev/28 | Mini banco: concorrência |
| 67 | 13/fev/28 | Performance: profiler |
| 68 | 20/fev/28 | Performance: benchmark publicado |
| 69 | 27/fev/28 | *Margem: Carnaval* |
| 70 | 05/mar/28 | Consolidar: SO, redes, concorrência |
| 71 | 12/mar/28 | Open source: entender código alheio |
| 72 | 19/mar/28 | Open source: contribuição com design doc |
| 73 | 26/mar/28 | System design de entrevista |
| 74 | 02/abr/28 | Algoritmos no tempo de entrevista |
| 75 | 09/abr/28 | *Margem* |
| 76 | 16/abr/28 | Histórias de projeto em inglês |
| 77 | 23/abr/28 | Entrevista técnica em inglês, guiada |
| 78 | 30/abr/28 | Loop completo e plano até a formatura |

### De mai/2028 até a formatura

| Período | Foco |
|---|---|
| mai a jun/2028 | revisão e currículo para big tech |
| jul a nov/2028 | seleções para o verão de 2029 |
| dez/2028 a mai/2029 | especialização e open source |
| jun a ago/2029 | estágio de verão |
| ago/2029 a jul/2030 | efetivação ou vaga de recém-formado |

## House rules

1. **AI in learning mode.** A IA explica, mostra exemplo parecido e corrige. Não escreve o código de `src/`.
2. **LeetCode method.** Padrão em outro exemplo, 30 min sozinho. Travou: lê a solução, fecha, reescreve. Revisão em 3 e 10 dias, registrada em `leetcode/TRACKER.md`.
3. **Sem prova como trava.** Lacuna vira exercício na segunda seguinte. Não move as datas.
4. **Dia perdido não dobra o seguinte.** O essencial vai para o sábado. Se não couber, corta o "Construir", nunca o conceito.
5. **FOMO.** Assunto novo vai para o parking lot. O roadmap só muda no fim de uma etapa ou se as horas mudarem.
6. **HUB.** Fora das horas deste plano, acompanhado no repo dele.
7. **Front-end.** Se o estágio pedir React, usa a hora de projeto.
8. **Prova da UnB.** Na semana de prova ficam as horas 1 e 2. A prova vem primeiro.
9. **Sono não paga bloco.** O que não coube até a hora de dormir é cortado.

## The goal

| Quando | Chegada |
|---|---|
| 30/jan/2027 | base de backend pronta para entrevista |
| 27/fev/2027 | Java, banco, Spring, AWS e IA: pacote completo de estágio |
| ago/2027 | disputar estágio em grande empresa no Brasil |
| mai/2028 | acima de júnior, com mini banco, sistema distribuído e open source |
| jul a nov/2028 | disputar estágio de big tech para 2029 |
| jul/2030 | formatura com proposta assinada |

As janelas de seleção são projeções dos ciclos de 2027. Confirmar quando abrirem.
