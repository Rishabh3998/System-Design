package IntroductionToPrinciplesOfOops.Inheritance;

public class Box {
    double l; // if I make this private it won't be accessible to the child class and this is applicable for all
    // properties and methods present in this or any parent class.
    double w;
    double h;
    double commonProp;

    // Default constructor
    Box () {
        super(); // This Box class don't have any parent class but still we can use super class here because
        // this super will point to the Object class. Object class is the main class from which every class is inherited.

        // Note:
        // Class Object is the root of the class hierarchy.
        // Every class has Object as the superclass. All objects, including arrays implements the method of this class.

        this.l = -1;
        this.w = -1;
        this.h = -1;
    }

    // Cube
    Box (double side) {
        this.l = side;
        this.w = side;
        this.h = side;
    }

    Box(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    Box (Box old) {
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;
    }

    public void displayInfo () {
        System.out.println("Running the box");
    }
}
