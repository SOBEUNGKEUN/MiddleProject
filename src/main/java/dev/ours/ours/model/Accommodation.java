package dev.ours.ours.model;


import lombok.*;

import javax.persistence.*;

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
