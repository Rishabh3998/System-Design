package IntroductionToPrinciplesOfOops.Polymorphism;

public class Numbers {
    // Method overloading
    int sum (int a, int b) {
        return a + b;
    }

    int sum (int a, int b, int c) {
        return a+b+c;
    }

    public static void main(String[] args) {
        Numbers num = new Numbers();
        int res = num.sum(1,2);
        System.out.println(res);
        int res2 = num.sum(1,2,3);
        System.out.println(res2);
    }
}
