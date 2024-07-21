package tn.teams.lmselearning.entites;

import javax.persistence.*;

@Entity
public class Candidature {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idCandidature", nullable = false)
    private int idCandidature;
    @Column(name = "idEnseignant", nullable = true)
    private Integer idEnseignant;
    @Basic
    @Column(name = "idEntretien", nullable = true)
    private Integer idEntretien;
    @Basic
    @Column(name = "idOffre", nullable = true)
    private Integer idOffre;

    public int getIdCandidature() {
        return idCandidature;
    }

    public void setIdCandidature(int idCandidature) {
        this.idCandidature = idCandidature;
    }

    public Integer getIdEnseignant() {
        return idEnseignant;
    }

    public void setIdEnseignant(Integer idEnseignant) {
        this.idEnseignant = idEnseignant;
    }

    public Integer getIdEntretien() {
        return idEntretien;
    }

    public void setIdEntretien(Integer idEntretien) {
        this.idEntretien = idEntretien;
    }

    public Integer getIdOffre() {
        return idOffre;
    }

    public void setIdOffre(Integer idOffre) {
        this.idOffre = idOffre;
    }
}
