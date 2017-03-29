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
        /**
     * on supprime les anciens labels affiché pour re affiché les nouveaux 
     */
        this.removeAll();
        /**
     * affichage des données relativent au nom
     */
        this.add(new JLabel("Nom : "+oPersonne.GetNom()));
        /**
     * affichage des données relativent au prénom
     */
        this.add(new JLabel("Prénom : "+oPersonne.GetPrenom()));
           /**
     * affichage des données relativent à l'adresse
     */
        this.add(new JLabel("Adresse : "+oPersonne.GetAdresse()));
           /**
     * incrémentation d'un compteur et affichage des données relativent au mail
     */
        ArrayList<String> email = oPersonne.GetMail();
        int i =1;
        for (String mail : email) {
                this.add(new JLabel("Adresse eMail" +" " + i+ " " + mail));
                i++;
            }
        /**
     * incrémentation d'un compteur et affichage des données relativent au téléphone
     */
        i=1;
        ArrayList<String> aNumTel = oPersonne.GetTelephone();
        for (String num : aNumTel) {
                this.add(new JLabel("Numéro de téléphone" +" " + i+ " " + num));
                i++;
            }
        this.updateUI();
        
    }

}