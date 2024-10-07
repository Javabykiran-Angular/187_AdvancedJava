package com.tka.utility;

import org.springframework.stereotype.Component;

@Component
public class Airtel implements Sim {

	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("Called By Airtel");
		
	}
	
	

}
