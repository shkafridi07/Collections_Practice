package com.doingjava.doing;
interface A{
    void method1();
    default void method() {
        System.out.println("from A");
    }
    static void method2() {
        System.out.println("from A- 2");
    }


}
interface B{
    void method1();

    default void method() {
        System.out.println("from A");
    }

    static void method2() {
        System.out.println("from B- 2");
    }
 }

public class ClassMain_AB implements A,B {
    public static void main(String[] args) {
        ClassMain_AB cab =  new ClassMain_AB();
        cab.method1();
        A.method2();


    }

    @Override
    public void method1() {

        System.out.println("defining in main");
    }

    @Override
    public void method() {
        A.super.method();
    }


}
