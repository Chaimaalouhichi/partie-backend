package tn.teams.lmselearning.entites;

import javax.persistence.*;

@Entity
public class Enseignant {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idEnseignant", nullable = false)
    private int idEnseignant;
    @Basic
    @Column(name = "idSpecialite", nullable = false)
    private int idSpecialite;

    public int getIdEnseignant() {
        return idEnseignant;
    }

    public void setIdEnseignant(int idEnseignant) {
        this.idEnseignant = idEnseignant;
    }

    public int getIdSpecialite() {
        return idSpecialite;
    }

    public void setIdSpecialite(int idSpecialite) {
        this.idSpecialite = idSpecialite;
    }
}
