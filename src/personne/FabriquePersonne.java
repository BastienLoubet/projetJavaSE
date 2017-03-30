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
    public Boolean ajoutPersonne() {
        String sNom, sPrenom, sAdresse;
        ArrayList<String> aEmails,aTelephone;
        sNom = getNom();
        if (sNom == null)
            return false;  
        sPrenom = getPrenom();
        if (sPrenom == null)
            return false;
        sAdresse = getAdresse();
        if (sAdresse == null)
            return false;
        //Au moins un numero de telephone
        aTelephone = getTelephone();
        if (aTelephone.isEmpty())
            return false;
        //Au moins un email
        aEmails = getEmails();
        if (aEmails.isEmpty())
            return false;
    Personne oPersonne = new Personne(sNom, sPrenom, aTelephone, sAdresse, aEmails);
    ListePersonne.getInstance().ajouter(oPersonne);
    return true;
    
    
    
    
    
    }    
       
    /**
     * Demande et verifie la chaîne de caractères nom.
     * @return retourne la chaîne au format validée.
     */
    public String getNom() {
        String sRes;
        do{
            sRes = client.Interactions.askString("Veuillez entrer un nom : ");
        }while(!nomCheck(sRes));
        return sRes;
    }

    /**
     * @param sTest pour tester le nom et le prénom.
     * @return vrai ou faux pour alimenter getNom et getPrenom
     */
    boolean nomCheck(String sTest){
        if (sTest == null)
            return true;
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
        }while(!nomCheck(sRes));
        return sRes;
    }

    /**
     * Demande et vérifie la chaîne de caratères téléphone.
     * @return retourne la chaîne au format (xx-xx-xx-xx-xx) validée .
     */
    public ArrayList<String> getTelephone() {
        String sRes;
        ArrayList<String> aTab = new ArrayList<>();
        do{
            sRes = client.Interactions.askString("Entrez un numéro de téléphone valide (xx-xx-xx-xx-xx) : ");
            if (sRes != null && telCheck(sRes))
                aTab.add(sRes);
        }while(sRes != null);
        return aTab;
    }
    
    /**
     * @param sTest pour tester le téléphone.
     * @return vrai ou faux alimentant getTelephone
     */
    boolean telCheck(String sTest){
        if (sTest == null)
            return true;        
        boolean b = Pattern.matches("^[0-9]{2}([- ]?[0-9]{2}){4}$", sTest);
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
        }while(!adrCheck(sRes));
        return sRes;
    }
    
    /**
     * @param sTest pour tester l'adresse.
     * @return vrai ou faux alimentant getAdresse
     */
    boolean adrCheck(String sTest){
        if (sTest == null)
            return true;
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
            if (sRes != null && emailCheck(sRes))
                aTab.add(sRes);
        }while(sRes != null);
        return aTab;
    }

    /**
     * @param sTest pour tester l'e-mail.
     * @return vrai ou faux alimentant getEmails
     */
    boolean emailCheck(String sTest){
        boolean b = Pattern.matches("^[a-zA-Z0-9._-]+@[a-z0-9._-]{2,}\\.[a-z]{2,4}$", sTest);
        return b;
    }
    
}