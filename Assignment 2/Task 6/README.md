# Task 6 – PriorityQueue and Hospital Emergency Triage

## Student Details
- Name: [Your Name]
- Register Number: [Your Register Number]
- Package: `Assignment2`
- Java Class: `task6`

## Aim
To design a hospital triage queue that treats patients according to severity and arrival order.

## Priority Rules
- Severity 1 is treated before severity 2, 3, 4 and 5.
- Patients with the same severity are treated in arrival order.

## Program Description
The program uses a `PriorityQueue<Patient>` with a comparator. Each patient receives an increasing arrival counter. The comparator first compares severity and then compares arrival counter. The `poll()` method removes the next patient.

## How to Run in Eclipse
1. Create package `Assignment2`.
2. Create class `task6`.
3. Paste the Task 6 program into `task6.java`.
4. Run it using **Run As → Java Application**.

## Expected Output
```text
Patient Treatment Order:
Meena(S1) Kumar(S1) Lata(S2) Ravi(S3) John(S3) Asha(S5)
```

## Result
The PriorityQueue selects the patient with the lowest severity number first. The arrival counter preserves first-come-first-served order among patients with equal severity.

## Complexity
- Add a patient: O(log n).
- Remove the next patient: O(log n).
- Peek at the next patient: O(1).
- Space: O(n) for n waiting patients.

## Additional Discussion
A plain FIFO queue cannot directly select the most severe patient. A PriorityQueue supports priority-based removal. Printing a PriorityQueue directly does not guarantee treatment order; repeatedly call `poll()` on a copy if a sorted display is required.

A patient with minor severity may wait for a long time if critical patients keep arriving. A real system can use a waiting-time rule to prevent starvation. Test the design with different queue sizes and record your own measurements before making a deployment decision.
