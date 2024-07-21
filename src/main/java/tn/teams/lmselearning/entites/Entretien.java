package tn.teams.lmselearning.entites;

import javax.persistence.*;

@Entity
public class Entretien {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idEntretien", nullable = false)
    private int idEntretien;

    public int getIdEntretien() {
        return idEntretien;
    }

    public void setIdEntretien(int idEntretien) {
        this.idEntretien = idEntretien;
    }
}
