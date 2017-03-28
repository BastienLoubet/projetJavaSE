package affichageEcouteur;

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
        oFabrique.ajouter();
    }

}