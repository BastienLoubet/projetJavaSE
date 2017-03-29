package personne;

import java.io.Serializable;
import java.util.*;

/**
 * 
 */
public class Emails implements Serializable{
    
    private ArrayList<String> aEmails;

    /**
     * Constructeur 
     * @param a liste des emails
     */
    public Emails(ArrayList<String> a) {
        aEmails=a;
    }
    
    public ArrayList<String> getaEmails(){
        return aEmails;
    }

}