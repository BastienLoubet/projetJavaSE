package affichageEcouteur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * class herite par tout nos ecouteurs de boutons
 */
public abstract class EcouteurBouton implements ActionListener {

    /**
     * Default constructor
     */
    public EcouteurBouton() {
    }

    @Override
    abstract public void actionPerformed(ActionEvent ae);
    

}
