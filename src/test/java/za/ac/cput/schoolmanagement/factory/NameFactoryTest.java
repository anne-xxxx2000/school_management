/*
 * Name.java
 * Entity for the NameFactoryTest
 * @Author: Lufulwabo Franck Kalengayi (220048762)
 * ADP3: June Assessment 2022
 * Date: 16 June 2022
 */

package za.ac.cput.schoolmanagement.factory;


import org.junit.jupiter.api.Test;
import za.ac.cput.schoolmanagement.domain.Name;

import static org.junit.jupiter.api.Assertions.*;

class NameFactoryTest {

    @Test
    void createNameSuccess() throws IllegalArgumentException {
        Name name = NameFactory.createName("Lufulwabo", "Franck", "Kalengayi");
        assertNotNull(name);
        assertEquals("Yellow", name.getFirstName());
        System.out.println(name);
    }

    @Test
    void createNameFail() {
        assertThrows(IllegalArgumentException.class, ()->{
            NameFactory.createName("", "Sweet", "Bone");
        });
        System.out.println("Thrown an error as expected");
    }
}

