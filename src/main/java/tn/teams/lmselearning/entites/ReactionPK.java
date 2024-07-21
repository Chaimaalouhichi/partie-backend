package tn.teams.lmselearning.entites;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class ReactionPK implements Serializable {
    @Column(name = "idApprenant", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idApprenant;
    @Column(name = "idPaquet", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPaquet;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ReactionPK that = (ReactionPK) o;

        if (idApprenant != that.idApprenant) return false;
        if (idPaquet != that.idPaquet) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idApprenant;
        result = 31 * result + idPaquet;
        return result;
    }
}
