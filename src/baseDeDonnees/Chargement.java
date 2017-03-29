package baseDeDonnees;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import personne.ListePersonne;

/**
 * 
 */
public class Chargement {

    /**
     * Methode de chargement de la liste personne, utilise le nom du fichier de Sauvegarde.NOM_FICHIER
     * @return 
     */
    public ListePersonne charger() {
        try {
            File oFile = new File(Sauvegarde.NOM_FICHIER);
            if (oFile.exists()) {
                ObjectInputStream oIn = new ObjectInputStream(new FileInputStream(oFile.getCanonicalPath()));
                ListePersonne oRes = (ListePersonne) oIn.readObject();
                return oRes;
            }
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Chargement.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}