package personne;


/**
 * 
 */
public class Prenom {

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