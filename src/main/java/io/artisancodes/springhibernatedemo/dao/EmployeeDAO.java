package io.artisancodes.springhibernatedemo.dao;

import io.artisancodes.springhibernatedemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
}
