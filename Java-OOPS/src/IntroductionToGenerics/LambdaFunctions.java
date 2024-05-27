package IntroductionToGenerics;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {
    int sum (int a , int b) {
        return a + b;
    }

    private static int operate (int a, int b, Operation op) {
        return op.operation(2,3);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0 ; i < 5 ; i++) {
            list.add(i);
        }

        // Using lambda function
        list.forEach((e) -> System.out.println(e * 2));

        // Method reference to print elements
        list.forEach(System.out::println);

        // Using Consumer type
        Consumer<Integer> fun = (item) -> System.out.println(item * 2);
        list.forEach(fun);

        Operation sum = (a, b) -> a + b + 2;
        Operation prod = (a, b) -> a * b + 2;
        Operation sub = (a, b) -> a - b + 2;

        int sumRes = operate(2,3,sum);
        System.out.println(sumRes);

        LambdaFunctions calculator = new LambdaFunctions();
        System.out.println(operate(5,3,prod));

    }
}

interface Operation {
    int operation (int a, int b);
}
