
import java.util.Scanner;


public class Ejercicio3 {
    /*
    Ejercicio 3: Crear y cargar una matriz de tamaño 3x3
    Transponerla y mostrarla
    */
    public static void main(String[] args) {
        Scanner entrada  = new Scanner(System.in);
        int matriz[][] = new int [3][3];
        
        System.out.println("Rellenar la matriz: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println("Matriz ["+i+"]["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        System.out.println();
        
        System.out.println("MATRIZ ORIGINAL: ");
         for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println(matriz[i][j]+" ");
            }
             System.out.println();
         }
         System.out.println();
        
        //Matriz transpuesta
        System.out.println("MATRIZ TRANSPUESTA: ");
         for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println(matriz[j][i]+" ");
            }
             System.out.println();
         }
         System.out.println();
    }
}
