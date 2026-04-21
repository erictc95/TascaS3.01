En este archivo vamos a exponer los arreglos, de cada uno de los principios SOLID -> 

# SOLID Principles – Refactoring Summary
 
---

## S — Single Responsibility Principle

### Problem
A single class handled multiple concerns, including validation and confirmation logic.

### Violation
The class had multiple reasons to change, violating SRP.

### Solution
Responsibilities were separated into:
- `UserValidator`
- `UserConfirmationService`

### Result
- Improved cohesion  
- Clear separation of concerns  
- Easier maintenance and evolution  

---

## O — Open/Closed Principle

### Problem
Behavior depended on conditional logic (`if/else`) based on instrument type.

### Violation
Adding new functionality required modifying existing code, violating OCP.

### Solution
Introduced the `Instrument` interface and leveraged polymorphism.

Each instrument encapsulates its own behavior.

### Result
- System is open for extension (new instruments)  
- Closed for modification (no changes to existing code)  
- Eliminated conditional logic  

---

## L — Liskov Substitution Principle

### Problem
The base class defined behavior that not all subclasses could correctly implement.

Example: `Ghost` could not fulfill `takeDamage()` and threw an exception.

### Violation
Subclasses altered expected behavior, breaking substitutability and violating LSP.

### Solution
Behavior was decoupled from the base class:
- `Character` now represents only shared state
- Capabilities were extracted into interfaces (`Attack`, `Damage`)

### Result
- Subclasses adhere to their contracts  
- No invalid or unsupported operations  
- Safe substitution of base types without runtime issues

---

## I — Interface Segregation Principle

### Problem
A single interface exposed multiple unrelated operations, forcing classes to implement unused methods.

### Violation
Clients depended on methods they did not use, violating ISP.

### Solution
The interface was decomposed into smaller, role-specific interfaces:
- `Switchable`
- `TemperatureControl`
- `Washable`

### Result
- Reduced unnecessary dependencies  
- Improved interface cohesion  
- Clearer contracts per capability  

---

## D — Dependency Inversion Principle

### Problem
`ServicePerson` depended directly on the concrete implementation `MySqlPersonRepository`, instantiating it internally. This created tight coupling between the business layer and the persistence layer.

### Violation
The high-level module (`ServicePerson`) depended on a low-level module instead of an abstraction, violating DIP. This design reduces flexibility and makes the system harder to extend or modify.

### Solution
An abstraction (`PersonRepository`) was introduced to define the persistence contract. `MySqlPersonRepository` implements this interface.

`ServicePerson` now receives a `PersonRepository` via constructor injection, decoupling business logic from concrete implementations.

### Result
- Reduced coupling between layers  
- Improved testability (mocking possible)  
- Easier substitution of persistence mechanisms (e.g., MySQL → MongoDB)  
- Better adherence to layered architecture principles
