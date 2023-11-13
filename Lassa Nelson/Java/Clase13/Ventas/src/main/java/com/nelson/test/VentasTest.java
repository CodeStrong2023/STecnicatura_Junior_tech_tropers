package com.nelson.test;

import com.nelson.Orden;
import com.nelson.Producto;


public class VentasTest {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Pantalon", 9500.00);
        Producto producto2 = new Producto("Campera", 29000.00);
        Producto producto3 = new Producto("Boxer", 950.00);
        Producto producto4 = new Producto("Buzo", 10000.00);
        Producto producto5 = new Producto("Camisa", 19500.00);
        Producto producto6 = new Producto("Mochila", 6005.99);
        Producto producto7 = new Producto("Medias", 155.00);
        Producto producto8 = new Producto("Remera", 7852.00);
        Producto producto9 = new Producto("Zapatillas", 45400.00);
        Producto producto10 = new Producto("Corpiño", 1450.00);

        Orden orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.mostrarOrden();

        // Tarea:
        // Crear mas objetos de tipo producto =10
        //Crear mas objetos de tipo orden = 2

        Orden orden2 = new Orden();
        orden2.agregarProducto(producto7);
        orden2.agregarProducto(producto9);
        orden2.agregarProducto(producto3);
        orden2.agregarProducto(producto8);
        orden2.mostrarOrden();

        Orden orden3 = new Orden();
        orden3.agregarProducto(producto5);
        orden3.agregarProducto(producto6);
        orden3.agregarProducto(producto4);
        orden3.agregarProducto(producto2);
        orden3.mostrarOrden();
    }
}
