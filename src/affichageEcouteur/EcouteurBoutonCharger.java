package affichageEcouteur;

import baseDeDonnees.Chargement;
import client.Interactions;
import java.awt.event.ActionEvent;
import java.util.*;
import personne.ListePersonne;

/**
 * 
 */
public class EcouteurBoutonCharger extends EcouteurBouton {

    /**
     * Default constructor
     */
    public EcouteurBoutonCharger() {
    }

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