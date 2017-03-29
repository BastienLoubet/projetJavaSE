package affichageListeRecherche;

import java.util.*;
import personne.Personne;

/**
 * 
 */
public class ObservableListe extends Observable {

    
    private ArrayList<Personne> aPersonne;
    private static ObservableListe oInstance;
    
    
    /**
     * Default constructor
     */
    public ObservableListe() {
        aPersonne = new ArrayList<>();
    }

    /**
     * Pour l'implementation du singleton
     * @return l'instance du singleton
     */
    public static ObservableListe getInstance() {
        if(oInstance == null){
            oInstance = new ObservableListe();
        }
        return oInstance;
    }

    /**
     * @param aPersonnes
     */
    public void mettreAJour(ArrayList<Personne> aPersonnes) {
        aPersonne = aPersonnes;
        this.setChanged();
        this.notifyObservers(aPersonne);
    }

}