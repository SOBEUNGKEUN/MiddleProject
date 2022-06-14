package dev.ours.controller;

import dev.ours.model.Market;
import dev.ours.service.MarketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("market")
public class MarketController {
    @Autowired
    private MarketService marketService;

    @GetMapping
    public List<Market> findAll(){
        return marketService.findAll();
    }

    @PostMapping
    public Market save(@RequestBody Market market) {
        System.out.println(market);
        return marketService.save(market);
    }
    @PutMapping
    public List<Market> update(@RequestBody Market market) {
        return marketService.update(market);
    }

    @DeleteMapping("/{id}")
    public List<Market> delete(@PathVariable("id") Long id) {
        return marketService.delete(id);
    }
}
