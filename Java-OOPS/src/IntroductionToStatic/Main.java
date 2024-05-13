package IntroductionToStatic;

public class Main {
    public static void main(String[] args) {
        Human Rishabh = new Human(25, "Rishabh", 100000, false);
        Human Ritik = new Human(23, "Ritik", 1000, false);

        System.out.println(Rishabh.name);
        System.out.println(Ritik.name);
        System.out.println(Human.population); // Accessing a static property
    }
}
