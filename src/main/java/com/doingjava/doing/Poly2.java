package com.doingjava.doing;

class Polly {
    String m1(){
        return "m1";
    }
    Integer m1(int i) {
        return i;
    }
    Double m1(int i,String s) {
        System.out.println(s);
        return (double)i;
    }
    protected String m(){
        return "polly";
    }

}
public class Poly2 extends Polly {
     public String m() {
         System.out.println( super.m());
        return "Poly2";
    }
    public static void main(String[] args) {
        Poly2 p2 = new Poly2();
        System.out.println(p2.m1(1));
        System.out.println(p2.m1(1, "A"));
        System.out.println(p2.m1());
        System.out.println(p2.m());
    }


}
