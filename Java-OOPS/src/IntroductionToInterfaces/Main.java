package IntroductionToInterfaces;

public class Main {
    // Interfaces:

    // 1. Interfaces basically contains abstract functions. No function body is allowed.

    // 2. By-default the functions are public and abstract in the interface, the variables are static and final
    // present inside the interface.

    // 3. we cannot create object of an interface.

    // 4. An abstract class can provide the implementation of an interface but interface cannot provide
    // an implementation of abstract class.

    public static void main(String[] args) {
        // Car car = new Car();
        // Engine car2 = new Car(); // Variable of interface type
        // Media car3 = new Car();

        // car.accelerate();
        // car.start();
        // car.stop();

        // car2.accelerate();
        // car2.start();
        // car2.stop();

        // car3.start();;
        // car3.stop();

        // car.a; // Here we can access the variable defined in Car class.
        // car2.a; // Variable of interface type cannot access the variable of the class.

        SportsCar audi = new SportsCar();
        EVEngine ev = new EVEngine();

        audi.start();
        audi.stop();

        audi.upgradeEngine(ev);
        audi.start();
        audi.stop();
    }
}
