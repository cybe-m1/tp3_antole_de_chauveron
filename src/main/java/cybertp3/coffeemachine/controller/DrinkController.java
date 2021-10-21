package cybertp3.coffeemachine.controller;

import cybertp3.coffeemachine.models.Drink;
import cybertp3.coffeemachine.service.DrinkService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
