package affichageEcouteur;

import affichageListeRecherche.ObservableListe;
import client.Interactions;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import personne.Personne;
import recherche.StrategieRechercheNom;

/**
 * Ecouteur bouton Rechercher
 */
public class EcouteurBoutonRechercher extends EcouteurBouton {

    /**
     * Default constructor
     */
    public EcouteurBoutonRechercher() {
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String sRecherche;
        StrategieRechercheNom oRecherche;
        ArrayList<Personne> aResultat;
        sRecherche = Interactions.askString("Entrez votre paramètre de recherche ");
        oRecherche = new StrategieRechercheNom();
        aResultat = oRecherche.rechercher(sRecherche);
        ObservableListe.getInstance().mettreAJour(aResultat);
    }

}
