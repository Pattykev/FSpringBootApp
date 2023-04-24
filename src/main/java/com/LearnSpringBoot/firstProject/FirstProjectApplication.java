package com.LearnSpringBoot.firstProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.LearnSpringBoot.firstProject.model.HelloWorld;
import com.LearnSpringBoot.firstProject.service.BusinessService;

@SpringBootApplication
public class FirstProjectApplication implements CommandLineRunner{
	@Autowired
	private BusinessService bs;

	public static void main(String[] args) {
		//permet de démarrer l'application
		SpringApplication.run(FirstProjectApplication.class, args);
	}

	@Override
	public void run( String ... args) throws Exception{
		HelloWorld hw= bs.getHelloWorld();
		System.out.println(hw);
	}

}
