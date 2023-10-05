package io.artisancodes.springhibernatedemo.service;

import io.artisancodes.springhibernatedemo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int id);

    Employee save(Employee theEmployee);

    void delete(int id);
}
