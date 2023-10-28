
package domain;

import java.util.Date;

public class Cliente extends Persona{
    //Atributos
    private int idCliente;
    private Date fechaRegistro; //Importar la clase Date
    private boolean vip; //Very important person
    private static int contadorCliente; //Tipo estatico
    
    //Constructor
    public Cliente(Date fechaRegistro,boolean vip, String nombre,
            char genero, int edad, String direccion){
     
        super(nombre, genero, edad, direccion);
        this.idCliente = ++Cliente.contadorCliente;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
        
    }
    
    //Setter Getter

    public int getIdCliente() {
        return this.idCliente;
    }


    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return this.vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }
    
    // To String

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{idCliente=").append(idCliente);
        sb.append(", fechaRegistro=").append(fechaRegistro);
        sb.append(", vip=").append(vip);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

}