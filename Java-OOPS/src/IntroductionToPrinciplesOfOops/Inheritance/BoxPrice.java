package IntroductionToPrinciplesOfOops.Inheritance;

public class BoxPrice extends BoxWithWeight{
    double price;

    BoxPrice () {
        super();
        this.price = -1;
    }

    BoxPrice (BoxPrice other) {
        super(other);
        this.price = other.price;
    }

    BoxPrice (double price) {
        this.price = price;
    }

    public BoxPrice(double l, double w, double h, double weight, double commonProp, double price) {
        super(l, w, h, weight, commonProp);
        this.price = price;
    }
}
