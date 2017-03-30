package personne;

import java.io.Serializable;


public class Adresse implements Serializable{
/**
 * Objet pour la gestion des adresses
 */
    private String sAdresse;
    
    /**
     * Construit et store l'adresse donner
     * @param s l'adresse
     */
    public Adresse(String s) {
        sAdresse = s;
    }

    /**
     * @return l'adresse
     */
    public String getsAdresse() {
        return sAdresse;
    }

}