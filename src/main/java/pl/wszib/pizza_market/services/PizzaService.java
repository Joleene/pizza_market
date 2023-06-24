package pl.wszib.pizza_market.services;

import org.springframework.stereotype.Service;
import pl.wszib.pizza_market.data.entities.PizzaEntity;
import pl.wszib.pizza_market.data.repositories.PizzaRepository;
import pl.wszib.pizza_market.web.mappers.PizzaMapper;
import pl.wszib.pizza_market.web.models.PizzaModel;

import java.util.List;

@Service
public class PizzaService {

    private final PizzaRepository pizzaRepository;

    public PizzaService(PizzaRepository pizzaRepository) {
        this.pizzaRepository = pizzaRepository;
    }

    public List<PizzaModel> findAll() {
        List<PizzaEntity> entities = pizzaRepository.findAll();

        return entities.stream()
                .map(PizzaMapper::toModel)
                .toList();

    }
}
