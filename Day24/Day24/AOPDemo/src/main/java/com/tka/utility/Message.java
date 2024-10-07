package com.tka.utility;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Message {
	
//	@Pointcut("execution (public void deposit())")
//	public void messageSent() {
//		
//	}
//	
//	@After("messageSent()")
//	public void sendSMS() {
//		System.out.println("Sms is Send to Client...");
//	}
//	
//	@Pointcut("execution (public void withdraw())")
//	public void withdrawMessage() {
//		
//	}
//	
//	@Before("withdrawMessage()")
//	public void withrawMessageSent() {
//		System.out.println("Pin Valid Successfully....");
//	}
//	
	
	@Pointcut("execution (* com.tka.service.Account.*() )")
	public void executeAllMethod() {
		
	}
	
	@After("executeAllMethod()")
	public void SendSmsAllMethod() {
		System.out.println("Sms is Sent to All...");
	}
	
	

}
