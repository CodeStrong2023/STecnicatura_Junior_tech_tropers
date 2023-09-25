
package holamundo;

public class PasoPorValor {
    public static void main(String[] args) {
        //creamos otro método por valor, no introduce un valor 
        var valorX = 20;
        System.out.println("valorX = " + valorX);
        cambioValor(valorX); //Llamamos al método y pasamos un argumento, solo una copia
        System.out.println("valorX = " + valorX);
    }
    public static void cambioValor(int arg1){
        System.out.println("arg1 = "+ arg1); //El método nos muestra el valor copiado
        arg1 = 15; //no se modifica poruqe usamos la variable local
    }
}
