package laskin;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

// Testisarja kokoaa kaikki testit yhdeksi testisarjaksi, jolloin 
// ne voidaan helposti ajaa kaikki yhdellä käynnistyksellä.

@RunWith(Suite.class)
@Suite.SuiteClasses({
    laskin.LaskinTest.class,
    laskin.NelioTest.class
})

public class TestSuite {
}
