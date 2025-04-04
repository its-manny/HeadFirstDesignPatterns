# Java Design Patterns
A repo of completed exercises and notes relating to my study of [Head First Design Patterns - 2nd Edition](https://www.oreilly.com/library/view/head-first-design/9781492077992/)
## Patterns
### Strategy
> The strategy pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable. Strategy 
> lets the algorithm vary independently of clients that use it.
### Observer
> Defines a one-to-many dependency between objects so that when one object changes state, all its dependants are 
> notified and updated automatically.
### Decorator
> Attach additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing
> for extending functionality.
### Factory Method
> Defines as interface for creating an object, but lets subclasses decide which class to instantiate. Factory Method
> lets a class defer instantiation to subclasses.
### Abstract Factory
> Provides and interface for creating families of related or dependent objects without specifying their concrete
> classes.
### Singleton
> Ensures a class has only one instance, and provides a global point of access to it.
### Command
> Encapsulates a request as an object, thereby letting you parameterize other objects with different requests, queue 
> or log requests, and support undoable operations.
### Adapter
> Converts the interface of a class into another interface the clients expect. Adapter lets classes work together that
> couldn't otherwise because of incompatible interfaces.
> 
> Note: This pattern can be implemented as object adapters (using composition) or class adapters (using multiple-
> inheritance).
### Facade
> Provides a unified interface to a set of interfaces in a subsystem. Facade defines a higher level interface that 
> makes the subsystem easier to use.
### Template Method
>Defines the skeleton of an algorithm in a method, deferring some steps in subclasses. Template Method lets subclasses
>redefine certain steps of an algorithm without changing the algorithm's structure.
### Iterator
>Provides a way to access the elements of an aggregate object sequentially without exposing its underlying 
>representation.
### Composite
>Allows you to compose objects into tree structures to represent part-whole hierarchies. Composite lets clients treat 
>individual objects compositions of objects uniformly.
### State
> Allows an object to alter its behaviour when its internal state changes. the object will appear to change its class.
### Proxy
> Provides a surrogate or placeholder for another object and controls access to it.
### Compound
> Combines two or more patterns into a solution that solves a recurring or general problem.
> e.g. Model View Controller.