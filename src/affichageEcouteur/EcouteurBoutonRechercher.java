package affichageEcouteur;

import client.Interactions;
import java.awt.event.ActionEvent;

/**
 * 
 */
public class EcouteurBoutonRechercher extends EcouteurBouton {

    /**
     * Default constructor
     */
    public EcouteurBoutonRechercher() {
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
    Interactions.askString("Entrez votre paramètre de recherche ");
    }

    

}