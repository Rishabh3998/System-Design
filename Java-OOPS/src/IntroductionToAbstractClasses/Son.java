package IntroductionToAbstractClasses;

public class Son extends Parent {
    public Son(int age) {
        super(age);
    }

    @Override
    void normal () {
        super.normal();
    }

    @Override
    void career(String name) {
        System.out.println(name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println(name + " " + age);
    }
}
