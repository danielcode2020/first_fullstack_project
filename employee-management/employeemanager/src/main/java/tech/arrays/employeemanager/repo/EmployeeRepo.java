package tech.arrays.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.arrays.employeemanager.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    void deleteEmployeeById(Long id);

    Employee findEmployeeById(Long id);
}
