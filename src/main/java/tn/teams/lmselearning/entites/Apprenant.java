package tn.teams.lmselearning.entites;

import javax.persistence.*;

@Entity
public class Apprenant {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idApprenant", nullable = false)
    private int idApprenant;
    @Basic
    @Column(name = "idParent", nullable = false)
    private int idParent;
    @Basic
    @Column(name = "active", nullable = true)
    private Byte active;

    public int getIdApprenant() {
        return idApprenant;
    }

    public void setIdApprenant(int idApprenant) {
        this.idApprenant = idApprenant;
    }

    public int getIdParent() {
        return idParent;
    }

    public void setIdParent(int idParent) {
        this.idParent = idParent;
    }

    public Byte getActive() {
        return active;
    }

    public void setActive(Byte active) {
        this.active = active;
    }
}
