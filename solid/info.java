package solid;

public enum info {
    /**
     * clean code
     * 	can help develop software that is easy to change and maintain
     * 	is easier to troubleshoot for problems
     * 	a quicker onboarding to keep productivity high
     *
     * 	characteristics -
     * 		Focused - code should be written to solve a specific problem (method, class, package, or module.)
     * 		Simple - design and implementation must be as simple as possible
     * 		Testable - intuitive and easy to test the codebase, preferably in an automated manner
     *
     * YAGNI - You are gonna not need it
     *
     * small functions
     *
     * refactoring
     * function refactoring
     * 	SLAP - Single level of abstraction principle
     *
     * SOLID design principles
     * 	Single Responsibility Principle:
     * 		Every interface, class, or method we define should have a clearly defined goal. In essence,
     * 		it should ideally do one thing and do that well. This effectively leads to smaller methods and classes which
     * 		are also testable.
     * 	Open-Closed Principle:
     * 		The code that we write should ideally be open for extension but closed for modification.
     * 		What this effectively means is that a class should be written in a manner that there should not be any need
     * 		to modify it. However, it should allow for changes through inheritance or composition.
     * 	Liskov Substitution Principle:
     * 		What this principle states is that every subclass or derived class should be substitutable for their parent
     * 		or base class. This helps in reducing coupling in the codebase and hence improve reusability across.
     * 	Interface Segregation Principle:
     * 		Implementing an interface is a way to provide a specific behavior to our class. However, a class must not
     * 		need to implement methods that it does not require. What this requires us to do is to define smaller, more
     * 		focussed interfaces.
     * 	Dependency Inversion Principle:
     * 		According to this principle, classes should only depend on abstractions and not on their concrete
     * 		implementations. This effectively means that a class should not be responsible for creating instances for
     * 		their dependencies. Rather, such dependencies should be injected into the class.
     *
     *
     * composition over inheritance
     * 	banana gorilla problem
     * 	you ask for banana, instead you got gorilla holding a banana
     *
     * DRY & KISS
     * 	DRY stands for “Don's Repeat Yourself”. This principle states that a piece of code should not be repeated across the software
     * 	KISS stands for “Keep It Simple and Stupid”. This principle states that we should try to keep the code as simple as possible
     *
     * TDD stands for “Test Driven Development”.- write test case first (red, green add refactoring)
     * 	write the test case
     * 		red - fail the test case
     * 			implement the code to make test case pass
     * 		green - implementation the actual method, make sure test is passed
     * 		refactoring - add test case of other scenarios as well
     * 	eg. get city count in a given state
     * 		method will take state as an input and returns the no. of city (will have map of state and city count)
     *
     * 		in refactoring, other test case can be
     * 			1. empty state
     * 			2. invalid state
     *
     * 	The benefits of such practice are tremendous. This leads to software that always works as expected.
     * 	As we always start with tests, we incrementally add working code in small chunks. Also, we only add code if the
     * 	new or any of the old tests fail. Which means that it leads to reusability as well.
     */
}
