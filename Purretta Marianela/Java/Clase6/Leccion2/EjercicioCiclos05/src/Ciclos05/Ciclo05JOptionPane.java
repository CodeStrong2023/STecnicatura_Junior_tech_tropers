package Ciclos05;

import javax.swing.JOptionPane;

/*Realizar juego para adivinar un número, generando un aleatorio
entre 0-100, e ir pidiendo númerosindicando "es mayor" o "es menor"
según ocurra con respecto a N El proceso termina cdo el usuario acierta
y mostramos el número de intentos realizados*/
public class Ciclo05JOptionPane {

    public static void main(String[] args) {
        int numero, aleatorio, conteo = 0;
        aleatorio = (int) (Math.random() * 100); //para generar núm aleatorios de 0 a 100
        do {

            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
            if (numero < aleatorio) {
                JOptionPane.showMessageDialog(null, "Ingrese un número mayor");
            } else if (numero > aleatorio) {
                JOptionPane.showMessageDialog(null, "Ingrese un número menor");
            } else {
                JOptionPane.showMessageDialog(null, "FELICIDADES!! Adivinaste el número");
            }
            conteo++;
        } while (numero != aleatorio);
        JOptionPane.showMessageDialog(null, "Adivinaste el número luego de " + conteo + " intentos");
    }

}
