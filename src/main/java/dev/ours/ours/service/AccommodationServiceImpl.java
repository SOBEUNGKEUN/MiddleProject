package dev.ours.ours.service;

import dev.ours.ours.model.Accommodation;
import dev.ours.ours.repository.AccommodationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccommodationServiceImpl implements AccommodationService {
    @Autowired
    private AccommodationRepository repository;

    public List<Accommodation> findAll(){
        return repository.findAll();
    }

    @Override
    public Accommodation save(Accommodation accommodation) {
        return repository.save(accommodation);
    }

    @Override
    public List<Accommodation> update(Accommodation accommodation) {
        final Optional<Accommodation> foundAccommodation = repository.findById(accommodation.getAccommodationId());

        foundAccommodation.ifPresent(newAccommodation -> {// id값에 의한 엔티티가 존재하면(ifPresent)
            newAccommodation.setCustomerName (accommodation.getCustomerName());
            newAccommodation.setCustomerPhone(accommodation.getCustomerPhone());
            newAccommodation.setCustomerCount(accommodation.getCustomerCount());
            newAccommodation.setReservationNumber(accommodation.getReservationNumber());

            repository.save(newAccommodation);
        });

        return repository.findAll();
    }

    @Override
    public List<Accommodation> delete(Long id) {
        final Optional<Accommodation> foundAccommodation = repository.findById(id);

        foundAccommodation.ifPresent(accommodation -> {
            repository.delete(accommodation);
        });

        return repository.findAll();
    }


}
