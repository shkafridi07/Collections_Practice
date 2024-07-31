package com.doingjava.doing.Practice;

import org.apache.commons.lang3.StringUtils;

public class String_Name {
    public String name;

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (StringUtils.isBlank(name)){
            this.name = name;
        }else {
            throw new RuntimeException("enter your name ");
        }
    }

//    public String_Name(String name) {
//        this.name = name;
//    }

    public static void main(String[] args) {
//        String_Name ss =new String_Name();
//        ss.setName("");
//        System.out.println(ss.getName());
        String str  ="               hello boiii                ";
        String trimmed =StringUtils.trim(str);
        System.out.println(trimmed);


    }
}
