package com.doingjava.doing;
import java.util.*;
import java.util.Collections;
import java.util.ArrayList;
import java.io.*;
class  Movies implements java.lang.Comparable<Movies>
{
private  double rating;
private String name;
private int year;

public int compareTo(Movies m){
    return this.year - m.year;
}

    public Movies(double rating, String name, int year) {
        this.rating = rating;
        this.name = name;
        this.year = year;
    }

    public double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }
}
public class Comparable {
    public static void main(String[] args) {
        ArrayList<Movies> list = new ArrayList<Movies>();
        list.add(new Movies(9.8, "CHERNOBYL", 2550));
        list.add(new Movies(8.6, "maharaja", 21));
        list.add(new Movies(9.5, "perfume", 1998));
        list.add(new Movies(9.2, "mirzapur", 255));
        list.add(new Movies(9.2, "khuun", 001));

        Comparator<Movies> comparator = new Comparator<Movies>() {
            @Override
            public int compare(Movies m1, Movies m2) {
                return m1.getYear() - m2.getYear();
            }
        };

        Collections.sort(list,comparator);
        System.out.println(comparator.hashCode());
        for (Movies movies:list){
//            System.out.println(movies.getRating());
//            System.out.println(movies.getName());
//            System.out.println(movies.getYear());
//            System.out.println(movies.hashCode());
//            System.out.println(movies.compareTo(,));
        }
        System.out.println(list.stream().max(Comparator.comparing(Movies::getRating)));

    }
}
//Comparable interface can be used to provide single way of sorting
// whereas Comparator interface is used to  provide different ways of sorting