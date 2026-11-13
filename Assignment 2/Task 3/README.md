# Task 3 – HashSet and the hashCode–equals Contract

## Student Details
- Name: [Your Name]
- Register Number: [Your Register Number]
- Package: `Assignment2`
- Java Class: `task3`

## Aim
To remove duplicate student attendance scans using `HashSet` and understand the relationship between `equals()` and `hashCode()`.

## Program Description
The `Student` class compares students using their registration number. It overrides:
- `equals()` to check whether registration numbers are equal.
- `hashCode()` to generate a hash code from the registration number.

The program adds three attendance scans, including a repeated student, and prints the number of unique students.

## How to Run in Eclipse
1. Create package `Assignment2`.
2. Create class `task3`.
3. Paste the Task 3 program into `task3.java`.
4. Run it using **Run As → Java Application**.

## Expected Output
```text
Unique students: 2

Student Details:
192311001 Arun
192311002 Divya

Duplicate Test:
Are students equal? true
```

*The order of students printed by a HashSet is not guaranteed.*

## Result
The repeated registration number is stored only once when `equals()` and `hashCode()` follow the required contract. Equal objects must have equal hash codes.

## Complexity
- HashSet insertion and lookup: O(1) average.
- Space for n unique students: O(n).

## Additional Tests for the Assignment
1. Test repeated scans with the original class that overrides `equals()` but not `hashCode()`.
2. Test two different student objects with the same registration number.
3. Test what happens if a field used by `hashCode()` is changed after insertion. Prefer immutable fields for values used in equality and hashing.

Record the predicted and observed set sizes for each test. The exact result of the broken implementation can depend on hash bucket placement; do not assume it will always show a duplicate.
