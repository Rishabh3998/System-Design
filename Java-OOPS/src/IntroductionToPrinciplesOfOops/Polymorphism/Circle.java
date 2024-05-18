package IntroductionToPrinciplesOfOops.Polymorphism;

public class Circle extends Shapes {
    // Method overriding
    @Override // Annotation
    void area () {
        System.out.println("Area is: Pie * r * r");
    }
}
