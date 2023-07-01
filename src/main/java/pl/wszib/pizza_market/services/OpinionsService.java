package pl.wszib.pizza_market.services;


import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import pl.wszib.pizza_market.data.entities.OpinionsEntity;
import pl.wszib.pizza_market.data.repositories.OpinionsRepository;
import pl.wszib.pizza_market.web.mappers.OpinionsMapper;
import pl.wszib.pizza_market.web.models.OpinionsModel;

import java.util.List;

@Service
public class OpinionsService {

    private final OpinionsRepository opinionsRepository;

    public OpinionsService(OpinionsRepository opinionsRepository) {

        this.opinionsRepository = opinionsRepository;
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
        public Long saveOpinion(Long opinionId, OpinionsModel opinionsModel) {
            OpinionsEntity opinionsEntity = opinionsRepository.findById(opinionId)
                    .orElseThrow(EntityNotFoundException::new);

            opinionsEntity.setName(opinionsEntity.getName());
            opinionsEntity.setOpinion(opinionsEntity.getOpinion());


            final var savedOpinion = opinionsRepository.save(opinionsEntity);
            return savedOpinion.getId();
        }


    public void findAll() {
    }
}

