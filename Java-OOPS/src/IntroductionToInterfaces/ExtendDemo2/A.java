package IntroductionToInterfaces.ExtendDemo2;

public interface A {
    // We know that static methods do not get inherited.
    // why ??

    // Reason:
    // Inheritance means you have to override methods, overriding means object dependency is there because of
    // runtime polymorphism, static entities does not depend on objects, that's why they cannot be inherited.
    // Therefore, we have to define body for static methods.

    // static methods present in the interface are the ones which will be used only. we can;t override or inherit
    // we have to use those already defined methods only.

    // static interface methods should always have a body.
    static void staticFun() {
        System.out.println("static interface function");
    }
    default void fun() {
        System.out.println("I am in A");
    }
}
