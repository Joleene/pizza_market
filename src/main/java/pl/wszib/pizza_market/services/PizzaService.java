package pl.wszib.pizza_market.services;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.wszib.pizza_market.data.entities.PizzaEntity;
import pl.wszib.pizza_market.data.repositories.PizzaRepository;
import pl.wszib.pizza_market.web.mappers.OpinionsMapper;
import pl.wszib.pizza_market.web.mappers.PizzaMapper;
import pl.wszib.pizza_market.web.models.OpinionsModel;
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

    public PizzaModel getById(Long pizzaId) {
        PizzaEntity pizzaEntity = pizzaRepository.findById(pizzaId).orElseThrow(EntityNotFoundException::new);
        return PizzaMapper.toModel(pizzaEntity);
    }

    @Transactional
    public void addOpinion(OpinionsModel opinionsModel) {
        final var entity = OpinionsMapper.toEntity(opinionsModel);
        entity.setName(opinionsModel.getName());
        entity.setOpinion(opinionsModel.getOpinion());

    }
}
