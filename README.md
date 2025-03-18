# Assignment 5 – Recurrences and Hash Tables

## Deadline: Wednesday, March 19, 2025, 9:59 PM

## Objectives:
- Understand and get familiar with the hash table data structure and its applications.
- Solve recurrence relations using repeated substitution and the Master Theorem.
- Implement and analyze radix sort.
- Implement double hashing for collision resolution in a hash table.
- Develop a program to check word pattern matching.
- Analyze the time and space complexity of implemented algorithms.
  
---

## Instructions:

- Problems marked as **(code)** require Java programs.
- Problems marked as **(text)** require written answers in prose, algorithms (pseudo-code or code), proofs, or mathematical equations.
- **Algorithm-based answers** (pseudo-code or code) will be assessed based on logic rather than compilation.

---

## Repository Structure
```
📂 Assignment5
├── 📂 src
│   ├── 📂 main
│   │   ├── 📂 java
│   │   │   ├── RadixSort.java   # Implementation of Radix Sort
│   │   │   ├── WordPattern.java # Implementation of Word Pattern Matching
│   │   │   ├── DoubleHashing.java # Implementation of Double Hashing
│   │   │   ├── SubarraySum.java # Extra Credit: Subarray Sum
│   │   ├── 📂 resources
│   ├── 📂 test
│   │   ├── RadixSortTest.java   # Unit tests for Radix Sort
│   │   ├── WordPatternTest.java # Unit tests for Word Pattern Matching
│   │   ├── DoubleHashingTest.java # Unit tests for Double Hashing
│   │   ├── SubarraySumTest.java # Unit tests for Extra Credit problem
├── 📄 Assignment5.pdf  # Solutions to text-based problems
├── 📄 README.md        # This file
```

## Problem Breakdown
### 1. Recurrence (Text)
- Solve the given recurrence relation using repeated substitution.
- Apply the Master Method to derive the solution.

### 2. Master Theorem (Text)
- Apply the Master Method to five different recurrence relations and justify results.

### 3. Radix Sort (Text)
- Show step-by-step sorting of a given list using lexicographical order.

### 4. Double Hashing (Text)
- Implement a hash table with double hashing collision resolution.
- Show step-by-step insertion, collision handling, and rehashing.

### 5. Radix Sort (Code)
- Implement radix sort for lexicographically sorting an array of strings.
- Extend support for uppercase letters (Extra Credit).

### 6. Word Pattern (Code)
- Implement a function to check if a string follows a pattern with a given delimiter.

### 7. Algorithm Analysis (Text)
- Analyze the time and space complexity of implemented algorithms.

### 8. Extra Credit: Subarray Sum (Code)
- Implement a function to find a contiguous subarray that sums to a target value.
- Optimize to achieve O(n) time complexity and O(1) space complexity.

## Compilation and Execution
### Compiling the Java Files
```sh
javac -d out src/main/java/*.java
```

### Running the Programs
```sh
java -cp out RadixSort
java -cp out WordPattern
java -cp out DoubleHashing
java -cp out SubarraySum # Extra Credit
```

### Running Unit Tests
```sh
javac -cp .:junit-4.13.2.jar:hamcrest-core-1.3.jar -d out src/test/java/*.java
java -cp .:out:junit-4.13.2.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore RadixSortTest
```

## Submission Details
- All Java files are in the `src/main/java/` directory.
- All test files are in `src/test/java/`.
- Solutions for text-based problems are in `Assignment5.pdf`.
- The GitHub repository link is submitted via Canvas.

## Notes
- Ensure all code compiles before submission to avoid penalties.
- If the repository is empty or inaccessible, the submission will be marked as a **zero**.

---
**Author:** Jayden Cruz\
**Course:** CSC 3130 - Introduction to Algorithms\
**University:** Belmont University
