package com.pixeon.pixeonchallenge;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pixeon.pixeonchallenge.entities.Exam;

@SpringBootApplication
public class PixeonChallengeApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PixeonChallengeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Exam ex1 = new Exam(1l, "Glicose");
		Exam ex2 = new Exam(2L, "Sangue");
		
		ex1.setProcedureName("blood collection");
		
		System.out.println("ID = " + ex2.getId());
		
	}

}
