
package test;

public class TestArreglos {
    public static void main(String[] args) {
        int edades[] = new int [3];  //el lado izq. declaramos la variable
                                    // el lado derecho instanciamos un objeto de tipo object
        System.out.println("edades = " + edades);
        
        edades[0] = 17;
        System.out.println("edades 0 = " + edades[0]);
        
        //tarea: modificar el indice 1 y 2
        
        edades[1] = 22;
        System.out.println("edades 1 = " + edades[1]);

        edades[2] = 18;
        System.out.println("edades 2 = " + edades[2]);
        
        // edades[3] = 7; //Fuera de rango, error en tiempo de ejecucion
        
        for(int i = 0; i < edades.length; i++){
            System.out.println("edades y sus elementos "+i+" :" +edades[i]);
        }
        
        
    }
}
