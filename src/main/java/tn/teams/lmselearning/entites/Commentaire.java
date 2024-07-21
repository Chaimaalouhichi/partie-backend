package tn.teams.lmselearning.entites;

import javax.persistence.*;

@Entity
@IdClass(CommentairePK.class)
public class Commentaire {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idApprenant", nullable = false)
    private int idApprenant;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idPaquet", nullable = false)
    private int idPaquet;
    @Basic
    @Column(name = "text", nullable = true, length = 254)
    private String text;

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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
