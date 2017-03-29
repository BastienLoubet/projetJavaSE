package personne;

import java.io.Serializable;
import java.util.*;

/**
 * 
 */
public class Personne implements Serializable{

    private Nom oNom;
    private Prenom oPrenom;
    private Telephone oTelephone;
    private Adresse oAdresse;
    private Emails oEmails;

    /**
     * @param sNom Le nom de la personne
     * @param sPrenom 
     * @param sTelephone 
     * @param sAdresse 
     * @param aEmails Un tableau contenant tous les emails
     */
    public Personne(String sNom, String sPrenom, String sTelephone, String sAdresse, ArrayList<String> aEmails) {
        oNom = new Nom(sNom);
        oPrenom = new Prenom(sPrenom);
        oTelephone = new Telephone(sTelephone);
        oAdresse = new Adresse(sAdresse);
        oEmails = new Emails(aEmails);
    }

    /**
     * retourne le nom
     * @return 
     */
    public String GetNom() {
         return oNom.getsNom();
    }
     /**
     * retourne le prénom
     */
     public String GetPrenom() {
         return oPrenom.getsPrenom();
    }
      /**
     * retourne le Num de tel
     */
      public String GetTelephone() {
         return oTelephone.getsNumTel();
    }
       /**
     * retourne l'adresse
     */
     public String GetAdresse() {
         return  oAdresse.getsAdresse();
    }

}