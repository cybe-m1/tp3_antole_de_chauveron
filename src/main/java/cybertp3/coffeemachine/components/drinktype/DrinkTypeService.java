package cybertp3.coffeemachine.components.drinktype;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrinkTypeService {
    private DrinkTypeRepository drinkTypeRepository;

    public DrinkTypeService(DrinkTypeRepository drinkTypeRepository) {
        this.drinkTypeRepository = drinkTypeRepository;
    }

    public List<DrinkType> getAllDrinkTypes() {
        return drinkTypeRepository.findAll();
    }

    public DrinkType addDrinkType(String name, String description) {
        return drinkTypeRepository.save(new DrinkType(name, description));
    }

    public DrinkType getDrinkTypeByName(String drinkTypeName) {
        return getAllDrinkTypes()
                .stream()
                .filter(drinkType -> drinkType.getName().equals(drinkTypeName))
                .findFirst()
                .orElse(null);
    }

    public DrinkType updateDrinkType(String name, String description) {
        return null;
    }
}
