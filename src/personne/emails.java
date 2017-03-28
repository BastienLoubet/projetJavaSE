package personne;

import java.util.*;

/**
 * 
 */
public class emails {
    
    private ArrayList<String> aEmails;

    /**
     * Constructeur 
     * @param a liste des emails
     */
    public emails(ArrayList<String> a) {
        aEmails=a;
    }
    
    public ArrayList<String> getaEmails(){
        return aEmails;
    }

}