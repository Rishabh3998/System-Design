package IntroductionToSingleTonClass;

public class Singleton {
    // Requirement:
    // Need to create a class where only one instance is allowed of that class.
    // Solution: Use SingleTon class

    // Logic: Whenever an object is created it uses the constructor of the class to create an object
    // If we can restrict the use of this constructor after an execution, then no other object will be created.

    private Singleton () {
        // Now this constructor can only be used in this file only
    }
    private static Singleton instance;
    public static Singleton getInstance () {
        // Check whether 1 object is created or not
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

