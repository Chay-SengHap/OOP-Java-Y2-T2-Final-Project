# OOP-Java-Y2-T2-Final-Project
Employee Payroll System 💰
Project Overview

The Employee Payroll System is an object-oriented application designed to calculate and manage employee salaries efficiently. This system demonstrates key Object-Oriented Programming (OOP) principles such as encapsulation, inheritance, polymorphism, and abstraction, while supporting both full-time and part-time employees.

Features

Automatic calculation of salaries based on employee type.

Supports Full-Time and Part-Time employees with distinct salary structures.

Demonstrates core OOP concepts for learning and practical application.

Ensures secure handling of salary data through controlled access.

Classes and Structure
Employee (Abstract Class)

Serves as the base class for all employee types.

Holds common attributes such as name, ID, and salary (salary is private for security).

Declares the abstract method calculateSalary() to enforce implementation in subclasses.

FullTimeEmployee

Represents employees with fixed monthly salaries.

Includes allowances and deductions in the salary computation.

Overrides calculateSalary() to implement full-time salary logic.

PartTimeEmployee

Represents employees paid based on hours worked.

Salary depends on hourly rate and total hours.

Overrides calculateSalary() with part-time salary formula.

Payroll

Manages employee payrolls efficiently.

Responsibilities include adding employees, calculating salaries, and generating payroll reports.

OOP Concepts Demonstrated
Principle	Implementation in the Project
Encapsulation	Employee salaries are private and accessed through getters.
Inheritance	FullTimeEmployee and PartTimeEmployee inherit from Employee.
Polymorphism	calculateSalary() behaves differently for each employee type.
Abstraction	Employee defines an abstract method calculateSalary() to enforce implementation.
Benefits

Modular and scalable system for managing salaries.

Easy to extend with new employee types or salary rules.

Practical demonstration of OOP principles for learning or academic purposes.

Future Enhancements

Add bonus, tax, and overtime calculations.

Include leave management for part-time employees.

Implement a graphical user interface (GUI) for better user interaction.

Integrate with a database for storing payroll records permanently.