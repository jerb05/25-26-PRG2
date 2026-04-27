class Carrera {

    private Caballo c1;
    private Caballo c2;
    private final int META = 40;

    public Carrera() {
        this.c1 = new Caballo(1);
        this.c2 = new Caballo(2);
    }

    private void mostrarPista() {
        System.out.println("----------------------------------------------");
        dibujarCarril(c1.getPosicion());
        dibujarCarril(c2.getPosicion());
        System.out.println("----------------------------------------------\n")
    }

    private void dibujarCarril(int posicion) {
    for (int i = 0; i < posicion; i++) {
        System.out.print(" ");
    }
    System.out.println(";-;'");
}