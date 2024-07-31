package com.doingjava.doing;


import org.apache.commons.lang3.StringUtils;

import java.util.Objects;

class Encapsulation extends Object {
    private String name;
    private  String age;
    private String gender ;
    private  String area;

    private String state;


    public Encapsulation(){}
    public Encapsulation(String name,  String gender, String age, String area) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.area = area;

        System.out.println(this.name+" "+ this.area+" "+this.age+" "+this.gender);
    }

    public Encapsulation(String name, String age, String gender, String area, String state) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.area = area;
        this.state = state;
    }

    public void setName(String name) {
        if(StringUtils.isEmpty(name) || StringUtils.isBlank(name)){
            throw new RuntimeException("Name should not be Empty or Null");
        }
        this.name = name;
    }

    public void setAge(String age) {
        if(Integer.parseInt(age) >= 18){
            this.age = age;
        } else {
            throw new RuntimeException("Not a valid age");
        }

    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getArea() {
        return area;
    }

    public String getState() {
        return state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Encapsulation that = (Encapsulation) o;
        return Objects.equals(name, that.name) && Objects.equals(age, that.age) && Objects.equals(gender, that.gender) && Objects.equals(area, that.area) && Objects.equals(state, that.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender, area, state);
    }

    @Override
    public String toString() {
        return "Encapsulation{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", area='" + area + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}

public class Encaps {
    public static void main(String[] args) {
        Encapsulation ep =new Encapsulation();
        ep.setName("mac");
        ep.setAge("18");
        ep.setArea("Hyderabad");
        ep.setGender("M");
        ep.setState("Telangana");

        Encapsulation ep1 = new Encapsulation("affu", "24", "M","toli choki");
        Encapsulation ep2 = new Encapsulation("affu2", "M", "17","toli choki", "Telangana");
        System.out.println(ep1+" "+ep+" - "+ep2);

//        System.out.println(Integer.parseInt(ep1.getGender()));
//        System.out.println((int)ep1.getAge().charAt(0));
//
//
//        if (ep1.getAge().charAt(0) >= 18 ) {
//            System.out.println(ep1.getName() + " - : "+ ep1.getAge());
        }


    }

