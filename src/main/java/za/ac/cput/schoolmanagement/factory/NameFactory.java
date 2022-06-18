/*
 * Name.java
 * Entity for the Name
 * @Author: Lufulwabo Franck Kalengayi (220048762)
 * ADP3: June Assessment 2022
 * Date: 16 June 2022
 */

package za.ac.cput.schoolmanagement.factory;
import za.ac.cput.schoolmanagement.domain.Name;
import za.ac.cput.schoolmanagement.util.helper;


public class NameFactory {
    public static Name createName(String firstName, String middleName, String lastName)
            throws IllegalArgumentException{
        if(!helper.isValidString(firstName) || !helper.isValidString(lastName))
            throw new IllegalArgumentException("IllegalArgumentException");
        return new Name.Builder().setFirstName(firstName).setMiddleName(middleName).setLastName(lastName).build();
    }
}

