package personne;



/**
 * 
 */
public class Nom {
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