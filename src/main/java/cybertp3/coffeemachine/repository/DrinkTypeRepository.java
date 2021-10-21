package cybertp3.coffeemachine.repository;

import cybertp3.coffeemachine.models.DrinkType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface DrinkTypeRepository extends JpaRepository<DrinkType, Integer> {
}
