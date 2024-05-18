package IntroductionToPrinciplesOfOops.Inheritance;

public class BoxWithWeight extends Box {
    double weight;
    double commonProp; // Defined in both parent and child class

    BoxWithWeight () {
        super();
        this.weight = -1;
        this.commonProp = -1;
    }

    BoxWithWeight (double weight, double commonProp) {
        this.weight = weight;
        this.commonProp = commonProp;
    }

    BoxWithWeight (BoxWithWeight other) {
        super(other);
        this.weight = other.weight;
        this.commonProp = other.commonProp;
    }

    BoxWithWeight(double l, double w, double h, double weight, double commonProp) {
        super(l, w, h); // This will call the constructor of parent class constructor(l,w,h)
        // Note: Access modifiers like private, public won;t affect super constructor
        // Initialisation of private member is still possible via super constructor.

        // The super keyword will always refer to the parent class.
        // Box => BoxWeight (super keyword defined in boxWeight will refer to the Box class which is the parent)

        System.out.println(this.commonProp); // Child class property;
        System.out.println(super.commonProp); // parent class property;

        this.weight = weight;
        this.commonProp = commonProp;
        System.out.println("Called from BoxWithWeight where l,w,h,weight all are used");
    }

    // Note: A parent class cannot access child class properties, but a child class can access the parent
    // class properties until and unless its private.
}
