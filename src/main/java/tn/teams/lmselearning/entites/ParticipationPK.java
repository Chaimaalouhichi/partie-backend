package tn.teams.lmselearning.entites;

import java.io.Serializable;

public class ParticipationPK implements Serializable {
    private int idApprenant;
    private int idPaquet;
    private int idSeance;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ParticipationPK that = (ParticipationPK) o;

        if (idApprenant != that.idApprenant) return false;
        if (idPaquet != that.idPaquet) return false;
        if (idSeance != that.idSeance) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idApprenant;
        result = 31 * result + idPaquet;
        result = 31 * result + idSeance;
        return result;
    }
}
