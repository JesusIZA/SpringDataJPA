package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import entity.Address;
import org.springframework.stereotype.Repository;

/**
 * Created by Jesus on 21.09.2017.
 */

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}
