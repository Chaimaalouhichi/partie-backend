package tn.teams.lmselearning.entites;

import javax.persistence.*;

@Entity
public class Facture {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idFacture", nullable = false)
    private int idFacture;

    @Basic
    @Column(name = "type", nullable = true, length = 254)
    private String type;

    public int getIdFacture() {
        return idFacture;
    }

    public void setIdFacture(int idFacture) {
        this.idFacture = idFacture;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
