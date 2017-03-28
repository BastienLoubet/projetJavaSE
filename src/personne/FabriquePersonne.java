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
     * Demande et verifie la chaîne de caractères nom.
     */
    public String getNom() {
        String sRes;
        do{
            sRes = client.Interactions.askString("Veuillez entrer un nom : ");
        }while(!testNom(sRes));
        return sRes;
    }

    /**
     * @param sTest pour tester le nom.
     * @return 
     */
    private boolean testNom(String sTest){
        boolean b = Pattern.matches("[a-zA-Z]*-?[a-zA-Z]*", "sTest");
        return b;
    }
    
    /**
     * Demande et verifie la chaîne de caractères prénom.
     * @return
     */
    public String getPrenom() {
        String sRes;
        do{
            sRes = client.Interactions.askString("Veuillez entrer un prénom : ");
        }while(!testPrenom(sRes));
        return sRes;
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