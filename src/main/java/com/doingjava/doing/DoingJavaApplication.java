package com.doingjava.doing;

import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DoingJavaApplication {

	String m1(String name) {
		if(StringUtils.isEmpty(name) || StringUtils.isAllEmpty(null,name) || StringUtils.isBlank(name)){

		}
		return name;
	}

	public static void main(String[] args) {
		SpringApplication.run(DoingJavaApplication.class, args);
	}

}
