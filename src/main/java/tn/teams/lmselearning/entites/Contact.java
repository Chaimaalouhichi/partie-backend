package tn.teams.lmselearning.entites;

import javax.persistence.*;

@Entity
public class Contact {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idContact", nullable = false)
    private int idContact;

    public int getIdContact() {
        return idContact;
    }

    public void setIdContact(int idContact) {
        this.idContact = idContact;
    }
}
