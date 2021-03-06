package personne;

import java.io.Serializable;
import java.util.*;

/**
 * Stocke la liste des contacts sous forme d'objets Personne
 */
public class ListePersonne implements Serializable{

    /**
 * Objet pour la gestion de l liste de personne
 */
    private ArrayList<Personne> aPersonnes;
    private static ListePersonne oInstance;

    
    /**
     * Constructeur par defaut initialise aPersonnes
     */
    private ListePersonne(){
        aPersonnes = new ArrayList<Personne>();
    }
    
    
    /**
     * 
     * @return retourne la liste des personnes
     */
    public ArrayList<Personne> getPersonnes() {
        return aPersonnes;
    }

    /**
     * 
     * @param oPersonne l'objet personne a rajouter a la liste
     */
    public void ajouter(Personne oPersonne){
        aPersonnes.add(oPersonne);
    }
    
    
    /**
     * Pour l'implementation du singleton
     * @return l'instance du singleton
     */
    public static ListePersonne getInstance() {
        if(oInstance == null){
            oInstance = new ListePersonne();
        }
        return oInstance;
    }

    /**
     * 
     * @param o la nouvelle instance, pour le chargement
     */
    public static void setInstance(ListePersonne o){
        oInstance =o;
    }
    
}