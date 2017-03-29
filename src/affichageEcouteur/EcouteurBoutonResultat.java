package affichageEcouteur;

import affichageInfo.ObservablePersonne;
import java.awt.event.ActionEvent;
import java.util.*;
import personne.Personne;

/**
 * 
 */
public class EcouteurBoutonResultat extends EcouteurBouton {

    
    private Personne oPersonne;
    
    /**
     * Construit et sauvegarde la personne cible du bouton
     */
    public EcouteurBoutonResultat(Personne oPersonne) {
        this.oPersonne = oPersonne;
    }

    /**
     * On met a jour l'ObservablePersonne pour l'affichage dans la fenetre d'information
     * @param ae 
     */
    @Override
    public void actionPerformed(ActionEvent ae) {
        ObservablePersonne.getInstance().mettreAJour(oPersonne);
    }

}