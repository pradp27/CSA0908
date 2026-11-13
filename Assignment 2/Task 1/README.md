# Task 1 – String, StringBuilder and StringBuffer

## Student Details
- Name: [Your Name]
- Register Number: [Your Register Number]
- Package: `Assignment2`
- Java Class: `task1`

## Aim
To compare `String`, `StringBuilder` and `StringBuffer` while generating railway e-ticket text.

## Program Description
The program creates ticket text using three approaches:
1. Repeated `String` concatenation using `+`.
2. `StringBuilder` with `append()`.
3. `StringBuffer` with `append()`.

It measures the execution time using `System.nanoTime()` and prints a sample ticket.

## How to Run in Eclipse
1. Create a Java project.
2. Create a package named `Assignment2`.
3. Create a class named `task1`.
4. Paste the Task 1 Java program into `task1.java`.
5. Right-click the file and select **Run As → Java Application**.

## Sample Output
```text
String Time: [measured time] ns
StringBuilder Time: [measured time] ns
StringBuffer Time: [measured time] ns

Sample Ticket:
PNR: 12345
Name: Arun
Coach: A1
Berth: 25
Fare: 500
```

*Execution times vary depending on the computer and Java environment.*

## Result
The program demonstrates that `String` is immutable and repeated concatenation can create intermediate objects. `StringBuilder` is generally suitable for repeated text changes in a single thread. `StringBuffer` provides synchronized methods for shared-buffer use.

## Complexity
- Repeated String concatenation can require O(n²) total character copying.
- Building text with StringBuilder takes O(n) total time in the number of appended characters, amortized.

## Experiment Record
Run the program with different ticket and field counts. Record your own repeated measurements and average them here:
| Workload | String | StringBuilder | StringBuffer |
|---|---:|---:|---:|
| Small | [your result] | [your result] | [your result] |
| Medium | [your result] | [your result] | [your result] |
| Large | [your result] | [your result] | [your result] |
