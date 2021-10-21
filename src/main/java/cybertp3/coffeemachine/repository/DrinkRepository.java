package cybertp3.coffeemachine.repository;

import cybertp3.coffeemachine.models.Drink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface DrinkRepository extends JpaRepository<Drink, Integer> {
}
