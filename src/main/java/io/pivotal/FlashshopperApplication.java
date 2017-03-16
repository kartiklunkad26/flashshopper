package io.pivotal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class FlashshopperApplication {

	@Autowired
	ItemRepo itemRepo;

	@Bean
	CommandLineRunner commandLineRunner(){
		return args->{
			itemRepo.save(new Item("Beyonce", 5));
			itemRepo.save(new Item("Beyonx", 5));
			itemRepo.save(new Item("Beyonce", 50));

			itemRepo.findAll().forEach(System.out::println);
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(FlashshopperApplication.class, args);
	}
}

