package tn.teams.lmselearning.entites;

import java.io.Serializable;

public class UsercontactPK implements Serializable {
    private int idUser;
    private int idContact;

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdContact() {
        return idContact;
    }

    public void setIdContact(int idContact) {
        this.idContact = idContact;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UsercontactPK that = (UsercontactPK) o;

        if (idUser != that.idUser) return false;
        if (idContact != that.idContact) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idUser;
        result = 31 * result + idContact;
        return result;
    }
}
