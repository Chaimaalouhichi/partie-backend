package tn.teams.lmselearning.entites;

import javax.persistence.*;

@Entity
public class Tag {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idTag", nullable = false)
    private int idTag;
    @Basic
    @Column(name = "idCours", nullable = true)
    private Integer idCours;
    @Basic
    @Column(name = "libelle", nullable = true, length = 254)
    private String libelle;

    public int getIdTag() {
        return idTag;
    }

    public void setIdTag(int idTag) {
        this.idTag = idTag;
    }

    public Integer getIdCours() {
        return idCours;
    }

    public void setIdCours(Integer idCours) {
        this.idCours = idCours;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
