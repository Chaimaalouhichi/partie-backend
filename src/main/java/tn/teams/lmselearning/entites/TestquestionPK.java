package tn.teams.lmselearning.entites;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class TestquestionPK implements Serializable {
    @Column(name = "idTest", nullable = false, length = 254)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idTest;
    @Column(name = "idQuestion", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idQuestion;

    public String getIdTest() {
        return idTest;
    }

    public void setIdTest(String idTest) {
        this.idTest = idTest;
    }

    public int getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(int idQuestion) {
        this.idQuestion = idQuestion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TestquestionPK that = (TestquestionPK) o;

        if (idQuestion != that.idQuestion) return false;
        if (idTest != null ? !idTest.equals(that.idTest) : that.idTest != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTest != null ? idTest.hashCode() : 0;
        result = 31 * result + idQuestion;
        return result;
    }
}
