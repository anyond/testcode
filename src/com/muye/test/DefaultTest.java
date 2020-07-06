package com.muye.test;

/**
 * 此类用来学习测试default的特性和用法
 */
public class DefaultTest implements SimpleInterface {

    @Override
    public void doSomeWork() {
        System.out.println("this is doSomeWork");
    }

    public static void main(String[] args) {
        SimpleInterface defaultTest = new DefaultTest();
        defaultTest.doSomeWork();
        defaultTest.doSomeOtherWork();
    }

}

interface SimpleInterface {
    void doSomeWork();
    default void doSomeOtherWork() {
        System.out.println("this is doSomeOtherWork");
    }
}
