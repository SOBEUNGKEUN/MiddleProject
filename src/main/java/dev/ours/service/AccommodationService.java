package dev.ours.service;



import dev.ours.model.Accommodation;
import java.util.List;

public interface AccommodationService {


    List<Accommodation> findAll();
    Accommodation save(Accommodation accommodation);

    List<Accommodation> update(Accommodation accommodation);

    List<Accommodation> delete(Long id);
    List<Accommodation> findByCustomerName(String customerName);

}