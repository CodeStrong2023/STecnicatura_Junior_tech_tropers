/*
Ejercicio 9: Pedir el dia, mes, año de una fecha e indicar
si la fecha es correcta. Suponiendo que todos los meses
son de 30 dias.
*/
package Ciclos09;

import javax.swing.JOptionPane;

public class Ejercicio09 {
    public static void main(String[] args) {
        int mes, dia, año;
        
        dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el dia: "));
        while(dia != 0 && dia > 30){
            dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un dia correcto: "));
        }
        mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el mes: "));
        while(mes != 0 && mes > 12){
            mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el mes correcto: "));
        }
        año = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el año: "));
        while(año > 0 && año > 12){
            año = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el año correcto: "));
        }
        System.out.println("La fecha "+dia+"/"+mes+"/"+año+" es correcta");
    }
}
