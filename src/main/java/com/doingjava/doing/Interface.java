package com.doingjava.doing;

interface Int1 {
    int age = 18;
    int total = 10;
}

public interface Interface extends Int1{

    public static void start(String[] args ){
        System.out.println("engine starting");
    }
    public static void main(String[] args) {
        start( args);

        System.out.println("Hi "+ Int1.age + " - " + Int1.total);
    }
}
