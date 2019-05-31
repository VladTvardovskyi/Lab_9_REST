package ua.lviv.iot.zoo.shop.models;


import java.sql.SQLException;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import ua.lviv.iot.zoo.shop.models.KindOfAnimal;
import ua.lviv.iot.zoo.shop.models.ShopAnimalRepository;
import ua.lviv.iot.zoo.shop.models.Sex;

@SpringBootApplication
public class ApplicationDB {

  public static void main(String... args) throws SQLException {
    SpringApplication.run(ApplicationDB.class, args);
  }

  @Bean
  public CommandLineRunner demo(ShopAnimalRepository repository) {
    return (args) -> {
      repository.save(new ShopAnimal("Obama", 2000, KindOfAnimal.CASUAL, "Black", 53, 80, Sex.MALE, "Hamgurger"));
      repository.save(new ShopAnimal("Trump", 3500, KindOfAnimal.PREDATORS, "White", 57, 100, Sex.MALE, "Nuggets"));
      repository.save(new ShopAnimal("Jessica Princess", 5000, KindOfAnimal.CASUAL, "Latina", 45, 65, Sex.FEMALE, "Frogs"));

      repository.findAll().forEach(System.out::println);
    };
  }
} 
