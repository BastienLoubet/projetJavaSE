package affichageEcouteur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
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
