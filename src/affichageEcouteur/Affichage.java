package affichageEcouteur;

import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *  Initialise l'affichage par son constructeur.
 */
public class Affichage {

    private JFrame oFramePrincipal;
    private JPanel oPanelMenu;
    private JButton oBoutonAjouter;
    private JButton oBoutonRechercher;
    private JButton oBoutonSauvegarder;
    private JButton oBoutonCharger;

    /**
     * initialise tout les elements d'affichages
     */
    public Affichage() {
        initFramePrincipal();
        initPanelMenu();
        initBoutonsMenu();
    }
    
    private void initFramePrincipal() {
        oFramePrincipal = new JFrame("Carnet d'adresses");
        oFramePrincipal.setVisible(true);
        oFramePrincipal.setSize(640, 480);
        oFramePrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        oFramePrincipal.setLayout(new GridLayout(1,3));
    }
    
    
    private void initPanelMenu(){
        oPanelMenu = new JPanel();
        oPanelMenu.setLayout(new BoxLayout(oPanelMenu, BoxLayout.Y_AXIS));
        oFramePrincipal.add(oPanelMenu);
    }

    private JButton initButtonMenu(String sMes){
        JButton oButton = new JButton(sMes);
        oButton.setSize(100, 30);
        oPanelMenu.add(oButton);
        return oButton;
    }
    
    private void initBoutonsMenu() {
        oBoutonAjouter = initButtonMenu("Ajouter");
        oBoutonRechercher = initButtonMenu("Rechercher");
        oBoutonCharger = initButtonMenu("Charger");
        oBoutonSauvegarder = initButtonMenu("Sauvegarder");
    }
    
}