package tn.teams.lmselearning.entites;

import javax.persistence.*;

@Entity
public class Support {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idSupp", nullable = false)
    private int idSupp;
    @Basic
    @Column(name = "idCours", nullable = true)
    private Integer idCours;
    @Basic
    @Column(name = "type", nullable = true, length = 254)
    private String type;
    @Basic
    @Column(name = "url", nullable = true, length = 254)
    private String url;

    public int getIdSupp() {
        return idSupp;
    }

    public void setIdSupp(int idSupp) {
        this.idSupp = idSupp;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
