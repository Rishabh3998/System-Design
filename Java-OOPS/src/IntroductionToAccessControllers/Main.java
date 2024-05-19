package IntroductionToAccessControllers;

import java.util.Arrays;

public class Main {
    // Access modifiers control structure

    //              |  Class  |  Package |   subclass     |    subclass    |  World
    //              |         |          | (same package) | (diff package) | (Diff package and not subclass
    // -------------|---------|----------|----------------|----------------|--------------------------------
    // public       |    +    |     +    |       +        |       +        |    +
    // protected    |    +    |     +    |       +        |       +        |
    // no modifier  |    +    |     +    |       +        |                |
    // private      |    +    |          |                |                |

    public static void main(String[] args) {
        A obj = new A(34, "Rishabh");

        // Need to do some stuff here
        // 1. Access the data members

        int num = obj.getNum(); // Accessing private member
        System.out.println(num);

        int[] res = obj.getArr(); // Accessing protected member
        System.out.println(Arrays.toString(res));

        // 2. Modify the data members
    }
}
