package com.tec;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.tec.model.Course;
import com.tec.repository.CourseRepository;

@SpringBootApplication
public class CrudSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringApplication.class, args);
	}
	
	@Bean
	CommandLineRunner initDataBase(CourseRepository courseRepository) {
		return args ->{
			courseRepository.deleteAll();
			
			Course c = new Course();
			
			c.setName("Angilar com Spring");
			c.setCategory("font-end");
			
			courseRepository.save(c);
		};
	}

}
