# SC-Assignment-1-OOP

## Software Construction Assignment 01

**University:** University of Engineering and Technology, Abbottabad Campus
**Department:** Software Engineering
**Course:** Software Construction
**Instructor:** Engr. Rizwan Shah
**Assignment:** 01 – OOP
**Semester:** 5th Semester

---

## Introduction

This assignment focuses on the implementation of basic Object-Oriented Programming concepts in Java. Different tasks were completed to understand how OOP principles can be used to create organized, secure, and reusable programs.

The assignment covers the following concepts:

* Encapsulation
* Inheritance
* Polymorphism
* Abstraction
* Interfaces
* AI Code Review

---

## Task 1 – Encapsulation

The first task focuses on improving the security of a `DigitalWallet` class.

The wallet stores information such as the account holder, balance, and PIN. Private variables are used to prevent direct access to important data. The program also applies validation to prevent an invalid starting balance and checks the PIN before processing a withdrawal.

**Files:**

* `DigitalWallet.java`
* `WalletDemo.java`

---

## Task 2 – Inheritance and Polymorphism

The second task demonstrates how different employee types can be created from a common parent class.

The `Employee` class contains the common employee information. The `Developer` and `SalesManager` classes extend it and provide their own implementations of `calculatePay()`.

A list of `Employee` objects is used in the main program. When `calculatePay()` is called, Java selects the appropriate overridden method according to the actual object.

**Files:**

* `Employee.java`
* `Developer.java`
* `SalesManager.java`
* `Task2Main.java`

---

## Task 3 – Abstraction

The third task uses an interface to demonstrate abstraction.

The `SmartDevice` interface defines the common operations that smart devices should provide. Two classes, `SmartBulb` and `SmartThermostat`, implement the interface.

Each device performs the common operations according to its own requirements. The bulb also manages brightness, while the thermostat manages temperature.

**Files:**

* `SmartDevice.java`
* `SmartBulb.java`
* `SmartThermostat.java`
* `SmartDeviceDemo.java`

---

## Task 4 – AI Code Review

For the fourth task, an AI tool was given the following prompt:

> "Write a Java program for a simple Library System using OOP. Include classes for Book and Member."

The generated program was examined to find both a useful OOP feature and a design issue.

The program correctly separated the `Book` and `Member` classes and used constructors for object creation. However, the class variables were not private. This could allow direct modification of the data from other classes.

To improve the design, the fields were changed to private and getter methods were introduced. This provides better encapsulation without changing the basic functionality of the program.

**Classes:**

* `Book`
* `Member`
* `LibraryMain`

---

## Technologies

The assignment was developed using the following:

* Java
* Apache NetBeans
* Maven
* Git
* GitHub

---

## Running the Programs

To run the project:

1. Open the project in Apache NetBeans.
2. Make sure the Java environment is configured.
3. Open the main class of the required task.
4. Run the class.
5. Check the output in the NetBeans console.

### Main Classes

| Task   | Main Class        |
| ------ | ----------------- |
| Task 1 | `WalletDemo`      |
| Task 2 | `Task2Main`       |
| Task 3 | `SmartDeviceDemo` |
| Task 4 | `LibraryMain`     |

---

## What I Learned

After completing this assignment, I gained a better understanding of how OOP concepts are applied in Java. I learned how private fields and methods can be used to protect data, how inheritance supports reuse of common features, and how polymorphism allows different classes to provide different implementations. I also learned how interfaces can define common operations and how AI-generated code should be reviewed before using it.

---

## Repository

**Repository Name:** `SC-Assignment-1-OOP`

This repository contains the source code and documentation for Software Construction Assignment 01.
