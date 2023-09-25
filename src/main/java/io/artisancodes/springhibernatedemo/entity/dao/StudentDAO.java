package io.artisancodes.springhibernatedemo.entity.dao;

import io.artisancodes.springhibernatedemo.entity.Student;

public interface StudentDAO {

    void save(Student student);

    Student findById(Integer id);
}
