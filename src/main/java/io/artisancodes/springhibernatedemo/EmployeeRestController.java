package io.artisancodes.springhibernatedemo;

import io.artisancodes.springhibernatedemo.dao.EmployeeDAO;
import io.artisancodes.springhibernatedemo.entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeRestController {

    private final EmployeeDAO employeeDAO;

    public EmployeeRestController(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeDAO.findAll();
    }
}
