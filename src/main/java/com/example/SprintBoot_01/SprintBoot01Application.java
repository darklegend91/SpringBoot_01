package com.example.SprintBoot_01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationContextFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
//	public class SprintBoot01Application implements CommandLineRunner {
	public class SprintBoot01Application {
	public void main(String[] args) {

		SpringApplication.run(SprintBoot01Application.class, args);
//		ApplicationContext cntxt = SpringApplication.run(SprintBoot01Application.class, args);
//		//System.out.println("Hello Spring!!!");
//
//		Pulsar plsr = new Pulsar();
//
//
//		//How to get Beans
//		Pulsar plsr = cntxt.getBean(Pulsar.class);
//		plsr.speed();
//	}

//	@Override
//	public void run(String... args) throws Exception {
//
//	}

//		2nd method is to autowire
//	@Autowired
//	Pulsar plsr;
//	@


		//3rd way to get Beans
		Bike bike;
		Object obj;
		SprintBoot01Application(Bike obj)
		{
			this.bike = obj ;
		}
		@Override
				void run (String... args) {
				bike.speed();

		}
	}
}