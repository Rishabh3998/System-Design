package IntroductionToInterfaces.NestedInterfaces;

public class A {
    // nested interfaces
    public interface NestedInterface {
        boolean isOdd (int num);
    }
}

class B implements A.NestedInterface {
    @Override
    public boolean isOdd (int num) {
        return (num & 1) == 1;
    }
}
