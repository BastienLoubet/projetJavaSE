package affichageEcouteur;

import baseDeDonnees.Sauvegarde;
import client.Interactions;
import java.awt.event.ActionEvent;
import personne.ListePersonne;

/**
 * Ecouteur du bouton Sauvegarder
 */
public class EcouteurBoutonSauvegarder extends EcouteurBouton {

    /**
     * methode appelée lors du clique du bouton Sauvegarder
     * @param ae 
     */
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