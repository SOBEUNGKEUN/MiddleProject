package dev.ours.controller;

import dev.ours.model.Accommodation;
import dev.ours.service.AccommodationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("accommodation")
@CrossOrigin("*")
public class AccommodationController {
    @Autowired
    private AccommodationService accommodationService;

    @GetMapping
    public List<Accommodation> findAll() {
        return accommodationService.findAll();
    }

    @PostMapping
    public Accommodation save(@RequestBody Accommodation accommodation) {
        System.out.println(accommodation);
        return accommodationService.save(accommodation);
    }

    @PutMapping
    public List<Accommodation> update(@RequestBody Accommodation accommodation) {
        return accommodationService.update(accommodation);
    }

    @DeleteMapping("/{id}")
    public List<Accommodation> delete(@PathVariable("id") Long id) {
        System.out.println("delete called");
        return accommodationService.delete(id);
    }

    @GetMapping("/customerName/{customer_name}")
    @Query("SELECT*FROM accommodation where customer_name LIKE %?")
    public List<Accommodation> findByCustomerName(@PathVariable("customer_name") String customerName) {
        return accommodationService.findByCustomerName(customerName);
    }


}
