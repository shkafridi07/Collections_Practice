package com.doingjava.doing.Collections;
class Apple{
    public Apple() {
        System.out.println("apple");
    }
    public void  seeds(){
        System.out.println("apple seeds");
    }
}
class Banana extends Apple{
    public Banana() {
        System.out.println("banana");
    }
    @Override
      public void  seeds(){
        System.out.println("i m banana seeds");

    }
}
public class Furits {
    public static void main(String[] args) {
        Apple ap =new Apple();
        ap.seeds();
        Banana bb =new Banana();
        bb.seeds();

    }
}
