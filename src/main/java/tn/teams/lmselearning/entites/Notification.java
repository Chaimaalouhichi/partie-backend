package tn.teams.lmselearning.entites;

import javax.persistence.*;

@Entity
public class Notification {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idNotif", nullable = false)
    private int idNotif;
    @Basic
    @Column(name = "idUser", nullable = true)
    private Integer idUser;
    @Basic
    @Column(name = "type", nullable = true, length = 254)
    private String type;
    @Basic
    @Column(name = "contenu", nullable = true, length = 254)
    private String contenu;

    public int getIdNotif() {
        return idNotif;
    }

    public void setIdNotif(int idNotif) {
        this.idNotif = idNotif;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }
}
