package dev.ours.repository;

import dev.ours.model.Accommodation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.*;
import java.util.List;

@Repository
public interface AccommodationRepository extends JpaRepository<Accommodation,Long> {

    List<Accommodation> findByCustomerName(String customerName);


}