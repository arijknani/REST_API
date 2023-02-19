package project.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.project.model.Employee;


public interface EmployeeRepository extends JpaRepository <Employee,Long> {
    

}
