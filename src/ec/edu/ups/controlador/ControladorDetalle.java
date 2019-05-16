/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Detalle;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Darwin
 */
public class ControladorDetalle {
    
    private Set<Detalle> lista;
    private int codigo;

    //metodo get sirve para asignarle al detalle 
    public int getCodigo() {
        return codigo;
    }
    
    public void setCodigo(int codigo){
        this.codigo=codigo;
    }
    
    public ControladorDetalle() {
        lista = new HashSet<>();
        codigo = 1;
    }
    
    public void create(Detalle detalle){
        detalle.setCodi(codigo);
        codigo++;
        lista.add(detalle);
    }
    
    public Detalle read(int codi){
        for (Detalle facturaDetalle : lista) {
            if(facturaDetalle.getCodi()== codi){
                return facturaDetalle;
            }
        }
        return null;
    }
    
    public void update(Detalle detalle){
        if(lista.contains(detalle)){
            lista.remove(detalle);
            lista.add(detalle);
        }
    }
    
    public void delete(int codigo){
        for (Detalle detalle : lista) {
            if(detalle.getCodi()== codigo){
                lista.remove(detalle);
                break;
            }
        }
    }
    
    public void imprimir(){
        for (Detalle impresion : lista) {
            System.out.println(impresion.getCodi());
        }
    }
    
}
