/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import clases.Deportista;
import clases.Gimnasio;
import controller.Controlador;
import javax.swing.JToggleButton;

/**
 *
 * @author Alessandro
 */
public class VentanaGimnasio extends javax.swing.JFrame {
    //Gimnasio gym = new Gimnasio() ;
    Gimnasio  gym = new  Gimnasio();
    TablaDeportista tablaDepo;
    Deportista depoActual;
    Controlador control;
    
    
    /**
     * Creates new form VentanaGimnasio
     */
    public VentanaGimnasio() {
        initComponents();
        control = new Controlador(this);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAtras = new javax.swing.JButton();
        btnModificarDepo = new javax.swing.JToggleButton();
        btnEliminarDepo = new javax.swing.JToggleButton();
        btnMostrarDepo = new javax.swing.JToggleButton();
        btnEliminarEnt = new javax.swing.JToggleButton();
        btnModificarEnt = new javax.swing.JToggleButton();
        btnMostrarEnt = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gimnasio");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAtras.setText("Atrás");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 318, -1, -1));

        btnModificarDepo.setText("Modificar Deportista");
        btnModificarDepo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarDepoActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificarDepo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 202, 148, -1));

        btnEliminarDepo.setText("Eliminar Deportista");
        btnEliminarDepo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarDepoActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminarDepo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 152, 148, -1));

        btnMostrarDepo.setText("Mostrar Deportista");
        btnMostrarDepo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarDepoActionPerformed(evt);
            }
        });
        getContentPane().add(btnMostrarDepo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 252, 148, -1));

        btnEliminarEnt.setText("Eliminar Entrenador");
        btnEliminarEnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarEntActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminarEnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 152, 149, -1));

        btnModificarEnt.setText("Modificar Entrenador");
        btnModificarEnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarEntActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificarEnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 202, -1, -1));

        btnMostrarEnt.setText("Mostrar Entrenador");
        btnMostrarEnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarEntActionPerformed(evt);
            }
        });
        getContentPane().add(btnMostrarEnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 252, 149, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/deportista.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 9, 129, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/entrenador.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 6, 128, 134));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo5.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:
        VentanaMenu ventana = new VentanaMenu();
        control.activaVentana(ventana, this);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnModificarDepoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarDepoActionPerformed
        // TODO add your handling code here:
        TablaDeportista tabla = new TablaDeportista(gym,"Modificar");
        control.activaVentana(tabla,this); 
    }//GEN-LAST:event_btnModificarDepoActionPerformed

    private void btnModificarEntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarEntActionPerformed
        // TODO add your handling code here:
        TablaEntrenador tabla = new TablaEntrenador(gym,"Modificar");
        control.activaVentana(tabla,this); 
    }//GEN-LAST:event_btnModificarEntActionPerformed

    private void btnMostrarDepoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarDepoActionPerformed
        // TODO add your handling code here:
        
        TablaDeportista tabla = new TablaDeportista(gym,"");
        control.activaVentana(tabla,this); 
    }//GEN-LAST:event_btnMostrarDepoActionPerformed

    private void btnEliminarDepoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarDepoActionPerformed
        // TODO add your handling code here:
        TablaDeportista tabla = new TablaDeportista(gym,"Eliminar");
        control.activaVentana(tabla,this); 
   
    }//GEN-LAST:event_btnEliminarDepoActionPerformed

    private void btnEliminarEntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEntActionPerformed
        // TODO add your handling code here:
        TablaEntrenador tabla = new TablaEntrenador(gym,"Eliminar");
        control.activaVentana(tabla,this); 
    }//GEN-LAST:event_btnEliminarEntActionPerformed

    private void btnMostrarEntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarEntActionPerformed
        // TODO add your handling code here:
        TablaEntrenador tabla = new TablaEntrenador(gym,"");
        control.activaVentana(tabla,this); 
    }//GEN-LAST:event_btnMostrarEntActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaGimnasio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaGimnasio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaGimnasio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaGimnasio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaGimnasio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JToggleButton btnEliminarDepo;
    private javax.swing.JToggleButton btnEliminarEnt;
    private javax.swing.JToggleButton btnModificarDepo;
    private javax.swing.JToggleButton btnModificarEnt;
    private javax.swing.JToggleButton btnMostrarDepo;
    private javax.swing.JToggleButton btnMostrarEnt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
