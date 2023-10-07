package io.artisancodes.springhibernatedemo.controller;

import io.artisancodes.springhibernatedemo.entity.Employee;
import io.artisancodes.springhibernatedemo.service.EmployeeService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeRestController {

    private final EmployeeService employeeService;

    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.findAll();
    }

    @GetMapping("/{employeeId}")
    public Employee getEmployeeById(@PathVariable int employeeId) {
        Employee employee = employeeService.findById(employeeId);
        if (employee == null) {
            throw new RuntimeException("Employee ID not found - " + employeeId);
        }
        return employee;
    }

    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee) {
        // also just in case they pass an id in JSON ... set id to 0
        // this is to force a save of a new item... instead of update
        employee.setId(0);
        return employeeService.save(employee);
    }

    @PutMapping
    public Employee updateEmployee(@RequestBody Employee employee) {
        return employeeService.save(employee);
    }

    @DeleteMapping("/{employeeId}")
    public String deleteEmployeeById(@PathVariable int employeeId) {
        Employee employee = employeeService.findById(employeeId);
        if (employee == null) {
            throw new RuntimeException("Employee ID not found - " + employeeId);
        }
        employeeService.deleteById(employeeId);
        return "Deleted Employee ID - " + employeeId;
    }
}
