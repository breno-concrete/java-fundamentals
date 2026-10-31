# Week 1: Java core starts

Oct 18 – 24, 2026, restarted Oct 27 – Nov 1 · Week 1 of 52

## Context

Week 1 of 52 in [Caminho das Pedras](../ROADMAP.md) starts today: Java core. Every 2h block below is the block from the parent plan's weekly grid, and every day has code.

- **Week:** Sunday, Oct 18 – Saturday, Oct 24, 2026. The week was lost after day 1, so day 2 restarts on Tuesday, Oct 27 and day 7 lands on Sunday, Nov 1 (plan shifted by 1 week, rule 4).
- **Restart:** each day keeps its blocks; only the date moves one weekday later (Monday's plan on Tuesday, and so on).
- **Blocks:** Fundamentals days 1, 2, 4 · LeetCode days 3, 6 · Jansenbot days 5, 7 · Blank page day 6 · HUB +25 min days 2–6 (Tue–Sat)
- **Where the code goes:** a `java-fundamentals` repo, where each concept is a small class plus a JUnit test that proves its behavior, and the new hand-written Jansenbot repo
- **penssay:** submit it to Hacktoberfest today in a few minutes, outside the blocks. That's all it gets this week.

## Week goals

By Sunday, Nov 1 you have written all of this by hand, with no AI writing the code:

- [x] A `Member` class with a correct equals/hashCode, and a test that shows a HashSet breaking when only equals is overridden
- [x] Your own small hash map: buckets, put, get, resize at 75% load, with tests
- [x] 2 LeetCode problems solved and logged (#1, #217), plus Two Sum's first review. #242, the third, moved to week 2.
- [ ] Jansenbot's new repo with the domain model (Member, Event, Attendance) and the points rule, covered by unit tests
- [ ] You can explain the equals/hashCode contract and how HashMap works out loud, with no notes

## Day by day

On weekdays, the HUB block comes first with a hard 25-minute timer, then the 2h block.

### Day 1 · Sunday, Oct 18 · Fundamentals 2h

- [x] First 15 minutes: create the `java-fundamentals` repo, the LeetCode spreadsheet (problem, pattern, date, solved alone, day-3 and day-10 review) and the blocks in your calendar.
- [x] Read *Effective Java* Items 10 and 11 (equals and hashCode).
- [x] Code: a `Member` class with correct equals and hashCode, and a JUnit test that puts it in a HashSet. Then override only equals and write the test that shows the set breaking.

### Day 2 · Tuesday, Oct 27 (was Monday) · Fundamentals 2h + HUB 25 min

- [x] Study how HashMap works inside: hashCode to bucket index, collisions, resize at 75% load, a crowded bucket turning into a tree since Java 8.
- [x] Code (moved to day 5): your own `SimpleHashMap<K, V>` with an array of buckets, put, get and resize, plus tests for collisions and resize.

### Day 3 · Wednesday, Oct 28 (was Tuesday) · LeetCode 2h + HUB 25 min

- [x] #1 Two Sum ✅ (Oct 28, alone, hash map). #217 Contains Duplicate moved to day 6 ✅ (Oct 31, alone). 30 minutes each with no help. If stuck, read the solution, close it, rewrite from scratch.
- [x] Write each one's complexity in the spreadsheet: brute force vs hash map.

### Day 4 · Thursday, Oct 29 (was Wednesday) · Fundamentals 2h + HUB 25 min

- [x] `SimpleHashMap` test-first, carried over from day 2. *Oct 29: steps 1.0–1.3 green, 1.4 almost (a bug when overwriting a key in the middle of a chain). The rest moved to day 5.*
- Moved to week 2's first Fundamentals block (see Next week): Item 17 and records, stack vs heap, the immutable record and the mutable key test.

### Day 5 · Friday, Oct 30 (was Thursday) · Jansenbot 2h + HUB 25 min

- [ ] **Carried over, do it first (~55 min):** `SimpleHashMap` steps 1.4–1.7 ✅ (Oct 30, 8 tests green) and the day-2 wrap-up (`docs/days/2026-10-30.md`). It must be done before day 6's blank page, so it takes priority over Jansenbot if it runs long.
- [ ] Jansenbot, in the time left (~65 min): create the new repo: plain Java 21, JUnit 5, no Spring yet. The old vibecoded version stays only as a reference for behavior.
- [ ] Code the domain model by hand: `Member`, `Event` (type: ensaio, culto, show), `Attendance` (confirmed, arrived, minutes late). Entities compare by id.
- [ ] Unit tests for the model. Whatever doesn't fit moves to the start of day 7.

### Day 6 · Saturday, Oct 31 (was Friday) · LeetCode 1h + Blank page 1h + HUB 25 min

- [x] **LeetCode 1h, carried over from day 3:** Two Sum's 3 open questions (complexity, check-before-insert, why `LinkedHashMap`) and #217 Contains Duplicate (30 min alone).
- [x] LeetCode: Two Sum's day-3 review, rewritten from scratch. #217's review is due Nov 3, and #242 Valid Anagram moves to week 2.
- Moved to day 7, ran out of time on Oct 31: the blank page and the English recording.

### Day 7 · Sunday, Nov 1 (was Saturday) · Jansenbot 2h

- [ ] **Carried over from day 6, do it first (~1h15):** blank page: rewrite `SimpleHashMap` from zero with no lookup (`SimpleHashMapBlank`, plan in `docs/days/2026-10-31.md`). Whatever you can't write, you didn't know yet: note it. Then explain HashMap out loud with no help, and record 5 minutes in English on the equals/hashCode contract.
- [ ] Jansenbot, in the time left (~45 min): anything left of day 5's domain model and tests. Whatever doesn't fit moves to week 2's first Jansenbot block.
- [ ] If there's time, code the points rule test-first: ensaio 2 points (1 if more than 20 minutes late), culto 3, show 4. If not, it moves to week 2's first Jansenbot block.
- [ ] Moved to week 2's Jansenbot block, before the tie-breaks: the monthly total per member with streams written by hand (group by member, sum points).

## HUB

Tracked in its own repo, not here. 25 minutes before the block, days 2 to 6 (Tuesday to Saturday this week). This month is literature review, so it stays light.

- [ ] Day 2 (Tue): set up the HUB backlog
- [ ] Day 3 (Wed): read Laurentino et al., 2025 (the trial protocol)
- [ ] Day 4 (Thu): read Santana et al., 2023 (diaphragm ultrasound)
- [ ] Day 5 (Fri): write the questions for the professor: which event appears in both recordings so the clocks can be aligned, and what format each machine exports
- [ ] Day 6 (Sat): note what you read

## Next week

Week 2, starting Monday, Nov 2 (shifted from Oct 25–31): Collections and their costs. Read *Effective Java* Item 14, build your own DynamicArray, solve LeetCode #49, #347 and #238, and code the Funcionário do Mês ranking with every tie-break in Jansenbot. Every week's details are in [Caminho das Pedras](../ROADMAP.md).

Carried over from this week, to go in first when week 2's plan is written:

- First Fundamentals block: *Effective Java* Item 17 and records, stack vs heap on paper, an immutable record, and the mutable key test (~50 min).
- First LeetCode block: #242 Valid Anagram, plus #217's review if it's due (Nov 3).
- First Jansenbot block: whatever is left of the domain model and the points rule, then the monthly total.
