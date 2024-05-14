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
        super(l, w, h); // This will call the constructor of parent class
        this.weight = weight;
    }
}
