package ProyectoCaja;

import java.util.Scanner;

public class PruebaCaja {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el alto");
        int a = entrada.nextInt();
        System.out.println("Ingrese el ancho");
        int b = entrada.nextInt();
        System.out.println("Ingrese el profundidad");
        int c = entrada.nextInt();
        Caja caja = new Caja();
        caja.alto = a;
        caja.ancho = b;
        caja.profundidad = c;
        Caja caja1 = new Caja(b,a,c);
        caja.encontrarVolumen();
        caja1.encontrarVolumen();
    }
}
