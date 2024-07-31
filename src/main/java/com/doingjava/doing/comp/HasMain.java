package com.doingjava.doing.comp;

public class HasMain {

    public static void main(String[] args) {

        HasA ha = new HasA();
        HasB hb = new HasB();
        hb.setId("A101");
        hb.setName("Affu");
        hb.setGender("M");
        hb.setAge("25");
        hb.setAddress(ha);

        ha.setCity("Hyderabad");
        ha.setCountry("INDIA");
        ha.setEmail("affu@java.com");
        ha.setMobile("+91-9164564606");
        ha.setStreet1("Tolichoki");

        System.out.println(hb);
    }
}
