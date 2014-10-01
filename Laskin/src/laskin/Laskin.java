package laskin;

class NegativeSquareRootException extends Exception {

    NegativeSquareRootException(String message) {
        super(message);
    }
}

public class Laskin {

    private static double tulos;  // Muuttuja tulokselle

    public void nollaa() {     // Nollaa tuloksen
        tulos = 0;
    }

    public double annaTulos() {
        return tulos;
    }

    public void lisaa(double n) {
        tulos = tulos + n;
    }

    public void vahenna(double n) {
        tulos -= n;
    }

    public void kerro(double n) {
        tulos = tulos * n;
    }

    public void jaa(double n) throws ArithmeticException {
        tulos = tulos / n;
    }

    public void nelio(double n) {
        tulos = n * n;
    }

    public void neliojuuri(double n) throws NegativeSquareRootException {
        if (n < 0) {
            throw new NegativeSquareRootException("Ei voi ottaa neliöjuurta negatiivisesta luvusta.");
        } else {
            tulos = (int) Math.sqrt((double) n);
        }
    }

    public void virtaON() {
        // Tähän voisi laittaa alkutoimet
        tulos = 0;
    }

    public void virtaOFF() {
        // Tähän voisi laittaa lopputoimet
    }

}
