package IntroductionToStatic;

class OutSideClass {
    static String name;

    public OutSideClass(String name) {
        OutSideClass.name = name;
    }
}

// Outside class cannot be static
public class InnerClasses {
    // Inner class be static or non-static
    static class Test {
        String name;

        public Test(String name) {
            this.name = name;
        }
    }

    class Test2 {
        String name;

        public Test2(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        // A static class object can be used here.
        Test a = new Test("A");
        Test b = new Test("B");

        System.out.println(a.name);
        System.out.println(b.name);

        // This object class is non-static, and we cannot access this in a static method
        // Test2 b = new Test2("Name");

        OutSideClass a1 = new OutSideClass("A1");
        OutSideClass b1 = new OutSideClass("B1");

        System.out.println(a1.name);
        System.out.println(b1.name);
    }
}

// Note: As we know that objects are created at runtime.
// And we also know that static variables and methods are not dependent on objects.
// Therefore, static entities are created during compile time.

// Outside class cannot be static.
// static class A {
//
// }
