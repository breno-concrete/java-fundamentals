# Caminho das Pedras

**Gold junior in 52 plan weeks** · Oct 18, 2026 → May 6, 2028

The whole plan in the order you learn it: the subject map, what each month covers, the monthly goals and the exact work for every plan week. Open it on the first day of each plan week to plan it.

- **Load:** 14h a week (2h every day): 1h of study here + 1h of project every day (7h + 7h; you pick the project, planned in its own repo) + HUB 25 min each weekday. Since Nov 20, 2026; before that it was 10h of study + 4h of project days (Thu, Sat)
- **Pace:** a plan week is 10h of study, so at 1h a day it takes 10 or 11 days and starts on a Sunday or a Wednesday. Every 3 calendar weeks hold 2 plan weeks: 21h, that is 12h of Fundamentals, 6h of LeetCode and 3h of blank page, so the 2 plan weeks plus 1 spare hour. Nothing is cut. Weeks 1–2 ran at the old pace; from week 3 (Nov 22, 2026) on, the dates follow the new one
- **Re-dated on Nov 21, 2026:** the Christmas weeks moved to where Christmas falls and are now weeks 6–7 (they were 10–11), so the old weeks 6–9 are now 8–11. From week 12 on, the numbers didn't change. Christmas 2027 is a break between weeks 40 and 41, not a plan week
- **Checkpoints:** halfway, week 26 (Jul 14 – 24, 2027) · the goal, May 6, 2028 (it was Oct 17, 2027 before the stretch)
- **Live version with trackers:** [Caminho das Pedras](https://claude.ai/artifact/KFTaScYYXn8mx3Tv4XRu3N)

## Contents

1. [The map](#the-map)
2. [Month by month](#month-by-month)
3. [Monthly goals](#monthly-goals)
4. [The weekly blocks](#the-weekly-blocks)
5. [Week by week](#week-by-week)
6. [House rules](#house-rules)
7. [The goal](#the-goal)

## The map

Each subject builds on the ones before it.

```mermaid
flowchart LR
  A[1 · Java core<br/>Oct 18, 2026 – Jan 16, 2027] --> B[2 · Databases<br/>Jan 17, 2027 – Mar 9, 2027]
  B --> C[3 · Spring internals + JPA<br/>Mar 10, 2027 – Apr 20, 2027]
  C --> D[4 · Operating systems<br/>Apr 21, 2027 – May 22, 2027]
  D --> E[5 · Concurrency<br/>May 23, 2027 – Jul 3, 2027]
  E --> F[6 · Networks<br/>Jul 4, 2027 – Aug 3, 2027]
  F --> G[7 · Docker, CI/CD, deploy<br/>Aug 4, 2027 – Sep 14, 2027]
  G --> H[8 · Design + architecture<br/>Sep 15, 2027 – Nov 16, 2027]
  H --> I[9 · System design<br/>Nov 17, 2027 – Jan 11, 2028]
  I --> J[10 · Applied AI<br/>Jan 12, 2028 – Mar 25, 2028]
  J --> K[11 · Interview sprint<br/>Mar 26, 2028 – May 6, 2028]
  K --> Z((Gold junior<br/>May 6, 2028))
```

| # | Subject | When | Builds on | Topics |
|---|---|---|---|---|
| 1 | Java core | Oct 18, 2026 – Jan 16, 2027 · 6 wk + holidays | What you already use | Object contracts · collections and costs · generics · immutability, records, enums · exceptions, Optional · streams, JVM memory |
| 2 | Databases | Jan 17, 2027 – Mar 9, 2027 · 5 wk | Java core | SQL joins, aggregates, window functions · modeling · indexes, B-trees, EXPLAIN · transactions, isolation, MVCC · JDBC, pools, pagination |
| 3 | Spring internals and JPA | Mar 10, 2027 – Apr 20, 2027 · 4 wk | Java core, Databases | IoC and auto-configuration · proxies, AOP, @Transactional · request path, Spring Security · JPA, N+1, @Version |
| 4 | Operating systems | Apr 21, 2027 – May 22, 2027 · 3 wk | Java core (JVM memory) | Processes, syscalls, signals · scheduling, OS threads · virtual memory, paging · files, descriptors, I/O |
| 5 | Concurrency | May 23, 2027 – Jul 3, 2027 · 4 wk | OS, Java core, Databases | Races, JMM, happens-before · locks, deadlock · executors, CompletableFuture, virtual threads · DB locking, idempotency |
| 6 | Networks | Jul 4, 2027 – Aug 3, 2027 · 2 wk + checkpoint | OS (sockets, I/O) | TCP/IP, TCP vs UDP · DNS · HTTP/1.1, HTTP/2, REST · TLS, certificates |
| 7 | Docker, CI/CD and deploy | Aug 4, 2027 – Sep 14, 2027 · 4 wk | OS, Networks | Namespaces, cgroups, layers · Dockerfile, Compose · Git beyond basics · CI pipelines · AWS deploy (ECS, RDS), HTTPS, backups |
| 8 | Design and architecture | Sep 15, 2027 – Nov 16, 2027 · 6 wk | Java, Spring, code in production | SOLID · design patterns · refactoring · hexagonal · DDD-lite, test strategy · ADRs, C4 |
| 9 | System design | Nov 17, 2027 – Jan 11, 2028 · 4 wk + holidays | DB, Concurrency, Networks, Design | Scaling, estimation · caching with Redis · queues, outbox · replication, partitioning |
| 10 | Applied AI | Jan 12, 2028 – Mar 25, 2028 · 7 wk | Spring, DB (pgvector), System design | LLM basics, prompting · embeddings · RAG · evals · AI in production · tool calling, agents |
| 11 | Interview sprint | Mar 26, 2028 – May 6, 2028 · 4 wk | Everything | System design interviews · mock interviews in English · project stories · CV, applications |

## Month by month

A plan week belongs to the month it starts in.

| Month | Fundamentals | LeetCode | HUB · 25 min/day |
|---|---|---|---|
| Oct 2026 | Java core (W1) | Arrays & Hashing | Literature review, questions for the professor |
| Nov 2026 | Java core (W2–W3) | Arrays & Hashing | Literature review, equipment training |
| Dec 2026 | Java core (W4–W5), holidays (W6–W7) | Two Pointers | Training; collection starts, patient names removed first |
| Jan 2027 | Java core (W8, phase exam), Databases (W9–W10) | Sliding Window, Stack | Collection: file readers |
| Feb 2027 | Databases (W11–W13, phase exam) | Stack, Binary Search | Collection; sync routine v1 starts |
| Mar 2027 | Spring and JPA (W14–W16) | Linked List, Trees | Collection ends; sync routine v1 |
| Apr 2027 | Spring and JPA (W17, phase exam), Operating systems (W18) | Trees | Data analysis |
| May 2027 | Operating systems (W19–W20, phase exam), Concurrency (W21) | Trees, Heap | Analysis; product testing |
| Jun 2027 | Concurrency (W22–W24, phase exam) | Backtracking, Tries | Product testing |
| Jul 2027 | Networks (W25–W27, phase exam), halfway checkpoint (W26) | Graphs | Write-up, innovation registration |
| Aug 2027 | Docker, CI/CD, deploy (W28–W30) | Graphs, Advanced graphs, 1-D DP | Final report and SEMUNI (crunch) |
| Sep 2027 | Docker, CI/CD, deploy (W31, phase exam), Design and architecture (W32–W33) | 1-D DP | Final report and SEMUNI; ends Sep 30 |
| Oct 2027 | Design and architecture (W34–W36) | 2-D DP, Greedy | Done |
| Nov 2027 | Design and architecture (W37, phase exam), System design (W38–W39) | Greedy, Intervals, Bit manipulation | — |
| Dec 2027 | System design (W40), holiday break (Dec 19 – Jan 1) | Bit manipulation, Math | — |
| Jan 2028 | System design (W41, phase exam), Applied AI (W42–W43) | Mixed review, mocks | — |
| Feb 2028 | Applied AI (W44–W46) | Mixed review, mocks | — |
| Mar 2028 | Applied AI (W47–W48, phase exam), Interview sprint (W49) | Mixed review, mock interviews | — |
| Apr 2028 | Interview sprint (W50–W52), goal on May 6 | Mock interviews | — |

## Monthly goals

Six goals, measured the same way every month. Fill them on the month's last Sunday, after the quiz. Codes like **W8** are questions from that plan week, not from the diagnostic.

**How a month is judged:** 5–6 goals hit = on track. 3–4 = at risk: the first week of next month goes to the gaps. 0–2 = off track: the plan shifts by one week. Targets sit at about 80% of the plan.

| Goal | Rule |
|---|---|
| Blocks done | ≥ 85% of planned blocks (one per study day; holiday weeks = 2 blocks) |
| Month quiz | ≥ 8/10, no lookup (the phase exam counts in months that have one) |
| Explained with no lookup | All of the month's diagnostic questions, out loud in 2 min |
| Deliverables shipped | ≥ 80% of the month's list |
| LeetCode solved | The month's target |
| Solved alone | The month's % target, no hints |

### October 2026 · Week 1

**Write Java's core contracts by hand.**

| Goal | Target | Result |
|---|---|---|
| Blocks done | 6 of 7 | |
| Month quiz, or the phase exam if the month has one | 8/10 | |
| Explained with no lookup | all 3 | |
| Deliverables | 2 of 2 | |
| LeetCode solved | 2 | |
| Solved alone | 30% | |

Explain with no lookup:
- [ ] **4.1a** Why HashMap lookup is O(1) and what breaks it
- [ ] **4.2a** The equals/hashCode contract
- [ ] **4.2c** Stack vs heap: where objects and references live

Deliverables:
- [ ] Member with equals/hashCode and a test that breaks a HashSet
- [ ] SimpleHashMap with resize, tested

### November 2026 · Weeks 2–3

**Know what each collection costs and start generics.**

| Goal | Target | Result |
|---|---|---|
| Blocks done | 15 of 17 | |
| Month quiz, or the phase exam if the month has one | 8/10 | |
| Explained with no lookup | all 2 | |
| Deliverables | 2 of 3 | |
| LeetCode solved | 4 | |
| Solved alone | 30% | |

Explain with no lookup:
- [ ] **4.1b** ArrayList vs LinkedList in practice
- [ ] **4.1f** Sort plus binary search vs sequential search

Deliverables:
- [ ] DynamicArray and the ArrayList vs LinkedList timing
- [ ] A Comparator chain with one test per tie-break
- [ ] Generic InMemoryRepository

### December 2026 · Weeks 4–7

**Write immutable types and domain exceptions, then rest over the holidays.**

| Goal | Target | Result |
|---|---|---|
| Blocks done | 22 of 25 | |
| Month quiz, or the phase exam if the month has one | 8/10 | |
| Explained with no lookup | all 2 | |
| Deliverables | 2 of 2 | |
| LeetCode solved | 4 | |
| Solved alone | 40% | |

Explain with no lookup:
- [ ] **4.2b** Why String is immutable
- [ ] **4.2e** Checked vs unchecked exceptions

Deliverables:
- [ ] TimeWindow record and EventType enum
- [ ] Domain exceptions and Optional, failure paths tested

### January 2027 · Weeks 8–10

**Close Java core with the phase exam and start real SQL.**

| Goal | Target | Result |
|---|---|---|
| Blocks done | 28 of 32 | |
| Month quiz, or the phase exam if the month has one | 8/10 | |
| Explained with no lookup | all 2 | |
| Deliverables | 2 of 3 | |
| LeetCode solved | 6 | |
| Solved alone | 40% | |

Explain with no lookup:
- [ ] **W8** What garbage collection does with young and old objects, at a high level
- [ ] **W9** Inner vs left vs anti join, with an example of each

Deliverables:
- [ ] Loops rewritten as streams and back
- [ ] pgexercises: joins, aggregates and window functions
- [ ] Library schema with migrations V1 to V3

### February 2027 · Weeks 11–13

**Read query plans, master transactions and use the database from Java.**

| Goal | Target | Result |
|---|---|---|
| Blocks done | 27 of 31 | |
| Month quiz, or the phase exam if the month has one | 8/10 | |
| Explained with no lookup | all 4 | |
| Deliverables | 3 of 4 | |
| LeetCode solved | 7 | |
| Solved alone | 40% | |

Explain with no lookup:
- [ ] **4.5a** How a B-tree index speeds a query and when it hurts
- [ ] **4.5d** What EXPLAIN ANALYZE shows
- [ ] **4.5b** ACID
- [ ] **4.5c** Isolation levels and their anomalies

Deliverables:
- [ ] 1M-row index experiment, plans compared
- [ ] Ranking with RANK() OVER, EXPLAIN ANALYZE before and after
- [ ] Lost update reproduced and fixed in psql
- [ ] SQL injection exploited and fixed

### March 2027 · Weeks 14–16

**See how Spring works inside.**

| Goal | Target | Result |
|---|---|---|
| Blocks done | 28 of 32 | |
| Month quiz, or the phase exam if the month has one | 8/10 | |
| Explained with no lookup | all 3 | |
| Deliverables | 2 of 3 | |
| LeetCode solved | 7 | |
| Solved alone | 50% | |

Explain with no lookup:
- [ ] **4.4a** IoC and dependency injection
- [ ] **4.4b** Why @Transactional fails on self-invocation
- [ ] **4.4d** The request path inside Spring

Deliverables:
- [ ] Tiny DI container with reflection
- [ ] JDK proxy and the self-invocation test
- [ ] Filter and interceptor order logged, request path drawn

### April 2027 · Weeks 17–18

**Finish Spring and JPA, then start operating systems.**

| Goal | Target | Result |
|---|---|---|
| Blocks done | 18 of 21 | |
| Month quiz, or the phase exam if the month has one | 8/10 | |
| Explained with no lookup | all 2 | |
| Deliverables | 2 of 2 | |
| LeetCode solved | 5 | |
| Solved alone | 50% | |

Explain with no lookup:
- [ ] **4.4c** The N+1 problem and its fixes
- [ ] **4.6a** Process vs thread

Deliverables:
- [ ] N+1 reproduced and fixed by query count
- [ ] Graceful shutdown on SIGTERM

### May 2027 · Weeks 19–21

**Understand scheduling and memory, then start concurrency.**

| Goal | Target | Result |
|---|---|---|
| Blocks done | 27 of 31 | |
| Month quiz, or the phase exam if the month has one | 8/10 | |
| Explained with no lookup | all 2 | |
| Deliverables | 2 of 3 | |
| LeetCode solved | 7 | |
| Solved alone | 50% | |

Explain with no lookup:
- [ ] **4.1c** When to use a heap
- [ ] **4.3a** Race conditions

Deliverables:
- [ ] Scheduler simulator with tests
- [ ] OutOfMemoryError caused and heap dump read
- [ ] Counter fixed 3 ways, each proven by a test

### June 2027 · Weeks 22–24

**Write code that is safe under concurrency.**

| Goal | Target | Result |
|---|---|---|
| Blocks done | 28 of 32 | |
| Month quiz, or the phase exam if the month has one | 8/10 | |
| Explained with no lookup | all 3 | |
| Deliverables | 2 of 3 | |
| LeetCode solved | 6 | |
| Solved alone | 55% | |

Explain with no lookup:
- [ ] **4.3c** Deadlock and how to avoid it
- [ ] **4.2d** Virtual threads
- [ ] **4.3b** Optimistic vs pessimistic locking

Deliverables:
- [ ] Deadlock found with jstack and fixed
- [ ] Fixed pool vs virtual threads measured
- [ ] Optimistic lock conflict reproduced, with a retry

### July 2027 · Weeks 25–27

**Pass the halfway checkpoint and understand the network under your code.**

| Goal | Target | Result |
|---|---|---|
| Blocks done | 27 of 31 | |
| Month quiz plus the halfway checkpoint | 8/10 | |
| Explained with no lookup | all 4 | |
| Deliverables | 2 of 3 | |
| LeetCode solved | 5 | |
| Solved alone | 60% | |

Explain with no lookup:
- [ ] **4.1d** BFS vs DFS
- [ ] **4.6c** TCP vs UDP
- [ ] **4.6b** What happens when you open https://google.com
- [ ] **4.6d** What HTTPS adds

Deliverables:
- [ ] TCP echo server and client
- [ ] Handshake watched in Wireshark
- [ ] HTTP request sent over a raw socket

### August 2027 · Weeks 28–30

**Containers, Compose, Git and CI, by hand.**

| Goal | Target | Result |
|---|---|---|
| Blocks done | 28 of 32 | |
| Month quiz, or the phase exam if the month has one | 8/10 | |
| Explained with no lookup | all 2 | |
| Deliverables | 3 of 4 | |
| LeetCode solved | 6 | |
| Solved alone | 60% | |

Explain with no lookup:
- [ ] **4.8a** Image vs container
- [ ] **4.8b** What a CI pipeline must do before production

Deliverables:
- [ ] Shell in its own namespace with unshare
- [ ] Compose with healthcheck
- [ ] Bad commit found with git bisect
- [ ] CI blocks a failing merge

### September 2027 · Weeks 31–33

**Deploy to AWS and start software design.**

| Goal | Target | Result |
|---|---|---|
| Blocks done | 27 of 31 | |
| Month quiz, or the phase exam if the month has one | 8/10 | |
| Explained with no lookup | all 3 | |
| Deliverables | 2 of 3 | |
| LeetCode solved | 7 | |
| Solved alone | 60% | |

Explain with no lookup:
- [ ] **4.8c** How to put a Spring + Postgres API online
- [ ] **4.7b** A SOLID principle with a real example
- [ ] **4.1e** Dynamic programming

Deliverables:
- [ ] Backup restored into a fresh database
- [ ] Two SOLID violations fixed in a real class
- [ ] 7 pattern examples with tests

### October 2027 · Weeks 34–36

**Refactor safely and structure code with hexagonal architecture.**

| Goal | Target | Result |
|---|---|---|
| Blocks done | 28 of 32 | |
| Month quiz, or the phase exam if the month has one | 8/10 | |
| Explained with no lookup | all 2 | |
| Deliverables | 2 of 2 | |
| LeetCode solved | 7 | |
| Solved alone | 50% | |

Explain with no lookup:
- [ ] **4.7c** Hexagonal architecture
- [ ] **4.7a** Unit vs integration tests

Deliverables:
- [ ] Gilded Rose refactored under tests
- [ ] Console adapter that drives the use cases from tests

### November 2027 · Weeks 37–39

**Document decisions and start system design.**

| Goal | Target | Result |
|---|---|---|
| Blocks done | 27 of 31 | |
| Month quiz, or the phase exam if the month has one | 8/10 | |
| Explained with no lookup | all 1 | |
| Deliverables | 2 of 3 | |
| LeetCode solved | 7 | |
| Solved alone | 50% | |

Explain with no lookup:
- [ ] **4.7d** The main risk of a Redis cache

Deliverables:
- [ ] 3 ADRs and C4 diagrams
- [ ] Back-of-the-envelope estimate for 10,000 groups
- [ ] Cache measured with and without

### December 2027 · Week 40

**Queues and async messaging, then rest over the holidays.**

| Goal | Target | Result |
|---|---|---|
| Blocks done | 10 of 11 | |
| Month quiz, or the phase exam if the month has one | 8/10 | |
| Explained with no lookup | all 1 | |
| Deliverables | 1 of 1 | |
| LeetCode solved | 2 | |
| Solved alone | 65% | |

Explain with no lookup:
- [ ] **W40** Queue vs log: when you pick SQS and when Kafka

Deliverables:
- [ ] Kafka producer, consumer and outbox; SQS dead-letter queue

### January 2028 · Weeks 41–43

**Design systems out loud and start applied AI.**

| Goal | Target | Result |
|---|---|---|
| Blocks done | 27 of 31 | |
| Month quiz, or the phase exam if the month has one | 8/10 | |
| Explained with no lookup | all 4 | |
| Deliverables | 2 of 3 | |
| LeetCode solved | 5 | |
| Solved alone | 65% | |

Explain with no lookup:
- [ ] **SD1** Design a URL shortener out loud in 30 minutes
- [ ] **SD2** Design a rate limiter out loud in 30 minutes
- [ ] **4.9a** Tokens and context windows
- [ ] **4.9b** Embeddings

Deliverables:
- [ ] 2 recorded designs
- [ ] Claude API client in Java with structured output
- [ ] pgvector nearest-neighbor demo

### February 2028 · Weeks 44–46

**RAG, evals and AI in production.**

| Goal | Target | Result |
|---|---|---|
| Blocks done | 28 of 32 | |
| Month quiz, or the phase exam if the month has one | 8/10 | |
| Explained with no lookup | all 2 | |
| Deliverables | 2 of 3 | |
| LeetCode solved | 5 | |
| Solved alone | 65% | |

Explain with no lookup:
- [ ] **4.9c** The RAG pipeline
- [ ] **4.9e** How to know an AI system got better

Deliverables:
- [ ] Chunk sizes compared
- [ ] Eval run before and after a prompt change
- [ ] Prompt injection test and fixes

### March 2028 · Weeks 47–49

**Build reliable agents and start interview prep.**

| Goal | Target | Result |
|---|---|---|
| Blocks done | 27 of 31 | |
| Month quiz, or the phase exam if the month has one | 8/10 | |
| Explained with no lookup | all 2 | |
| Deliverables | 2 of 2 | |
| LeetCode solved | 5 | |
| Solved alone | 70% | |

Explain with no lookup:
- [ ] **4.9d** Tool calling: who runs the tool
- [ ] **SD3** Design a notification system out loud

Deliverables:
- [ ] Tool loop written by hand
- [ ] CV and LinkedIn rewritten

### April 2028 · Weeks 50–52

**Hit the gold-junior bar.**

| Goal | Target | Result |
|---|---|---|
| Blocks done | 28 of 32 | |
| Mock interviews passed | 3/4 | |
| Explained with no lookup | all 1 | |
| Deliverables | 5 of 5 | |
| Interview problems solved | 4 | |
| Solved alone | 70% | |

Explain with no lookup:
- [ ] **DX** Full diagnostic with no lookup: 3 or more in every area except front-end

Deliverables:
- [ ] 6 STAR stories told in English
- [ ] 45-minute mock interview in English
- [ ] 5 applications sent
- [ ] Full diagnostic retaken
- [ ] Year-2 plan written

## The weekly blocks

Every day is 1h of study here, then 1h of project. A plan week takes 10 or 11 of these days (see Pace at the top).

| Day | Study (1h) | What |
|---|---|---|
| Sun | Fundamentals | Read the week's chapters. Notes by hand. |
| Mon | Fundamentals | Study the topics, start the lab. |
| Tue | LeetCode | 1 new problem (30 min) and the due reviews. |
| Wed | Fundamentals | Go on with the lab. |
| Thu | Fundamentals | Finish the lab, explain it to an AI tutor. |
| Fri | LeetCode | 1 new problem (30 min) and the due reviews. |
| Sat | Blank page | Rewrite the lab from memory, then record 5 min explaining it in English. |

**Project (1h, every day):** you pick the project. Planned and tracked in its own repo.

HUB: 25 minutes before the block, Monday to Friday, outside the 14 hours.

## Week by week

### October 2026

> **HUB, 25 min/day:** literature review · write the questions for the professor: which event aligns the two clocks, what each machine exports

#### Week 1 · Oct 18 – Nov 6 · Java core

**Object contracts, hashing and memory**

- **Topics:** The equals/hashCode contract · how HashMap works inside (buckets, load factor 0.75, a crowded bucket turns into a tree) · why a mutable key gets lost · stack vs heap
- **Read:** Effective Java Items 10, 11, 17
- **Lab:** Member with a correct equals/hashCode and a test that breaks a HashSet · your own SimpleHashMap with resize · a test that loses a mutable key
- **LeetCode:** #1 Two Sum · #217 Contains Duplicate · #242 Valid Anagram
- **Weekly doc:** [weeks/week-01.md](weeks/week-01.md)
- [ ] Week done

### November 2026

> **HUB, 25 min/day:** literature review and equipment training

#### Week 2 · Nov 7 – 21 · Java core

**Collections and their costs**

- **Topics:** List, Set, Map and Deque implementations · Big-O of each operation · ArrayList growth and amortized O(1) · ArrayList vs LinkedList in practice · Comparable and Comparator
- **Read:** Effective Java Item 14 · javadocs of ArrayList, HashMap, TreeMap, ArrayDeque
- **Lab:** Your own DynamicArray with growth · time 100k inserts in ArrayList vs LinkedList and explain the result · a Comparator chain (comparing, thenComparing, reversed) with one test per tie-break
- **LeetCode:** #49 Group Anagrams · #347 Top K Frequent Elements · #238 Product of Array Except Self
- [ ] Week done

#### Week 3 · Nov 22 – Dec 1 · Java core

**Generics**

- **Topics:** Type parameters and bounded types · wildcards and PECS (? extends, ? super) · type erasure and its limits · generic methods
- **Read:** Effective Java Items 26–31
- **Lab:** A generic InMemoryRepository<T, ID> · a copy method that only compiles with the right wildcards
- **LeetCode:** #36 Valid Sudoku · #128 Longest Consecutive Sequence · review #49
- **Carried from week 2 (Nov 10):** convert `DynamicArray` from `int[]` to `DynamicArray<T>` with an `Object[]` + `(T)` cast, tests on `DynamicArray<Integer>` and `DynamicArray<String>`. The why (no `new T[]`: arrays keep their type at runtime, `T` is erased) was covered on Nov 10
- [ ] Week done

### December 2026

> **HUB, 25 min/day:** equipment training · data collection starts: remove patient names before anything else

#### Week 4 · Dec 2 – 12 · Java core

**Immutability, records and enums**

- **Topics:** Immutable classes and defensive copies · records and compact constructors · enums with behavior · value objects
- **Read:** Effective Java Items 17, 34, 50
- **Lab:** A TimeWindow record that validates itself · an EventType enum that carries its points
- **Carried from week 1 (Nov 6):** the `record` version of the mutable key (`Person`) with a test that `get` still finds it · predict: a `record` with a `List<String>` component, `add` after `put`: is the key lost, and what would a compact constructor do about it?
- **LeetCode:** #125 Valid Palindrome · #167 Two Sum II · #15 3Sum
- [ ] Week done

#### Week 5 · Dec 13 – 19 and Jan 3 – 5 · Java core

**Exceptions and Optional**

- **Topics:** Checked vs unchecked · designing domain exceptions · try-with-resources · Optional instead of null
- **Read:** Effective Java Items 55, 69–77
- **Lab:** A domain exception hierarchy · null returns replaced with Optional · tests for every failure path
- **LeetCode:** #11 Container With Most Water · #42 Trapping Rain Water · review #15
- **Note:** Split by the holidays: Dec 13 – 19, then Jan 3 – 5 to finish it.
- [ ] Week done

#### Week 6 · Dec 20 – 26 · Holidays · `Holiday`

**Christmas week**

- **Topics:** No new topic
- **Read:** None
- **Lab:** Optional: finish anything left from weeks 3–5
- **LeetCode:** Reviews only: every problem you didn't solve alone
- **Blocks planned:** 2
- [ ] Week done

#### Week 7 · Dec 27 – Jan 2 · Holidays · `Holiday`

**New Year week**

- **Topics:** No new topic
- **Read:** None
- **Lab:** Blank page: explain generics, records and exceptions out loud, no notes
- **LeetCode:** Reviews only
- **Blocks planned:** 2
- [ ] Week done

### January 2027

> **HUB, 25 min/day:** data collection: file readers for EMG (EDF/CSV) and ultrasound (DICOM/AVI)

#### Week 8 · Jan 6 – 16 · Java core · `Phase exam`

**Streams, lambdas and the JVM**

- **Topics:** Lambdas and method references · collectors: groupingBy, partitioningBy, toMap · JVM memory areas · garbage collection and generations at a high level
- **Read:** Effective Java Items 42–48
- **Lab:** Rewrite 5 loops as streams and 5 streams as loops · draw the JVM memory of one request · Java core quiz (8/10 to pass)
- **LeetCode:** #121 Best Time to Buy and Sell Stock · #3 Longest Substring Without Repeating Characters · #424 Longest Repeating Character Replacement
- [ ] Week done

#### Week 9 · Jan 17 – 26 · Databases

**SQL beyond the basics**

- **Topics:** Inner, left and anti joins · GROUP BY and HAVING · subqueries vs CTEs · window functions: ROW_NUMBER, RANK, SUM OVER
- **Read:** PostgreSQL docs: Tutorial (Advanced Features) and Window Functions
- **Lab:** pgexercises.com: the joins, aggregates and window function sections
- **LeetCode:** #567 Permutation in String · #76 Minimum Window Substring · review #3
- [ ] Week done

#### Week 10 · Jan 27 – Feb 6 · Databases

**Data modeling**

- **Topics:** Normal forms 1NF–3NF and when to denormalize · keys and constraints: PK, FK, UNIQUE, CHECK · modeling N:N · migrations
- **Read:** PostgreSQL docs: Data Definition (constraints) · Flyway docs: getting started
- **Lab:** Model a small library system and write its migrations V1 to V3
- **LeetCode:** #20 Valid Parentheses · #155 Min Stack · #150 Evaluate Reverse Polish Notation
- [ ] Week done

### February 2027

> **HUB, 25 min/day:** data collection · sync routine v1 starts

#### Week 11 · Feb 7 – 16 · Databases · `Carnival`

**Indexes and query plans**

- **Topics:** How a B-tree index works · composite indexes and column order · when an index hurts · reading EXPLAIN and EXPLAIN ANALYZE
- **Read:** Use The Index, Luke! chapters 1–3
- **Lab:** Load 1M rows, time a query, add the right index, compare the two plans · a ranking query with RANK() OVER, EXPLAIN ANALYZE before and after its index
- **LeetCode:** #22 Generate Parentheses · #739 Daily Temperatures · #853 Car Fleet
- **Note:** Carnival is Monday and Tuesday (Feb 8 – 9, 2027): move those two study hours to other days of the plan week.
- [ ] Week done

#### Week 12 · Feb 17 – 27 · Databases

**Transactions and isolation**

- **Topics:** ACID · isolation levels: read committed, repeatable read, serializable · anomalies: dirty read, non-repeatable read, phantom, lost update · MVCC in Postgres
- **Read:** PostgreSQL docs: Concurrency Control chapter
- **Lab:** Two psql sessions: reproduce a lost update, then fix it with SELECT … FOR UPDATE and with serializable
- **LeetCode:** #704 Binary Search · #74 Search a 2D Matrix · #875 Koko Eating Bananas
- [ ] Week done

#### Week 13 · Feb 28 – Mar 9 · Databases · `Phase exam`

**Databases from Java**

- **Topics:** JDBC and prepared statements · SQL injection · connection pooling with HikariCP · offset vs keyset pagination
- **Read:** HikariCP wiki: About Pool Sizing · PostgreSQL JDBC driver docs
- **Lab:** Exploit a string-built query with SQL injection, then fix it · keyset pagination over 1M rows · databases quiz (8/10)
- **LeetCode:** #153 Find Minimum in Rotated Sorted Array · #33 Search in Rotated Sorted Array · #981 Time Based Key-Value Store
- [ ] Week done

### March 2027

> **HUB, 25 min/day:** collection ends · sync routine v1 on real data

#### Week 14 · Mar 10 – 20 · Spring and JPA

**The IoC container**

- **Topics:** ApplicationContext and bean definitions · scopes and lifecycle · constructor injection · how Spring Boot auto-configuration picks beans (@Conditional)
- **Read:** Spring Framework reference: The IoC Container · Spring Boot reference: Auto-configuration
- **Lab:** Build a tiny DI container with reflection: register classes, resolve them by constructor
- **LeetCode:** #206 Reverse Linked List · #21 Merge Two Sorted Lists · #143 Reorder List
- [ ] Week done

#### Week 15 · Mar 21 – 30 · Spring and JPA

**Proxies, AOP and transactions**

- **Topics:** JDK dynamic proxies vs CGLIB · how @Transactional, @Async and @Cacheable work · the self-invocation trap · propagation and rollback rules
- **Read:** Spring Framework reference: AOP and Declarative Transaction Management
- **Lab:** A JDK dynamic proxy that logs timing · a test that reproduces the self-invocation bug
- **LeetCode:** #19 Remove Nth Node From End of List · #141 Linked List Cycle · #2 Add Two Numbers
- [ ] Week done

#### Week 16 · Mar 31 – Apr 10 · Spring and JPA

**The request path and Spring Security**

- **Topics:** Servlet container and filter chain · DispatcherServlet, handler mapping, message converters · validation and @ControllerAdvice · SecurityFilterChain and where a JWT filter sits
- **Read:** Spring Framework reference: DispatcherServlet · Spring Security reference: Architecture
- **Lab:** A custom Filter and a HandlerInterceptor that log the order they run in · draw the full request path
- **LeetCode:** #226 Invert Binary Tree · #104 Maximum Depth of Binary Tree · #100 Same Tree
- [ ] Week done

### April 2027

> **HUB, 25 min/day:** data analysis

#### Week 17 · Apr 11 – 20 · Spring and JPA · `Phase exam`

**JPA and Hibernate**

- **Topics:** Entity states and the persistence context · dirty checking and flush · LAZY vs EAGER · N+1 and JOIN FETCH or @EntityGraph · @Version
- **Read:** Hibernate ORM user guide: persistence context and fetching
- **Lab:** Reproduce an N+1, count the queries, fix it · Spring quiz (8/10)
- **LeetCode:** #572 Subtree of Another Tree · #543 Diameter of Binary Tree · #110 Balanced Binary Tree
- [ ] Week done

#### Week 18 · Apr 21 – May 1 · Operating systems

**Processes**

- **Topics:** Program vs process · system calls, fork and exec · process states and context switches · signals: SIGTERM vs SIGKILL · ps, top and kill on Linux
- **Read:** OSTEP chapters 4–6
- **Lab:** On WSL: run your Java app, inspect it with ps, top and jcmd, send SIGTERM and handle it with a shutdown hook
- **LeetCode:** #102 Binary Tree Level Order Traversal · #199 Binary Tree Right Side View · #235 Lowest Common Ancestor of a BST
- [ ] Week done

### May 2027

> **HUB, 25 min/day:** data analysis · product testing

#### Week 19 · May 2 – 11 · Operating systems

**Scheduling and OS threads**

- **Topics:** FIFO, SJF, round robin, MLFQ · kernel threads vs user threads · what a JVM thread is to the OS
- **Read:** OSTEP chapters 7, 8 and 26
- **Lab:** A round robin vs FIFO simulator in Java that computes average turnaround time, with tests
- **LeetCode:** #98 Validate Binary Search Tree · #230 Kth Smallest Element in a BST · #1448 Count Good Nodes in Binary Tree
- [ ] Week done

#### Week 20 · May 12 – 22 · Operating systems · `Phase exam`

**Memory and I/O**

- **Topics:** Address spaces and virtual memory · paging and the TLB at a high level · the JVM heap inside the process · file descriptors, buffering, blocking vs non-blocking I/O
- **Read:** OSTEP chapters 13, 15, 18, 36, 39
- **Lab:** Cause an OutOfMemoryError on purpose and read the heap dump · read a big file buffered vs unbuffered and time it · OS quiz (8/10)
- **LeetCode:** #703 Kth Largest Element in a Stream · #1046 Last Stone Weight · #973 K Closest Points to Origin
- [ ] Week done

#### Week 21 · May 23 – Jun 1 · Concurrency

**Thread safety**

- **Topics:** Race conditions and atomicity · visibility and the Java Memory Model · happens-before · volatile and synchronized
- **Read:** Java Concurrency in Practice chapters 1–3
- **Lab:** A counter shared by 8 threads that loses updates · fix it with synchronized, AtomicInteger and LongAdder, each proven by a test
- **LeetCode:** #215 Kth Largest Element in an Array · #621 Task Scheduler · #355 Design Twitter
- [ ] Week done

### June 2027

> **HUB, 25 min/day:** product testing

#### Week 22 · Jun 2 – 12 · Concurrency

**Locks and coordination**

- **Topics:** ReentrantLock and ReadWriteLock · condition variables and semaphores · CountDownLatch · deadlock, livelock, starvation · lock ordering
- **Read:** Java Concurrency in Practice chapters 5 and 10 · OSTEP chapters 28, 30–32
- **Lab:** Cause a deadlock with two locks, find it with jstack, fix it with lock ordering · a bounded producer-consumer buffer
- **LeetCode:** #78 Subsets · #39 Combination Sum · #46 Permutations
- [ ] Week done

#### Week 23 · Jun 13 – 22 · Concurrency

**Executors, async and virtual threads**

- **Topics:** Thread pools and sizing · ExecutorService and ScheduledExecutorService · CompletableFuture · virtual threads and when they help
- **Read:** Java Concurrency in Practice chapters 6 and 8 · CompletableFuture javadoc · JEP 444 (virtual threads)
- **Lab:** Simulate 1,000 I/O calls with a fixed pool vs virtual threads and measure
- **LeetCode:** #90 Subsets II · #40 Combination Sum II · #79 Word Search
- [ ] Week done

#### Week 24 · Jun 23 – Jul 3 · Concurrency · `Phase exam`

**Concurrency in the database**

- **Topics:** Optimistic (@Version) vs pessimistic (SELECT … FOR UPDATE) locking · idempotency keys · at-least-once delivery · retries with backoff
- **Read:** Designing Data-Intensive Applications (1st ed.) chapter 7, first half · Spring Data JPA reference: locking
- **Lab:** Two threads update the same row: watch the optimistic lock fail and retry · concurrency quiz (8/10)
- **LeetCode:** #208 Implement Trie · #211 Design Add and Search Words Data Structure · review #79
- [ ] Week done

### July 2027

> **HUB, 25 min/day:** write-up and innovation registration

#### Week 25 · Jul 4 – 13 · Networks

**Layers, TCP, UDP and DNS**

- **Topics:** TCP/IP layers · IP addresses and ports · TCP handshake, flow and congestion control · UDP and where it fits · DNS resolution
- **Read:** High Performance Browser Networking chapters 1–3 · Cloudflare Learning Center: What is DNS?
- **Lab:** A TCP echo server and client in Java · watch the handshake in Wireshark · trace a domain with dig
- **LeetCode:** #200 Number of Islands · #695 Max Area of Island · #133 Clone Graph
- [ ] Week done

#### Week 26 · Jul 14 – 24 · Checkpoint · `Checkpoint`

**Halfway checkpoint**

- **Topics:** Retake diagnostic sections 4.1 to 4.6 with no lookup · target 2.5 or more in every area studied so far
- **Read:** Your notes and blank pages from weeks 1–25
- **Lab:** Fill the gaps the retake shows, one gap per block
- **LeetCode:** 1 mock interview · reviews of everything you didn't solve alone
- [ ] Week done

#### Week 27 · Jul 25 – Aug 3 · Networks · `Phase exam`

**HTTP and TLS**

- **Topics:** HTTP/1.1 methods, status codes, headers, caching, keep-alive · HTTP/2 multiplexing · REST design · TLS handshake and certificate chains · CORS
- **Read:** High Performance Browser Networking chapters 4, 9, 11, 12
- **Lab:** Send an HTTP request by hand over a raw socket · read a certificate chain with openssl s_client · networks quiz (8/10)
- **LeetCode:** #994 Rotting Oranges · #207 Course Schedule · #210 Course Schedule II
- [ ] Week done

### August 2027

> **HUB, 25 min/day:** final report and SEMUNI (crunch: borrows the Friday LeetCode hour)

#### Week 28 · Aug 4 – 14 · Docker, CI/CD, deploy

**Containers from the inside**

- **Topics:** Namespaces and cgroups · image layers · image vs container · Dockerfile instructions, multi-stage builds, layer caching
- **Read:** Docker docs: Building images and Multi-stage builds
- **Lab:** Run a shell in its own namespace with unshare on WSL · build a small Spring Boot app's image single-stage vs multi-stage and compare sizes
- **LeetCode:** #684 Redundant Connection · #127 Word Ladder · review #207
- [ ] Week done

#### Week 29 · Aug 15 – 24 · Docker, CI/CD, deploy

**Compose and Git beyond the basics**

- **Topics:** Compose networks, volumes, healthchecks · env files and secrets · rebase, interactive rebase, conflict resolution, bisect
- **Read:** Docker docs: Compose · Pro Git chapters 3 and 7
- **Lab:** Compose with app + Postgres + healthcheck · break a commit on purpose and find it with git bisect
- **LeetCode:** #743 Network Delay Time · #1584 Min Cost to Connect All Points · #787 Cheapest Flights Within K Stops
- [ ] Week done

#### Week 30 · Aug 25 – Sep 4 · Docker, CI/CD, deploy

**CI/CD**

- **Topics:** Pipeline stages: build, test, static analysis, image, push · GitHub Actions workflows, caching, secrets · branch protection · trunk-based development
- **Read:** GitHub Actions docs: Understanding GitHub Actions, Building and testing Java with Maven
- **Lab:** Make a test fail on purpose and watch the pipeline block the merge
- **LeetCode:** #70 Climbing Stairs · #746 Min Cost Climbing Stairs · #198 House Robber
- [ ] Week done

### September 2027

> **HUB, 25 min/day:** final report and SEMUNI · the scholarship ends Sep 30

#### Week 31 · Sep 5 – 14 · Docker, CI/CD, deploy · `Live` `Phase exam`

**Deploy to AWS**

- **Topics:** AWS basics: regions, IAM users and roles, a billing alert before anything else · VPC and security groups · Postgres on RDS · the app's container on ECS Fargate, with the image in ECR · load balancer, HTTPS (ACM certificate) and DNS records · RDS snapshots, CloudWatch logs and healthchecks
- **Read:** AWS docs: getting started with ECS on Fargate · getting started with RDS for PostgreSQL · AWS Budgets
- **Lab:** Deploy a Spring + Postgres app with ECS and RDS · restore a snapshot into a fresh database to prove the backup works · deploy quiz (8/10)
- **LeetCode:** #213 House Robber II · #5 Longest Palindromic Substring · #647 Palindromic Substrings
- [ ] Week done

#### Week 32 · Sep 15 – 25 · Design and architecture

**Cohesion, coupling and SOLID**

- **Topics:** Deep vs shallow modules · cohesion and coupling · SOLID with real examples · composition over inheritance
- **Read:** A Philosophy of Software Design chapters 1–6 · Effective Java Item 18
- **Lab:** List every SOLID violation in one class of a real codebase (an old project of yours works) and fix two
- **LeetCode:** #91 Decode Ways · #322 Coin Change · #152 Maximum Product Subarray
- [ ] Week done

#### Week 33 · Sep 26 – Oct 5 · Design and architecture

**Design patterns that matter**

- **Topics:** Strategy, Factory, Builder, Adapter, Decorator, Observer, Template Method · where Spring uses each one
- **Read:** Head First Design Patterns, 2nd ed.: the chapters on those patterns
- **Lab:** Each pattern in a 30-line example with a test · find 3 of them in Spring's source
- **LeetCode:** #139 Word Break · #300 Longest Increasing Subsequence · #416 Partition Equal Subset Sum
- [ ] Week done

### October 2027

> **HUB, 25 min/day:** done

#### Week 34 · Oct 6 – 16 · Design and architecture

**Refactoring**

- **Topics:** Code smells · characterization tests before refactoring · Extract Function, Replace Conditional with Polymorphism, Introduce Parameter Object
- **Read:** Refactoring, 2nd ed., chapters 1–3, with the catalog as reference
- **Lab:** The Gilded Rose kata: characterization tests first, then refactor
- **LeetCode:** #62 Unique Paths · #1143 Longest Common Subsequence · #309 Best Time to Buy and Sell Stock with Cooldown
- [ ] Week done

#### Week 35 · Oct 17 – 26 · Design and architecture

**Hexagonal architecture**

- **Topics:** Ports and adapters · the dependency rule · use cases as the application layer · mapping between layers
- **Read:** Get Your Hands Dirty on Clean Architecture, 2nd ed., first half
- **Lab:** Draw the hexagon of a small app: domain, ports, adapters
- **LeetCode:** #518 Coin Change II · #494 Target Sum · #72 Edit Distance
- [ ] Week done

#### Week 36 · Oct 27 – Nov 6 · Design and architecture

**DDD-lite and test strategy**

- **Topics:** Entities, value objects, aggregates and invariants · domain events · the test pyramid · stubs, mocks and fakes: what to mock and what not
- **Read:** Get Your Hands Dirty on Clean Architecture, second half
- **Lab:** A console adapter that drives a small app's use cases from tests, without touching the domain
- **LeetCode:** #53 Maximum Subarray · #55 Jump Game · #45 Jump Game II
- [ ] Week done

### November 2027

#### Week 37 · Nov 7 – 16 · Design and architecture · `Phase exam`

**Decisions and documentation**

- **Topics:** Architecture Decision Records · C4 diagrams: context, container, component · a README that explains decisions
- **Read:** adr.github.io · c4model.com
- **Lab:** Design quiz (8/10)
- **LeetCode:** #134 Gas Station · #763 Partition Labels · #678 Valid Parenthesis String
- [ ] Week done

#### Week 38 · Nov 17 – 27 · System design

**Scaling and estimation**

- **Topics:** Vertical vs horizontal scaling · load balancers and stateless services · latency numbers · back-of-the-envelope estimation
- **Read:** Designing Data-Intensive Applications (1st ed.) chapter 1 · System Design Interview vol. 1 chapters 1–2
- **Lab:** Estimate requests per second and storage for a group-scheduling app serving 10,000 groups
- **LeetCode:** #57 Insert Interval · #56 Merge Intervals · #435 Non-overlapping Intervals
- [ ] Week done

#### Week 39 · Nov 28 – Dec 7 · System design

**Caching**

- **Topics:** Cache-aside and write-through · TTL and invalidation · cache stampede · Redis data types
- **Read:** Redis docs: data types and key expiration
- **Lab:** Measure the ranking endpoint with and without the cache
- **LeetCode:** #136 Single Number · #191 Number of 1 Bits · #338 Counting Bits
- [ ] Week done

### December 2027

#### Week 40 · Dec 8 – 18 · System design

**Queues and async messaging**

- **Topics:** Queue vs log: SQS vs Kafka · Kafka topics, partitions, consumer groups and offsets · SQS visibility timeout and dead-letter queues · at-least-once delivery and idempotent consumers · the outbox pattern
- **Read:** Kafka docs: Introduction and Quickstart · Amazon SQS developer guide: how queues work, dead-letter queues · Designing Data-Intensive Applications (1st ed.) chapter 11, first part
- **Lab:** Producer and consumer with Kafka in Compose · an outbox table with a poller · on SQS (LocalStack), a message that keeps failing until it lands in the dead-letter queue
- **LeetCode:** #268 Missing Number · #371 Sum of Two Integers · #48 Rotate Image
- [ ] Week done

> **Holiday break · Dec 19, 2027 – Jan 1, 2028:** not a plan week. Keep it light: LeetCode reviews and the blank page only (house rule 9).

### January 2028

#### Week 41 · Jan 2 – 11 · System design · `Phase exam`

**Data at scale and design interviews**

- **Topics:** Replication and lag · partitioning · consistency trade-offs · the interview framework: requirements, estimation, high level, deep dive
- **Read:** Designing Data-Intensive Applications (1st ed.) chapters 5–6 · System Design Interview vol. 1 chapters 3–4
- **Lab:** Design out loud, recorded: a URL shortener and a rate limiter · system design quiz (8/10)
- **LeetCode:** 2 mixed mediums + reviews · 1 mock interview
- [ ] Week done

#### Week 42 · Jan 12 – 22 · Applied AI

**LLM fundamentals**

- **Topics:** Tokens and context windows · sampling and temperature · prompting: structure, examples, structured output · cost and latency
- **Read:** AI Engineering (Chip Huyen) chapters 1, 2 and 5
- **Lab:** A Java client for the Claude API with structured JSON output and token counting
- **LeetCode:** 2 mixed mediums + reviews
- [ ] Week done

#### Week 43 · Jan 23 – Feb 1 · Applied AI

**Embeddings and vector search**

- **Topics:** What an embedding is · cosine similarity · vector indexes (HNSW) at a high level · pgvector
- **Read:** pgvector README · AI Engineering chapter 6, the retrieval part
- **Lab:** Embed 200 essay excerpts into pgvector and query the nearest ones
- **LeetCode:** 2 mixed mediums + reviews · 1 mock interview
- [ ] Week done

### February 2028

#### Week 44 · Feb 2 – 12 · Applied AI

**RAG**

- **Topics:** Chunking · retrieval and reranking · building the context · how RAG fails
- **Read:** AI Engineering chapter 6
- **Lab:** Compare 3 chunk sizes on the same 20 questions
- **LeetCode:** 2 mixed mediums + reviews
- [ ] Week done

#### Week 45 · Feb 13 – 22 · Applied AI

**Evals**

- **Topics:** Eval sets and metrics · LLM-as-judge and its pitfalls · regression tests for prompts
- **Read:** AI Engineering chapters 3–4
- **Lab:** Run the eval before and after one prompt change and record the difference
- **LeetCode:** 2 mixed mediums + reviews · 1 mock interview
- [ ] Week done

#### Week 46 · Feb 23 – Mar 4 · Applied AI · `Launch` `Carnival`

**AI in production**

- **Topics:** Prompt injection and guardrails · personal data in prompts · cost control and caching · logging and tracing LLM calls
- **Read:** AI Engineering chapter 5 (defensive prompt engineering) and chapter 10
- **Lab:** Attack your own app with prompt injection and fix what gets through
- **LeetCode:** 2 mixed mediums + reviews
- **Note:** Carnival is Monday and Tuesday (Feb 28 – 29, 2028): move those two study hours to other days of the plan week.
- [ ] Week done

### March 2028

#### Week 47 · Mar 5 – 14 · Applied AI

**Tool calling and agents**

- **Topics:** The tool-use loop: the model asks, your code runs the tool · agent loops · when not to use an agent
- **Read:** Anthropic docs: tool use · AI Engineering chapter 6, the agents part
- **Lab:** A tool loop written by hand with 2 tools
- **LeetCode:** 2 mixed mediums + reviews · 1 mock interview
- [ ] Week done

#### Week 48 · Mar 15 – 25 · Applied AI · `Phase exam`

**Reliable agents**

- **Topics:** Evaluating tool choice · confirmation before actions · limits, timeouts and failure handling
- **Read:** Anthropic: Building effective agents
- **Lab:** AI quiz (8/10)
- **LeetCode:** 2 mixed mediums + reviews
- [ ] Week done

#### Week 49 · Mar 26 – Apr 4 · Interview sprint

**System design interviews**

- **Topics:** The framework end to end · URL shortener · notification system
- **Read:** System Design Interview vol. 1 chapters 8 and 10
- **Lab:** 2 designs out loud, recorded, 45 minutes each
- **LeetCode:** 2 mock interviews, one in English
- **Career:** CV and LinkedIn rewritten around your projects and the HUB project
- [ ] Week done

### April 2028

#### Week 50 · Apr 5 – 15 · Interview sprint

**Stories from your projects**

- **Topics:** STAR stories from your projects · explaining a technical decision · chat system design
- **Read:** System Design Interview vol. 1 chapter 12
- **Lab:** Write 6 STAR stories and tell each one in English in 2 minutes
- **LeetCode:** 2 mock interviews
- **Career:** Maintenance · project READMEs polished
- [ ] Week done

#### Week 51 · Apr 16 – 25 · Interview sprint

**Java and Spring deep-dive questions**

- **Topics:** Every diagnostic question answered at depth · follow-ups on the JVM, concurrency and Spring internals
- **Read:** Your notes from the year
- **Lab:** A 45-minute mock technical interview in English
- **LeetCode:** 2 mock interviews
- **Career:** Start applying: 5 applications
- [ ] Week done

#### Week 52 · Apr 26 – May 6 · Interview sprint · `Goal`

**Final check**

- **Topics:** Retake the full diagnostic · check every item of the gold-junior bar
- **Read:** None
- **Lab:** Full diagnostic with no lookup: 3 or more in every area except front-end
- **LeetCode:** 1 mock interview + final review
- **Career:** Plan year 2 toward pleno
- [ ] Week done

## House rules

1. **AI in learning mode.** In study blocks, AI explains and corrects your explanations; it never writes the code.
2. **LeetCode method.** 30 minutes with no help. If stuck, read the solution, close it, rewrite from scratch. Review on day 3 and day 10. Log every problem in `leetcode/TRACKER.md`.
3. **Phase exam.** Weeks tagged `Phase exam` end a subject with a 10-question quiz, no lookup. 8 or more and you move on. Under 8, the next week repeats the gaps and the plan shifts by a week. In a month with a phase exam, it also counts as the month quiz.
4. **Missed blocks.** A missed block moves to another day of the same plan week. A lost week shifts the plan by one week. No subject is skipped.
5. **FOMO.** New topics go to a parking-lot file and wait until the current subject ends.
6. **HUB.** 25 minutes a weekday, outside the 14 hours. Only during the Aug–Sep 2027 crunch does it borrow the Friday LeetCode hour.
7. **Front-end.** When the internship starts asking for React and TypeScript, it takes the project hour on two days a week until it settles.
8. **University exams.** A UnB exam week becomes a light week, like the holidays: LeetCode reviews and the blank page only. The plan shifts by one week.
9. **Recovery.** The holiday weeks and the checkpoint week are your rest. Keep them light. Sleep never pays for a missed block.

## The goal

**Gold junior on May 6, 2028** (it was Oct 17, 2027 before the plan was stretched to 1h of study a day):

- Ships a feature alone: design, code, tests, deploy
- 3 out of 4 in every diagnostic area, no lookup
- About 70% of LeetCode mediums in 30 minutes
- Own projects in production with real users (tracked in their own repos)
- Finds what's wrong in AI-written code
- Holds a 45-minute interview in English

Pleno is the next step, realistic about a year after the goal.
