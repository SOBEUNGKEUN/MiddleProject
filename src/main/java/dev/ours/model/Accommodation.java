package dev.ours.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Builder
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Accommodation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accommodationId;

    private String customerName;

    private int customerCount;

    private String customerPhone;

    private String reservationNumber;

}
