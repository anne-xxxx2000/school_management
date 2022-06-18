package za.ac.cput.schoolmanagement.repository.name;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.schoolmanagement.domain.Name;
import java.util.List;

public interface INameRepository extends JpaRepository<Name,String> {
  /* List<Name> findByFirstName(String firstName);
      List<Name> findByMiddleName(String middleName);
     List<Name> findByLastName(String lastName);*/

}