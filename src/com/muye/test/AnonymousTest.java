package com.muye.test;

/**
 * 此类用来学习测试匿名类的特性和用法
 */
public class AnonymousTest {
    public static void main(String[] args) {

        //匿名类可以用来实现抽象类
        Person p = new Person() {
            @Override
            public void eat() {
                System.out.println("eat something");
            }
        };
        p.eat();

        //匿名类也可以用来实现接口类
        //此处是Lambda表达式的写法，对于函数型接口可以用这种写法
        Person2 p2 = new Person2() {
            @Override
            public void eat() {
                System.out.println("eat something2");
            }
        };
        p2.eat();

        //用匿名类继承一个普通类并重新类中的某个方法
        Person3 p3 = new Person3() {
            @Override
            void eat() {
                System.out.println("eat something4");
            }
        };
        p3.eat();

        //Thread类的匿名类实现
        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println("this is a anonymous thread");
            }
        };
        thread.start();

        //Runnable类的匿名类实现
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("this is a anonymous runnable");
            }
        };
        Thread t = new Thread(runnable);
        t.start();
    }
}

class Student implements Person2 {

    @Override
    public void eat() {
        System.out.println("this is student");
    }

    public static void main(String[] args) {
        Person2 student = new Student();
        student.eat();
    }
}

abstract class Person {
    public abstract void eat();
}

@FunctionalInterface
interface Person2 {
    void eat();
}

class Person3 {
    void eat() {
        System.out.println("eat something3");
    }
}