package za.ac.cput.schoolmanagement.repository.student;

/**
 * @author Honest Mpungu
 * Student No:215072081
 * Group:24
 *
 */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.schoolmanagement.domain.Student;

/*
Honest Mpungu
 */
@Repository
public interface IStudentRepository extends JpaRepository<Student, String> {
}
