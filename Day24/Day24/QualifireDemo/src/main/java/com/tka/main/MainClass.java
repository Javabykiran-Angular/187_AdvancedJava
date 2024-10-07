package com.tka.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tka.config.MyConfiguration;
import com.tka.entity.Mobile;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new AnnotationConfigApplicationContext(MyConfiguration.class);
		
		Mobile mobile= context.getBean(Mobile.class);
		System.out.println(mobile);
		mobile.getSim1().calling();
//		mobile.getAirtel().calling();
		mobile.getSim2().calling();
		
		

	}

}
