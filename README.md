# Java Object-Oriented Programming (OOP) Masterclass

Welcome to the **Java OOP Learning Repository**! This project is structured sequentially based on the **OOP in Java** playlist by Telusko (Navin Reddy).

Each directory corresponds to a specific module in the series. Inside each folder, create your Java code files, experiment with concepts, and practice.

## 📁 Recommended Project Directory Structure

```
java-oop-mastery/
├── README.md
├── 01-classes-objects-memory/
│   ├── ClassAndObject.java
│   └── StackVsHeap.java
├── 02-methods-overloading/
│   ├── MethodBasics.java
│   └── MethodOverloading.java
├── 03-array-of-objects/
│   └── StudentArray.java
├── 04-static-keyword/
│   ├── StaticVariables.java
│   └── StaticMethodsBlocks.java
├── 05-encapsulation-constructors/
│   ├── Encapsulation.java
│   └── ConstructorsThisKeyword.java
├── 06-inheritance/
│   └── SingleAndMultilevel.java
├── 07-overriding-packages/
│   ├── MethodOverriding.java
│   └── PackagesAccessModifiers.java
├── 08-polymorphism-dispatch-final/
│   ├── DynamicMethodDispatch.java
│   └── FinalKeyword.java
├── 09-object-class-casting/
│   ├── ObjectClassMethods.java
│   └── UpcastingDowncasting.java
├── 10-abstraction-abstract-classes/
│   └── AbstractClasses.java
├── 11-inner-classes/
│   └── AnonymousInnerClass.java
└── 12-interfaces/
    ├── InterfaceBasics.java
    └── MultipleInheritance.java
```

## 📚 Module & Topic Tracker

### Module 1: Classes, Objects & Memory Basics

* Introduction to Object-Oriented Programming
* Creating Classes and Objects in Java (`new` operator)
* Stack vs. Heap Memory allocation
* Instance Variables vs. Local Variables

### Module 2: Methods & Method Overloading

* Declaring Methods and Parameters
* Return types and execution stack
* Method Overloading (Compile-time Polymorphism)
* Passing Primitive vs. Object references to methods

### Module 3: Array of Objects

* Creating Arrays of Primitive Data Types
* Creating and Instantiating Arrays of Objects
* Iterating Array of Objects using Enhanced `for` Loop (`for-each`)

### Module 4: The `static` Keyword

* Static Variables (Shared Class-level Memory)
* Static Methods and their restrictions
* Static Initializer Block vs. Instance Initializer Block
* Loading Class Bytecode vs. Instantiating Objects

### Module 5: Encapsulation & Constructors

* Encapsulation & `private` access control
* Getters and Setters
* The `this` Keyword
* Shadowing Instance Variables
* Default Constructors
* Parameterized Constructors
* Constructor Overloading & `this()` Chaining
* Anonymous Objects
* Naming Conventions in Java

### Module 6: Inheritance

* Introduction to Inheritance (`extends` keyword)
* Single-Level Inheritance
* Multi-Level Inheritance
* Why Java does not support Multiple Inheritance with classes

### Module 7: Method Overriding & Packages

* Method Overriding (Runtime Polymorphism)
* Using the `@Override` Annotation
* `super` Keyword in Method Overriding & Constructors
* Packages and Directory Structure
* Access Modifiers (`public`, `private`, `protected`, default)
* Classpath and Running packaged files from Terminal

### Module 8: Polymorphism, Dynamic Dispatch & `final`

* Polymorphism Types
* Dynamic Method Dispatch
* Upcasting Reference for Dynamic Polymorphism
* `final` Variables (Constants)
* `final` Methods (Preventing Overriding)
* `final` Classes (Preventing Inheritance)

### Module 9: Object Class & Typecasting Objects

* The Root `Object` Class in Java
* Overriding `toString()`, `equals()`, and `hashCode()`
* Object Upcasting
* Object Downcasting and `instanceof` check

### Module 10: Abstraction & Abstract Classes

* What is Abstraction?
* Abstract Methods and Abstract Classes
* Concrete Subclasses implementing Abstract Methods

### Module 11: Inner Classes

* Member Inner Classes
* Static Nested Classes
* Anonymous Inner Classes

### Module 12: Interfaces

* What is an Interface? (`interface` keyword)
* Implementing Interfaces (`implements` keyword)
* Achieving Multiple Inheritance with Interfaces
* Abstract Classes vs. Interfaces (When to use which)

## 🛠️ How to Run Files in Terminal

To compile and run Java files inside package directories using the terminal:

```bash
# Navigate to the root directory
cd java-oop-mastery

# Compile a specific file
javac 02-methods-overloading/MethodOverloading.java

# Run a compiled class file
java 02-methods-overloading/MethodOverloading.java
```