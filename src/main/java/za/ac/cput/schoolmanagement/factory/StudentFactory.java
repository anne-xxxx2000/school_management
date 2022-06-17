package za.ac.cput.schoolmanagement.factory;

import za.ac.cput.schoolmanagement.domain.Address;
import za.ac.cput.schoolmanagement.domain.Student;

public class StudentFactory {
    public static Student createStudent( String studentId, String name,String email) {
        return new Student.Builder()
                .setStudentId(studentId)
                .setName(name)
                .setEmail(email)
                .build();
    }
}
