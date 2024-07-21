package tn.teams.lmselearning.entites;

import java.io.Serializable;

public class TestapprenantpaquetPK implements Serializable {
    private String idTest;
    private int idApprenant;
    private int idPaquet;

    public String getIdTest() {
        return idTest;
    }

    public void setIdTest(String idTest) {
        this.idTest = idTest;
    }

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

        TestapprenantpaquetPK that = (TestapprenantpaquetPK) o;

        if (idApprenant != that.idApprenant) return false;
        if (idPaquet != that.idPaquet) return false;
        if (idTest != null ? !idTest.equals(that.idTest) : that.idTest != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTest != null ? idTest.hashCode() : 0;
        result = 31 * result + idApprenant;
        result = 31 * result + idPaquet;
        return result;
    }
}
