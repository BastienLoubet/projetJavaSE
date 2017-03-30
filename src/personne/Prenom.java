package personne;

import java.io.Serializable;


/**
 * Objet pour la gestion des prénoms
 */
public class Prenom implements Serializable{

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