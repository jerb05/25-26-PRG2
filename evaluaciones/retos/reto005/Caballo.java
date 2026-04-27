public class Caballo {

    private int posicion;
    private int numero;

    public Caaballo(int numero) {
        this.numero = numero;
        this.posicion = 0;
    }

    public void avanzar(){

        int avance = (int) (Math.random() * 3);
        this.posicion += avance;
    }

    public int getPosicion() {
        return this.posicion;
    }

    public int getNumero() {
        return this.numero;
    }
}