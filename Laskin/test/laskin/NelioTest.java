package laskin;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.List;

// Käyttää Parameterized ajuria
// Testitapaukset ja odotetut tulokset Collection-oliossa
@RunWith(Parameterized.class)
public class NelioTest {

    private static Laskin laskin = new Laskin();
    private int luku;
    private int tulos;

    @Parameters
    public static List testiTapaukset() {
        return Arrays.asList(new Object[][]{
                    {0, 0},
                    {1, 1},
                    {2, 4},
                    {4, 16},
                    {5, 25},
                    {6, 36},
                    {7, 48} // 7*7 = 49, ei 48
                });
    }

    // Konstruktori, jota JUnit kutsuu kullekin listan testitapaukselle.
    // Parametrien kytkentä sijainnin / järjestyksen perusteella:
    // ekana syötetty luku, toisena odotettu arvo
    public NelioTest(int luku, int tulos) {
        this.luku = luku;
        this.tulos = tulos;
    }

    @Test
    public void testNelio() {
        String messu = luku + " * " + luku;
        laskin.nelio(luku);
        assertEquals(messu, tulos, laskin.annaTulos());
    }
}
