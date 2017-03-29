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
        b = oFabrique.nomCheck("Bobby");
        assertTrue(b);
        b = oFabrique.nomCheck("121431251");
        assertFalse(b);
        b = oFabrique.nomCheck("abcdefghijabcdefghijabcdefghijabcdefghijabcdefghij");
        assertTrue(b);
        b = oFabrique.nomCheck("Aabcdefghijabcdefghijabcdefghijabcdefghijabcdefghij");
        assertFalse(b);
    }

    /**
     * Test of telCheck method, of class FabriquePersonne.
     */
    @Test
    public void testTelCheck() {
    }

    /**
     * Test of adrCheck method, of class FabriquePersonne.
     */
    @Test
    public void testAdrCheck() {
    }

    /**
     * Test of emailCheck method, of class FabriquePersonne.
     */
    @Test
    public void testEmailCheck() {
    }

}
