package com.doingjava.doing.Collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashmap {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String > list =new LinkedHashMap<Integer,String>();
        list.put(101,"dilip");
        list.put(102,"raja");
        list.put(103,"bhavani");
        list.put(104,"jothsna");
        list.put(105,"jitu");

//        System.out.println(list.getOrDefault(105,""));
//        System.out.println(list.isEmpty());
//        System.out.println(list.remove(101));
        System.out.println(list);

//        -----------------------------------------------------------linkedhashmap entryset--------------------------------------
//        Set<Map.Entry<Integer,String>> entrySet  = list.entrySet();
//        for (Map.Entry<Integer,String> entry:entrySet){
//            System.out.println(entry.getKey()+":"+entry.getValue());
//        }


    }
}
