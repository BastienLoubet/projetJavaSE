package affichageListeRecherche;

import java.util.Observable;
import java.util.Observer;
import javax.swing.JScrollPane;

/**
 * 
 */
public class NotreJScrollPanel extends JScrollPane implements Observer {

    /**
     * Default constructor
     */
    public NotreJScrollPanel() {
        super();
    }


    /**
     * 
     * @param o
     * @param o1 
     */
    @Override
    public void update(Observable o, Object o1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}