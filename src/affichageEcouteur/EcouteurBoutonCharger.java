package affichageEcouteur;

import baseDeDonnees.Chargement;
import client.Interactions;
import java.awt.event.ActionEvent;
import personne.ListePersonne;

/**
 * 
 */
public class EcouteurBoutonCharger extends EcouteurBouton {

    /**
     * methode appelée lors du clique du bouton Charger
     * @param ae 
     */
    @Override
    public void actionPerformed(ActionEvent ae) {
        Chargement oCharge = new Chargement();
        ListePersonne oRes = oCharge.charger();
        if(oRes != null){
            ListePersonne.setInstance(oRes);
            Interactions.sayInfo("Objet charge !");
        }else{
            Interactions.sayError("Impossible de charger le fichier !");
        }
                        
    }


}