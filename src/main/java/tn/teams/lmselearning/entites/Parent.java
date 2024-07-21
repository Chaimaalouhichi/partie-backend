package tn.teams.lmselearning.entites;

import javax.persistence.*;

@Entity
public class Parent {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idParent", nullable = false)
    private int idParent;

    public int getIdParent() {
        return idParent;
    }

    public void setIdParent(int idParent) {
        this.idParent = idParent;
    }
}
