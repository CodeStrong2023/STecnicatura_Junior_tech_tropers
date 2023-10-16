package Operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        int a = 10; //Variables locales
        int b = 7; //Memoria stack
        miMetodo(); //para el alcance de variable a otro metodo
        
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 3;
        aritmetica1.b = 7;

        aritmetica1.sumarNumeros();
    //Para almacenar un objeto o los atributos se utiliza la memoria HEAP
        
    // 2 Creamos una variable para recibir el metodo
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado = " + resultado);
        
    // 3 reutilizamos la variable resultado
        resultado = aritmetica1.sumarConArgumentos(12, 26);
        System.out.println("Resultado usando argumentos: "+resultado);
        
    // hasta aqui se ejecuta el constructor 1
    // vamos a ejecutar el constructor 2
    
        System.out.println("aritmetica1 a: "+aritmetica1.a);
        System.out.println("aritmetica1 a: "+aritmetica1.b);
        
        Aritmetica aritmetica2 = new Aritmetica(5,8);
        System.out.println("aritmetica2 = " + aritmetica2.a);
        System.out.println("aritmetica2 = " + aritmetica2.b);
        //aritmetica1 = numm; Nunca itilizar esto, nose debe hacer
        //System.gc(); metodo para limpiar residuos, es pesado, no utilizar
    }
    
    public static void miMetodo(){
        int a = 10; //una variable esta limitada
        System.out.println("Aqui hay otro metodo");
        
    }
}
