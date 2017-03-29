package recherche;

import java.util.*;
import personne.Personne;

/**
 * 
 */
public abstract class StrategieRecherche {

    /**
     * Default constructor
     */
    public StrategieRecherche() {
    }


    /**
     * @param sRecherche
     * @return 
     */
    public abstract ArrayList<Personne> rechercher(String sRecherche);

}