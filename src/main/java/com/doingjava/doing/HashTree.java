package com.doingjava.doing;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashTree {
           public static void main(String[] args) {
            Map<Employee, String> employee = new TreeMap<>();
            Employee p1 = new Employee("jothsna", 1111);
            Employee p2 = new Employee("jagdish", 4232);
            employee.put(p1, "Hacker");
            employee.put(p2, "Java  Backend Developer");
            for (Map.Entry<Employee, String> entry : employee.entrySet()) {
                System.out.println(entry.getKey());
                System.out.println(entry.getValue());
//                System.out.println(entry.setValue(Employee ,"aaa"));
            }

        }
    }

