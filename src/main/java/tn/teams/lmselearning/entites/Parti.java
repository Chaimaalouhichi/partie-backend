package tn.teams.lmselearning.entites;

import javax.persistence.*;

@Entity
public class Parti {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idParti", nullable = false)
    private int idParti;
    @Basic
    @Column(name = "idCours", nullable = true)
    private Integer idCours;
    @Basic
    @Column(name = "type", nullable = true, length = 254)
    private String type;
    @Basic
    @Column(name = "contenu", nullable = true, length = 254)
    private String contenu;
    @Basic
    @Column(name = "video", nullable = true, length = 254)
    private String video;

    public int getIdParti() {
        return idParti;
    }

    public void setIdParti(int idParti) {
        this.idParti = idParti;
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

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }
}
