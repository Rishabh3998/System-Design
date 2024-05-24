package IntroductionToGenerics.Comparing;

public class Student implements Comparable<Student> {
    int rollNo;
    float marks;

    public Student(int rollNo, float marks) {
        this.rollNo = rollNo;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", marks=" + marks +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        int diff = (int)(this.marks - student.marks);
        // if (diff == 0) both are equal
        // if (diff > 1) 1st student has greater marks then second
        // else second has greater than first.

        return diff;
    }
}
