package cybertp3.coffeemachine.components.drink;

import cybertp3.coffeemachine.components.drinktype.DrinkTypeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrinkService {
    private DrinkRepository drinkRepository;
    private DrinkTypeService drinkTypeService;

    public DrinkService(DrinkRepository drinkRepository) {
        this.drinkRepository = drinkRepository;
    }

    public List<Drink> getAllDrinks() {
        return drinkRepository.findAll();
    }

    public List<Drink> getAllDrinksByType(String drinkTypeName) {
        return (List<Drink>) getAllDrinks()
                .stream()
                .filter(drink -> drink.getDrinkType().getName().equals(drinkTypeName));
    }

    public Drink addDrink(String drinkTypeName, String name, String description, float price) {
        return drinkRepository.save(new Drink(
                drinkTypeService.getDrinkTypeByName(drinkTypeName),
                name,
                description,
                price
        ));
    }
}
