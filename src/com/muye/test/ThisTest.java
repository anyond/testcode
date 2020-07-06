package com.muye.test;

public class ThisTest {

    int id;

    public ThisTest(int id) {
        this.id = id;
    }

    //在构造方法中，this()调用其他构造方法只能在第一行
    //构造方法的参数可以不是成员变量
    public ThisTest(int id,String name) {
        this(id);
        System.out.println("name is " + name);
    }

    public ThisTest add() {
        this.id ++;
        return this;
    }

    public static void main(String[] args) {
        ThisTest t1 = new ThisTest(1,"ThisTest");
        System.out.println(t1.id);
        System.out.println(t1.add().id);
        System.out.println(t1.add().add().id);
    }
}
