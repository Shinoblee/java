package com.shinoblee.lambdas;

import java.util.List;
import java.util.function.*;

public class LambdasDemo {
    public static String prefix = "-";

    public LambdasDemo(String message) {

    }

    public void print(String message) {
        System.out.println(message);
    }

    public static void show() {

        //THIS IS AN ANONYMOUS INNER CLASS
//        greet(new Printer(){
//            @Override
//            public void print(String message) {
//                System.out.println(message);
//            }
//        });
        //THIS IS A LAMBDA EXPRESSION
//        Printer printer = message -> System.out.println(message);
        //LAMBDA'S CAN SKIP THE DECLARATION TYPE
//        greet(message -> System.out.println(message));
        //Class/Object::method
//        greet(System.out::println);

        //THESE ARE THE SAME
//        greet(message -> print(message));
//        greet(LambdasDemo::print);

//        var demo = new LambdasDemo();
//        greet(message -> demo.print(message));
//        greet(demo::print);

        //CAN ALSO USE WITH THE CONSTRUCTORS
//        greet(message -> new LambdasDemo(message));
//        greet(LambdasDemo::new);

//        List<Integer> list = List.of(1, 2, 3);
//        //IMPERATIVE PROGRAMMING (for, if/else, switch/case)
//        for (var item : list)
//            System.out.println(item);
//        //DECLARATIVE PROGRAMMING
//        list.forEach(item -> System.out.println(item));

        //CONSUMERS INTERFACE
//        List<String> list = List.of("a", "b", "c");
//        Consumer<String> print = item -> System.out.println(item);
//        Consumer<String> printUpperCase = item -> System.out.println(item.toUpperCase());
//        //CHAINING CONSUMERS INTERFACE
//        list.forEach(print.andThen(printUpperCase).andThen(print));

        //SUPPLIER INTERFACE
        //SUPPLIER HAS PRIMITIVE TYPES /DOUBLESUPPLIER/INTSUPPLIER...
//        Supplier<Double> getRandom = () -> Math.random() ;
//        var random = getRandom.get();
//        System.out.println(random);

        //FUNCTION INTERFACE
//        Function<String, Integer> map = str -> str.length();
//        var length = map.apply("Sky");
//        System.out.println(length);

        //COMPOSING FUNCTIONS
        //"key:value"
        //first: "key=value"
        //second: "{key=value}"
//        Function<String, String> replaceColon = str -> str.replace(":", "=");
//        Function<String, String> addBraces = str -> "{" + str + "}";

        //DECLARATIVE PROGRAMING
//        var result = replaceColon
//              .andThen(addBraces)
//              .apply("key:value");
//
//      var result = addBraces.compose(replaceColon).apply("key:value");
//        System.out.println(result);

        //PREDICATE INTERFACE
        //"sky" has more than 5 characters
//        Predicate<String> isLongerThan5 = str -> str.length() > 5;
//        var result = isLongerThan5.test("sky");
//        System.out.println(result);

//        Predicate<String> hasLeftBrace = str -> str.startsWith("{");
//        Predicate<String> hasRightBrace = str -> str.endsWith("}");
//        Predicate<String> hasLeftAndRightBraces= hasLeftBrace.and(hasRightBrace);
//        var result = hasLeftAndRightBraces.test("{key:value}");
//        System.out.println(result);

        //BINARYOPERATOR INTERFACE
//        BinaryOperator<Integer> add = (a,b) -> a + b;
        // a, b -> a + b -> square
//        Function<Integer, Integer> square = a -> a * a;
//        var result = add.andThen(square).apply(1,2);
//        System.out.println(result);

        //UNARYOPERATOR INTERFACE
        UnaryOperator<Integer> square = n -> n * n;
        UnaryOperator<Integer> increment = n -> n + 1;
        var result = increment.andThen(square).apply(1);
        System.out.println(result);

    }

    public static void greet(Printer printer) {
        printer.print("Hello World");
    }
}
