
package ProyectoCaja;

import javax.swing.JOptionPane;

public class Caja {
   //Definimos las variables
   float ancho;
   float alto;
   float profundidad;
   
   //Definimos el primer constructor vacío
   public Caja(){
       
   }
   
   //Definimos el Constructor con los argumentos de la clase
    public Caja(float ancho, float alto, float profundidad){
        this.ancho = ancho;
        this.alto = alto;
        this.profundidad = profundidad;
    }
    
    //Método formula
    public void volumen(float ancho, float alto, float profundidad){
        //Pedimos al usuario los datos
        ancho = Float.parseFloat(JOptionPane.showInputDialog("Digite el ancho: "));
        alto = Float.parseFloat(JOptionPane.showInputDialog("Digite el alto: "));
        profundidad = Float.parseFloat(JOptionPane.showInputDialog("Digite la profundidad: "));
        //Definimos la variable volumen que será el resultado
        float volumen = ancho * alto * profundidad;
        System.out.println("El resultado es: " + volumen);
    }
}
