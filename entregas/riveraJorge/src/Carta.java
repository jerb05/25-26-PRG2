public class Carta {
    private String palo;
    private String rango;

    public Carta(String palo, String rango) {
        this.palo = palo;
        this.rango = rango;
    }

    public String toString() {
        return"[" + rango + " " + palo + "]";
    }
}