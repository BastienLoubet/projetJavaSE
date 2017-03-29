package affichageInfo;


import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JLabel;
import javax.swing.JPanel;
import personne.Personne;
import java.lang.String;

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
        this.add(new JLabel("Nom : "+oPersonne.GetNom()));
        this.add(new JLabel("Prénom : "+oPersonne.GetPrenom()));
        this.add(new JLabel("Adresse : "+oPersonne.GetAdresse()));
        ArrayList<String> email = oPersonne.GetMail();
        int i =1;
        for (String mail : email) {
                this.add(new JLabel("Adresse eMail" +" " + i+ " " + mail));
                i++;
            }
        ArrayList<String> aNumTel = oPersonne.GetTelephone()
        for (String num : aNumTel) {
                this.add(new JLabel("Numéro de téléphone" +" " + i+ " " + num));
                i++;
            }
        this.updateUI();
        
    }

}