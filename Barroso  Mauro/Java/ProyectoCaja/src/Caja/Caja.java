package Caja;

public class Caja {
    int ancho;
    int alto;
    int profundidad;
    float volumen;

    public Caja() {
        System.out.println("Constructor 1");
    }

    public Caja(int ancho, int alto, int profundidad) {
        System.out.println("Constructor 2");
        this.ancho = ancho;
        this.alto = alto;
        this.profundidad = profundidad;
    }
    public void calcularVolumen(){
        volumen= alto*ancho*profundidad;
        System.out.println("volumen = " + volumen);
    }

}