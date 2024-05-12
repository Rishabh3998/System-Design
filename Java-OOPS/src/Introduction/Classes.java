package Introduction;

import java.util.Arrays;

public class Classes {
    public static void main(String[] args) {
        // Introduction
        // Problem: Store 5 roll numbers
        int[] rollNumbers = new int[5];

        // Problem: Store 5 names
        String[] names = new String[5];

        // Problem: Store student data {rollNumber, name, marks}
        int[] studentRollNumbers = new int[5];
        String[] studentNames = new String[5];
        float[] studentMarks = new float[5];

        // In the above code where we are storing student data we are creating 3 types of Data
        // structures to store the data. This is not a good practice instead we have to create a
        // Single data structure which can store accumulated data of every student collectively.

        // To do this kind of stuff we need classes and OOPS concepts
        // Class is a named group of properties and functions or methods.
        // It is a blueprint according to which
        // we can store data of an object or instance of the defined class.
        // So we can create our own data type by using classes

        // Class => Logic construct
        // Object => Physical reality

        // By-default the instance present in the array will point to null
        Student[] students = new Student[5];

        System.out.println(Arrays.toString(students));
        // [null, null, null, null, null]

        // Declaration
        Student rishabh;

        // Instantiation
        rishabh = new Student();

        // Initialization of properties without using setter
        rishabh.rollNumber = 1;
        rishabh.name = "Rishabh";
        rishabh.marks = 80;

        // new operator is used to create an object or instance in heap memory (Dynamic allocation)
        Student vansh = new Student(); // Object/Instance of Student class

        // vansh is the reference variable pointing to the object present in heap.
        Student ritik = new Student();

        // Initialization of properties using setter
        vansh.setStudentData("Vansh", 99, 3);
        ritik.setStudentData("Ritik", 69, 2);

        // Fetching the properties using getter
        vansh.getStudentData();
        ritik.getStudentData();
        rishabh.getStudentData();

        // Introduction to constructor
        // Student(); => constructor
        // A constructor basically defines what happens when an object gets created

        Student peter = new Student(10, "Peter", 99);
        peter.getStudentData();
    }
}

// Create a class
// Objects stored in heap memory
class Student {
    String name; // properties/instance variables (Stack memory)
    float marks;
    int rollNumber;

    // Default Constructor
    Student() {};

    // Parametrised Constructor
    Student(int rollNumber, String name, float marks) {
        this.name = name;
        this.marks = marks;
        this.rollNumber = rollNumber;
    }

    // Method/Setter
    void setStudentData (String name, float marks, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method/Getter
    void getStudentData () {
        System.out.println(rollNumber + " " + name + " " + marks);
    }
}
