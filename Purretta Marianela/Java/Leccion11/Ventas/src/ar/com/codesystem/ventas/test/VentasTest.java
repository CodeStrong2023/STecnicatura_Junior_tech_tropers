
package ar.com.codesystem.ventas.test;

import ar.com.codesystem.ventas.Orden;
import ar.com.codesystem.ventas.Producto;

/**
 *
 * @author marianela
 */
public class VentasTest {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Pantalon", 18000.00);
        Producto producto2 = new Producto("Campera", 60000);
       
        Orden orden1 = new Orden();
        //Agregamos productos al arreglo
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.mostrarOrden();
        
        
        //Tarea:
        //Crear más objetos de tipo producto
        //Crear más objetos de tipo Orden
        
        //Creamos los productos
        Producto producto3 = new Producto("Medias", 1200.00);
        Producto producto4 = new Producto("Parka", 70000);
        Producto producto5 = new Producto("Remera niño", 3000.00);
        Producto producto6 = new Producto("Zapatilla Urbana", 85000);
        Producto producto7 = new Producto("Remera Mujer", 13000.00);
        Producto producto8 = new Producto("Cargo", 25000.00);
        Producto producto9 = new Producto("Campera", 23000.00);
        Producto producto10 = new Producto("Croks", 19000);
        
        //Creamos las ordenes
        Orden orden2 = new Orden();
        Orden orden3 = new Orden();
        orden2.agregarProducto(producto3);
        orden2.agregarProducto(producto4);
        orden2.agregarProducto(producto5);
        orden2.agregarProducto(producto6);
        orden2.agregarProducto(producto7);
        orden2.mostrarOrden();
        
        orden3.agregarProducto(producto8);
        orden3.agregarProducto(producto9);
        orden3.agregarProducto(producto10);
        orden3.mostrarOrden();
    }
}
