package IntroductionToInterfaces.ExtendDemo2;

public class Main implements A, B {
    @Override
    public void greet() {
        System.out.println("Greet");
    }

    public static void main(String[] args) {
        Main obj = new Main();
        A.staticFun();
    }

    // To create inheritance between class and interface use implements
    // To create inheritance between interface to interface use extends

    // Note: Annotations are also implemented internally using interfaces.
}
