package affichageEcouteur;

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
     * 
     * @param ae 
     */
    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}