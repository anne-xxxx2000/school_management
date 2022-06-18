package za.ac.cput.schoolmanagement.repository.employeeaddress;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.schoolmanagement.domain.EmployeeAddress;

@Repository
public interface IEmployeeAddressRepository extends JpaRepository<EmployeeAddress, String> {
}
