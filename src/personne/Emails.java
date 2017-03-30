package personne;

import java.io.Serializable;
import java.util.*;

/**
 * Stocke la ou les adresse emails du contact
 */
public class Emails implements Serializable{
    /**
 * Objet pour la gestion des mails
 */
    private ArrayList<String> aEmails;

    /**
     * Constructeur 
     * @param a liste des emails
     */
    public Emails(ArrayList<String> a) {
        aEmails=a;
    }
    /**
     * @return le arraylist d'email
     */
    public ArrayList<String> getaEmails(){
        return aEmails;
    }

}