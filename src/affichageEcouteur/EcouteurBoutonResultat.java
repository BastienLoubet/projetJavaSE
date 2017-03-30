package affichageEcouteur;

import affichageInfo.ObservablePersonne;
import java.awt.event.ActionEvent;
import personne.Personne;

/**
 * Ecouteur des boutons d'affichage des details de la personne
 * Mets a jour ObservablePersonne
 */
public class EcouteurBoutonResultat extends EcouteurBouton {

    
    private Personne oPersonne;
    
    /**
     * Construit et sauvegarde la personne cible du bouton
     * @param oPersonne la personne correspondant au bouton
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