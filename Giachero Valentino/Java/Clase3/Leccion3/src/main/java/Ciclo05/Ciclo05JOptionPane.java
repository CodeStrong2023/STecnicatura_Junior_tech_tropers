package Ciclo05;


import javax.swing.*;

/*
Ejercicio 5: Reliazar un juevo para adivinar un número,
para ello generar un número aleatorio entre 0-100 y
luego ir pidiendo número indicando "Es mayor" o
"es menor" según sea mayor o menor con respecto a N
El proceso termina cuando el usuario acierta y mostramos
el número de intentos hechos.
 */
public class Ciclo05JOptionPane {
    public static void main(String[] args) {

        int numero, aleatorio, conteo = 0;
        aleatorio = (int) (Math.random() * 100);
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
            if (numero < aleatorio) {
                JOptionPane.showMessageDialog(null,"Digite un número Mayor");
            } else if (numero > aleatorio) {
                JOptionPane.showMessageDialog(null,"Digite un número Menor");
            }
            else {
                JOptionPane.showMessageDialog(null,"FELICIDADES!!! encontraste el número "+aleatorio);            }
            conteo++;

        } while (numero!=aleatorio);
        JOptionPane.showMessageDialog(null,"Encontraste el número con ->"+ conteo+ " <- intentos");
    }
}
