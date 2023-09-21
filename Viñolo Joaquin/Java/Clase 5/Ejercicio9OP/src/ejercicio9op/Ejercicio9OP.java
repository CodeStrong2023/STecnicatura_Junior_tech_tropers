
package ejercicio9op;

import javax.swing.JOptionPane;


public class Ejercicio9OP {


    public static void main(String[] args) {
       /*
        Ejercicio 9: Pedir el día, mes y año de una fecha e
        indicar si la fecha es correcta. Suponiendo que todos
        losmeses son de 30 días.
        */
      
        // Declaramos variables
        int dia, mes, anio;
        //Pedimos un dia
        
        dia = Integer.parseInt(JOptionPane.showInputDialog("Digite un día: "));
        //Pedimos un mes
        
        mes = Integer.parseInt(JOptionPane.showInputDialog("Digite un mes: "));
        //Pedimos un año
        
        anio = Integer.parseInt(JOptionPane.showInputDialog("Digite un año: "));
        
        if((dia != 0)&&(dia <= 30)){
            if((mes != 0)&&(mes <= 12)){
                if((anio != 0)&&(anio <= 2023)){
                    System.out.println("La fecha es correcta y la fecha es " + dia +"/"+ mes +"/"+anio);
                }else{
                    System.out.println("La fecha ingresada es incorrecta, año incorrecto");
                }
            }else{
                    System.out.println("La fecha ingresada es incorrecta, mes incorrecto");
                }
            
        }else{
                    System.out.println("La fecha ingresada es incorrecta, dia incorrecto");
                }
    }
    
    
}
