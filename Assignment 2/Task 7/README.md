# Task 7 – Diagnose, Redesign and Validate

## Student Details
- Name: [Your Name]
- Register Number: [Your Register Number]
- Package: `Assignment2`
- Java Class: `task7`

## Aim
To identify a performance limitation in an earlier task, redesign the solution and compare the original and redesigned approaches.

## Selected Problem
The ticket-generation solution from Task 1 repeatedly concatenates text using the `String` `+` operator inside a loop.

## A. Diagnose the Bottleneck
`String` objects are immutable. Each concatenation creates a new string containing the previous text and the new field. As the ticket becomes longer, more characters may need to be copied repeatedly.

## B. Design Objective
Reduce repeated string creation and reduce the time required to build a ticket containing many fields.

## C. Revised Solution
Use `StringBuilder` and its `append()` method to add each field to a mutable character sequence. Convert it to a String only when the final text is needed.

## D. Prediction
For a large number of fields, the StringBuilder version is expected to take less time and create fewer intermediate objects than repeated String concatenation.

## E. Implementation and Validation
The `task7` program measures the original String approach and the StringBuilder approach using `System.nanoTime()`. It also prints a sample ticket.

## How to Run in Eclipse
1. Create package `Assignment2`.
2. Create class `task7`.
3. Paste the Task 7 program into `task7.java`.
4. Run it using **Run As → Java Application**.

## Sample Output Format
```text
Original String Time: [measured time] ns
Redesigned StringBuilder Time: [measured time] ns

Sample Ticket:
PNR: 12345
Passenger: Arun
Coach: A1
Berth: 25
Fare: 500

Performance Comparison:
[StringBuilder is faster / String was faster in this run]
```

*The actual comparison depends on the computer and the run. Do not copy or invent timing values.*

## F. Final Evaluation
Compare both approaches under the same conditions and repeat the measurements. Record the results below:
| Run | Original String (ns) | StringBuilder (ns) |
|---|---:|---:|
| 1 | [your result] | [your result] |
| 2 | [your result] | [your result] |
| 3 | [your result] | [your result] |
| Average | [your average] | [your average] |

Discuss whether the prediction was supported, the measured improvement, and when the original approach may still be acceptable (for example, a small number of simple concatenations).
