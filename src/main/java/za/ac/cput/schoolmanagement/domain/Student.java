package za.ac.cput.schoolmanagement.domain;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.regex.Pattern;

@Data
@Entity
public class Student implements Serializable {
    @Id
    private String studentId;
   // @Email(regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}")
    private String email;
    private String name;
/*
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumns({
            @JoinColumn(
                    name = "first_name"),
            @JoinColumn(
                    name = "last_name")
    })
    private Name name;
*/
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
/*
    public String getName() {
        return name;
    }*/

    public static class Builder {
        private String studentId;
        private String name;
        private String email;

            public Builder setStudentId (String studentId){
                this.studentId = studentId;
                return this;
            }

            public Builder setName (String name){
                this.name = name;
                return this;
            }
            public Builder setEmail (String email){
                this.email = email;
                return this;
            }

            public Builder copy (Student student){
                this.studentId = student.studentId;
                this.name = student.name;
                this.email = student.email;
                return this;
            }

            public Student build () {
                return new Student(this);
            }
        public static boolean patternMatches(String emailAddress, String regexPattern) {
            return Pattern.compile(regexPattern)
                    .matcher(emailAddress)
                    .matches();
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", name=" + name +
                '}';
    }
}



