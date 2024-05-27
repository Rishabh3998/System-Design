package IntroductionToGenerics.Comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student Rishabh = new Student(1, 88f);
        Student Vansh = new Student(2, 98f);
        Student Rahul = new Student(3, 91f);
        Student Sachin = new Student(4, 67f);
        Student Ritik = new Student(5, 87f);
        Student Arpit = new Student(6, 35f);

        Student[] list = {Rishabh, Vansh, Rahul, Sachin, Ritik, Arpit};

        // Arrays.sort(list); // This is using the compareTo present in the Student class.
        Arrays.sort(list, new Comparator<Student>() {
            // Using special defined comparator for this Array.
            @Override
            public int compare(Student student, Student t1) {
                // Ascending order
                // return (int)(student.marks - t1.marks);
                // Descending order
                return -(int)(student.marks - t1.marks);
            }
        });

        // Using special defined comparator for this Array.
        // Implementation done in lambda expression
        Arrays.sort(list, (student, t1) ->
            -(int)(student.marks - t1.marks)
        );

        System.out.println(Arrays.toString(list));

        // here the problem is that if we need to compare these object to find the greater one
        // how can we do that we don't have any metric here.
        // here Java is confused which parameter to use for comparison rollNo or marks.
        // To solve this we need to implement comparable interface.
        if (Rishabh.compareTo(Vansh) > 0) {
            System.out.println("Rishabh has more marks");
        } else {
            System.out.println("Vansh has more marks");
        }
    }
}
