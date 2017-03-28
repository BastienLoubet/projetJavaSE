package client;

import javax.swing.JOptionPane;

/**
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

}