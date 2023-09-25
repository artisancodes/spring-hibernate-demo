package io.artisancodes.springhibernatedemo;

import io.artisancodes.springhibernatedemo.entity.Student;
import io.artisancodes.springhibernatedemo.entity.dao.StudentDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringHibernateDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringHibernateDemoApplication.class, args);
	}

	// Executed after Spring Beans have been loaded.
	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
			createStudent(studentDAO) ;
		};
	}

	private void createStudent(StudentDAO studentDAO) {
		// create a student object
		System.out.println("Creating a new student object ...");
		Student student = new Student("Rúben", "Leonardo", "ruben@artisancodes.io");

		// save the student object
		System.out.println("Saving the student ...");
		studentDAO.save(student);

		// display the id of the saved student
		System.out.println("Saved student. Generated ID: " + student.getId());
	}

}
