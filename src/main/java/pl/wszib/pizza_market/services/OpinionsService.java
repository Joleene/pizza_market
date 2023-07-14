package pl.wszib.pizza_market.services;


import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import pl.wszib.pizza_market.data.entities.NewOpinionEntity;
import pl.wszib.pizza_market.data.repositories.NewOpinionRepository;
import pl.wszib.pizza_market.data.repositories.OpinionsRepository;
import pl.wszib.pizza_market.web.mappers.OpinionsMapper;
import pl.wszib.pizza_market.web.models.NewOpinionModel;
import pl.wszib.pizza_market.web.models.OpinionsModel;

import java.util.List;

@Service
public class OpinionsService {

    private final OpinionsRepository opinionsRepository;
    private final NewOpinionRepository newOpinionRepository;

    public OpinionsService(OpinionsRepository opinionsRepository, NewOpinionRepository newOpinionRepository) {

        this.opinionsRepository = opinionsRepository;
        this.newOpinionRepository = newOpinionRepository;
    }

    public List<OpinionsModel> findAll() {
        final var entities = opinionsRepository.findAll();

        return entities.stream()
                .map(OpinionsMapper::toModel)
                .toList();
    }
    public OpinionsModel getById(Long opinionId) {
        final var entity = opinionsRepository.findById(opinionId)
                .orElseThrow(EntityNotFoundException::new);

        return OpinionsMapper.toModel(entity);
    }

            @Transactional
        public Long saveOpinion(Long opinionId, NewOpinionModel newOpinionModel) {
            NewOpinionEntity newOpinionEntity = newOpinionRepository.findById(opinionId)
                    .orElseThrow(EntityNotFoundException::new);

            newOpinionEntity.setName(newOpinionEntity.getName());
            newOpinionEntity.setOpinion(newOpinionEntity.getOpinion());


            final var savedOpinion = newOpinionRepository.save(newOpinionEntity);
            return savedOpinion.getId();
        }

}

