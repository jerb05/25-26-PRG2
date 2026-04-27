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

    public void jugar() {
        boolean turnoC1 = Math.random() < 0.5;

    while (c1.getPosicion() < META && c2.getPosicion() < META) {
        if (turnoC1) {
            c1.avanzar();
        } else {
            c2.avanzar();
        }

        mostrarPista();
        turnoC1 = !turnoC1; 

        
        try { Thread.sleep(200); } catch (InterruptedException e) {}
    }
    determinarGanador(); 
}
    }
}