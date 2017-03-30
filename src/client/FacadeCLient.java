package client;

import affichageEcouteur.Controller;

/**
 * classe qui permettra de créer l'interface graphique de l'application
 */
public class FacadeCLient {

    /**
     * Default constructor
     */
    public FacadeCLient() {
    }
    /**
     * initialisation du controller oControl
     */
    public void Initialiser(){
        Controller oControl = new Controller();
    }

}