package tn.teams.lmselearning.entites;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@IdClass(PaquetapprenantPK.class)
public class Paquetapprenant {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idApprenant", nullable = false)
    private int idApprenant;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idPaquet", nullable = false)
    private int idPaquet;
    @Basic
    @Column(name = "idCommande", nullable = true)
    private Integer idCommande;
    @Basic
    @Column(name = "date", nullable = true)
    private Timestamp date;
    @Basic
    @Column(name = "code", nullable = true, length = 254)
    private String code;
    @Basic
    @Column(name = "validitee", nullable = true)
    private Timestamp validitee;
    @Basic
    @Column(name = "type", nullable = true, length = 254)
    private String type;
    @Basic
    @Column(name = "etat", nullable = true, length = 254)
    private String etat;

    public int getIdApprenant() {
        return idApprenant;
    }

    public void setIdApprenant(int idApprenant) {
        this.idApprenant = idApprenant;
    }

    public int getIdPaquet() {
        return idPaquet;
    }

    public void setIdPaquet(int idPaquet) {
        this.idPaquet = idPaquet;
    }

    public Integer getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(Integer idCommande) {
        this.idCommande = idCommande;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Timestamp getValiditee() {
        return validitee;
    }

    public void setValiditee(Timestamp validitee) {
        this.validitee = validitee;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }
}
