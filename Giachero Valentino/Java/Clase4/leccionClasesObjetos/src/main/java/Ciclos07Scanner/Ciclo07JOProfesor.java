package Ciclos07Scanner;
/*
Ejercicio 7: Pedir números hasta que se introduzca uno negativo
y calmar la media
 */
import javax.swing.*;

public class Ciclo07JOProfesor {
    public static void main(String[] args) {
        int numero, conteo = 0, suma = 0;
        float promedio = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un Número:"));
        while (numero >= 0) {//Mientras el numero no sea negativo
            suma +=numero;
            conteo++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número: "));
        }
        if (conteo==0){
            JOptionPane.showMessageDialog(null,"Error, La división entre cero no existe");
        }
        else {
            promedio=(float) suma/conteo;
            JOptionPane.showMessageDialog(null,"El promedio es = " + promedio);
        }
    }
}
