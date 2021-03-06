# Head First Design Pattern Notes

## OO Basics  
* polymorphism
* inheritance
* abstraction
* encapsulation

## OO Principles
1. Encapsulate what varies
2. Favor composition over inheritance
3. Program to interface, not implementations
4. Strive for loosely coupled designs between objects that interact
5. Classes should be open for extension, but closed for modification
6. Depend upon abstractions. Do not depend upon concrete classes

## OO Patterns  
* **Strategy** - defines a family of algorithms, encapsulates each one, and makes them interchangeable.
Strategy lets the algorithm vary independently from clients that use it.
* **Observer** - defines a one-to-many dependency between objects so that when one object changes state, all of its dependents are notified and updated automatically.
* **Decorator** - attach additional responsibilities to an object dynamically. Decorator provide a flexible alternative to subclassing for extending functionality. 
* **Factory Method** - defines an interface for creating an object, but let subclasses decide which class to instantiate. Factory Method let a class defer instantiation to subclass.

## Explains
* **Loose coupling** - When Two objects are loosely coupled, they can interact, but have very little knowledge of each other.

## Bullet Points
* Chapter 1
  * Knowing the OO Basics do not make you a good OO designer
  * Good OO designs are reusable, extensible and maintainable
  * Pattern show you how to build systems with good OO design qualities
  * Patterns are proven object-oriented experience
  * Patterns do not give you code, they give you general solutions to design problems. You apply them to your specific application.
  * Patterns are not invented, they are discovered.
  * Most Patterns are principles address issues of change in software.
  * Most Patterns allow some part of the system to vary independently of all other parts.
  * We often try to take what varies in a system and encapsulate it.
  * Patterns provide a shared language that can maximize the value of your communication with other developers.
* Chapter 2
  * The Observer Pattern defines a one-to-many relationship between objects
  * Subjects, or as we also know them, Observables, update Observers using a common interface
  * Observers are loosely coupled in that the Observable knows nothing about them, other than that they implement the Observer Interface
  * You can push or pull data from Observable when using the pattern (pull is considered more "correct")
  * Do not depend on a specific order of notification for your Observers
  * Java has several implementations of Observer Pattern, including the general purpose java.util.Observable
  * Watch out for issues with the java.util.Observable implementation
  * Do not afraid to create your own Observable implementation if needed
  * Swing makes heavy use of the Observer Pattern as do many GUI frameworks
  * You will also find the pattern in many other places, including JavaBeans and RMI
* Chapter 3
  * Inheritance is one form of extension, but not necessarily the best way to achieve flexibility in our designs.
  * In our design we should allow behavior to be extended without the need to modify existing code.
  * Composition and delegation can often be used to add new behaviors at runtime.
  * The Decorator Pattern provides and alternative to subclassing for extending behavior.
  * The Decorator Pattern involves a set of decorator classes that are used to wrap concrete components.
  * Decorator classes mirror the type of the components they decorate.(In fact, they are the same type as the components they decorate, either through inheritance or interface implementation.)
  * Decorators change the behavior of their components by adding new functionality before and/or after(or even in place of) method calls to the component.
  * You can wrap a component with any number of decorators.
  * Decorators are typically transparent to the client of the components.That is, unless the client is relying on the component's concrete type.
  * Decorators can result in many small objects in our design, and overuse can be complex.
