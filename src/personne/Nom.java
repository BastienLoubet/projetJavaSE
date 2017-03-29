package personne;

import java.io.Serializable;



/**
 * 
 */
public class Nom implements Serializable{
private String sNom;
    
    /**
     * Construit et store le nom donner
     * @param n le nom
     */
    public Nom(String n) {
        sNom = n;
    }

    public String getsNom() {
        return sNom;
    }
}