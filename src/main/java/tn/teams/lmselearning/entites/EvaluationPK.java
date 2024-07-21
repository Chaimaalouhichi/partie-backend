package tn.teams.lmselearning.entites;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class EvaluationPK implements Serializable {
    @Column(name = "idEnseignant", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEnseignant;
    @Column(name = "idApprenant", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idApprenant;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EvaluationPK that = (EvaluationPK) o;

        if (idEnseignant != that.idEnseignant) return false;
        if (idApprenant != that.idApprenant) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idEnseignant;
        result = 31 * result + idApprenant;
        return result;
    }
}
