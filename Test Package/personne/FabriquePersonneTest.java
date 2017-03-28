/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personne;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Garry
 */
public class FabriquePersonneTest {
    
    public FabriquePersonneTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getNom method, of class FabriquePersonne.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        FabriquePersonne instance = new FabriquePersonne();
        instance.getNom();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of String method, of class FabriquePersonne.
     */
    @Test
    public void testString() {
        System.out.println("String");
        FabriquePersonne instance = new FabriquePersonne();
        instance.String();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrenom method, of class FabriquePersonne.
     */
    @Test
    public void testGetPrenom() {
        System.out.println("getPrenom");
        FabriquePersonne instance = new FabriquePersonne();
        instance.getPrenom();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTelephone method, of class FabriquePersonne.
     */
    @Test
    public void testGetTelephone() {
        System.out.println("getTelephone");
        FabriquePersonne instance = new FabriquePersonne();
        instance.getTelephone();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAdresse method, of class FabriquePersonne.
     */
    @Test
    public void testGetAdresse() {
        System.out.println("getAdresse");
        FabriquePersonne instance = new FabriquePersonne();
        instance.getAdresse();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmails method, of class FabriquePersonne.
     */
    @Test
    public void testGetEmails() {
        System.out.println("getEmails");
        FabriquePersonne instance = new FabriquePersonne();
        instance.getEmails();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of <error> method, of class FabriquePersonne.
     */
    @Test
    public void test<error>() {
        System.out.println("<error>");
        FabriquePersonne instance = new FabriquePersonne();
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.<error>();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
