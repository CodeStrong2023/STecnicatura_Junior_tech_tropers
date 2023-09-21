
package Operaciones;


public class PruebaAritmetica {
    public static void main(String[] args) {
        //Creamos un objeto 
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 10;
        aritmetica1.b = 8;
        //Llamamos al metodo sumar numeros
        aritmetica1.sumarNumeros();
        
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("El resultado es: " +resultado );
        
        resultado = aritmetica1.sumarConArgumentos(2, 4);
        System.out.println("El  resultado es: " + resultado );
    }
}
