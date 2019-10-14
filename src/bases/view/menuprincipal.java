/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bases.view;

import bases.view.admin_schemas.menu_admin_schemas;
import bases.view.admin_tablespaces.menu_admin_tablespaces;
import bases.view.auditoria.menu_auditoria;
import bases.view.creacion_respaldos.menu_creacion_respaldos;
import bases.view.performance.menu_performance;
import bases.view.recuperacion_respaldos.menu_recuperacionRespaldos;
import bases.view.respaldos_y_directorios.menu_respaldosDirectorios;
import bases.view.seguridad_usuarios.menu_seguridadUsuarios;
import bases.view.tunning.menu_tunning;

/**
 *
 * @author CALIL
 */
public class menuprincipal extends javax.swing.JFrame {

    /**
     * Creates new form menuprincipal
     */
    public menuprincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        boton_recuperaRespaldo = new javax.swing.JButton();
        boton_creacionRespaldo = new javax.swing.JButton();
        boton_admRespaldosDirectorios = new javax.swing.JButton();
        boton_admSchemas = new javax.swing.JButton();
        boton_admTablespaces = new javax.swing.JButton();
        boton_performance = new javax.swing.JButton();
        boton_auditoria = new javax.swing.JButton();
        boton_tunning = new javax.swing.JButton();
        boton_seguridad = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titulo.setText("        Administracion de base de datos ");

        boton_recuperaRespaldo.setText("Recuperacion de respaldos");
        boton_recuperaRespaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_recuperaRespaldoActionPerformed(evt);
            }
        });

        boton_creacionRespaldo.setText("Creacion de respaldos ");
        boton_creacionRespaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_creacionRespaldoActionPerformed(evt);
            }
        });

        boton_admRespaldosDirectorios.setText("Respaldos y directorios");
        boton_admRespaldosDirectorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_admRespaldosDirectoriosActionPerformed(evt);
            }
        });

        boton_admSchemas.setText("Administracion de Schemas");
        boton_admSchemas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_admSchemasActionPerformed(evt);
            }
        });

        boton_admTablespaces.setText("Administracion de Tablespaces");
        boton_admTablespaces.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_admTablespacesActionPerformed(evt);
            }
        });

        boton_performance.setText("Performance de BD");
        boton_performance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_performanceActionPerformed(evt);
            }
        });

        boton_auditoria.setText("Auditoria de BD");
        boton_auditoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_auditoriaActionPerformed(evt);
            }
        });

        boton_tunning.setText("Tunning de consultas");
        boton_tunning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_tunningActionPerformed(evt);
            }
        });

        boton_seguridad.setText("Seguridad de usuarios");
        boton_seguridad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_seguridadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boton_seguridad)
                    .addComponent(boton_auditoria)
                    .addComponent(boton_performance)
                    .addComponent(boton_admTablespaces)
                    .addComponent(boton_tunning)
                    .addComponent(boton_admSchemas)
                    .addComponent(boton_admRespaldosDirectorios)
                    .addComponent(boton_recuperaRespaldo)
                    .addComponent(boton_creacionRespaldo))
                .addGap(75, 75, 75))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo)
                .addGap(65, 65, 65)
                .addComponent(boton_creacionRespaldo)
                .addGap(18, 18, 18)
                .addComponent(boton_recuperaRespaldo)
                .addGap(18, 18, 18)
                .addComponent(boton_admRespaldosDirectorios)
                .addGap(18, 18, 18)
                .addComponent(boton_admSchemas)
                .addGap(18, 18, 18)
                .addComponent(boton_admTablespaces)
                .addGap(18, 18, 18)
                .addComponent(boton_tunning)
                .addGap(18, 18, 18)
                .addComponent(boton_performance)
                .addGap(18, 18, 18)
                .addComponent(boton_auditoria)
                .addGap(18, 18, 18)
                .addComponent(boton_seguridad)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_creacionRespaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_creacionRespaldoActionPerformed
        // TODO add your handling code here:
        menu_creacion_respaldos menu = new menu_creacion_respaldos();
        this.setVisible(false);
        menu.setVisible(true);
    }//GEN-LAST:event_boton_creacionRespaldoActionPerformed

    private void boton_recuperaRespaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_recuperaRespaldoActionPerformed
        // TODO add your handling code here:
        menu_recuperacionRespaldos menu = new menu_recuperacionRespaldos();
        this.setVisible(false);
        menu.setVisible(true);
    }//GEN-LAST:event_boton_recuperaRespaldoActionPerformed

    private void boton_admRespaldosDirectoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_admRespaldosDirectoriosActionPerformed
        // TODO add your handling code here:
        menu_respaldosDirectorios menu = new menu_respaldosDirectorios();
        this.setVisible(false);
        menu.setVisible(true);
    }//GEN-LAST:event_boton_admRespaldosDirectoriosActionPerformed

    private void boton_admSchemasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_admSchemasActionPerformed
        // TODO add your handling code here:
        menu_admin_schemas menu = new menu_admin_schemas();
        this.setVisible(false);
        menu.setVisible(true);
    }//GEN-LAST:event_boton_admSchemasActionPerformed

    private void boton_admTablespacesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_admTablespacesActionPerformed
        // TODO add your handling code here:
        menu_admin_tablespaces menu = new menu_admin_tablespaces();
        this.setVisible(false);
        
        menu.setVisible(true);
    }//GEN-LAST:event_boton_admTablespacesActionPerformed

    private void boton_tunningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_tunningActionPerformed
        // TODO add your handling code here:
        menu_tunning menu = new menu_tunning();
        this.setVisible(false);
        menu.setVisible(true);
    }//GEN-LAST:event_boton_tunningActionPerformed

    private void boton_performanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_performanceActionPerformed
        // TODO add your handling code here:
        menu_performance menu = new menu_performance();
        this.setVisible(false);
        menu.setVisible(true);
    }//GEN-LAST:event_boton_performanceActionPerformed

    private void boton_auditoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_auditoriaActionPerformed
        // TODO add your handling code here:
        menu_auditoria menu = new menu_auditoria();
        this.setVisible(false);
        menu.setVisible(true);
    }//GEN-LAST:event_boton_auditoriaActionPerformed

    private void boton_seguridadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_seguridadActionPerformed
        // TODO add your handling code here:
        menu_seguridadUsuarios menu = new menu_seguridadUsuarios();
        this.setVisible(false);
        menu.setVisible(true);
    }//GEN-LAST:event_boton_seguridadActionPerformed

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
            java.util.logging.Logger.getLogger(menuprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuprincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_admRespaldosDirectorios;
    private javax.swing.JButton boton_admSchemas;
    private javax.swing.JButton boton_admTablespaces;
    private javax.swing.JButton boton_auditoria;
    private javax.swing.JButton boton_creacionRespaldo;
    private javax.swing.JButton boton_performance;
    private javax.swing.JButton boton_recuperaRespaldo;
    private javax.swing.JButton boton_seguridad;
    private javax.swing.JButton boton_tunning;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
