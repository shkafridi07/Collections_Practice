package com.doingjava.doing.Collections;

public class Person {
    public  static  String name = "a";

    public String getName() {
        System.out.println(name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.setName("aaaaaaaaaa");
        System.out.println(p.getName());


    }
}
