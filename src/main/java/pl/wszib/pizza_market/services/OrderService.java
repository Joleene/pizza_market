package pl.wszib.pizza_market.services;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import pl.wszib.pizza_market.data.entities.OrderAddressEntity;
import pl.wszib.pizza_market.data.entities.OrderEntity;
import pl.wszib.pizza_market.data.entities.PizzaEntity;
import pl.wszib.pizza_market.data.repositories.OrderRepository;
import pl.wszib.pizza_market.data.repositories.PizzaRepository;
import pl.wszib.pizza_market.web.mappers.OrderAddressMapper;
import pl.wszib.pizza_market.web.models.OrderAddressModel;

@Service
public class OrderService {

    private final OrderRepository orderRepository;
    private final PizzaRepository pizzaRepository;

    public OrderService(OrderRepository orderRepository, PizzaRepository pizzaRepository) {
        this.orderRepository = orderRepository;
        this.pizzaRepository = pizzaRepository;
    }

    @Transactional
    public void saveOrder(Long pizzaId, OrderAddressModel orderAddressModel) {
        PizzaEntity pizzaEntity = pizzaRepository.findById(pizzaId).orElseThrow(EntityNotFoundException::new);
        OrderAddressEntity orderAddressEntity = OrderAddressMapper.toEntity(orderAddressModel);

        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setPizzaName(pizzaEntity.getName());
        orderEntity.setPrice(pizzaEntity.getPrice());
        orderEntity.setOrderAddress(orderAddressEntity);

        orderRepository.save(orderEntity);
    }
}
