package pl.wszib.pizza_market.web.mappers;

import pl.wszib.pizza_market.data.entities.NewOpinionEntity;
import pl.wszib.pizza_market.web.models.NewOpinionModel;

public class NewOpinionMapper {
    public static NewOpinionEntity toEntity (NewOpinionModel model) {
        NewOpinionEntity entity = new NewOpinionEntity();
        entity.setName(model.getName());
        entity.setOpinion(model.getOpinion());

        return entity;
    }
}
