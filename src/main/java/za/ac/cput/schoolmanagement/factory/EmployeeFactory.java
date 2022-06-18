package za.ac.cput.schoolmanagement.factory;

/*
 * Author: Emeka Thato Nwamadi
 * Student number 219404070
 * Date: June
 */

import za.ac.cput.schoolmanagement.domain.Employee;
import za.ac.cput.schoolmanagement.util.helper;

public class EmployeeFactory {
    public static Employee createEmployee(String staffId, String email, String name) {

//        Validation
        if (helper.isEmptyOrNull(staffId) || helper.isEmptyOrNull(email) || helper.isEmptyOrNull(name))
            throw new IllegalArgumentException("staff Id, email and name are required ");

        return new Employee.Builder().setStaffId(staffId).setEmail(email).setEmployeeName(name).build();
    }
}
