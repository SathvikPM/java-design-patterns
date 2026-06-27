# ☕ Java Design Patterns

A beginner-friendly repository that explains the most commonly used Java Design Patterns with simple examples.

## 📖 About

This repository contains easy-to-understand implementations of popular **Java Design Patterns** using Core Java. Each pattern is implemented with simple examples so beginners can understand the concept without any frameworks.

The goal of this repository is to learn:

- Object-Oriented Programming (OOP)
- Software Design Principles
- Reusable and Maintainable Code
- Design Patterns used in Java & Spring Boot
- Common Java Interview Questions

---

# 📂 Design Patterns Included

| Pattern | Purpose |
|---------|---------|
| Singleton | Ensure only one object exists throughout the application. |
| Builder | Build complex objects step by step. |
| Factory | Create objects without exposing object creation logic. |
| Observer | Notify multiple objects when an event occurs. |
| Strategy | Choose one behavior at runtime. |
| Proxy | Control access to another object by acting as a middleman. |
| Template Method | Define the workflow while allowing some steps to be customized. |

---

# 1️⃣ Singleton Pattern

## What is Singleton?

Singleton ensures that **only one object of a class is created** during the application's lifetime.

Instead of creating multiple objects using the `new` keyword, every part of the application uses the same object.

### Real-Life Example

Imagine a **Database Connection**.

Creating multiple database connections is expensive. Instead, one connection is created and shared across the application.

### Implementations Included

### ✅ Eager Singleton

The object is created when the class is loaded.

**Advantages**

- Simple implementation
- Thread-safe

**Disadvantages**

- Object is created even if it is never used.

---

### ✅ Lazy Singleton

The object is created only when it is needed.

**Advantages**

- Saves memory
- Object created only when required

**Disadvantages**

- Not thread-safe without synchronization

---

### ✅ Holder Singleton (Recommended)

Uses a static inner class to create the object.

**Advantages**

- Lazy Loading
- Thread-safe
- No synchronization overhead
- Best implementation for most cases

---

### When to Use?

- Database Connection
- Logger
- Configuration Manager
- Cache Manager

---

# 2️⃣ Builder Pattern

## What is Builder?

Builder Pattern helps create an object **step by step**.

Instead of passing many constructor parameters, values are set one by one using method chaining.

### Without Builder

```java
Employee employee = new Employee("John",25,"IT",50000,"Bangalore");
```

Difficult to remember parameter order.

### With Builder

```java
Employee employee = new Employee.EmployeeBuilder()
        .setName("John")
        .setAge(25)
        .setDepartment("IT")
        .setSalary(50000)
        .setCity("Bangalore")
        .build();
```

Much easier to read and maintain.

### Advantages

- Improves readability
- Supports Method Chaining
- Easy to maintain
- Avoids constructors with many parameters

### When to Use?

- Employee
- Student
- User
- Configuration Objects
- Request Objects

---

# 3️⃣ Factory Pattern

## What is Factory?

Factory Pattern creates objects without exposing object creation logic.

Instead of directly creating objects using `new`, we ask a factory class to create the object.

### Real-Life Example

Ordering food in a restaurant.

You simply order food.

The kitchen decides how to prepare it.

Similarly,

Instead of

```java
new CargoPlane();
```

we write

```java
Plane plane = PlaneFactory.getPlane("CargoPlane");
```

The factory decides which object to create.

### Advantages

- Loose Coupling
- Centralized Object Creation
- Easy to Extend
- Cleaner Code

### When to Use?

- Vehicle Creation
- Payment Gateway
- Database Drivers
- Notification Services

---

# 4️⃣ Observer Pattern

## What is Observer?

Observer Pattern allows one object to notify multiple objects whenever an event occurs.

The object sending notifications is called the **Subject**.

The objects receiving notifications are called **Observers**.

### Real-Life Example

A YouTube channel uploads a new video.

All subscribers receive notifications automatically.

```
YouTube Channel
       │
       ▼
Subscribers
 ├── Ram
 ├── Rahul
 └── Rakesh
```

### Advantages

- Loose Coupling
- One-to-Many Relationship
- Easy to Add New Observers

### When to Use?

- YouTube Notifications
- Email Notifications
- Weather Updates
- Stock Price Alerts

---

# 5️⃣ Strategy Pattern

## What is Strategy?

Strategy Pattern allows selecting one behavior from multiple behaviors **at runtime**.

Instead of using many `if-else` statements, every behavior is implemented in its own class.

### Real-Life Example

Payment Methods

- UPI
- Credit Card
- Debit Card
- Wallet

Each payment method implements the same interface.

Runtime decides which one to use.

```java
PaymentService service = new PaymentService(new UPIPayment());
```

or

```java
PaymentService service = new PaymentService(new CardPayment());
```

No changes are required inside `PaymentService`.

### Advantages

- Removes large if-else blocks
- Easy to Extend
- Easy to Test
- Follows Open/Closed Principle

### When to Use?

- Payment Systems
- Discount Calculation
- Sorting Algorithms
- Compression Algorithms

---

# 6️⃣ Proxy Pattern

## What is Proxy?

Proxy Pattern provides a substitute (middleman) object that controls access to the real object.

The proxy performs additional work before or after calling the real object.

### Real-Life Example

ATM Machine

```
Customer
    │
    ▼
ATM Machine (Proxy)
    │
    ▼
Bank Server
```

Before withdrawing money, the ATM

- Verifies the card
- Checks the PIN
- Checks account balance

Then it forwards the request to the bank.

### Advantages

- Security
- Logging
- Validation
- Access Control
- Lazy Initialization

### When to Use?

- ATM Systems
- Authentication
- Authorization
- Logging
- Remote Services

---

# 7️⃣ Template Method Pattern

## What is Template Method?

Template Method defines the overall workflow.

Some steps are fixed.

Some steps are implemented differently by subclasses.

### Real-Life Example

Food Ordering

```
Place Order
      │
      ▼
Select Food
      │
      ▼
Make Payment
      │
      ▼
Prepare Food
      │
      ▼
Deliver Food
```

The order of execution never changes.

Only

- Food Selection
- Payment Method

can change.

### Advantages

- Code Reusability
- Fixed Workflow
- Easy Customization
- Reduces Code Duplication

### When to Use?

- Food Ordering
- Online Shopping
- Report Generation
- File Processing

---

# 📌 Design Pattern Summary

| Pattern | One-Line Explanation |
|---------|----------------------|
| Singleton | One object for the entire application. |
| Builder | Build an object step by step. |
| Factory | Factory creates objects for you. |
| Observer | One event notifies many objects. |
| Strategy | Choose one behavior at runtime. |
| Proxy | A middleman adds extra functionality. |
| Template Method | Fixed workflow with customizable steps. |

---

# 🎯 Benefits of Learning Design Patterns

Learning Design Patterns helps you:

- Write Clean Code
- Reduce Code Duplication
- Improve Code Reusability
- Follow SOLID Principles
- Understand Spring Framework Internals
- Build Scalable Applications
- Crack Java & Spring Boot Interviews

---

# 🚀 Future Improvements

More design patterns will be added soon:

- Adapter Pattern
- Decorator Pattern
- Command Pattern
- State Pattern
- Facade Pattern
- Abstract Factory Pattern
- Prototype Pattern
- Bridge Pattern
- Composite Pattern
- Chain of Responsibility Pattern

---

## ⭐ Support

If you found this repository useful, please consider giving it a **⭐ Star** on GitHub.

Happy Coding! 🚀
