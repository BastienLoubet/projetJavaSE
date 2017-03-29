package affichageEcouteur;

import client.Interactions;
import java.awt.event.ActionEvent;
import personne.FabriquePersonne;

/**
 * 
 */
public class EcouteurBoutonAjouter extends EcouteurBouton {

    /**
     * Default constructor
     */
    public EcouteurBoutonAjouter() {
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        FabriquePersonne oFabrique = new FabriquePersonne();
        if(oFabrique.ajoutPersonne()){
            Interactions.sayInfo("Contact ajoute !");
        }else{
            Interactions.sayError("Echec de l'ajout du contact !");
        }
    }

}