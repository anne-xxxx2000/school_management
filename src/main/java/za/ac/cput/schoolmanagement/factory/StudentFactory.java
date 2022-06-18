package za.ac.cput.schoolmanagement.factory;


/**
 * @author Honest Mpungu
 * Student No:215072081
 * Group:24
 *
 */

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
