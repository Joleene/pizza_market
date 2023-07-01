package pl.wszib.pizza_market.web.mappers;

import pl.wszib.pizza_market.data.entities.OpinionsEntity;
import pl.wszib.pizza_market.web.models.OpinionsModel;

public class OpinionsMapper {
    public static OpinionsModel toModel(OpinionsEntity entity) {
        return new OpinionsModel(entity.getId(), entity.getName(), entity.getOpinion());
    }
        public static OpinionsEntity toEntity(OpinionsModel model) {
            final var entity = new OpinionsEntity();

            entity.setName(model.getName());
            entity.setOpinion(model.getOpinion());


        return entity;
}
}
