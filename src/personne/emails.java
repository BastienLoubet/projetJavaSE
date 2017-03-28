package personne;

import java.util.*;

/**
 * 
 */
public class Emails {
    
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