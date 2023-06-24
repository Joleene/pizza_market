package pl.wszib.pizza_market.web.mappers;

import pl.wszib.pizza_market.data.entities.OrderAddressEntity;
import pl.wszib.pizza_market.data.entities.OrderEntity;
import pl.wszib.pizza_market.web.models.OrderAddressModel;

public class OrderAddressMapper {
    public static OrderAddressEntity toEntity(OrderAddressModel model) {
        OrderAddressEntity entity = new OrderAddressEntity();
        entity.setFirstName(model.getFirstName());
        entity.setLatsName(model.getLatsName());
        entity.setStreet(model.getStreet());
        entity.setPostalCode(model.getPostalCode());
        entity.setCity(model.getCity());

        return entity;
    }
}
