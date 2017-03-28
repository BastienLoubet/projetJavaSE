package personne;

import java.util.*;

/**
 * 
 */
public class Personne {

    private Nom oNom;
    private Prenom oPrenom;
    private Telephone oTelephone;
    private Adresse oAdresse;
    private emails oEmails;

    /**
     * @param sNom Le nom de la personne
     * @param sPrenom 
     * @param sTelephone 
     * @param sAdresse 
     * @param aEmails Un tableau contenant tous les emails
     */
    public void Personne(String sNom, String sPrenom, String sTelephone, String sAdresse, ArrayList<String> aEmails) {
        oNom = new Nom(sNom);
        oPrenom = new Prenom(sPrenom);
        oTelephone = new Telephone(sTelephone);
        oAdresse = new Adresse(sAdresse);
        oEmails = new Emails(aEmails);
    }

    /**
     * 
     */
    public void Getters...() {
        // TODO implement here
    }

}