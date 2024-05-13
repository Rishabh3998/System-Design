package IntroductionToPackages.b;
import static IntroductionToPackages.b.Message.message; // Import statement

public class Greeting {
    public static void main(String[] args) {
        System.out.println("Hey buddy");
        message(); // Imported message function from Message class
    }
}
