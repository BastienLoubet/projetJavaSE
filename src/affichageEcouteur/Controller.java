package affichageEcouteur;

import affichageInfo.ObservablePersonne;
import affichageListeRecherche.ObservableListe;

/**
 * Classe utiliser pour initialiser l'affichage et lier les ecouteurs sur les boutons d'origines
 * et l'affichage.
 */
public class Controller {

    /**
     * Default constructor
     */
    public Controller() {
        Affichage oAffichage = new Affichage();
        //On lie Les boutons du menu a leur Ecouteur respectif
        oAffichage.getBoutonAjouter().addActionListener(new EcouteurBoutonAjouter());
        oAffichage.getBoutonRechercher().addActionListener(new EcouteurBoutonRechercher());
        oAffichage.getBoutonCharger().addActionListener(new EcouteurBoutonCharger());
        oAffichage.getBoutonSauvegarder().addActionListener(new EcouteurBoutonSauvegarder());
        //Pour l'actualisation de l'affichage
        ObservableListe.getInstance().addObserver(oAffichage.getPaneRecherche());
        ObservablePersonne.getInstance().addObserver(oAffichage.getPanelInfo());
    }

}