package recherche;

import java.util.ArrayList;
import personne.Personne;
import personne.ListePersonne;
import affichageEcouteur.EcouteurBoutonRechercher;


/**
 * 
 */
public class StrategieRechercheNom extends StrategieRecherche {
ArrayList<Personne> aPers;
    /**
     * Default constructor
     */
    public StrategieRechercheNom() {
    }

    /**
     * 
     * @param sRecherche
     * @return 
     */
    @Override
    public ArrayList<Personne> rechercher(String sRecherche) {
        
       
            for(int i=0;i<ListePersonne.getInstance().getPersonnes().size();i++)
        {
            if(ListePersonne.getInstance().getPersonnes().get(i).GetNom() == sRecherche)
            {
              aPers.add(ListePersonne.getInstance().getPersonnes().get(i));
            }
            
        }
            return aPers;
    }
    

}