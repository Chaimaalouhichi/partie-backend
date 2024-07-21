package tn.teams.lmselearning.entites;

import javax.persistence.*;

@Entity
public class Offrerecrutement {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idOffre", nullable = false)
    private int idOffre;
    @Basic
    @Column(name = "idAdmin", nullable = true)
    private Integer idAdmin;
    @Basic
    @Column(name = "idSpecialite", nullable = true)
    private Integer idSpecialite;
    @Basic
    @Column(name = "text", nullable = true, length = 254)
    private String text;

    public int getIdOffre() {
        return idOffre;
    }

    public void setIdOffre(int idOffre) {
        this.idOffre = idOffre;
    }

    public Integer getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(Integer idAdmin) {
        this.idAdmin = idAdmin;
    }

    public Integer getIdSpecialite() {
        return idSpecialite;
    }

    public void setIdSpecialite(Integer idSpecialite) {
        this.idSpecialite = idSpecialite;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
