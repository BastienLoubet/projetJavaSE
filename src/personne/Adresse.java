package personne;

import java.io.Serializable;

/**
 * Objet pour la gestion des adresses
 */
public class Adresse implements Serializable{

    private String sAdresse;
    
    /**
     * Construit et store l'adresse donner
     * @param s l'adresse
     */
    public Adresse(String s) {
        sAdresse = s;
    }

    public String getsAdresse() {
        return sAdresse;
    }

}