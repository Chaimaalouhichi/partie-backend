package tn.teams.lmselearning.entites;

import javax.persistence.*;

@Entity
public class Document {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idDocument", nullable = false)
    private int idDocument;
    @Basic
    @Column(name = "idCandidature", nullable = true)
    private Integer idCandidature;
    @Basic
    @Column(name = "type", nullable = true, length = 254)
    private String type;

    public int getIdDocument() {
        return idDocument;
    }

    public void setIdDocument(int idDocument) {
        this.idDocument = idDocument;
    }

    public Integer getIdCandidature() {
        return idCandidature;
    }

    public void setIdCandidature(Integer idCandidature) {
        this.idCandidature = idCandidature;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
