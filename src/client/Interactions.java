package client;

import javax.swing.JOptionPane;

/**
 * classe statique pour les fenetres d'interactions avec l'utilisateur
 */
public abstract class Interactions {

    /**
     * @param  sQuestion Le message de la question
     * @return La chaine de charactere entre par l'utilisateur
     */
    public static String askString(String  sQuestion) {
        return JOptionPane.showInputDialog(sQuestion);
    }

    /**
     * Affiche un message dans la console et dans une fenetre d'erreur pour l'utilisateur
     * @param sMessage le message a afficher
     */
    public static void sayError(String sMessage) {
        System.out.println(sMessage);
        JOptionPane.showMessageDialog(null,sMessage,"Erreur !", JOptionPane.ERROR_MESSAGE);
    }
    
    /**
     * Affiche un message dans la console et dans une fenetre d'information pour l'utilisateur
     * @param sMessage le message a afficher
     */
    public static void sayInfo(String sMessage) {
        System.out.println(sMessage);
        JOptionPane.showMessageDialog(null,sMessage,"Information", JOptionPane.INFORMATION_MESSAGE);
    }

}