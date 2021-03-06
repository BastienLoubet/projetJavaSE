package affichageInfo;

import java.util.*;
import personne.Personne;

/**
 * classe qui va observer un objet personne
 */
public class ObservablePersonne extends Observable {

    
    private static ObservablePersonne oInstance;
    private Personne oPersonne;
    
    /**
     * Default constructor
     */
    private ObservablePersonne() {
    }
    

    /**
     * 
     * @return l'instance du singleton ou cree l'instance si elle n'existe pas
     */
    public static ObservablePersonne getInstance() {
        if (oInstance == null){
            oInstance = new ObservablePersonne();
        }
        return oInstance;
    }

    /**
     * @param oPersonne l'objet personne a sauvegarder
     */
    public void mettreAJour(Personne oPersonne) {
        this.oPersonne = oPersonne;
        this.setChanged();
        this.notifyObservers();
    }
    /**
     * @return  l'instance de la classe personne
     */
    public Personne getPersonne() {
        return oPersonne;
    }
}