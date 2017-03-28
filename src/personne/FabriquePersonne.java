package personne;

import java.util.*;
import java.util.regex.Pattern;

/**
 * 
 */
public class FabriquePersonne {

    /**
     * Default constructor
     */
    public FabriquePersonne() {
    }

    
    
       
    /**
     * Demande et verifie le nom entre
     */
    public String getNom() {
        String sRes;
        do{
            sRes = client.Interactions.askString("Veuillez entrer un nom:");
        }while(!testNom(sRes));
        return sRes;
    }

    /**
     * 
     * @param sTest
     * @return 
     */
    private boolean testNom(String sTest){
        Pattern.matches("pattern", sTest);
        return false;
    }
    
    /**
     * 
     */
    public void getPrenom:String() {
        // TODO implement here
    }

    /**
     * 
     */
    public void getTelephone:String() {
        // TODO implement here
    }

    /**
     * 
     */
    public void getAdresse:String() {
        // TODO implement here
    }

    /**
     * 
     */
    public void getEmails:ArrayList<String>() {
        // TODO implement here
    }

}