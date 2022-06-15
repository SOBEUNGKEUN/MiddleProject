package dev.ours.controller;

import dev.ours.model.Market;
import dev.ours.service.MarketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("market")
public class MarketController {
    @Autowired
    private MarketService marketService;

    @GetMapping
    public List<Market> findAll() {
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

    @GetMapping("/type/{type}")
    @Query("SELECT*FROM market WHERE type LIKE ?% ")
    public List<Market> findByTypeStartingWith(@PathVariable("type") String type) {
        return marketService.findByTypeStartingWith(type);
    }

    @Query("SELECT*FROM market WHERE product_name LIKE ?% ")
    @GetMapping("/productName/{product_name}")
    public List<Market> findByProductNameLike(@PathVariable("product_name") String productName) {
        return marketService.findByProductNameLike(productName);
    }


}
