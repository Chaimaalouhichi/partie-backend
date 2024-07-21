package tn.teams.lmselearning.entites;

import javax.persistence.*;

@Entity
@IdClass(TestapprenantpaquetPK.class)
public class Testapprenantpaquet {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idTest", nullable = false, length = 254)
    private String idTest;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idApprenant", nullable = false)
    private int idApprenant;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idPaquet", nullable = false)
    private int idPaquet;
    @Basic
    @Column(name = "note", nullable = true, precision = 0)
    private Double note;

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

    public Double getNote() {
        return note;
    }

    public void setNote(Double note) {
        this.note = note;
    }
}
