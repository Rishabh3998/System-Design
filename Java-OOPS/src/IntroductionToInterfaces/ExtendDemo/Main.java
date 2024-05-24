package IntroductionToInterfaces.ExtendDemo;

public class Main implements A, B{

    @Override
    public void fun() {
        System.out.println("Run func");
    }

    @Override
    public void greet() {
        System.out.println("Greet");
    }

    public static void main(String[] args) {

    }

    // To create inheritance between class and interface use implements
    // To create inheritance between interface to interface use extends
}
