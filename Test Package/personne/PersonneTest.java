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
public class PersonneTest {
    
    private Personne oPersonne;
    private String sNom;
    private String sPrenom;
    private String sAdresse;
    private ArrayList<String> aTel;
    private ArrayList<String> aEmails;
    
    
    public PersonneTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        sNom="Ryan";
        sPrenom="Andrew";
        sAdresse="51 au font de l'ocean";
        aTel = new ArrayList<>();
        aTel.add("05 61 06 12 75");
        aTel.add("05 24 55 37 89");
        aEmails = new ArrayList<>();
        aEmails.add("whatever@run.eu");
        
        oPersonne = new Personne(sNom,sPrenom,aTel,sAdresse,aEmails);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of GetNom method, of class Personne.
     */
    @Test
    public void testGetNom() {
        System.out.println("GetNom");
        Personne instance = oPersonne;
        String expResult = sNom;
        String result = instance.GetNom();
        assertEquals(expResult, result);
    }

    /**
     * Test of GetPrenom method, of class Personne.
     */
    @Test
    public void testGetPrenom() {
        System.out.println("GetPrenom");
        Personne instance = oPersonne;
        String expResult = sPrenom;
        String result = instance.GetPrenom();
        assertEquals(expResult, result);
    }

    /**
     * Test of GetTelephone method, of class Personne.
     */
    @Test
    public void testGetTelephone() {
        System.out.println("GetTelephone");
        Personne instance = oPersonne;
        ArrayList<String> expResult = aTel;
        ArrayList<String> result = instance.GetTelephone();
        assertEquals(expResult, result);
    }

    /**
     * Test of GetAdresse method, of class Personne.
     */
    @Test
    public void testGetAdresse() {
        System.out.println("GetAdresse");
        Personne instance = oPersonne;
        String expResult = sAdresse;
        String result = instance.GetAdresse();
        assertEquals(expResult, result);
    }

    /**
     * Test of GetMail method, of class Personne.
     */
    @Test
    public void testGetMail() {
        System.out.println("GetMail");
        Personne instance = oPersonne;
        ArrayList<String> expResult = aEmails;
        ArrayList<String> result = instance.GetMail();
        assertEquals(expResult, result);
    }
    
}
