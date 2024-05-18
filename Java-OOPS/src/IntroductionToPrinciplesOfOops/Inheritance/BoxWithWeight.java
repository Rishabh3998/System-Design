package IntroductionToPrinciplesOfOops.Inheritance;

public class BoxWithWeight extends Box {
    double weight;

    BoxWithWeight () {
        this.weight = -1;
    }

    BoxWithWeight (double weight) {
        this.weight = weight;
    }

    BoxWithWeight(double l, double w, double h, double weight) {
        super(l, w, h); // This will call the constructor of parent class constructor(l,w,h)
        // Note: Access modifiers like private, public won;t affect super constructor
        // Initialisation of private member is still possible via super constructor.
        this.weight = weight;
        System.out.println("Called from BoxWithWeight where l,w,h,weight all are used");
    }

    // Note: A parent class cannot access child class properties, but a child class can access the parent
    // class properties until and unless its private.
}
