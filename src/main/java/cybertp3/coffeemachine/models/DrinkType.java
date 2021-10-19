package cybertp3.coffeemachine.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class DrinkType {
    private int id;
    private String name, description;
}