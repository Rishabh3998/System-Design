package IntroductionToPrinciplesOfOops.Inheritance;

public class Box {
    double l;
    double w;
    double h;

    // Default constructor
    Box () {
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
