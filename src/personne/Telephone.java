package personne;


/**
 * 
 */
public class Telephone {
private String sNumTel;
    
    /**
     * Construit et store le num de tel donner
     * @param t le num de tel 
     */
    public Telephone(String t) {
        sNumTel = t;
    }

    public String getsNumTel() {
        return sNumTel;
    }

}