/*

*/
package pasoporvalor;


public class PasoPorValor {
    public static void main(String[] args) {
        var valorX = 20;
        System.out.println("valorX = " + valorX);
        cambioValor(valorX); //Solo le enviamos una copia
    }
    
    //Creamos un nuevo metodo
    public static void cambioValor(int arg1){
        System.out.println("arg1 = " + arg1);
    }
}
