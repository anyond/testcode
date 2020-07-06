package com.muye.test;

/**
 * 此类用来学习Lambda表达式
 */
public class LambdaTest {
    public static void main(String[] args) {

    }
}

@FunctionalInterface
interface SimpleInterfece {

    void doSomeWork(String work);

    default void defaultWork() {
        System.out.println("this is a default method in interface");
    }

    static void staticWork() {
        System.out.println("this is a static method in interface");
    }

    @Override
    public boolean equals(Object obj);
}
