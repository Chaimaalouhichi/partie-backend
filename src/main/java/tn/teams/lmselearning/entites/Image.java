package tn.teams.lmselearning.entites;

import javax.persistence.*;

@Entity
public class Image {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idImage", nullable = false)
    private int idImage;
    @Basic
    @Column(name = "idParti", nullable = true)
    private Integer idParti;
    @Basic
    @Column(name = "nom", nullable = true, length = 254)
    private String nom;

    public int getIdImage() {
        return idImage;
    }

    public void setIdImage(int idImage) {
        this.idImage = idImage;
    }

    public Integer getIdParti() {
        return idParti;
    }

    public void setIdParti(Integer idParti) {
        this.idParti = idParti;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
