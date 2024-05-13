package IntroductionToStatic;

public class StaticBlock {
    static int a = 4;
    static int b;

    static {
        // This block will run or execute once when class will load and object is created
        // We can use this block to do initialisation
        System.out.println("Static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " +  StaticBlock.b);

        StaticBlock.b += 3;
        System.out.println(StaticBlock.a + " " +  StaticBlock.b);

        StaticBlock newObj = new StaticBlock();
        System.out.println(StaticBlock.a + " " +  StaticBlock.b);
    }
}
