package repository;

import entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Jesus on 21.09.2017.
 */

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
