/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.modelo.Factura;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Darwin
 */
public class ControladorFactura {
    private Set<Factura> lista;
    private int codigo;
    
    public ControladorFactura(){
        lista = new HashSet<>();
        codigo =1;
    }

    //metodo get que se utiliza en la creacion de la factura
    public int setCodigo() {
        return codigo;
    }

    public int getCodigo() {
        return codigo;
    } //final metodoto set y get
    
    /**
     * Se crea automaticamente con el codigo asignado
     * @param factura 
     */
    public void crear(Factura factura){
        factura.setCodigo(codigo);
        lista.add(factura);
        codigo++;
    }
    
    /**
     * Llamamos en el menuItem eliminar del menu factura.
     * @param obj 
     */
     public void delete(Factura obj) {
       if(lista.contains(obj))
            lista.remove(obj);    
    }
     
     public void imprimir(Factura obj){
         if(lista.contains(obj)){
             System.out.println(obj);
         }
     }
     
   
     
}
