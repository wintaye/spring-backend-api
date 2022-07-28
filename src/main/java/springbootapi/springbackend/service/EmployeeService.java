package springbootapi.springbackend.service;

import springbootapi.springbackend.model.Employee;

import java.util.List;

public interface EmployeeService {

       Employee saveEmployee (Employee employee);

       List<Employee> getAllEmployees();

       Employee getEmployeeById (long id);

}
