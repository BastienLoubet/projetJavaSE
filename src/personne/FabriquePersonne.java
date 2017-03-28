package personne;

import java.util.*;
import java.util.regex.Pattern;

/**
 * 
 */
public class FabriquePersonne {

    /**
     * Méthode "Architecte" qui permet l'ajout d'une personne.
     * @return si l'ajout a été validé.
     */
    public Boolean Ajouter() {
        String sNom, sPrenom, sAdresse, sTelephone;
        ArryList<String> aEmails;
        
        
        
    }    
       
    /**
     * Demande et verifie la chaîne de caractères nom.
     * @return retourne la chaîne au format validée.
     */
    public String getNom() {
        String sRes;
        do{
            sRes = client.Interactions.askString("Veuillez entrer un nom : ");
        }while(!testNom(sRes));
        return sRes;
    }

    /**
     * @param sTest pour tester le nom et le prénom.
     * @return vrai ou faux pour alimenter getNom et getPrenom
     */
    private boolean testNom(String sTest){
        if (sTest.length() > 50)
            return false;
        boolean b = Pattern.matches("^[^ ][a-zA-Z '\\-éèêëçäà]*[^ ]$", sTest);        
        return b;
    }
    
    /**
     * Demande et verifie la chaîne de caractères prénom.
     * @return retourne la chaîne au format validée.
     */
    public String getPrenom() {
        String sRes;
        do{
            sRes = client.Interactions.askString("Veuillez entrer un prénom : ");
        }while(!testNom(sRes));
        return sRes;
    }

    /**
     * Demande et vérifie la chaîne de caratères téléphone.
     * @return retourne la chaîne au format (xx-xx-xx-xx-xx) validée .
     */
    public String getTelephone() {
        String sRes;
        do{
            sRes = client.Interactions.askString("Entrez un numéro de téléphone (xx-xx-xx-xx-xx) : ");
        }while(!testTel(sRes));
        return sRes;
    }
    
    /**
     * @param sTest pour tester le téléphone.
     * @return vrai ou faux alimentant getTelephone
     */
    private boolean testTel(String sTest){
        boolean b = Pattern.matches("^[0-9]{2}{[-]?[0-9]{2}){4}$", sTest);
        return b;
    }

    /**
     * Demande et vérifie la chaîne de caratères Adresse.
     * @return retourne la chaîne au format validée.
     */
    public String getAdresse() {
        String sRes;
        do{
            sRes = client.Interactions.askString("Entrez une adresse : ");
        }while(!testAdr(sRes));
        return sRes;
    }
    
    /**
     * @param sTest pour tester l'adresse.
     * @return vrai ou faux alimentant getAdresse
     */
    private boolean testAdr(String sTest){
        boolean b = sTest.length() < 100 ;
        return b;
    }

    /**
     * Demande et vérifie la ou les chaîne(s) de caractères d'adresse e-mail.
     * @return retourne une collection d'adresse e-mail.
     */
    public ArrayList<String> getEmails() {
        String sRes;
        ArrayList<String> aTab = new ArrayList<>();
        do{
            sRes = client.Interactions.askString("Entrez une adresse e-mail valide : ");
            if (testEmail(sRes))
                aTab.add(sRes);
        }while(sRes != null);
        return aTab;
    }

    /**
     * @param sTest pour tester l'e-mail.
     * @return vrai ou faux alimentant getEmails
     */
    private boolean testEmail(String sTest){
        boolean b = Pattern.matches("^[a-zA-Z0-9._-]+@[a-z0-9._-]{2,}\\.[a-z]{2,4}$", sTest);
        return b;
    }
    
}