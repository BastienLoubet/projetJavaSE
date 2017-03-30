package affichageEcouteur;

import affichageInfo.NotreJpanelInfo;
import affichageListeRecherche.NotreJScrollPanel;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.Box;
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
        //Pour l'initialisation de l'affichage de toutes les Panels
        oFramePrincipal.setVisible(true);
    }
    
    /**
     * Initialise la fenetre principale en grille de 1 ligne et 3 colonnes.
     */
    private void initFramePrincipal() {
        oFramePrincipal = new JFrame("Carnet d'adresses");
        oFramePrincipal.setSize(840, 480);
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
        oButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        oPanelMenu.add(oButton);
        //Pour ajouter un espace entre les boutons
        oPanelMenu.add(Box.createRigidArea(new Dimension(5,5)));
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
        oPanelInfo.setLayout(new BoxLayout(oPanelInfo, BoxLayout.Y_AXIS));
        oFramePrincipal.add(oPanelInfo);
    }

    /**
     *
     * @return le bouton Ajouter pour l'ajout de l'ecouteur
     */
    public JButton getBoutonAjouter() {
        return oBoutonAjouter;
    }
    
    /**
     *
     * @return le bouton Charger pour l'ajout de l'ecouteur
     */
    public JButton getBoutonCharger() {
        return oBoutonCharger;
    }
    
    /**
     *
     * @return le bouton Rechercher pour l'ajout de l'ecouteur
     */
    public JButton getBoutonRechercher() {
        return oBoutonRechercher;
    }

    /**
     *
     * @return le bouton Sauvegarder pour l'ajout de l'ecouteur
     */
    public JButton getBoutonSauvegarder() {
        return oBoutonSauvegarder;
    }

    /**
     *
     * @return le JScrollPane pour l'ajout de l'ecouteur
     */
    public NotreJScrollPanel getPaneRecherche() {
        return oPaneRecherche;
    }

    /**
     *
     * @return le JPanel pour l'ajout de l'ecouteur
     */
    public NotreJpanelInfo getPanelInfo() {
        return oPanelInfo;
    }
    
    
    
}