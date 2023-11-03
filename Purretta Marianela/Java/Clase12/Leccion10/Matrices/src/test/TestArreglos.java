package test;

/**
 *
 * @author marianela
 */
public class TestArreglos {

    public static void main(String[] args) {
        //en el lado izq declaramos la variable y en el derecho instanciamos el objeto 
        int edades[] = new int[3]; //Usamos new porque los arreglos son tipo object
        //Al indicar la cantidad de elem ya no se puede modificar de manera dinámica a futuro
        System.out.println("edades = " + edades);
        //Para modificar elem del arreglo: de a uno:
        edades[0] = 17;
        edades[1] = 12; //TAREA
        edades[2] = 15;
        //edades[3] = 10; //fuera de rango, error en tiempo de ejecución
        System.out.println("edades 0 = " + edades[0]);
        System.out.println("edades 1 = " + edades[1]); //TAREA
        System.out.println("edades 2 = " + edades[2]);
        //recorremos todo el arreglo, de índice 0 a índice 2
        for(int i = 0; i < edades.length; i++){
            System.out.println("Edades y sus elementos "+i+": "+edades[i]);
                                     
        }        
    }
}
