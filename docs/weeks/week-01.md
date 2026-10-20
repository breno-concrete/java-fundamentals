# Week 1: Java core starts

Oct 18 – 24, 2026 · Week 1 of 52

## Context

Week 1 of 52 in [Caminho das Pedras](../ROADMAP.md) starts today: Java core. Every 2h block below is the block from the parent plan's weekly grid, and every day has code.

- **Week:** Sunday, Oct 18 – Saturday, Oct 24, 2026
- **Blocks:** Fundamentals Sun, Mon, Wed · LeetCode Tue, Fri · Jansenbot Thu, Sat · Blank page Fri · HUB +25 min Mon–Fri
- **Where the code goes:** a `java-fundamentals` repo, where each concept is a small class plus a JUnit test that proves its behavior, and the new hand-written Jansenbot repo
- **penssay:** submit it to Hacktoberfest today in a few minutes, outside the blocks. That's all it gets this week.

## Week goals

By Saturday you have written all of this by hand, with no AI writing the code:

- [x] A `Member` class with a correct equals/hashCode, and a test that shows a HashSet breaking when only equals is overridden
- [ ] Your own small hash map: buckets, put, get, resize at 75% load, with tests
- [ ] 3 LeetCode problems solved and logged, plus their first review
- [ ] Jansenbot's new repo with the domain model (Member, Event, Attendance) and the points rule, covered by unit tests
- [ ] You can explain the equals/hashCode contract and how HashMap works out loud, with no notes

## Day by day

On weekdays, the HUB block comes first with a hard 25-minute timer, then the 2h block.

### Sunday, Oct 18 · Fundamentals 2h

- [x] First 15 minutes: create the `java-fundamentals` repo, the LeetCode spreadsheet (problem, pattern, date, solved alone, day-3 and day-10 review) and the blocks in your calendar.
- [x] Read *Effective Java* Items 10 and 11 (equals and hashCode).
- [x] Code: a `Member` class with correct equals and hashCode, and a JUnit test that puts it in a HashSet. Then override only equals and write the test that shows the set breaking.

### Monday, Oct 19 · Fundamentals 2h + HUB 25 min

- [ ] Study how HashMap works inside: hashCode to bucket index, collisions, resize at 75% load, a crowded bucket turning into a tree since Java 8.
- [ ] Code: your own `SimpleHashMap<K, V>` with an array of buckets, put, get and resize, plus tests for collisions and resize.

### Tuesday, Oct 20 · LeetCode 2h + HUB 25 min

- [ ] #1 Two Sum and #217 Contains Duplicate, 30 minutes each with no help. If stuck, read the solution, close it, rewrite from scratch.
- [ ] Write each one's complexity in the spreadsheet: brute force vs hash map.

### Wednesday, Oct 21 · Fundamentals 2h + HUB 25 min

- [ ] Read *Effective Java* Item 17 (minimize mutability) and the Java docs on records.
- [ ] Study stack vs heap: where a `new` object lives, where its reference lives, when the GC collects it. Draw it on paper.
- [ ] Code: rewrite a value type as an immutable record, and write a test that shows a mutable key getting lost inside a HashMap.

### Thursday, Oct 22 · Jansenbot 2h + HUB 25 min

- [ ] Create the new Jansenbot repo: plain Java 21, JUnit 5, no Spring yet. The old vibecoded version stays only as a reference for behavior.
- [ ] Code the domain model by hand: `Member`, `Event` (type: ensaio, culto, show), `Attendance` (confirmed, arrived, minutes late). Entities compare by id.
- [ ] Unit tests for the model.

### Friday, Oct 23 · LeetCode 1h + Blank page 1h + HUB 25 min

- [ ] LeetCode: #242 Valid Anagram, new, plus the day-3 review of Tuesday's two problems, rewritten from scratch.
- [ ] Blank page: rewrite `SimpleHashMap` from zero with no lookup. Whatever you can't write, you didn't know yet: note it.
- [ ] Record 5 minutes in English explaining the equals/hashCode contract.

### Saturday, Oct 24 · Jansenbot 2h

- [ ] Code the points rule test-first: ensaio 2 points (1 if more than 20 minutes late), culto 3, show 4.
- [ ] Code the monthly total per member with streams written by hand: group by member, sum points. The tie-breaks come next week.

## HUB

25 minutes before the block, Monday to Friday. This month is literature review, so it stays light.

- [ ] Mon: set up the HUB backlog
- [ ] Tue: read Laurentino et al., 2025 (the trial protocol)
- [ ] Wed: read Santana et al., 2023 (diaphragm ultrasound)
- [ ] Thu: write the questions for the professor: which event appears in both recordings so the clocks can be aligned, and what format each machine exports
- [ ] Fri: note what you read

## Next week

Week 2, Oct 25–31: Collections and their costs. Read *Effective Java* Item 14, build your own DynamicArray, solve LeetCode #49, #347 and #238, and code the Funcionário do Mês ranking with every tie-break in Jansenbot. Every week's details are in [Caminho das Pedras](../ROADMAP.md).
