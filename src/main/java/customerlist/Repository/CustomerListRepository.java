package customerlist.Repository;
import java.util.List;

import customerlist.Model.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerListRepository extends JpaRepository<Customers, Long> {
    List<Customers> findByFirstName(String firstName);
}