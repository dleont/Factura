/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Producto;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Darwin
 */
public class ControladorProducto {
    
    private Set<Producto> lista;
    private int codigo;
         
    public ControladorProducto(){
        lista=new HashSet<>();
        codigo=1;
    }
    
    //metodo get y set
    public int getCodigo(){
        return codigo;
    }
    
    public void setCodigo(){
        this.codigo=codigo;
    }//final metodo get y set.
    
    public void crear(Producto obj){
        obj.setCodigo(codigo);
        lista.add(obj);
        codigo++;
    }
    
    public Producto read(int codigo){
        for (Producto producto : lista) {
            if(producto.getCodigo()==codigo){
                return producto;
            } 
        }
        return null;
    }
    
    public void update(Producto producto){
        if(lista.contains(producto)){
            lista.remove(producto);
            lista.add(producto);
        }   
    }
    
    public void delete(Producto producto){
        if (lista.contains(producto)) {
            lista.remove(producto);
        }
    }
    
    public Producto list(){
        for (Producto producto : lista) {
            return producto; 
        }
        return null;
    }

    public Set<Producto> getLista() {
        return lista;
    }
     
}
