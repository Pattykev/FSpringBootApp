package com.LearnSpringBoot.firstProject;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.LearnSpringBoot.firstProject.service.BusinessService;

@SpringBootTest
class FirstProjectApplicationTests {
	@Autowired
	private BusinessService bs;

	@Test
	void contextLoads() { //son role est de vérifier que le contxte spring se charge bien
	}
    @Test
	public void helloWorldTest(){
    	String result= bs.getHelloWorld().toString();
		String expected="Hello world";
		assertEquals(expected, result);
	}

}
