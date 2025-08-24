package Mixed2_inherits;

class A {
    int ivar = 7;

    void m1() {
        System.out.println("A is m1.");
    }

    void m2() {
        System.out.println("A is m2.");
    }

    void m3() {
        System.out.println("A is m3.");
    }
}

// Class B
class B extends A {
    void m1() {
        System.out.println("B is m1");
    }
}

// Class C
class C extends B {
    void m3() {
        System.out.println("C is m3, " + (ivar + 6));
    }
}

// main class
public class Mixed2 {

    public static void main(String[] args) {

        A a = new A();
        B b = new B();
        C c = new C();
        // A a2 = new C();

        b.m1();
        c.m2();
        a.m3();
    }

} // end of main
