package com.doingjava.doing;

abstract class Abstr {
    int i;
     void method() {
        System.out.println("abstract method-0");
    }
    static void method0() {
        System.out.println("abstract method-0");
    }
    abstract String method2();

    @Override
    public String toString() {
        return "Abstr{" +
                "i=" + i +
                '}';
    }

    public static void main(String[] args) {
        method0();
        System.out.println("Main method of abstract");
    }
}
public class Abstractly extends Abstr {


    @Override
    String method2() {
        return "Method 2";
    }

    String method3() {
        return "Method 3";
    }

    public static void main(String[] args) {
        Abstr ab = new Abstractly();


//             Abstr ab = new Abstr() {
//            @Override
//            String method2() {
//                return "inner";
//            }
//        };
        System.out.println(ab.method2());
        System.out.println(((Abstractly) ab).method3());
    }
}
