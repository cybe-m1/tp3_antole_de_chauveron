package cybertp3.coffeemachine.components.drink;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("tp3/coffee-machine/drinks")
public class DrinkController {
    private final DrinkService drinkService;

    public DrinkController(DrinkService drinkService) {
        this.drinkService = drinkService;
    }

    @GetMapping
    public List<Drink> getAllDrinks() {
        return drinkService.getAllDrinks();
    }

    @PutMapping("/{type}")
    public List<Drink> getAllDrinksByType(@PathVariable String type) {
        return drinkService.getAllDrinksByType(type);
    }

}
