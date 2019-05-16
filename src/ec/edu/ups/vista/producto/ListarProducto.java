/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista.producto;

import ec.edu.ups.controlador.ControladorProducto;
import ec.edu.ups.modelo.Producto;
import java.util.ResourceBundle;
import java.util.Set;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Darwin
 */
public class ListarProducto extends javax.swing.JInternalFrame {
    private ControladorProducto controlProducto;
    private ResourceBundle mensajes;

    /**
     * Creates new form ListarProducto
     */
    public ListarProducto(ControladorProducto controlProducto, ResourceBundle mensajes) {
        initComponents();
        this.controlProducto=controlProducto;
        this.mensajes=mensajes;
        llenarProducto();
        cambiarIdioma(mensajes); 
    }
    
    public void llenarProducto(){
        DefaultTableModel modelo= (DefaultTableModel) tblProducto.getModel();
        Set<Producto> lista = controlProducto.getLista();
        for (Producto producto : lista) {
        Object[] datos = {producto.getCodigo(),  
            producto.getNombre(),
            producto.getPrecioU()};
        
            modelo.addRow(datos);
        }
    }
    
    public void cambiarIdioma(ResourceBundle mensajes){
        JTableHeader tableHeader = tblProducto.getTableHeader();
        TableColumnModel tableColumnModel = tableHeader.getColumnModel();
        TableColumn tableColumn;
        tableColumn = tableColumnModel.getColumn(0);
        tableColumn.setHeaderValue(mensajes.getString("cliente.codigo"));
        tableColumn = tableColumnModel.getColumn(1);
        tableColumn.setHeaderValue(mensajes.getString("cliente.nombre"));
        tableColumn = tableColumnModel.getColumn(2);
        tableColumn.setHeaderValue(mensajes.getString("producto.precio"));
        tableHeader.repaint();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblProducto = new javax.swing.JTable();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ventana Lista de  Productos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        setClosable(true);

        tblProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Descripcion", "Precio Unitario"
            }
        ));
        jScrollPane1.setViewportView(tblProducto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProducto;
    // End of variables declaration//GEN-END:variables
}
