package test;

// TODO en Arreglos no se puede trabajar en forma dinamica
public class TestArreglos {
    public static void main(String[] args) { // Lado derecho instanciamos un objeto de tipo objeto
        // Es un tipo objeto
        int edades[] = new int[3]; // Lado izquierdo declaramos la variable
        System.out.println("edades = " + edades);

        edades[0] = 17;
        System.out.println("edades 0= " + edades[0]);
        edades[1] = 22;
        System.out.println("edades 1= " + edades[1]);
        edades[2] = 01;
        System.out.println("edades 2 = " + edades[2]);

        //edades[3] = 7; // Fuera de rango, error en tiempo de ejecucion

        for (int i = 0; i < edades.length; i++) {
            System.out.println("edades y sus elemntos " + i + ": " + edades[i]);
        }
    }
}
