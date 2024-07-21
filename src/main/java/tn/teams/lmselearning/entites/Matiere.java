package tn.teams.lmselearning.entites;

import javax.persistence.*;

@Entity
public class Matiere {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idMatiere", nullable = false)
    private int idMatiere;
    @Basic
    @Column(name = "libelle", nullable = true, length = 254)
    private String libelle;

    public int getIdMatiere() {
        return idMatiere;
    }

    public void setIdMatiere(int idMatiere) {
        this.idMatiere = idMatiere;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
