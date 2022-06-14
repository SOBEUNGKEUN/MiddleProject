package dev.ours.service;

import dev.ours.model.Market;
import dev.ours.repository.MarketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MarketServiceImpl implements MarketService{

    @Autowired
    private MarketRepository repository;

    @Override
    public List<Market> findAll(){
        return repository.findAll();
    }

    @Override
    public Market save(Market market) {
        return repository.save(market);
    }

    @Override
    public List<Market> update(Market market) {
        final Optional<Market> foundMarket = repository.findById(market.getMarketId());

        foundMarket.ifPresent(newMarket -> {// id값에 의한 엔티티가 존재하면(ifPresent
            newMarket.setMarketName(market.getMarketName());
            newMarket.setType(market.getType());
            newMarket.setProductName(market.getProductName());
            newMarket.setProductPrice(market.getProductPrice());

            repository.save(newMarket);
        });

        return repository.findAll();
    }
    @Override
    public List<Market> delete(Long id) {
        final Optional<Market> foundMarket = repository.findById(id);

        foundMarket.ifPresent(market -> {
            // programList : 삭제하고자 하는 엔터티
            repository.delete(market);
        });

        return repository.findAll();
    }
}
