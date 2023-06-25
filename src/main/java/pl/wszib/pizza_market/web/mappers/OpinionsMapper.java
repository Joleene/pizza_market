package pl.wszib.pizza_market.web.mappers;

import pl.wszib.pizza_market.data.entities.OpinionsEntity;
import pl.wszib.pizza_market.data.entities.OrderAddressEntity;
import pl.wszib.pizza_market.web.models.OpinionsModel;
import pl.wszib.pizza_market.web.models.OrderAddressModel;

public class OpinionsMapper {
    public static OpinionsEntity toEntity(OpinionsModel model) {
        OpinionsEntity entity = new OpinionsEntity();
        entity.setName(model.getName());
        entity.setOpinion(model.getOpinion());


        return entity;
}
}
