package IntroductionToPrinciplesOfOops.Polymorphism;

public class Main {
    // What is Polymorphism ??
    // Poly => many, morphism => ways to represent
    // Act of representing the same thing in multiple ways
    // Like we did with multiple constructors with different parameters.

    // Types:
    // 1. Compile time or static polymorphism
    // -> This is achieved via method overloading and operator overloading but operator one does not exist in Java.
    // -> Method overloading: when a class with same name have multiple methods with different functionalities.

    // 2. Runtime / Dynamic polymorphism
    // -> This is achieved by method overriding.
    // -> For overriding, same function has to be there in both parent and child.

    // Note: we do overriding mainly when the type of reference is Parent class and type of object is of type child.
    // At that moment if we need to call a function which present in parent class with some functionalities
    // related to child class we do overriding of that function and declare the same function present in parent class
    // with different logic.


    // Parent obj = new Child();
    // Here the method which will be called depends upon the child class.
    // This is known as upcasting.

    // Reference type defines which one is accessible.
    // Object type defines which one to run.

    // How Java determines this ?
    // Which method to call is determined via dynamic method dispatch.

    // use of final keyword
    // 1. To declare constants
    // 2. To prevent overrides.
    // 3. We can use prevent inheritance public final class A {} => Now we cannot extend this class.
    // Note: when a class is final it implicitly declares all the methods final too.

    // We cannot override the static methods. It is happening because no matter what but the static methods will
    // get invoked independent of the object. They don't need any object hence they don't behave according to the
    // child and parent separately. static methods can be inherited but cannot be overridden.

    // Analogy:
    // overriding depends on object.
    // static does not depend on object.
    // Hence static methods cannot be overridden.

    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Square square = new Square();
        // In inheritance, we saw that properties depends upon the reference type not on the object
        // But here the area function getting invoked from the square class which is object type.
        // Reason: Method overriding
        Shapes square2 = new Square();

        // Here function area is depicting polymorphism
        shape.area();
        circle.area();
        triangle.area();
        square.area();
        square2.area();
    }
}
