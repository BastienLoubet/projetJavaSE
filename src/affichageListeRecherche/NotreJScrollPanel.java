package affichageListeRecherche;

import affichageEcouteur.EcouteurBoutonRechercher;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import personne.Personne;

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
     * @param oPersonne la personne lier au bouton de recherche
     * @return Le bouton initialiser
     */
    private JButton creerBouton(Personne oPersonne){
        JButton oBouton = new JButton(oPersonne.GetNom()+" "+oPersonne.GetPrenom());
        oBouton.setSize(100, 30);
        oBouton.addActionListener(new EcouteurBoutonResultat(oPersonne));
        return oBouton;
    }

    /**
     * 
     * @param o l'objet Observableliste qui envoi la notification
     * @param o1 le tableau de personne a afficher
     */
    @Override
    public void update(Observable o, Object o1) {
        ArrayList<Personne> aListe = (ArrayList<Personne>) o1;
        JPanel oPanel = new JPanel();
        aListe.forEach((oPersonne) -> {
            oPanel.add(creerBouton(oPersonne));
        });
        this.setViewportView(oPanel);
        
    }

}