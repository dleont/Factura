/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *
 * @author Darwin Leon, Est.
 */
public class Factura {
    //atributos de la clase Factura que representa la cabecera
    private int codigo;
    private Double subTotal;
    private Double descuento;
    private Double iva;
    private Double total;
    
    private Cliente cliente;

    public Factura(){ 
        descuento =0.0;
        iva= subTotal*0.12;
        total=descuento+iva;
    }
    
    public Factura(int codigo, Double subTotal, Double descuento, Double iva, Double total){
        this.codigo = codigo;
        this.subTotal=subTotal;
        this.descuento=descuento;
        this.iva=iva;
        this.total=total;
    }

    //setter y getter
    public int getCodigo() {
        return codigo;
    }

    public Double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Double subTotal) {
        this.subTotal = subTotal;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }

    public Double getIva() {
        return iva;
    }

    public void setIva(Double iva) {
        this.iva = iva;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
   
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    } //final setter y getters

    @Override
    public String toString() {
        return "Factura{" + "codigo=" + codigo + ", subTotal=" + subTotal + ", descuento=" + descuento + ", iva=" + iva + ", total=" + total + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.codigo;
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
        final Factura other = (Factura) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
    
}
