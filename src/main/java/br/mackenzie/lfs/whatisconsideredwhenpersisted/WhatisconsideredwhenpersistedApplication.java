package br.mackenzie.lfs.whatisconsideredwhenpersisted;

;
import br.mackenzie.lfs.whatisconsideredwhenpersisted.aspects.AspectTest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@Slf4j
@EnableAspectJAutoProxy
public class WhatisconsideredwhenpersistedApplication implements CommandLineRunner {

	@Autowired
	private AspectTest test;

	public static void main(String[] args) {
		SpringApplication.run(WhatisconsideredwhenpersistedApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		test.say("Hey! 1");
		System.out.println(test.say2("Hey! 2 "));
		test.hey("Hey!3 ", "Hey the second");
		test.say1("Hey! 0");

	}
}
