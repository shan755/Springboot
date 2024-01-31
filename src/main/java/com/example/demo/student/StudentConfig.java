package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(

        StudentRepository repository){

        return args ->{
           Student mariam = new Student(
                "Mariam",
                "mariam@gmail.com",
                LocalDate.of(2000,Month.JANUARY, 5)
            );
            Student ali = new Student(
                "Ali",
                "ali@gmail.com",
                LocalDate.of(2005,Month.AUGUST, 5)
            );

            repository.saveAll(
                List.of(mariam, ali)
            );


        };
    }


}
