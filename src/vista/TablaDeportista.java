/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import clases.Deportista;
import clases.Gimnasio;
import controller.Controlador;
import static controller.Controlador.gym;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alessandro
 */
public class TablaDeportista extends javax.swing.JFrame {

    Gimnasio gym;
    Controlador control;
    private String cedulaDepo = "";
    private String nombreDepo = "";
    private String edadDepo = "";
    private String sexoDepo = "";
    private String pesoDepo = "";
    private String alturaDepo = "";
    private String direccionDepo = "";
    private String ritmoCardiaco = "";
    private String frecuenciaEntrenamiento = "";
    private String tipoEjercicio = "";

    /**
     * Creates new form TablaDeportista
     */
    public TablaDeportista() {
        initComponents();
        control = new Controlador(this);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    public TablaDeportista(Gimnasio gym, String tipoBoton) {
        initComponents();
        control = new Controlador(this);
        control.llenarTablaDepo(tablaDeportista);

        if (tipoBoton.equals("Eliminar")) {

            btnEliminarDeportista.setVisible(true);
            btnModificarDeportista.setVisible(false);

        } else if (tipoBoton.equals("Modificar")) {

            btnEliminarDeportista.setVisible(false);
            btnModificarDeportista.setVisible(true);

        } else if (tipoBoton.equals("")) {

            btnEliminarDeportista.setVisible(false);
            btnModificarDeportista.setVisible(false);
        }

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
        tablaDeportista = new javax.swing.JTable();
        btnAtras = new javax.swing.JButton();
        btnEliminarDeportista = new javax.swing.JToggleButton();
        btnModificarDeportista = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaDeportista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Cedula", "Edad", "Sexo", "Dirección", "Peso", "Altura", "Frecuencia Cardíaca", "Entrenamiento", "Ejercicio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaDeportista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaDeportistaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaDeportista);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 180));

        btnAtras.setText("Atrás");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 200, -1, -1));

        btnEliminarDeportista.setText("Eliminar Deportista");
        btnEliminarDeportista.setPreferredSize(new java.awt.Dimension(145, 32));
        btnEliminarDeportista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarDeportistaActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminarDeportista, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 150, -1));

        btnModificarDeportista.setText("Modificar Deportista");
        btnModificarDeportista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarDeportistaActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificarDeportista, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:
        VentanaGimnasio ventana = new VentanaGimnasio();
        control.activaVentana(ventana, this);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void tablaDeportistaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaDeportistaMouseClicked
        // TODO add your handling code here:
        int i = tablaDeportista.getSelectedRow();
        nombreDepo = (tablaDeportista.getValueAt(i, 0).toString());
        cedulaDepo = (tablaDeportista.getValueAt(i, 1).toString());
        edadDepo = (tablaDeportista.getValueAt(i, 2).toString());
        sexoDepo = (tablaDeportista.getValueAt(i, 3).toString());
        direccionDepo = (tablaDeportista.getValueAt(i, 4).toString());
        pesoDepo = (tablaDeportista.getValueAt(i, 5).toString());
        alturaDepo = (tablaDeportista.getValueAt(i, 6).toString());
        ritmoCardiaco = (tablaDeportista.getValueAt(i, 7).toString());
        frecuenciaEntrenamiento = (tablaDeportista.getValueAt(i, 8).toString());
        tipoEjercicio = (tablaDeportista.getValueAt(i, 9).toString());
    }//GEN-LAST:event_tablaDeportistaMouseClicked

    private void btnEliminarDeportistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarDeportistaActionPerformed
        // TODO add your handling code here: 
        control.eliminarElemento(this.nombreDepo);
    }//GEN-LAST:event_btnEliminarDeportistaActionPerformed

    private void btnModificarDeportistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarDeportistaActionPerformed
        // TODO add your handling code here:
//        control.modificarCampo(this.nombreDepo);
        
    }//GEN-LAST:event_btnModificarDeportistaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TablaDeportista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TablaDeportista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TablaDeportista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TablaDeportista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TablaDeportista().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JToggleButton btnEliminarDeportista;
    private javax.swing.JToggleButton btnModificarDeportista;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaDeportista;
    // End of variables declaration//GEN-END:variables
}
