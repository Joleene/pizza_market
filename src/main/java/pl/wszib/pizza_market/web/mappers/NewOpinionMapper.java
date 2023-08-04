package pl.wszib.pizza_market.web.mappers;
import pl.wszib.pizza_market.data.entities.OpinionsEntity;
import pl.wszib.pizza_market.web.models.NewOpinionModel;

public class NewOpinionMapper {
    public static OpinionsEntity toEntity (NewOpinionModel model) {
        OpinionsEntity entity = new OpinionsEntity();
        entity.setName(model.getName());
        entity.setOpinion(model.getOpinion());

        return entity;
    }
}
