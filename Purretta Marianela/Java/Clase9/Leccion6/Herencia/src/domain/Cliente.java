
package domain;

import java.util.Date;

public class Cliente extends Persona{
    private int idCliente;
    private Date fechaDeRegistro;
    private boolean vip;
    private static int contadorCliente;
    
    //constructor completo
    public Cliente(Date fechaDeRegistro, boolean vip, String nombre, char genero, 
            String direccion, int edad){
        super(nombre, genero, edad, direccion); //argumentos de la clase padre
        this.idCliente = ++Cliente.contadorCliente;
        this.fechaDeRegistro = fechaDeRegistro;
        this.vip = vip;
    }

    public int getIdCliente() {
        return this.idCliente;
    }

    public Date getFechaDeRegistro() {
        return this.fechaDeRegistro;
    }

    public void setFechaDeRegistro(Date fechaDeRegistro) {
        this.fechaDeRegistro = fechaDeRegistro;
    }

    public boolean isVip() {
        return this.vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{idCliente=").append(idCliente);
       
        sb.append(", fechaDeRegistro=").append(fechaDeRegistro);
        sb.append(", vip=").append(vip);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
       
}
