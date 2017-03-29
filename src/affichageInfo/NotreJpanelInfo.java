package affichageInfo;


import java.util.Observable;
import java.util.Observer;
import javax.swing.JLabel;
import javax.swing.JPanel;
import personne.Personne;

/**
 * 
 */
public class NotreJpanelInfo extends JPanel implements Observer {

    /**
     * Default constructor
     */
    public NotreJpanelInfo() {
        super();
    }

    @Override
    public void update(Observable o, Object o1) {
        Personne oPersonne;
        ObservablePersonne oObservable = (ObservablePersonne) o;
        oPersonne = oObservable.getPersonne();
        this.removeAll();
        this.add(new JLabel("Nom et prenom : "+oPersonne.GetNom()+" "+oPersonne.GetPrenom()));
        this.add(new JLabel("Adresse : "+oPersonne.GetAdresse()));
        this.updateUI();
        
    }

}