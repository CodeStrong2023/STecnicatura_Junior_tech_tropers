
package ar.com.codeStrong.ventas.test;

import ar.com.codeStrong.Orden;
import ar.com.codeStrong.Producto;

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
        Producto producto3 = new Producto("Remera", 13000.00);
        Producto producto4 = new Producto("Zapatilla", 60000);
        Producto producto5 = new Producto("Calzoncillo", 3000.00);
        Producto producto6 = new Producto("Zapato Clasic", 65000);
        Producto producto7 = new Producto("Remera Rock", 13000.00);
        Producto producto8 = new Producto("Par de medias", 2500);
        Producto producto9 = new Producto("Camisa", 19000.00);
        Producto producto10 = new Producto("Campera invierno", 90000);
        
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
