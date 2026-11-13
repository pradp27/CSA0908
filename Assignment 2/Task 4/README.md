# Task 4 – HashMap, TreeMap and LinkedHashMap

## Student Details
- Name: [Your Name]
- Register Number: [Your Register Number]
- Package: `Assignment2`
- Java Class: `task4`

## Aim
To compare `HashMap`, `TreeMap` and `LinkedHashMap` for storing and retrieving pharmacy inventory.

## Program Description
The program stores medicine codes and medicine names in three map implementations. It displays each map and looks up the medicine with code `102`.

## How to Run in Eclipse
1. Create package `Assignment2`.
2. Create class `task4`.
3. Paste the Task 4 program into `task4.java`.
4. Run it using **Run As → Java Application**.

## Sample Output
```text
HashMap:
[Entries may appear in any order]

TreeMap:
101 Aspirin
102 Cetirizine
103 Paracetamol

LinkedHashMap:
103 Paracetamol
101 Aspirin
102 Cetirizine

Medicine Lookup:
Medicine: Cetirizine
```

*HashMap iteration order is unspecified. LinkedHashMap preserves insertion order; TreeMap sorts keys.*

## Result
- `HashMap` is suitable for average constant-time lookup when iteration order is not important.
- `TreeMap` maintains keys in sorted order.
- `LinkedHashMap` maintains insertion order.

## Complexity
| Operation | HashMap | TreeMap | LinkedHashMap |
|---|---|---|---|
| put | O(1) average | O(log n) | O(1) average |
| get | O(1) average | O(log n) | O(1) average |
| Iterate | O(n) | O(n) | O(n) |

## Experiment Record
For full assignment evidence, test at least three medicine counts. Measure 100,000 lookups and the time to create both code-order and insertion-order reports. Record actual times and confirm whether each report meets its required order.
