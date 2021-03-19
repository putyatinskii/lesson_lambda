package org.lesson;



public class ExampleAnonymousClass {
    public static void main(String[] args) {
        A a = new A();

        A a1 = new A() {
            @Override
            public void test() {
                System.out.println("test in anonymous class");
            }
        };

        a.test();
        a.test2();
        System.out.println(a.getClass().getName());

        a1.test();
        a1.test2();
        System.out.println(a1.getClass().getName());
    }
}

class A {
    public void test() {
        System.out.println("test in A");
    }

    public void test2() {
        System.out.println("test2 in A");
    }
}
