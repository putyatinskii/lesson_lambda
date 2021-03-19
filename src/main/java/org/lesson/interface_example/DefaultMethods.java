package org.lesson.interface_example;

public class DefaultMethods {
    public static void main(String[] args) {
        ADefault a = new ADefault();
        a.test();
        a.defMethod();

    }
}

class ADefault implements Inter, Inter2 {
    @Override
    public String toString() {
        return "A{}";
    }

    @Override
    public void defMethod() {
        Inter.super.defMethod();
        //System.out.println("defMethod in ADefault");
    }
    @Override
    public void test() {
        System.out.println("method test");
    }
}

interface Inter {
    default void defMethod() {
        System.out.println("defMethod in Inter");
    }
    void test();
}

interface Inter2 {
    default void defMethod() {
        System.out.println("defMethod in Inter2");
    }

    void test();
}