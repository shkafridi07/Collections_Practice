package com.doingjava.doing.comp;

import java.util.Objects;

public class HasA {
    private String email;
    private String mobile;
    private String street1;
    private String city;
    private String state;
    private String country;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getStreet1() {
        return street1;
    }

    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HasA hasA = (HasA) o;
        return email.equals(hasA.email) && mobile.equals(hasA.mobile) && street1.equals(hasA.street1) && city.equals(hasA.city) && state.equals(hasA.state) && country.equals(hasA.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, mobile, street1, city, state, country);
    }

    @Override
    public String toString() {
        return "HasA{" +
                "email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", street1='" + street1 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
