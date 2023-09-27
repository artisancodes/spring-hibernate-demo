package io.artisancodes.springhibernatedemo.dao;

import io.artisancodes.springhibernatedemo.entity.Student;

import java.util.List;

public interface StudentDAO {

    void save(Student student);

    Student findById(Integer id);

    List<Student> findAll();

    List<Student> findByLastName(String theLastname);

    void update(Student theStudent);

    void delete(Integer id);

    int deleteAll();
}
