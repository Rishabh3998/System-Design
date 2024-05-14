package IntroductionToPrinciplesOfOops.Inheritance;

public class Main {
    // What is inheritance ??
    // When a child class is able to utilise the properties or methods of its parent's class, then
    // this process of sharing the resources from parent's class is called inheritance.
    public static void main(String[] args) {
        Box newBox = new Box(); // calling default constructor
        System.out.println(newBox.l + " " + newBox.w + " " + newBox.h);

        Box newBox2 = new Box(2); // calling cube constructor
        System.out.println(newBox2.l + " " + newBox2.w + " " + newBox2.h);

        Box newBox3 = new Box(1, 2, 3); // calling parameterized constructor
        System.out.println(newBox3.l + " " + newBox3.w + " " + newBox3.h);

        BoxWithWeight boxWeight = new BoxWithWeight();
        System.out.println(boxWeight.l + " " + boxWeight.w + " " + boxWeight.h + " " + boxWeight.weight);

        BoxWithWeight boxWeight2 = new BoxWithWeight(100);
        System.out.println(boxWeight2.l + " " + boxWeight2.w + " " + boxWeight2.h + " " + boxWeight2.weight);

        BoxWithWeight boxWeight3 = new BoxWithWeight(1,2,3,100);
        System.out.println(boxWeight3.l + " " + boxWeight3.w + " " + boxWeight3.h + " " + boxWeight3.weight);

    }
}
