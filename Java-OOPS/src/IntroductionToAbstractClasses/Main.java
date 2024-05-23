package IntroductionToAbstractClasses;

public class Main {
    // As we know that java does not support multiple inheritance
    // But sometimes we can face this type of situation where we need to extend more than
    // one class into a base or child class, So in this case how can we implement the
    // multiple inheritance ?

    // But the catch here is that we will not use the parent class to do any task. The parent
    // class will only tell us to do something, but we have to do that task using the child class.
    // The parent class will not tell us how to do that the child class should have to figure that out.

    // The parent class will only provide us a method without any body. The child class should have to
    // write the body itself. This kind of method provided by parent class are known as Abstract methods.

    // So child class will override the method provided by parent class according to its requirement.

    // The answer is using abstract classes.
    // Note: Any class that contains one or more abstract methods must also be declared as abstract.
    // Every child class has to override all the abstract methods present in a parent abstract class.

    public static void main(String[] args) {
        Son son = new Son(25);
        son.career("programmer");

        Son son2 = new Son(23);
        son.career("Doctor");

        // 1. We cannot create object of an abstract class.
        // Parent mom = new Parent();

        // because if creation of abstract class objects will be allowed then the object will have the access of the
        // access of abstract or non-abstract methods present in the class.
        // But since we know that abstract methods don't have any body the accessibility is unnecessary there.

        // 2. Therefore, we cannot even create abstract constructors.

        // 3. We also cannot create abstract static methods because we cannot override static methods.
        // But we can create static methods in abstract classes this is allowed.

        Parent.hello();

        // Normal methods can also be created
        son.normal();
        son2.normal();
    }
}
