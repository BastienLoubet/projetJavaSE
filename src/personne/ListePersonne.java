package personne;

import java.util.*;

/**
 * 
 */
public class ListePersonne {

    /**
     * 
     */
    private ArrayList<Personne> aPersonnes;
    private transient static ListePersonne oInstance;

    
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
    public void add(Personne oPersonne){
        aPersonnes.add(oPersonne);
    }
    
    
    /**
     * Pour l'implementation du singleton
     * @return l'instance du singleton
     */
    public ListePersonne getInstance() {
        if(oInstance == null){
            oInstance = new ListePersonne();
        }
        return oInstance;
    }

    /**
     * 
     * @param o la nouvelle instance, pour le chargement
     */
    public void setInstance(ListePersonne o){
        oInstance =o;
    }
    
}