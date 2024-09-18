package src.com.java.world.practice.sealed_classes;

// java: sealed class must have subclasses
// We can't inherit final class
// We can't crate object of the abstract class

//sealed class A extends Thread implements Cloneable permits B, C {

sealed class A permits B, C {

}

non-sealed class B extends A {

}

non-sealed class C extends A {

}

class D implements Y {

    @Override
    public void print() {

    }
}

sealed interface X permits Y {

}

non-sealed interface Y extends X {
    void print();
}


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

    }
}
