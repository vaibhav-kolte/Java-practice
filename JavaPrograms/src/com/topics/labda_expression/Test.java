package com.topics.labda_expression;

public class Test {
    public static void main(String[] args) {
        // Simple java example with no return value
//        Greeting greeting = new Greeting() {
//            @Override
//            public void greet(String name) {
//                System.out.println("Hi " + name);
//            }
//        };
//
//        greeting.greet("Vaibhav");


        // Using lambda expression
//        Greeting greeting = name -> System.out.println("Hi " + name);
//        greeting.greet("Vaibhav");


        // Example with return value

//        Addition addition = new Addition() {
//            @Override
//            public int add(int a, int b) {
//                return a + b;
//            }
//        };
//
//        System.out.println("Addition = " + addition.add(4, 5));



        Addition addition = (a, b) -> a + b;
        System.out.println("Addition = " + addition.add(4, 5));

//        Addition addition = Integer::sum;
//        System.out.println("Addition = " + addition.add(4, 5));
    }
}
