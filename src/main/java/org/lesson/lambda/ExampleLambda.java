package org.lesson.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Supplier;

public class ExampleLambda {
    static int digit = 3;

    public static void main(String[] args) {
        Comparator<User> comp = Comparator.comparing(User::getName);

        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Ray", "Harley"));
        users.add(new User("Van", "Darkholme"));
        users.add(new User("William ", "Herrington"));
        users.add(new User("Brad", "McGuire"));
        users.add(new User("Steve", "Rambo"));

       users.sort(new NameCompare());

//        System.out.println(comp.getClass().getName());
//        users.sort(comp);

        System.out.println(users);

        int a = 2;
        //
//            @Override
//            public int met2() {
//                return 0;
//            }
        Inter inter = () -> {
            //a+=2;
            digit += 7;
            System.out.println(digit + a);
        };
        System.out.println(inter.getClass().getName());

    }
}

interface Inter {
    void met();
    //int met2();
    //static void s() {}
    String toString();
}


