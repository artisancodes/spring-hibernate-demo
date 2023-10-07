package io.artisancodes.springhibernatedemo.repository;

import io.artisancodes.springhibernatedemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

//@RepositoryRestResource(path = "members")
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
