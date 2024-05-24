package IntroductionToAbstractClasses;

public abstract class Parent {
    int age;
    final int VALUE;

    public Parent(int age) {
        this.age = age;
        VALUE = 1234;
    }

    // We cannot create abstract constructors
    // abstract Parent ();
    abstract void career (String name);
    abstract void partner (String name, int age);

    static void hello () {
        System.out.println("Hello");
    }

    void normal () {
        System.out.println("Normal");
    }
}
