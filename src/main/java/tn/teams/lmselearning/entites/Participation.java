package tn.teams.lmselearning.entites;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@IdClass(ParticipationPK.class)
public class Participation {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idApprenant", nullable = false)
    private int idApprenant;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idPaquet", nullable = false)
    private int idPaquet;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idSeance", nullable = false)
    private int idSeance;
    @Basic
    @Column(name = "estPresent", nullable = true)
    private Timestamp estPresent;

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

    public int getIdSeance() {
        return idSeance;
    }

    public void setIdSeance(int idSeance) {
        this.idSeance = idSeance;
    }

    public Timestamp getEstPresent() {
        return estPresent;
    }

    public void setEstPresent(Timestamp estPresent) {
        this.estPresent = estPresent;
    }
}
