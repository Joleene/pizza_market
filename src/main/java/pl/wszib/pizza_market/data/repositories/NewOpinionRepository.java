package pl.wszib.pizza_market.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.wszib.pizza_market.data.entities.OpinionsEntity;

public interface NewOpinionRepository extends JpaRepository<OpinionsEntity, Long> {
}
