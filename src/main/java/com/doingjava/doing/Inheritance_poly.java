package com.doingjava.doing;

class Parent{
    int total = 8;
    void myFamily(){
        System.out.println(" we are 8 Members in my family");
    }

}

public class Inheritance_poly extends Parent {

    void myFamily() {
        System.out.println("We are Two Members in my family");
    }
    public static void main(String[] args) {
        Inheritance_poly ip = new Inheritance_poly();
        ip.total = ip.total + 1;
        System.out.println(ip.total);
        ip.myFamily();

    }

}
