package springbootapi.springbackend.service.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springbootapi.springbackend.exception.ResourceNotFoundException;
import springbootapi.springbackend.model.Employee;
import springbootapi.springbackend.repository.EmployeeRepository;
import springbootapi.springbackend.service.EmployeeService;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    // @Autowired not needed b/c 1 constructor
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(long id) {
//        Optional<Employee> employee = employeeRepository.findById(id);
//        if(employee.isPresent()){
//            return employee.get();
//        } else{
//            throw new ResourceNotFoundException("Employee", "Id", id);
//        }
        //expressed as lambda
        return  employeeRepository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("Employee", "Id", id));

    }

}
