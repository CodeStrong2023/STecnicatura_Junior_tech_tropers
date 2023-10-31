package Ciclos09;


import javax.swing.*;

public class Clase09JOptionPane {
    public static void main(String[] args) {

        int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el día: "));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el mes: "));
        int anio = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el año: "));
        if ((dia != 0) && (dia <= 30)){
            if ((mes!=0)&&(mes<=12)){
                if ((anio!=0)&&(anio<=2023)){
                    JOptionPane.showMessageDialog(null,"La fecha ingresada: "+dia+"/"+mes+"/"+anio);
                }
                else {
                    JOptionPane.showMessageDialog(null,"Fecha incorrecta, año incorrecto");
                }
            }
            else {
                JOptionPane.showMessageDialog(null,"Fecha incorrecta, mes incorrecto");
            }
        }
        else {
            System.out.println("Fecha incorrecta, dia incorrecto");
        }
    }
}
