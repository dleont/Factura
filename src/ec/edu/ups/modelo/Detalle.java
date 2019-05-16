/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *
 * @author Darwin
 */
public class Detalle {
    //atributos de la clase Detalle hace referencia al detalle de la factura.
    private int codi;
    private int cantidad;
    private Double precioU;
    private Double total;
    private int codFactura;
    private Producto producto;

    public Detalle(){
        
    }
    
    public Detalle(int codi,int cantidad, Double precioU, double total){
        this.codi=codi;
        this.cantidad=cantidad;
        this.precioU=precioU;
        this.total=total;
    }

    //metodos setter y getters
    public int getCodi() {
        return codi;
    }

    public void setCodi(int codi) {
        this.codi = codi;
    }
    
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecioU() {
        return precioU;
    }

    public void setPrecioU(Double precioU) {
        this.precioU = precioU;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    } //final metodos setter y getters

    @Override
    public String toString() {
        return "Detalle{" + "cantidad=" + cantidad + ", precioU=" + precioU + ", total=" + total + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.codi;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Detalle other = (Detalle) obj;
        if (this.codi != other.codi) {
            return false;
        }
        return true;
    }
     
}
