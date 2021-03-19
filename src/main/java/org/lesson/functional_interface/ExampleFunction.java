package org.lesson.functional_interface;

import java.util.Random;
import java.util.function.*;

public class ExampleFunction {

    static int a = 9;
    public static void main(String[] args) {
        Predicate<Integer> pr = x -> x > 0;
        Predicate<Integer> pr2 = pr.negate();
        Predicate<Integer> prAnd = pr.and(pr);

        System.out.println(pr.test(5));
        System.out.println(pr2.test(5));
        System.out.println(prAnd.test(5));
        System.out.println();

        UnaryOperator<Double> funcSqrt = x -> Math.sqrt(x);
        UnaryOperator<Double> funcLog = x -> Math.log(x);
        Function<Double, Double> func1 = funcLog.compose(funcSqrt);
        Function<Double, Double> func2 = funcLog.andThen(funcSqrt);

        System.out.println(funcSqrt.apply(5.0));
        System.out.println(funcLog.apply(5.0));
        System.out.println(func1.apply(5.0));
        System.out.println(func2.apply(5.0));
        System.out.println();

        Supplier<Integer> sup = () -> new Random().nextInt(1000);
        Consumer<Object> cons = System.out::println;
        cons.accept(sup.get());

        BinaryOperator<Double> sum = (x, y) -> {
            double z = Math.pow(a, x);
            z += y*a;
            return z;
        };
        cons.accept(sum.apply(2.,4.));

        UnaryOperator<String> trim = String::trim;
        String str = trim
                .andThen(String::toLowerCase)
                .andThen(StringBuilder::new)
                .andThen(StringBuilder::reverse)
                .andThen(StringBuilder::toString)
                .apply(" ABCDEFG ");
        System.out.println(str);

    }

}

