package com.doingjava.doing.Collections;

import java.util.ArrayList;
import java.util.HashSet;

public class Hashset {
    public static void main(String[] args) {
        HashSet<ArrayList> set = new HashSet<>();
        ArrayList<Integer> ls1 = new ArrayList<>();
        ArrayList<Integer> ls2 =new ArrayList<>();

        ls1.add(1);
        ls1.add(2);
        ls2.add(3);
        ls2.add(4);
        ls2.add(5);
        set.add(ls1);
        set.add(ls2);
        System.out.println(set);

    }
    
}
