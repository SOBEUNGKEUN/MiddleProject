package dev.ours.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Builder
@RequiredArgsConstructor
@AllArgsConstructor
@Setter @Getter
@ToString
@Entity
public class Market {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long marketId;
    private String marketName;
    private String type;
    private String productName;
    private int productPrice;

}
