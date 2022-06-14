package dev.ours.repository;

import dev.ours.model.Market;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MarketRepository extends JpaRepository<Market,Long> {
    List<Market> findByTypeStartingWith(String type);

    List<Market> findByProductNameLike(String productName);

}
