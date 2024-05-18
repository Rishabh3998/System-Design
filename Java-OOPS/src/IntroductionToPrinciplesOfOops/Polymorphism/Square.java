package IntroductionToPrinciplesOfOops.Polymorphism;

public class Square extends Shapes{
    // Method overriding
    @Override // Annotation
    void area () {
        System.out.println("Area is: side * side");
    }
}
