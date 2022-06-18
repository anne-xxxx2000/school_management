package za.ac.cput.schoolmanagement.controller.student;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.schoolmanagement.domain.Student;
import za.ac.cput.schoolmanagement.service.student.IStudentService;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

/**
 * @author Honest Mpungu
 * Student No:215072081
 * Group:24
 *
 */
@RestController
@RequestMapping("/studentapi")
@Slf4j
public class StudentController {

     @Autowired
    private IStudentService studentService;

    @GetMapping("/students")
    public List<Student> getStudent(){
        log.info("Using a Get method to get all Students");
        return studentService.readAll();
    }

    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable String id){
        log.info("Using a Get method to get Student by Id : "+id);
        return studentService.read(id).get();
    }

    @PostMapping("/createstudent")
    public ResponseEntity createStudent(@RequestBody Student student, @RequestParam(name = "firstName")
    String firstName, @RequestParam(name = "lastName") String lastName) throws URISyntaxException {
        log.info("Using the firstname on the controller: "+firstName + "  lastname: "+ lastName+" to create an student");
        Student savedStudent = studentService.save(student,firstName,lastName);
        return ResponseEntity.created(new URI("/studentapi/"+savedStudent.getStudentId())).body( savedStudent);
    }

    @DeleteMapping("/deletestudents/{id}")
    public void deleteStudent(@PathVariable String id){
        log.info("Using a Student by Id : "+id + " to delete this student");
        studentService.delete(id);
    }
}
