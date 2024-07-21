package tn.teams.lmselearning.entites;

import javax.persistence.*;

@Entity
public class Cours {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idCours", nullable = false)
    private int idCours;
    @Basic
    @Column(name = "idEnseignant", nullable = true)
    private Integer idEnseignant;
    @Basic
    @Column(name = "idMatiere", nullable = true)
    private Integer idMatiere;
    // changed to MANY to Many with Paquet
    @Basic
    @Column(name = "type", nullable = true, length = 254)
    private String type;
    @Basic
    @Column(name = "niveau", nullable = true, length = 254)
    private String niveau;

    public int getIdCours() {
        return idCours;
    }

    public void setIdCours(int idCours) {
        this.idCours = idCours;
    }

    public Integer getIdEnseignant() {
        return idEnseignant;
    }

    public void setIdEnseignant(Integer idEnseignant) {
        this.idEnseignant = idEnseignant;
    }

    public Integer getIdMatiere() {
        return idMatiere;
    }

    public void setIdMatiere(Integer idMatiere) {
        this.idMatiere = idMatiere;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }
}
