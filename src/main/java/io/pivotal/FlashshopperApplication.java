package io.pivotal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class FlashshopperApplication {

    @Autowired
    WishlistItemRepo wishlistItemRepo;

    public static void main(String[] args) {
        SpringApplication.run(FlashshopperApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner() {
        return args -> {

            wishlistItemRepo.save(new WishlistItem("Beyonce", 50, 70));
            wishlistItemRepo.save(new WishlistItem("Adele", 40, 50));

            System.out.println("WISHLIST:");
            wishlistItemRepo.findAll().forEach(System.out::println);


            Tickets tickets = new Tickets("Beyonce", 50, 125);

            System.out.println("AVAILABLE TICKETS:");
            System.out.println(tickets.toString());

           };
    }

}

