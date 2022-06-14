package dev.ours.ours.service;

import java.util.List;


import dev.ours.ours.model.Accommodation;


public interface AccommodationService {


    List<Accommodation> findAll();
    Accommodation save(Accommodation accommodation);

    List<Accommodation> update(Accommodation accommodation);

    List<Accommodation> delete(Long id);


}