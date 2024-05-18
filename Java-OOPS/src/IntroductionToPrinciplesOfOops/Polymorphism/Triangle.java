package IntroductionToPrinciplesOfOops.Polymorphism;

public class Triangle extends Shapes {
    // Method overriding
    @Override // Annotation
    void area() {
        System.out.println("Area is: 0.5 * base * height");
    }
}
