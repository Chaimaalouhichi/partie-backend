package tn.teams.lmselearning.entites;

import javax.persistence.*;

@Entity
public class Admincommercial {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idAdmin", nullable = false)
    private int idAdmin;

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }
}
