package com.nelson;

public class Orden {
    private int idOrden;
    private Producto productos[]; //Declaramos el arreglo
    private static int contadorOrden;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;

    // COnstructor vacio
    public Orden() {
        this.idOrden = ++Orden.contadorOrden;
        // Instanciamo o iniciamos y le desiganmos el maximo al arreglo
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }

    public void agregarProducto(Producto producto) {
        if (this.contadorProductos < Orden.MAX_PRODUCTOS) {
            this.productos[this.contadorProductos++] = producto;
        } else {
            System.out.println("Se ha superado el maximo de productos: " + Orden.MAX_PRODUCTOS);
        }
    }


    public double calculartotal() {
        double total = 0;
        for (int i = 0; i < this.contadorProductos; i++) {
//            Producto producto = this.productos[i];
//            total += producto.getPrecio();
            total += this.productos[i].getPrecio();
        }
        return total;
    }

    public void mostrarOrden() {
        System.out.println("Id Orden: " + idOrden);
        double totalOrden = this.calculartotal();
        System.out.println("El total de la orden es: $" + totalOrden);
        System.out.println("Productos de la orden: ");
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println(this.productos[i]);
        }
    }
}