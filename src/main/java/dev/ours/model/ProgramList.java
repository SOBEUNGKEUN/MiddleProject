package dev.ours.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
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
public class ProgramList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long programListId;
    private String villageName;
    private String stateName;
    private String cityName;
    private String experience;
    private String experienceName;
    private String address;
    private String manager;
    private String managerPhone;
    private double latitude;
    private double longitude;
}
