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
