package io.artisancodes.springhibernatedemo.dao;

import io.artisancodes.springhibernatedemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();

    Employee findById(int id);

    Employee save(Employee theEmployee);

    void delete(int id);
}
