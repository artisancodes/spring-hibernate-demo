package io.artisancodes.springhibernatedemo.rest;

import io.artisancodes.springhibernatedemo.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class StudentRestController {

    // Define endpoint for "/students" - returns a list of students
    @GetMapping("/students")
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Rúben", "Leonardo"));
        students.add(new Student("Jéssica", "Fonseca"));
       return students;
    }
}
