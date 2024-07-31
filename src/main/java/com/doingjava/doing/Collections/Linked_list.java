package com.doingjava.doing.Collections;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Linked_list {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add("hello");
        ll.add("pajji");
        ll.add("i");
        ll.add("love ");
        ll.add(" your food");
        ll.add(2,"salam");

        LinkedList ll1 = new LinkedList();
        ll1.add("i");
        ll1.add("dont ");
        ll1.add("need");
        ll1.add("friend");


//        System.out.println(ll.size());

//        System.out.println(ll.pop());
        Object l = ll.pop();
        ll.push(ll1);
//        ll.clear();
          Object s= ll.clone();
        System.out.println(s.hashCode());
//        System.out.println(l);
        System.out.println(ll.hashCode());
        System.out.println(ll1);
//        System.out.println(ll.stream().max(Comparator.comparing(ll::get()));
    }
}
