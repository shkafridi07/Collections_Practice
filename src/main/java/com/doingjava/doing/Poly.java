package com.doingjava.doing;


class Animal {

    void sound(String sound){
        System.out.println(sound+ " -");
    }

}


public class Poly extends Animal {
//    void sound(String sound){
//        System.out.println(sound);
//    }

    void eat() {
        System.out.println("Eating Poly");
    }

    public static void main(String[] args) {
        Poly p = new Poly();
        p.sound("che che");
        p.eat();

    }

}
