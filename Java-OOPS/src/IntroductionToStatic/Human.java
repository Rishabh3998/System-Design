package IntroductionToStatic;

public class Human {
    // Static variable:

    // Properties those are not related to the object, the properties which are object independent are static.

    // For example:

    // Population for every Human class object will be same
    // For Rishabh, population will be 7 billion
    // For others, population will be 7 billion

    // Therefore, this property of population will be independent for every object.
    // Hence, it is static in nature.

    int age;
    String name;
    int salary;
    boolean maritalStatus;
    static long population;

    public Human(int age, String name, int salary, boolean maritalStatus) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.maritalStatus = maritalStatus;
        Human.population = 7000000000L;
    }
}
