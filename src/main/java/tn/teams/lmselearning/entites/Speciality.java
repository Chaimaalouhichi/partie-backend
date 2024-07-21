package tn.teams.lmselearning.entites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Speciality {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "specialityId", nullable = false)
    private Long specialityId;

    private String specialityName;

    private String specialityAbbreviation;

    private Long enseignantId;

    private Long offreRecutementId;



}
