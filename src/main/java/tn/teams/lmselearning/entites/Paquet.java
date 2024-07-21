package tn.teams.lmselearning.entites;

import javax.persistence.*;

@Entity
public class Paquet {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idPaquet", nullable = false)
    private int idPaquet;
    @Basic
    @Column(name = "estDisponible", nullable = true)
    private Byte estDisponible;
    @Basic
    @Column(name = "type", nullable = true, length = 254)
    private String type;
    @Basic
    @Column(name = "nom", nullable = true, length = 254)
    private String nom;

    public int getIdPaquet() {
        return idPaquet;
    }

    public void setIdPaquet(int idPaquet) {
        this.idPaquet = idPaquet;
    }

    public Byte getEstDisponible() {
        return estDisponible;
    }

    public void setEstDisponible(Byte estDisponible) {
        this.estDisponible = estDisponible;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
