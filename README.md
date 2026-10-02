# simple-grade-calculator
A console-based Java application that computes a student's average grade and determines a pass or fail remark, built to demonstrate core method concepts in Java.
---
 
## Author
 
**Mark Droeid Mendoza**
Bachelor of Science in Information Technology
Batangas State University, JPLPC Malvar Campus
 
- Email: [markdroeidmendoza@gmail.com](mailto:markdroeidmendoza@gmail.com)
- GitHub: [@mendoza-mark](https://github.com/mendoza-mark)
---
 
## Table of Contents
 
1. [About This Project](#about-this-project)
2. [Features](#features)
3. [Sample Output](#sample-output)
4. [Project Structure](#project-structure)
5. [Getting Started](#getting-started)
6. [How the Program Works](#how-the-program-works)
7. [Concepts Demonstrated](#concepts-demonstrated)
8. [Notes and Limitations](#notes-and-limitations)
9. [License](#license)
---
 
## About This Project
 
This project was developed as a practice exercise in structuring a Java program with methods. Instead of placing all logic inside `main`, the program separates responsibilities into small, reusable methods: one for computing averages, one for displaying results, and one for drawing the decorative header line.
 
The program asks for a student's name and three grades, computes the average, and prints a final remark based on a passing mark of **75**. It also computes the average of the first two grades only, which shows how one method name can serve different inputs through overloading.
 
This makes the project a useful starting point for understanding:
 
- How to break a program into methods with clear responsibilities
- How method overloading lets one method name handle different parameter lists
- How recursion works, including the role of a base case
---
 
## Features
 
**Student Information Input**
 
- Accepts the student's full name through the console.
- Accepts three numeric grades, including decimal values.
**Automatic Grade Computation**
 
- Computes the average of three grades.
- Computes the average of the first two grades using an overloaded method.
**Pass or Fail Evaluation**
 
- An average of **75 or higher** is marked `PASSED`.
- An average **below 75** is marked `FAILED`.
**Formatted Console Output**
 
- A centered title banner is drawn using a recursive method.
- Results are grouped under clearly labeled sections: student information, grade input, and results.
---
 
## Sample Output
 
```text
===== SIMPLE GRADE CALCULATOR =====
 
STUDENT INFORMATION
Enter student name: Juan Dela Cruz
 
PLEASE ENTER THE STUDENT'S GRADE
Grade No.1: 85
Grade No.2: 90
Grade No.3: 78
 
RESULTS
Student: Juan Dela Cruz
Average: 84.33333333333333
Final Remark: PASSED
Average of Grade No.1 and Grade No.2: 87.5
```
 
---
 
## Project Structure
 
```text
simple-grade-calculator/
├── Main.java      # Complete source code (all methods and entry point)
├── README.md      # Project documentation
└── LICENSE        # MIT License (optional separate file)
```
 
---
 
## Getting Started
 
### Requirements
 
- Java Development Kit (JDK) 8 or later
- No external libraries required
To confirm Java is installed, run:
 
```bash
java -version
javac -version
```
 
### Installation
 
Clone the repository:
 
```bash
git clone https://github.com/mendoza-mark/simple-grade-calculator.git
cd simple-grade-calculator
```
 
### Compile and Run
 
Compile the source file:
 
```bash
javac Main.java
```
 
Run the program:
 
```bash
java Main
```
 
---
 
## How the Program Works
 
### Method Overview
 
| Method | Parameters | Returns | Purpose |
| --- | --- | --- | --- |
| `calculateAverage` | `double g1, double g2, double g3` | `double` | Returns the average of three grades |
| `calculateAverage` | `double g1, double g2` | `double` | Returns the average of two grades (overloaded version) |
| `displayResult` | `String name, double average` | `void` | Prints the student name, average, and the PASSED or FAILED remark |
| `printLine` | `int n` | `void` | Recursively prints `n` equal signs for the title banner |
| `main` | `String[] args` | `void` | Entry point; handles input and calls the other methods |
 
### Program Flow
 
1. The program prints the title banner using `printLine`.
2. The user enters the student's name.
3. The user enters three grades.
4. `calculateAverage` computes the average of the three grades.
5. `displayResult` prints the results and the final remark.
6. `calculateAverage` is called again with only two grades, and that result is printed.
### Passing Rule
 
```java
if (average >= 75) {
    System.out.println("Final Remark: PASSED");
} else {
    System.out.println("Final Remark: FAILED");
}
```
 
### Recursive Banner
 
`printLine` draws the banner without using a loop. It prints one character, then calls itself with a smaller number, and stops when the number reaches zero.
 
```java
static void printLine(int n) {
    if (n == 0) {
        return;                  // Base case: stop here
    }
    System.out.print("=");
    printLine(n - 1);            // Recursive call with a smaller value
}
```
 
---
 
## Concepts Demonstrated
 
| Concept | Where It Appears |
| --- | --- |
| Static methods | `calculateAverage`, `displayResult`, `printLine` |
| Method overloading | Two versions of `calculateAverage` with different parameter lists |
| Return values | `calculateAverage` returns a `double` |
| Void methods | `displayResult` and `printLine` |
| Recursion and base case | `printLine` |
| User input with `Scanner` | Name and grade entry in `main` |
| Conditional statements | PASSED or FAILED evaluation in `displayResult` |
 
---
 
## Notes and Limitations
 
- This is a learning and practice project and is not intended for production use.
- The passing mark is fixed at **75** and is set directly in the code.
- Input validation is not included. Entering a non-numeric value for a grade will cause the program to stop with an `InputMismatchException`.
- Grades are not restricted to a range (for example, 0 to 100).
- The entire project is contained in a single `.java` file with no third-party dependencies.
---
 
## License
 
This project is licensed under the MIT License. See below for details.
 
```text
MIT License
 
Copyright (c) 2026 Mark Droeid Mendoza
 
Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:
 
The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.
 
THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
