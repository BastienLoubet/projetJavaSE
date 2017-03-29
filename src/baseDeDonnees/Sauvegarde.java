package baseDeDonnees;

import client.Interactions;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import personne.ListePersonne;

/**
 * 
 */
public class Sauvegarde {

    public static final String SAVE_FILE=".\\carnet.save" ;
    
    /**
     * Sauvegarder l'objet dans le fichier donner par la constante SAVE_FILE
     * @param oSave l'objet a sauvegarder
     * @return true si la sauvegarde a reusssi, false si une exception a ete leve
     */
    public boolean sauvegarder(ListePersonne oSave) {
        try {
            ObjectOutputStream oOut = new ObjectOutputStream(new FileOutputStream(SAVE_FILE));
            oOut.writeObject(oSave);
            return true;
        } catch (IOException ex) {
            Logger.getLogger(Sauvegarde.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

}