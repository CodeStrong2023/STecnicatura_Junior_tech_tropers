package Operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 3;
        aritmetica1.b = 7;
        aritmetica1.sumarNumeros();
        
    // 2 Creamos una variable para recibir el metodo
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado = " + resultado);
        
    // 3 reutilizamos la variable resultado
        resultado = aritmetica1.sumarConArgumentos(12, 26);
        System.out.println("Resultado usando argumentos: "+resultado);
    }
}
