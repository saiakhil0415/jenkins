package com.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.Service;

public class ServiceTest {
	
	@Test
	public void TestEmailOne() {
		Service service=new Service();
		assertTrue(service.validateEmail("abc@xyz.com"));
	}
	
	@Test
	public void TestEmailTwo() {
		Service service=new Service();
		assertTrue(service.validateEmail("abc.xyz@domain.com"));
	}

}
