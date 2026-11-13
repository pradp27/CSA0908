# Task 5 – Generics, Comparator and Leaderboard

## Student Details
- Name: [Your Name]
- Register Number: [Your Register Number]
- Package: `Assignment2`
- Java Class: `task5`

## Aim
To create a reusable generic leaderboard that ranks sports teams using multiple comparison rules.

## Ranking Rules
1. Higher points rank first.
2. If points are equal, higher goal difference ranks first.
3. If both are equal, team name is sorted alphabetically.

## Program Description
The program defines a `Team` class and a generic `Leaderboard<T>` class. A comparator chain defines the ranking order. The `ranking()` method sorts a copy of the list, leaving the original list unchanged.

## How to Run in Eclipse
1. Create package `Assignment2`.
2. Create class `task5`.
3. Paste the Task 5 program into `task5.java`.
4. Run it using **Run As → Java Application**.

## Expected Output
```text
Team Ranking:
[Eagles(9,6), Bisons(9,4), Panthers(9,4), Cobras(6,1)]
```

## Result
The leaderboard sorts teams by points, goal difference and name. Bisons ranks above Panthers because both have 9 points and a goal difference of 4, and `Bisons` comes alphabetically before `Panthers`.

## Complexity
Sorting n teams takes O(n log n) time. Creating a copy of the list requires O(n) additional space.

## Concepts Used
- Generics: `Leaderboard<T>` can work with different object types.
- Comparator: defines custom sorting rules.
- `thenComparing()`: adds tie-breaking conditions.
- `List<? extends T>`: accepts a list containing T or a subtype of T.
