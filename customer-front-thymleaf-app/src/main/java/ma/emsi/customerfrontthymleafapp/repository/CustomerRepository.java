package ma.emsi.customerfrontthymleafapp.repository;

import ma.emsi.customerfrontthymleafapp.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
