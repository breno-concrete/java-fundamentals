# Week 2: Collections and their costs

Nov 7 – 13, 2026 (ROADMAP dates: Oct 25 – 31) · Week 2 of 52

## Context

Week 2 of 52 in [Caminho das Pedras](../ROADMAP.md): Java core, collections and their costs.

- **Week:** Saturday, Nov 7 – Friday, Nov 13, 2026. Week 1's Fundamentals ran until Nov 6 (see [week-01.md](week-01.md)), so the plan is now shifted by about 2 weeks. Like week 1, the days keep the template's order of blocks; only the weekdays move.
- **Blocks:** Fundamentals days 1, 2, 4 · LeetCode day 3 · LeetCode 1h + Blank page 1h day 6 · Jansenbot days 5, 7 · HUB +25 min on weekdays (tracked in its own repo)
- **Where the code goes:** `src/main/java/dev/breno/labs/week02/` (tests mirrored in `src/test/...`), LeetCode in `src/main/java/dev/breno/leetcode/arrayshashing/`, Jansenbot in its own repo

## Week goals

By Friday, Nov 13 you have written all of this by hand, with no AI writing the code:

- [ ] A table on paper with the Big-O of `get`, `add`, `remove` and `contains` for `ArrayList`, `LinkedList`, `HashSet`, `HashMap`, `TreeMap` and `ArrayDeque`, and you can justify each line
- [ ] Your own `DynamicArray` that grows, with tests, and you can explain why `add` is amortized O(1)
- [ ] 100k inserts timed in `ArrayList` vs `LinkedList`, with the result explained
- [ ] `Comparable` vs `Comparator` (*Effective Java* Item 14), used in Jansenbot's ranking tie-breaks
- [ ] LeetCode #242 (carried from week 1), #49, #347 logged in `leetcode/TRACKER.md`. #238 if it fits
- [ ] Jansenbot: what was carried from week 1 (domain model, points rule, monthly total), then the ranking

## Day by day

### Day 1 · Saturday, Nov 7 · Fundamentals 2h

- [ ] Two Sum's day-10 review first (~15 min), rewritten from scratch with no lookup
- [ ] Theory: the List, Set, Map and Deque implementations: what each one is inside (array, linked nodes, hash table, red-black tree, circular array)
- [ ] Paper: the Big-O table from the week goals. Fill in what you can alone first, then check it against the javadocs of `ArrayList`, `HashMap`, `TreeMap` and `ArrayDeque`
- [ ] Code: start `DynamicArray` test-first: `add`, `get`, `size`, with a fixed capacity for now

### Day 2 · Sunday, Nov 8 · Fundamentals 2h

- [ ] `DynamicArray` growth: when it's full, allocate a bigger array (double it) and copy. Tests for growth, and for `get` out of bounds
- [ ] On paper: why doubling makes `add` amortized O(1), and why growing by a fixed +1 would make it O(n)
- [ ] Compare with your `SimpleHashMap` resize: what's the same idea, and what's different

### Day 3 · Monday, Nov 9 · LeetCode 2h + HUB 25 min

- [ ] #242 Valid Anagram (carried from week 1), 30 min alone
- [ ] #49 Group Anagrams, 30 min alone. If stuck: read a solution, close it, rewrite from scratch
- [ ] Log both in `leetcode/TRACKER.md` with brute force vs best complexity

### Day 4 · Tuesday, Nov 10 · Fundamentals 2h + HUB 25 min

- [ ] #217's day-10 review first (~15 min), from scratch
- [ ] Lab: time 100k inserts in `ArrayList` vs `LinkedList` (at the end, at the start, in the middle). Predict first, then measure, then explain the result with the Big-O table and memory (contiguous vs nodes)
- [ ] Read *Effective Java* Item 14 (`Comparable`), then `Comparator` chains (`comparing`, `thenComparing`, `reversed`), with a small test

### Day 5 · Wednesday, Nov 11 · Jansenbot 2h + HUB 25 min

- [ ] Carried from week 1: create the new repo (plain Java 21, JUnit 5, no Spring), then the domain model `Member`, `Event` (ensaio, culto, show), `Attendance` (confirmed, arrived, minutes late). Entities compare by id
- [ ] Carried from week 1: the points rule test-first: ensaio 2 points (1 if more than 20 minutes late), culto 3, show 4

### Day 6 · Thursday, Nov 12 · LeetCode 1h + Blank page 1h + HUB 25 min

- [ ] #242's day-3 review (~10 min), then #347 Top K Frequent Elements, 30 min alone. #238 moves to week 3 if it doesn't fit
- [ ] Blank page: `DynamicArray` from zero with no lookup, plus its tests. Whatever you can't write, you didn't know yet: note it
- [ ] Out loud, with no notes: why `ArrayList.add` is amortized O(1), and when `LinkedList` actually wins

### Day 7 · Friday, Nov 13 · Jansenbot 2h + HUB 25 min

- [ ] Carried from week 1: the monthly total per member with streams written by hand (group by member, sum points)
- [ ] Funcionário do Mês ranking: every tie-break as a `Comparator` chain, one test per tie-break. Whatever doesn't fit moves to week 3's first Jansenbot block

## HUB

Tracked in its own repo, not here.

## Next week

Week 3: Generics. Read *Effective Java* Items 26–31, build a generic `InMemoryRepository<T, ID>`, solve #36 and #128 and review #49. Every week's details are in [Caminho das Pedras](../ROADMAP.md).
