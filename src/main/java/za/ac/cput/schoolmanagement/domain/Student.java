package za.ac.cput.schoolmanagement.domain;

/**
 * @author Honest Mpungu
 * Student No:215072081
 * Group:24
 * June Test
 */

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Student implements Serializable {
    @Id
    private String studentId;
    private String email;
    private Name name;

    public Student() {}

    public Student(Builder builder) {
        this.studentId= builder.studentId;
        this.name = builder.name;
        this.email = builder.email;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getEmail() {
        return email;
    }

    public Name getName() {
        return name;
    }

    public static class Builder {
        private String studentId;
        private String email;
        private Name name;

        public Builder setStudentId (String studentId){
            this.studentId = studentId;
            return this;
        }
        public Builder setEmail (String email){
            this.email = email;
            return this;
        }

        public Builder setName (Name name){
            this.name = name;
            return this;
        }

        public Builder copy (Student student){
            this.studentId = student.studentId;
            this.email = student.email;
            this.name = student.name;
            return this;
        }

        public Student build () {
            return new Student(this);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", email='" + email + '\'' +
                ", name=" + name +
                '}';
    }
}


