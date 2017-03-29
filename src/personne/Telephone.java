package personne;

import java.io.Serializable;
import java.util.ArrayList;


/**
 * 
 */
public class Telephone implements Serializable{
private ArrayList<String> aNumTel;
    

    public ArrayList<String> getsNumTel() {
        return aNumTel;
    }

    /**
     * Constructeur 
     * @param a liste des emails
     */
    public Telephone(ArrayList<String> a) {
        aNumTel=a;
    }
    
    public ArrayList<String> getaEmails(){
        return aNumTel;
    }
}