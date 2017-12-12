package com.xl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xl.aop.HelloWorld;

public class TestSpring {

	private static ApplicationContext ctx;

	public static void main(String[] args) {

		ctx = new ClassPathXmlApplicationContext("spring-application.xml");
		HelloWorld hw1 = (HelloWorld) ctx.getBean("helloWordImpl1");
		hw1.printHelloWorld();
		System.out.println();
		hw1.doPrint();
		System.out.println();
		hw1.doScan();
	}

}
