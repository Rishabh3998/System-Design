package IntroductionToAccessControllers;

public class A {
    // Data members or properties

    // Making these properties public by default is not a good practice. Generally we don't expose properties or data
    // members to the user we try to make them private, protected and even public according to the requirement.
    // PS: with no explicit keyword the data member is accessible everywhere but within the same package only.
    // It is public but within the defined package.

    // We use getter and setters to access these data members indirectly without violating rules of OOPS principle.
    // Direct access of any property is not good for the codebase and violates the principle of data-hiding and
    // security.

    // Private keyword is going to restrict the usage of the data member outside the base class.
    private int num;

    // public data members are accessible everywhere
    public String name;

    // protected is used when inheritance is involved
    int[] arr;

    // public method exposed to everywhere
    public int getNum() {
        return num;
    }

    // public method exposed to everywhere
    public void setNum(int num) {
        this.num = num;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
