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
			createStudent(studentDAO);
			createMultipleStudents(studentDAO);
			readStudent(studentDAO);
		};
	}
	private void createStudent(StudentDAO studentDAO) {
		// create a student object
		System.out.println("Creating a new student object ...");
		Student student = new Student("Lewis", "Hamilton", "lewis@artisancodes.io");

		// save the student object
		System.out.println("Saving the student ...");
		studentDAO.save(student);

		// display the id of the saved student
		System.out.println("Saved student. Generated ID: " + student.getId());
	}

	private void createMultipleStudents(StudentDAO studentDAO) {
		// create multiple students
		System.out.println("Creating 3 student objects ...");
		Student tempStudent1 = new Student("Jéssica", "Fonseca", "jess@artisancodes.io");
		Student tempStudent2 = new Student("Inês", "Leonardo", "ines@artisancodes.io");
		Student tempStudent3 = new Student("Daniel", "Godinho", "daniel@artisancodes.io");

		// save the student objects
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);

		// display the id of the saved student
		System.out.println("Saved tempStudent1 . Generated ID: " + tempStudent1.getId());
		System.out.println("Saved tempStudent2 . Generated ID: " + tempStudent2.getId());
		System.out.println("Saved tempStudent3 . Generated ID: " + tempStudent3.getId());
	}

	private void readStudent(StudentDAO studentDAO) {
		// create a student object
		System.out.println("Creating a new student object ...");
		Student tempStudent = new Student("Rúben", "Leonardo", "ruben@artisancodes.io");

		// save the student object
		System.out.println("Saving the student ...");
		studentDAO.save(tempStudent);

		// display the id of the saved student
		int theId = tempStudent.getId();
		System.out.println("Saved student. Generated ID: " + theId);

		// retrieve student based on the id: primary key
		System.out.println("Retrieving student ...");
		Student student = studentDAO.findById(theId);

		// display student
		System.out.println("Found the student: " + student);

	}

}
