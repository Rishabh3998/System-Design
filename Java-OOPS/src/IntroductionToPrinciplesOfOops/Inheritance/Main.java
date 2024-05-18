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

        BoxWithWeight boxWeight2 = new BoxWithWeight(100, 1);
        System.out.println(boxWeight2.l + " " + boxWeight2.w + " " + boxWeight2.h + " " + boxWeight2.weight);

        BoxWithWeight boxWeight3 = new BoxWithWeight(1,2,3,100, 1);
        System.out.println(boxWeight3.l + " " + boxWeight3.w + " " + boxWeight3.h + " " + boxWeight3.weight);

        // Here reference type is Box but instance type is BoxWeight
        Box hybridBox = new BoxWithWeight(1,2,3,4, 5);
        // hybridBox.weight; // Still can't access the child property, because it is reference type that decide
        // which properties and methods will be accessible of which class. here the reference type if Box, therefore
        // we can only access the properties and methods of Box class.

        // Case:
        // There are many variables in parent and child class.
        // We are given access to variables which are defined in the reference type here i.e. BoxWithWeight.
        // Hence, we should have access to the weight variable.
        // But we are receiving an error why ??
        // This also means, that the ones we are trying to access should be initialised
        // But here the object is of type parent's class i.e. Box how we are going to call the constructor of child class.
        // Parent's class don't have any idea about the properties available in child class.
        // That's why this error is arising.

        // BoxWithWeight hybridBoxWithWeight = new Box(1,2,3); // We cannot reference a child to a parent


        // Types of Inheritance:

        // 1. Single Inheritance: one class extends another class Eg: Box => BoxWithWeight
        // 2. Multilevel Inheritance: one to second then second to third Eg: A => B => C
        // 3. Hierarchical Inheritance
        // 4. Hybrid Inheritance

        BoxPrice boxPrice = new BoxPrice(); // Multilevel inheritance

    }
}
