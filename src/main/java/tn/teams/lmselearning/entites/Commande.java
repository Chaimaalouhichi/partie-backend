package tn.teams.lmselearning.entites;

import javax.persistence.*;

@Entity
public class Commande {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idCommande", nullable = true)
    private Integer idCommande;
    @Basic
    @Column(name = "idParent", nullable = true)
    private Integer idParent;
    @Basic
    @Column(name = "type", nullable = true)
    private String type;
    @Basic
    @Column(name = "estValidee", nullable = true)
    private boolean estValidee;
    @Basic
    @Column(name = "idAdmin", nullable = true)
    private Integer idAdmin;
    @Basic
    @Column(name = "idFacture", nullable = true)
    private Integer idFacture;

    public Integer getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(Integer idAdmin) {
        this.idAdmin = idAdmin;
    }

    public Integer getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(Integer idCommande) {
        this.idCommande = idCommande;
    }

    public Integer getIdParent() {
        return idParent;
    }

    public void setIdParent(Integer idParent) {
        this.idParent = idParent;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isEstValidee() {
        return estValidee;
    }

    public void setEstValidee(boolean estValidee) {
        this.estValidee = estValidee;
    }

    public Integer getIdFacture() {
        return idFacture;
    }

    public void setIdFacture(Integer idFacture) {
        this.idFacture = idFacture;
    }
}
