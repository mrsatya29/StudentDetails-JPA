package org.springjpa.practice;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;*/


/**
 * Hello world!
 */
@SpringBootApplication
/*@ComponentScan(basePackages = "org.*")
@EntityScan("org.springjpa.practice.model")*/
public class StudentApp implements CommandLineRunner {
    public static void main(String[] args) {

        SpringApplication.run(StudentApp.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Student Details Application");
    }
}
