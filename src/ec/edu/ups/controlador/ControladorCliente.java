/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Cliente;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Darwin Leon, Est.
 */
public class ControladorCliente {
    private Set<Cliente> lista;
    private int cod;
    
    public ControladorCliente(){
        lista= new HashSet<>();
        cod=1;
    }
    
    //medoto get y set
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }//final metodo get y set
    
   
    public void crear(Cliente obj){
        obj.setCodigo(cod);
        lista.add(obj); 
        cod ++;
    }
    
    /**
     * Metodo read de la clase ControladorCliente por el codigo.
     *
     * @param codigo que es ingresado desde el teclado para la lectura.
     * @return el objeto obj.
     */
    public Cliente read(int codigo) {
        for (Cliente obj : lista) {
            if (obj.getCodigo() == codigo) {
                return obj;
            }
        }
        return null;
    }
    
    /**
     * Metodo buscar de la clase ControladorCliente por la cedula
     * Sirve en la factura
     * @param cedula
     * @return el cliente.
     */
    public Cliente buscar(String cedula){
        for (Cliente cliente : lista) {
            if (cliente.getCedula().equals(cedula)) {
                return cliente;
            }
        }
        return null;
    }
    
    /**
     *
     * @param obj
     * @return
     */
    public void update(Cliente obj) {
            if (lista.contains(obj)) {  
                lista.remove(obj);
                lista.add(obj);
            }  
    }

   /**
    * Metodo elimina un obj de la lista
    * @param obj 
    */
    public void delete(Cliente obj) {
       if(lista.contains(obj))
            lista.remove(obj);    
    }
    
    /**
     * Imprime todos los objetos de la lista que han sido creados 
     * en base a un Set y clase HashSet.
     */
    public void imprimir(){
        for (Cliente obj : lista) {
            System.out.println(obj);
        }
    }

    /**
     * Metodo que sirve para listar los objetos creados
     * @return 
     */
    public Set<Cliente> getLista() {
        return lista;
    }
    
    
    
    
}
