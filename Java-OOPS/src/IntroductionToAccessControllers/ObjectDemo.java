package IntroductionToAccessControllers;

public class ObjectDemo {
    int num;
    float gpa;

    public ObjectDemo(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    @Override
    public int hashCode() {
        return num * 100;
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectDemo)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(12, 58.6f);
        ObjectDemo obj2 = new ObjectDemo(12, 88.6f);

        if (obj == obj2) {
            // This is checking if these 2 variables are pointing to the same object or not.
            System.out.println("Obj1 is equal to obj2");
        }

        if (obj.equals(obj2)) {
            // This is checking the content present in the object
            System.out.println("Obj1 is equal to obj2, from equals method");
        }

        System.out.println(obj.hashCode()); // hashcode is the random integer value. It is not an address
        // we cannot access memory address in Java

        System.out.println(obj.getClass()); // class IntroductionToAccessControllers.ObjectDemo
    }
}
