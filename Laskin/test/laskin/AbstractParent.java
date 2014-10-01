package laskin;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 * Tässä esitellään @Before, @After, @BeforeClass ja @AfterClass annotaatioita
 */
public abstract class AbstractParent {

    @BeforeClass
    public static void startTestSystem() {
        System.out.println("@BeforeClass TESTAAMINEN ALKAA.");
    }


    @AfterClass
    public static void stopTestSystem() {
        System.out.println("@AfterClass TESTAAMINEN VALMIS.");
    }

    @Before
    public void initTestSystem() {
        System.out.println("  @Before Käynnistä uusi testimetodi.");
    }

    @After
    public void cleanTestSystem() {
        System.out.println("  @After Testimetodi suoritettu.");
    }
}
