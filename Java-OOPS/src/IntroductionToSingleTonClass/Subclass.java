package IntroductionToSingleTonClass;
import IntroductionToAccessControllers.A;
import java.util.Arrays;

public class Subclass extends A {
    public Subclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        Subclass obj = new Subclass(69, "Rishabh");

        int[] arr = obj.getArr(); // Accessing protected member in a subclass or child class of diff package
        System.out.println(Arrays.toString(arr));
    }
}
