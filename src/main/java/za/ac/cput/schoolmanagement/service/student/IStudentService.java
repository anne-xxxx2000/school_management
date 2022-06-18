package za.ac.cput.schoolmanagement.service.student;

import za.ac.cput.schoolmanagement.domain.Student;

import java.util.List;
import java.util.Optional;

public interface IStudentService  {
    public Student save(Student student, String firstName, String lastname);

    public Optional<Student> read(String id) ;

    public List<Student> readAll();

    public void delete(String id) ;

    void save(Student student);
}
