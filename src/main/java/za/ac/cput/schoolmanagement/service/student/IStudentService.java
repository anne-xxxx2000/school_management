package za.ac.cput.schoolmanagement.service.student;


/**
 * @author Honest Mpungu
 * Student No:215072081
 * Group:24
 * June Test
 */

import za.ac.cput.schoolmanagement.domain.Student;

import java.util.List;
import java.util.Optional;

public interface IStudentService  {
    public Student save(Student student, String firstName, String lastname);

    public Optional<Student> read(String id) ;

    public List<Student> readAll();

    public void delete(String id) ;

    Student save(Student student);

    List<Student> findAll();
}
