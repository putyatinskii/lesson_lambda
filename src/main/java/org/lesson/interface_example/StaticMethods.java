package org.lesson.interface_example;

public class StaticMethods {
    public static void main(String[] args) {
        AStatic a = new AStatic();
        a.test();
        InterWithStatic.staticTest();
    }
}

interface InterWithStatic {
    void test();
    static void staticTest() {
        System.out.println("This is static method");
    }
}

class AStatic implements InterWithStatic {
    @Override
    public void test() {
        System.out.println("non static method");
    }
    public static void m() {
        System.out.println("m in AStatic");
    }
}

