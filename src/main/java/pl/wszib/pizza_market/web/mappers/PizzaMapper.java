package pl.wszib.pizza_market.web.mappers;

import pl.wszib.pizza_market.data.entities.PizzaEntity;
import pl.wszib.pizza_market.web.models.PizzaModel;

public class PizzaMapper {
    public static PizzaModel toModel(PizzaEntity entity) {
        return new PizzaModel(
                entity.getId (),
                entity.getName(),
                entity.getPrice(),
                entity.getIngredients()
        );
    }
}
