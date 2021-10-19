package cybertp3.coffeemachine.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Drink {
    private int id;
    private DrinkType drinkType;
    private String name, description;
    private float price;
}
