package Introduction;

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

        Student vansh = new Student(); // Object/Instance of Student class
        Student ritik = new Student();
        vansh.setStudentData("Vansh", 99, 1);
        ritik.setStudentData("Ritik", 69, 2);
        vansh.getStudentData();
        ritik.getStudentData();
    }
}

// Create a class
class Student {
    String name;
    float marks;
    int rollNumber;

    void setStudentData (String name, float marks, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    void getStudentData () {
        System.out.println(rollNumber + " " + name + " " + marks);
    }
}
