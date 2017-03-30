package personne;

import java.io.Serializable;


/**
 * 
 */
public class Prenom implements Serializable{
/**
 * Objet pour la gestion des prénoms
 */
    private String sPrenom;
    
    /**
     * Construit et store le prénom donner
     * @param p le prénom
     */
    public Prenom(String p) {
        sPrenom = p;
    }

    public String getsPrenom() {
        return sPrenom;
    }
}