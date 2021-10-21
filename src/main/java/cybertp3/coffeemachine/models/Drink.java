package cybertp3.coffeemachine.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Drink {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private DrinkType drinkType;
    private String name, description;
    private float price;

    public Drink(DrinkType drinkType, String name, String description, float price) {
        this.drinkType = drinkType;
        this.name = name;
        this.description = description;
        this.price = price;
    }
}
