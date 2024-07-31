package com.doingjava.doing.comp;

import java.util.Objects;

public class HasB {

    private String id;
    private String name;
    private String gender;
    private String age;

    private HasA address;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public HasA getAddress() {
        return address;
    }

    public void setAddress(HasA address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HasB hasB = (HasB) o;
        return Objects.equals(id, hasB.id) && Objects.equals(name, hasB.name) && Objects.equals(gender, hasB.gender) && Objects.equals(age, hasB.age) && Objects.equals(address, hasB.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, gender, age, address);
    }

    @Override
    public String toString() {
        return "HasB{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age='" + age + '\'' +
                ", address=" + address +
                '}';
    }
}
