package io.artisancodes.springhibernatedemo;

import io.artisancodes.springhibernatedemo.entity.Student;
import io.artisancodes.springhibernatedemo.dao.StudentDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class SpringHibernateDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringHibernateDemoApplication.class, args);
	}

	// Executed after Spring Beans have been loaded.
	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
			//createStudent(studentDAO);
			createMultipleStudents(studentDAO);
			//readStudent(studentDAO);
			//readAllStudents(studentDAO);
			//readAllStudentsByLastName(studentDAO);
			//updateStudent(studentDAO);
			//deleteStudent(studentDAO);
			//deleteAll(studentDAO);
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
		Student tempStudent4 = new Student("Rúben", "Leonardo", "ruben@artisancodes.io");

		// save the student objects
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);
		studentDAO.save(tempStudent4);

		// display the id of the saved student
		System.out.println("Saved tempStudent1 . Generated ID: " + tempStudent1.getId());
		System.out.println("Saved tempStudent2 . Generated ID: " + tempStudent2.getId());
		System.out.println("Saved tempStudent3 . Generated ID: " + tempStudent3.getId());
		System.out.println("Saved tempStudent4 . Generated ID: " + tempStudent4.getId());
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

	private void readAllStudents(StudentDAO studentDAO) {
		// get a list of students;
		List<Student> students = studentDAO.findAll();

		// display list of students;
		students.forEach(System.out::println);
	}

	private void readAllStudentsByLastName(StudentDAO studentDAO) {
		// get a list of students
		List<Student> students = studentDAO.findByLastName("Leonardo");

		// display list of students
		students.forEach(System.out::println);
	}

	private void updateStudent(StudentDAO studentDAO) {
		// retrieve student based on the id: primary key
		int studentId = 1;

		System.out.println("Getting the student with ID: " + studentId);
		Student student = studentDAO.findById(studentId);

		// change first name to "Scooby"
		System.out.println("Updating student ...");
		student.setFirstName("Jéssica");

		// update the student
		studentDAO.update(student);

		// display the updated student
		System.out.println("Updated student: " + student);
	}

	private void deleteStudent(StudentDAO studentDAO) {
		int studentId = 1;

		System.out.println("Deleting student id: " + studentId);
		studentDAO.delete(studentId);
	}

	private void deleteAll(StudentDAO studentDAO) {
		System.out.println("Deleting all students");
		int numRowsDeleted = studentDAO.deleteAll();
		System.out.println("Deleted row count:" + numRowsDeleted);
	}

}
