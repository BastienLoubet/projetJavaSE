package recherche;

import java.util.ArrayList;
import personne.Personne;
import personne.ListePersonne;
import client.Interactions;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 *
 */
public class StrategieRechercheNom extends StrategieRecherche {

    /**
     * Default constructor
     */
    public StrategieRechercheNom() {
    }

    /**
     *
     * @param sRecherche
     * @return
     */
    @Override
    public ArrayList<Personne> rechercher(String sRecherche) {

        ArrayList<Personne> aPers, aListePleine;
        aPers = new ArrayList<Personne>();
        aListePleine = ListePersonne.getInstance().getPersonnes();
        try {
            for (Personne oPersonne : aListePleine) {
                if (Pattern.matches("^" + sRecherche + "$", oPersonne.GetNom())) {
                    aPers.add(oPersonne);
                }
            }
        } catch (PatternSyntaxException e) {
            Interactions.sayError(sRecherche+" est un regex non reconnu !");
        }

        return aPers;
    }

}
