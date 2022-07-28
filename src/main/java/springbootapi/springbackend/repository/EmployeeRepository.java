package springbootapi.springbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springbootapi.springbackend.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {


}
