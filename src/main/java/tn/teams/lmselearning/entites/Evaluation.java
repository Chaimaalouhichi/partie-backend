package tn.teams.lmselearning.entites;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@IdClass(EvaluationPK.class)
public class Evaluation {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idEnseignant", nullable = false)
    private int idEnseignant;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idApprenant", nullable = false)
    private int idApprenant;
    @Basic
    @Column(name = "text", nullable = true, length = 254)
    private String text;
    @Basic
    @Column(name = "annee", nullable = true)
    private Timestamp annee;

    public int getIdEnseignant() {
        return idEnseignant;
    }

    public void setIdEnseignant(int idEnseignant) {
        this.idEnseignant = idEnseignant;
    }

    public int getIdApprenant() {
        return idApprenant;
    }

    public void setIdApprenant(int idApprenant) {
        this.idApprenant = idApprenant;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Timestamp getAnnee() {
        return annee;
    }

    public void setAnnee(Timestamp annee) {
        this.annee = annee;
    }
}
