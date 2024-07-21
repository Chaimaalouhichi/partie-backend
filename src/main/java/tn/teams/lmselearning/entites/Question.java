package tn.teams.lmselearning.entites;

import javax.persistence.*;

@Entity
public class Question {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idQuestion", nullable = false)
    private int idQuestion;
    @Basic
    @Column(name = "type", nullable = true, length = 254)
    private String type;

    public int getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(int idQuestion) {
        this.idQuestion = idQuestion;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
