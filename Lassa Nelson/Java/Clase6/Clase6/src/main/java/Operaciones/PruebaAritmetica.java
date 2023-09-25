package Operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        var a = 10;// Variable locales
        int b = 7; // Memoria stack
        miMetodo(); // Llamamos el metodo nuevo
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 3;
        aritmetica1.b = 7;
        aritmetica1.sumarNumeros();
        // Para almacenar un objeto o los atributos se utiliza la memoria heap
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado = " + resultado);

        resultado = aritmetica1.sumarConArgumentos(12, 26);
        System.out.println("resultado = " + resultado);

        System.out.println("aritmetica1 a: " + aritmetica1.a);
        System.out.println("aritmetica2 b: " + aritmetica1.b);

        Aritmetica Aritmetica2 = new Aritmetica(5, 8);
        System.out.println("Aritmetica2.a = " + Aritmetica2.a);
        System.out.println("Aritmetica2.b = " + Aritmetica2.b);
        //aritmetica1 = null;  no se utiliza para hacer formas de recidos
        //System.gc();  Metodo para limpiar residuos, es pesado, no utilizar
    }

    public static void miMetodo() {
        // int a = 10; // Una variable esta limitada
        System.out.println("Aqui hay otro metodo");

    }
}
