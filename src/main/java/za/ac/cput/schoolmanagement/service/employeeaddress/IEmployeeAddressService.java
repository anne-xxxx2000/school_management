package za.ac.cput.schoolmanagement.service.employeeaddress;

import za.ac.cput.schoolmanagement.domain.EmployeeAddress;
import za.ac.cput.schoolmanagement.service.IService;

import java.util.List;

public interface IEmployeeAddressService extends IService<EmployeeAddress, String> {
    List<EmployeeAddress> findAll();

    void deleteById(String employeeId);

    void delete(EmployeeAddress object);
}

