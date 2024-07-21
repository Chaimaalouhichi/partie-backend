package tn.teams.lmselearning.entites;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Seance {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idSeance", nullable = false)
    private int idSeance;
    @Basic
    @Column(name = "idAdmin", nullable = true)
    private Integer idAdmin;
    @Basic
    @Column(name = "idCours", nullable = true)
    private Integer idCours;
    @Basic
    @Column(name = "debut", nullable = true)
    private Timestamp debut;
    @Basic
    @Column(name = "fin", nullable = true)
    private Timestamp fin;

    public int getIdSeance() {
        return idSeance;
    }

    public void setIdSeance(int idSeance) {
        this.idSeance = idSeance;
    }

    public Integer getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(Integer idAdmin) {
        this.idAdmin = idAdmin;
    }

    public Integer getIdCours() {
        return idCours;
    }

    public void setIdCours(Integer idCours) {
        this.idCours = idCours;
    }

    public Timestamp getDebut() {
        return debut;
    }

    public void setDebut(Timestamp debut) {
        this.debut = debut;
    }

    public Timestamp getFin() {
        return fin;
    }

    public void setFin(Timestamp fin) {
        this.fin = fin;
    }
}
