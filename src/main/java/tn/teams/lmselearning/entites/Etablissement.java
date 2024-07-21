package tn.teams.lmselearning.entites;

import javax.persistence.*;

@Entity
public class Etablissement {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idEtablissement", nullable = false)
    private int idEtablissement;

    public int getIdEtablissement() {
        return idEtablissement;
    }

    public void setIdEtablissement(int idEtablissement) {
        this.idEtablissement = idEtablissement;
    }
}
