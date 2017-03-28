package affichageEcouteur;

import affichageInfo.NotreJpanelInfo;
import affichageListeRecherche.NotreJScrollPanel;
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
    
    private NotreJScrollPanel oPaneRecherche;
    
    private NotreJpanelInfo oPanelInfo;

    /**
     * initialise tout les elements d'affichages
     */
    public Affichage() {
        initFramePrincipal();
        initPanelMenu();
        initPanelRecherche();
        initPanelInfo();
    }
    
    /**
     * Initialise la fenetre principale en grille de 1 ligne et 3 colonnes.
     */
    private void initFramePrincipal() {
        oFramePrincipal = new JFrame("Carnet d'adresses");
        oFramePrincipal.setVisible(true);
        oFramePrincipal.setSize(640, 480);
        oFramePrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        oFramePrincipal.setLayout(new GridLayout(1,3));
    }
    
    /**
     * initialise le panel des menus et ses boutons
     */
    private void initPanelMenu(){
        oPanelMenu = new JPanel();
        oPanelMenu.setLayout(new BoxLayout(oPanelMenu, BoxLayout.Y_AXIS));
        initBoutonsMenu();
        oFramePrincipal.add(oPanelMenu);
    }

    /**
     * Utiliser pour initialiser les boutons du menu
     * @param sMes le texte du bouton
     * @return l'objet bouton initialise
     */
    private JButton initButtonMenu(String sMes){
        JButton oButton = new JButton(sMes);
        oButton.setSize(100, 30);
        oPanelMenu.add(oButton);
        return oButton;
    }
    
    /**
     * Initialise les boutons du menu
     */
    private void initBoutonsMenu() {
        oBoutonAjouter = initButtonMenu("Ajouter");
        oBoutonRechercher = initButtonMenu("Rechercher");
        oBoutonCharger = initButtonMenu("Charger");
        oBoutonSauvegarder = initButtonMenu("Sauvegarder");
    }
    
    /**
     * Initialise le panneau de resultats de recherche
     */
    private void initPanelRecherche(){
        oPaneRecherche = new NotreJScrollPanel();
        oFramePrincipal.add(oPaneRecherche);
    }
    
    /**
     * Initialise le panneau d'affihcage d'information des personnes
     */
    private void initPanelInfo(){
        oPanelInfo = new NotreJpanelInfo();
        oFramePrincipal.add(oPanelInfo);
    }

    JButton getBoutonAjouter() {
        return oBoutonAjouter;
    }
    
    JButton getBoutonCharger() {
        return oBoutonCharger;
    }
    
    JButton getBoutonRechercher() {
        return oBoutonRechercher;
    }

    JButton getBoutonSauvegarder() {
        return oBoutonSauvegarder;
    }
    
}