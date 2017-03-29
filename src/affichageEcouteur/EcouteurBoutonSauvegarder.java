package affichageEcouteur;

import baseDeDonnees.Sauvegarde;
import client.Interactions;
import java.awt.event.ActionEvent;
import java.util.*;
import personne.ListePersonne;

/**
 * 
 */
public class EcouteurBoutonSauvegarder extends EcouteurBouton {

    /**
     * Default constructor
     */
    public EcouteurBoutonSauvegarder() {
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Sauvegarde oSave = new Sauvegarde();
        if(oSave.sauvegarder(ListePersonne.getInstance())){
            Interactions.sayInfo("Carnet sauvegarde !");
        }else{
            Interactions.sayError("Erreur lors de la sauvegarde du fichier !");
        }
    }


}