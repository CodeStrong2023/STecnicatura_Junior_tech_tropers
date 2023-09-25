package CicloWhile;

public class EjercicioWhile01 {

    public static void main(String[] args) {
        //ciclo While
        var conteo = 0; //inferencia de tipos
        while (conteo <= 7) { //condicion entre ()
            System.out.println("conteo = " + conteo);
            conteo++; //aumentamos en 1 la variable
        }
        //ciclo Do While
        var contador = 0;
        do {
            System.out.println("contador = " + contador);//código dentro de do
            contador++; //aumento de var
        } while (contador < 7);//condicion entre ()
        //Etiquetas (labels)
        //permiten a break y continue ir a un lugar especifico del programa
        //no es recomendable su uso
        //label "inicio"
        //Ciclo For
        for (var contar = 0; contar < 7; contar++) { //tiene 3 lugares: 1_(crea o declara la variable;
            //2_ condición a cumplir;
            //3_ incremendo o decremento)
            if (contar % 2 == 0) {
                System.out.println("contar = " + contar);
                break;
            }//sintaxis
        }
        inicio:
        for (var contar = 0; contar < 7; contar++) {
            if (contar % 2 != 0) {
                continue inicio; //pasamos a la siguiente iteracion 
            }
            System.out.println("contar = " + contar);
        }     
    }
}