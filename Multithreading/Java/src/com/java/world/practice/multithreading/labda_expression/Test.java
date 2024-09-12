package com.java.world.practice.multithreading.labda_expression;

public class Test {
    public static void main(String[] args) {
//        Student engineerStudent = new Student() {
//            @Override
//            public String getBio(String name) {
//                return name + " is Engineer Student";
//            }
//        };

        // Same as above
        Student engineerStudent = name -> name + " is Engineer Student";

        String bio = engineerStudent.getBio("Vaibhav");
        System.out.println(bio);
    }
}
