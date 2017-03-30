package recherche;

import java.util.*;
import personne.Personne;

/**
 * La classe d'on herite toute les strategies de recherches
 */
public abstract class StrategieRecherche {

    /**
     * Default constructor
     */
    public StrategieRecherche() {
    }


    /**
     * @param sRecherche
     * @return ArrayList La liste de personne verifiant le critere de recherche
     * serra redéfinie dans la classe fille
     */
    public abstract ArrayList<Personne> rechercher(String sRecherche);

}