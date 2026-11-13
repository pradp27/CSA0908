# Task 2 – ArrayList, LinkedList and ArrayDeque

## Student Details
- Name: [Your Name]
- Register Number: [Your Register Number]
- Package: `Assignment2`
- Java Class: `task2`

## Aim
To compare `ArrayList`, `LinkedList` and `ArrayDeque` for playlist-related operations.

## Program Description
The program:
- Adds 10,000 songs to each collection.
- Measures the time taken for adding.
- Accesses the element at index 5,000 in `ArrayList` and `LinkedList`.
- Iterates through `ArrayDeque`.
- Adds one song at the front and another at the end of `ArrayDeque`.

## How to Run in Eclipse
1. Create or open the Java project.
2. Create package `Assignment2`.
3. Create class `task2`.
4. Paste the Task 2 Java program into `task2.java`.
5. Select **Run As → Java Application**.

## Sample Output
```text
ArrayList Add Time: [measured time] ns
LinkedList Add Time: [measured time] ns
ArrayDeque Add Time: [measured time] ns

ArrayList Kth Song: Song5000
ArrayList Access Time: [measured time] ns
LinkedList Kth Song: Song5000
LinkedList Access Time: [measured time] ns
ArrayDeque Iteration Time: [measured time] ns

First Song: New Song
Last Song: Last Song

Collection sizes:
ArrayList: 10000
LinkedList: 10000
ArrayDeque: 10002
```

*Execution times vary by system.*

## Result
`ArrayList` provides fast index-based access. `LinkedList` supports insertion and removal at its ends, but accessing an element by index takes linear time. `ArrayDeque` is suitable for queue operations at both ends.

## Complexity
| Operation | ArrayList | LinkedList | ArrayDeque |
|---|---|---|---|
| Add at end | O(1) amortized | O(1) | O(1) amortized |
| Insert at front | O(n) | O(1) | O(1) amortized |
| Insert in middle | O(n) | O(n) to locate position | Not supported by index |
| Access by index | O(1) | O(n) | Not supported by index |
| Iterate | O(n) | O(n) | O(n) |

## Experiment Record
The supplied program is a simple demonstration. For the full assignment evidence, repeat the tests at three or more collection sizes and separately measure front/middle insertion, removal, indexed access and full iteration. Record your actual results.
