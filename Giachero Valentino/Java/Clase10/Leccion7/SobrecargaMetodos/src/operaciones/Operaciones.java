//SOBRECARGA DE MÉTODOS
package operaciones;


public class Operaciones {
    public static int sumar(int a, int b){
        System.out.println("Método para sumar enteros");
        return a + b;
    }
    //Cuando uno es "public" es ste no puede cambiar el modificador de acceso
    //no puede hacerse mas restrictivo
    public static double sumar(double a, double b){
        System.out.println("Método para sumar double");
        return a + b;
    }   
    
}
