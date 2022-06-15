package dev.ours.service;

import dev.ours.model.Market;

import java.util.List;

public interface MarketService {
    /**
     * ProgramList
     */
    List<Market> findAll();
    Market save(Market market);
    List<Market> update(Market market);

    List<Market> delete(Long id);

    List<Market> findByTypeStartingWith(String type);

    List<Market> findByProductNameLike(String productName);

}