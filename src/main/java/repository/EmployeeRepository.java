package repository;

import entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Created by Jesus on 21.09.2017.
 */

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query(value = "SELECT * FROM EMPLOYEE WHERE FIRST_NAME=?1 AND LAST_NAME=?2", nativeQuery = true)
    Employee findByNameAndLastName(String firstName, String lastName);

    Employee findByLastName(String lastName);
}
