package IntroductionToAccessControllers;

import java.util.Arrays;

public class Subclass extends A{
    public Subclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        Subclass obj = new Subclass(69, "Rishabh");

        int[] arr = obj.getArr(); // Accessing protected member in a subclass or child class
        System.out.println(Arrays.toString(arr));

        System.out.println(obj instanceof A); // true
        System.out.println(obj instanceof Subclass); // true
        System.out.println(obj instanceof Object); // true

    }
}
