package tn.teams.lmselearning.entites;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@IdClass(TestquestionPK.class)
public class Testquestion {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idTest", nullable = false, length = 254)
    private String idTest;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idQuestion", nullable = false)
    private int idQuestion;
    @Basic
    @Column(name = "date", nullable = true)
    private Timestamp date;

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

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }
}
