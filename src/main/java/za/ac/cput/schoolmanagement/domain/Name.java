
package za.ac.cput.schoolmanagement.domain;

/*
 * Name.java
 * Entity for the Name
 * @Author: Lufulwabo Franck Kalengayi (220048762)
 * ADP3: June Assessment 2022
 * Date: 16 June 2022
 */

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.io.Serializable;
@Embeddable
public class Name implements Serializable {
    private String firstName;
    private String middleName;
    @NotNull
    @Id
    private String lastName;
    protected Name() {}
    private Name(Builder builder){
        this.firstName = builder.firstName;
        this.middleName = builder.middleName;
        this.lastName = builder.lastName;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getMiddleName() {
        return middleName;
    }
    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Name{" + "firstName=" + firstName + ", " +
                "middleName=" + middleName + ", " +
                "lastName=" + lastName + '}';
    }

    public static class Builder {
        private String firstName, middleName, lastName;

        public Builder setFirstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public Builder setMiddleName(String middleName){
            this.middleName = middleName;
            return this;
        }

        public Builder setLastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public Builder copy(Name name){
            this.firstName = name.firstName;
            this.middleName = name.middleName;
            this.lastName = name.lastName;
            return this;
        }

        public Name build(){
            return new Name(this);
        }
    }

    @Override
    public boolean equals(Object o){
        if(o == null || this.getClass() != o.getClass()) return false;
        if(this == o) return true;
        Name x = (Name) o;
        return this.firstName.equals(x.firstName) && this.middleName.equals(x.middleName) && this.lastName.equals(x.lastName);
    }

}