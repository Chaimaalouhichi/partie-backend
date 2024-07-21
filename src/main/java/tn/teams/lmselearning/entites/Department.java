package tn.teams.lmselearning.entites;

import lombok.*;

import javax.persistence.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "departmentId", nullable = false)
    private Long departmentId;

    private String departmentName;

    private String departmentAbbreviation;

}
