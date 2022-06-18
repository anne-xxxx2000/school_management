package za.ac.cput.schoolmanagement.repository.employee;

/*
 * Author: Emeka Thato Nwamadi
 * Student number 219404070
 * Date: June
 */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.schoolmanagement.domain.Employee;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, String> {
}
