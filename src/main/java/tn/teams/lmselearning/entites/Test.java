package tn.teams.lmselearning.entites;

import javax.persistence.*;

@Entity
public class Test {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idTest", nullable = false, length = 254)
    private String idTest;
    @Basic
    @Column(name = "idCours", nullable = true)
    private Integer idCours;
    @Basic
    @Column(name = "type", nullable = true, length = 254)
    private String type;

    public String getIdTest() {
        return idTest;
    }

    public void setIdTest(String idTest) {
        this.idTest = idTest;
    }

    public Integer getIdCours() {
        return idCours;
    }

    public void setIdCours(Integer idCours) {
        this.idCours = idCours;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
