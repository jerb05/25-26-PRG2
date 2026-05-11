import java.util.ArrayList;
import java.util.List;

public class Mano {
    private List<Carta> cartas;
    private int puntaje;

    public Mano() {
        this.cartas = new ArrayList<>();
        this.puntaje = 0;
    }

    public void agregarCarta(Carta carta) {
        this.cartas.add(carta);
    }
}