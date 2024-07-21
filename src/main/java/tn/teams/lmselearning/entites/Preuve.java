package tn.teams.lmselearning.entites;

import javax.persistence.*;

@Entity
public class Preuve {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idPreuve", nullable = false)
    private int idPreuve;
    @Basic
    @Column(name = "idFacture", nullable = true)
    private Integer idFacture;

    public int getIdPreuve() {
        return idPreuve;
    }

    public void setIdPreuve(int idPreuve) {
        this.idPreuve = idPreuve;
    }

    public Integer getIdFacture() {
        return idFacture;
    }

    public void setIdFacture(Integer idFacture) {
        this.idFacture = idFacture;
    }
}
