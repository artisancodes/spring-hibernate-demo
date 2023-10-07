package io.artisancodes.springhibernatedemo.service;

import io.artisancodes.springhibernatedemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
