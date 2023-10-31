import java.util.Scanner;

/*
Ejercicio 2: Leer un número e indicar si es positivo o
negativo. El proceso se repetira hasta que se introduzca
un cero
 */
public class Ejercicio02scaner {
    public static void main(String[] args) {
        int numero;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un número: ");
        numero = Integer.parseInt(entrada.nextLine());
        while (numero != 0) {
            if (numero > 0) {
                System.out.println("El número " + numero + " es positivo");
            } else if (numero < 0) {
                System.out.println("El número " + numero + " es negativo");
            }
            System.out.println("Digite un número: ");
            numero = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("El número " + numero + " finaliza el programa");
    }
}
