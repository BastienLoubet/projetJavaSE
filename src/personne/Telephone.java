package personne;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Stocke le ou les numeros de telephones
 */
public class Telephone implements Serializable {

    /**
     * Objet pour la gestion de la liste des numéros de téléphone
     */
    private ArrayList<String> aNumTel;

    public ArrayList<String> getsNumTel() {
        return aNumTel;
    }

    /**
     * Constructeur
     *
     * @param a liste des emails
     */
    public Telephone(ArrayList<String> a) {
        aNumTel = a;
    }

    public ArrayList<String> getaEmails() {
        return aNumTel;
    }
}
