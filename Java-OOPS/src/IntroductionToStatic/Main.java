package IntroductionToStatic;

public class Main {
    public static void main(String[] args) {
        Human Rishabh = new Human(25, "Rishabh", 100000, false);
        Human Ritik = new Human(23, "Ritik", 1000, false);

        System.out.println(Rishabh.name);
        System.out.println(Ritik.name);

        // To access any static variable or method we don't have to create an instance of that class
        // We can access these property with any instantiated object.
        // Accessing a static property
        System.out.println(Human.population);

        // For example:
        // Our main function is always static
        // To run the main function we don't have to create any object of the class where main function is defined.

        // Note: All the static variables and methods belong to the class not to the object.

        greeting(); // This has to be static because inside any static method we cannot use any non-static method.
        // A static method can only access static data. It cannot access any non-static data.

        // Something non-static belongs or depends on an object.
        // Therefore, if this greeting function is non-static then
        // to access this method we have to access this through an object.

        Main obj = new Main();
        obj.fun(); // To access this non-static method i had to create an object of Main class.
    }

    // This static method does not depend on an object
    static void greeting () {
        // fun(); // Cannot access non-static method.
        // Main newObj = new Main();
        // newObj.fun();
        System.out.println("Greet");
    }

    // This non-static method depend on object
    void fun () {
        greeting(); // we can use static method in non-static method. But not vice-versa
    }
}
