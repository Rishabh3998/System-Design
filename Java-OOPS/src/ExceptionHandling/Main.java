package ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        try {
            // int c = a / b;
            int c = divide(a, b);
            System.out.println(c);
        } catch (Exception e) {
            // The type that we used for e in above line is generic in nature
            // if there are any specific exceptions we should declare them above this code block
            // because if we declare them below this, then for every exception this code block will get execute
            // and rest of the catch block will be ignored.
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This will always execute");
        }
    }

    static int divide (int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("numerator cannot be divided by 0");
        }
        return a / b;
    }
}
