/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personne;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Garry
 */
public class FabriquePersonneTest {

    /**
     * Test of nomCheck method, of class FabriquePersonne.
     */
    @Test
    public void testNomCheck() {
        System.out.println("test NomCheck");
        
        FabriquePersonne oFabrique = new FabriquePersonne();
        boolean b;
        // Chaîne de caractères valide
        b = oFabrique.nomCheck("Bobby");
        assertTrue(b);
        // Chiffres sont non autorisés
        b = oFabrique.nomCheck("121431251");
        assertFalse(b);
        // 50 caractères -> c'est valide
        b = oFabrique.nomCheck("abcdefghijabcdefghijabcdefghijabcdefghijabcdefghij");
        assertTrue(b);
        // 51 caractères -> non valide
        b = oFabrique.nomCheck("Aabcdefghijabcdefghijabcdefghijabcdefghijabcdefghij");
        assertFalse(b);
    }

    /**
     * Test of telCheck method, of class FabriquePersonne.
     */
    @Test
    public void testTelCheck() {
        System.out.println("test TelCheck");
        
        FabriquePersonne oFabrique = new FabriquePersonne();
        boolean b;
        // Chaîne demandée et validée
        b = oFabrique.telCheck("01-02-03-04-05");
        assertTrue(b);
        // 12 chiffres -> non valide
        b = oFabrique.telCheck("01-02-03-04-05-06");
        assertFalse(b);
        // 8 chiffres -> non valide
        b = oFabrique.telCheck("01-02-03-04");
        assertFalse(b);
        // Le point est non validé
        b = oFabrique.telCheck("01.02-03-04-05");
        assertFalse(b);
    }

    /**
     * Test of adrCheck method, of class FabriquePersonne.
     */
    @Test
    public void testAdrCheck() {
        System.out.println("test AdrCheck");
        
        FabriquePersonne oFabrique = new FabriquePersonne();
        boolean b;
        // Chaîne de caractères valide
        b = oFabrique.adrCheck("100, Avenue d'ailleurs 31000 Toulouse");
        assertTrue(b);
        // 100 caractères -> non validé
        b = oFabrique.adrCheck("abcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghij");
        assertFalse(b);
        // 99 caractères -> validé
        b = oFabrique.adrCheck("abcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghijabcdefghi");
        assertTrue(b);
    }

    /**
     * Test of emailCheck method, of class FabriquePersonne.
     */
    @Test
    public void testEmailCheck() {        
        System.out.println("test AdrCheck");
        
        FabriquePersonne oFabrique = new FabriquePersonne();
        boolean b;
        // Chaîne de caractères valide
        b = oFabrique.emailCheck("monsieurmail@boom.fr");
        assertTrue(b);
        // Autre que @ non validé
        b = oFabrique.emailCheck("monsieurmail&boom.fr");
        assertFalse(b);
        // Extension nom de domaine 5 caratères -> non valide
        b = oFabrique.emailCheck("monsieurmail@boom.world");
        assertFalse(b);
    }

}
