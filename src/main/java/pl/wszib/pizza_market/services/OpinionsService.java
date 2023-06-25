package pl.wszib.pizza_market.services;


import org.springframework.stereotype.Service;
import pl.wszib.pizza_market.data.entities.OpinionsEntity;

import pl.wszib.pizza_market.data.repositories.OpinionsRepository;

import pl.wszib.pizza_market.web.models.OpinionsModel;


import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class OpinionsService {

    private final OpinionsRepository opinionsRepository;

    public OpinionsService(OpinionsRepository opinionsRepository) {
        this.opinionsRepository = opinionsRepository;
    }


    public void saveOpinion(String name, OpinionsModel opinionsModel) {

        OpinionsEntity opinionsEntity = new OpinionsEntity();
        opinionsEntity.setName(opinionsEntity.getName());
        opinionsEntity.setOpinion(opinionsEntity.getOpinion());


        opinionsRepository.save(opinionsEntity);


}

}

