package com.doingjava.doing;

public class Constructor {
    int age;
    String  name;

    Constructor(){}
    Constructor(int age , String name){
        this.age = age;
        this.name = name;
    }

    public static void main(String[] args) {
        Constructor c =new Constructor(56,"nisum");
        System.out.println(c.age);
        System.out.println(c.name);

        Constructor c1 =new Constructor();
        c1.age =89;
        c1.name ="world";
        System.out.println(c1.name+" "+c1.age);

    }
}
