/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consola;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jpalazzesi
 */
public class ListadoPcs extends javax.swing.JFrame {

    /**
     * Creates new form ConsolaIT
     */
    public ListadoPcs() {
        initComponents();
    }
        @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("turnos/iconos/lock_64.png"));


        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblListadoPC = new javax.swing.JTable();
        txtBusqueda = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnReparaciones = new javax.swing.JButton();
        btnVNC = new javax.swing.JButton();
        btnConsola = new javax.swing.JButton();
        btnRDP = new javax.swing.JButton();
        btnPutty = new javax.swing.JButton();
        btnPing = new javax.swing.JButton();
        btnTracert = new javax.swing.JButton();
        btnNsLookup = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Control de Equipos");
        setIconImage(getIconImage());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Control de Equipos"));

        jtblListadoPC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Dirección IP", "Nombre", "Usuario", "Sector"
            }
        ));
        jScrollPane1.setViewportView(jtblListadoPC);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turnos/iconos/pencil.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turnos/iconos/delete.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turnos/iconos/add.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnReparaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turnos/iconos/wrench.png"))); // NOI18N
        btnReparaciones.setText("Reparaciones");
        btnReparaciones.setToolTipText("");
        btnReparaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReparacionesActionPerformed(evt);
            }
        });

        btnVNC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turnos/iconos/television.png"))); // NOI18N
        btnVNC.setText("VNC");
        btnVNC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVNCActionPerformed(evt);
            }
        });

        btnConsola.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turnos/iconos/application_view_list.png"))); // NOI18N
        btnConsola.setText("Consola");
        btnConsola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsolaActionPerformed(evt);
            }
        });

        btnRDP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turnos/iconos/television.png"))); // NOI18N
        btnRDP.setText("RDP");
        btnRDP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRDPActionPerformed(evt);
            }
        });

        btnPutty.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turnos/iconos/PuTTY_icon_128px.png"))); // NOI18N
        btnPutty.setText("Putty");
        btnPutty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuttyActionPerformed(evt);
            }
        });

        btnPing.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turnos/iconos/arrow_right.png"))); // NOI18N
        btnPing.setText("PIng");
        btnPing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPingActionPerformed(evt);
            }
        });

        btnTracert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turnos/iconos/coins.png"))); // NOI18N
        btnTracert.setText("Traceroute");
        btnTracert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTracertActionPerformed(evt);
            }
        });

        btnNsLookup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turnos/iconos/arrow_refresh.png"))); // NOI18N
        btnNsLookup.setText("NSLookup");
        btnNsLookup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNsLookupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 803, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnReparaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPutty)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVNC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConsola)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRDP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificar)
                .addGap(80, 80, 80))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnPing, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTracert, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNsLookup, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar)
                    .addComponent(btnNuevo)
                    .addComponent(btnReparaciones)
                    .addComponent(btnVNC)
                    .addComponent(btnConsola)
                    .addComponent(btnRDP)
                    .addComponent(btnPutty))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPing)
                    .addComponent(btnTracert)
                    .addComponent(btnNsLookup))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 821, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        new tablasCombos().getInventarioPC(txtBusqueda.getText().toString(), jtblListadoPC);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        int fila1;
        Object id;
        int resp;
        DefaultTableModel m;
        try{
            fila1 = jtblListadoPC.getSelectedRow();
            m = (DefaultTableModel) jtblListadoPC.getModel();
            if(fila1==-1){
                JOptionPane.showMessageDialog(null, "Selecciona un Item");
            }else{
                id = m.getValueAt(fila1, 0);
                resp = Integer.parseInt(id.toString());
                NuevaPc np = new NuevaPc(resp);
                np.setVisible(true);
                np.toFront();
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al eliminar!");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int fila1;
        int id;
        int resp;

        try{
            fila1 = jtblListadoPC.getSelectedRow();
            if(fila1==-1){
                JOptionPane.showMessageDialog(null, "Selecciona un Item");
            }else{
                resp=JOptionPane.showConfirmDialog(null, "Seguro de eliminar?", "Eliminar", JOptionPane.YES_NO_OPTION);
                if(resp==JOptionPane.YES_OPTION){
                    ConexionSegura conexion = new ConexionSegura();
                    try{
                        conexion.setPs("delete from inventariopc where id = ?");
                        conexion.ps.setInt(1, Integer.parseInt(jtblListadoPC.getModel().getValueAt(fila1, 0).toString()));
                        conexion.ps.executeUpdate();
                    }catch(Exception e){
                        JOptionPane.showMessageDialog(null, "Error al Eliminar Registro "+e);
                    }
                    new tablasCombos().getInventarioPC(ListadoPcs.txtBusqueda.getText(), ListadoPcs.jtblListadoPC);
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al eliminar!");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        NuevaPc np = new NuevaPc();
        np.setVisible(true);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnReparacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReparacionesActionPerformed
        int fila1;
        Object id;
        int resp;
        DefaultTableModel m;
        try{
            fila1 = jtblListadoPC.getSelectedRow();
            m = (DefaultTableModel) jtblListadoPC.getModel();
            if(fila1==-1){
                JOptionPane.showMessageDialog(null, "Selecciona un Item");
            }else{
                id = m.getValueAt(fila1, 0);
                resp = Integer.parseInt(id.toString());
                reparaciones np = new reparaciones(resp);
                np.setVisible(true);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al Seleccionar!");
        }
    }//GEN-LAST:event_btnReparacionesActionPerformed

    private void btnVNCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVNCActionPerformed
        int fila1;
        Object id;
        int resp;
        DefaultTableModel m;
        try{
            fila1 = jtblListadoPC.getSelectedRow();
            m = (DefaultTableModel) jtblListadoPC.getModel();
            if(fila1==-1){
                JOptionPane.showMessageDialog(null, "Selecciona un Item");
            }else{
                try{
                    Process p = Runtime.getRuntime().exec ("vncviewer.exe "+jtblListadoPC.getModel().getValueAt(fila1, 1).toString());
                }
                catch (Exception e){
                    System.out.println("No se puede encontrar el programa: "+e);
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al Seleccionar!");
        }
    }//GEN-LAST:event_btnVNCActionPerformed

    private void btnConsolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsolaActionPerformed
        try{
            Process p = Runtime.getRuntime().exec ("cmd.exe /c start cmd");
        }catch (Exception e){
            System.out.println("No se puede encontrar el programa: "+e);
        }
    }//GEN-LAST:event_btnConsolaActionPerformed

    private void btnRDPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRDPActionPerformed
        int fila1;
        Object id;
        int resp;
        DefaultTableModel m;
        try{
            fila1 = jtblListadoPC.getSelectedRow();
            m = (DefaultTableModel) jtblListadoPC.getModel();
            if(fila1==-1){
                JOptionPane.showMessageDialog(null, "Selecciona un Item");
            }else{
                try{
                    Process p = Runtime.getRuntime().exec ("mstsc /v:"+jtblListadoPC.getModel().getValueAt(fila1, 1).toString());
                }
                catch (Exception e){
                    System.out.println("No se puede encontrar el programa: "+e);
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al Seleccionar!");
        }
    }//GEN-LAST:event_btnRDPActionPerformed

    private void btnPuttyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuttyActionPerformed
        int fila1;
        Object id;
        int resp;
        DefaultTableModel m;
        try{
            fila1 = jtblListadoPC.getSelectedRow();
            m = (DefaultTableModel) jtblListadoPC.getModel();
            if(fila1==-1){
                JOptionPane.showMessageDialog(null, "Selecciona un Item");
            }else{
                try{
                    Process p = Runtime.getRuntime().exec ("putty.exe "+jtblListadoPC.getModel().getValueAt(fila1, 1).toString()+" -ssh");
                }
                catch (Exception e){
                    System.out.println("No se puede encontrar el programa. Asegurate de haber copiado putty.exe a \\windows "+e);
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al Seleccionar!");
        }
    }//GEN-LAST:event_btnPuttyActionPerformed

    private void btnPingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPingActionPerformed
        int fila1;
        Object id;
        int resp;
        DefaultTableModel m;
        try{
            fila1 = jtblListadoPC.getSelectedRow();
            m = (DefaultTableModel) jtblListadoPC.getModel();
            if(fila1==-1){
                JOptionPane.showMessageDialog(null, "Selecciona un Item");
            }else{
                try{
                    Process p = Runtime.getRuntime().exec ("pinga.bat "+jtblListadoPC.getModel().getValueAt(fila1, 1).toString());
                }
                catch (Exception e){
                    System.out.println("No se puede encontrar el programa. "+e);
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al Seleccionar!");
        }
    }//GEN-LAST:event_btnPingActionPerformed

    private void btnTracertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTracertActionPerformed
        int fila1;
        Object id;
        int resp;
        DefaultTableModel m;
        try{
            fila1 = jtblListadoPC.getSelectedRow();
            m = (DefaultTableModel) jtblListadoPC.getModel();
            if(fila1==-1){
                JOptionPane.showMessageDialog(null, "Selecciona un Item");
            }else{
                try{
                    Process p = Runtime.getRuntime().exec ("eject.bat "+jtblListadoPC.getModel().getValueAt(fila1, 1).toString());
                }
                catch (Exception e){
                    System.out.println("No se puede encontrar el programa. "+e);
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al Seleccionar!");
        }
    }//GEN-LAST:event_btnTracertActionPerformed

    private void btnNsLookupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNsLookupActionPerformed
        try{
                    Process p = Runtime.getRuntime().exec ("ns.bat");
        }catch (Exception e){
            System.out.println("No se puede encontrar el programa. "+e);
        }
    }//GEN-LAST:event_btnNsLookupActionPerformed

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
            java.util.logging.Logger.getLogger(ListadoPcs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListadoPcs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListadoPcs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListadoPcs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListadoPcs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnConsola;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNsLookup;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnPing;
    private javax.swing.JButton btnPutty;
    private javax.swing.JButton btnRDP;
    private javax.swing.JButton btnReparaciones;
    private javax.swing.JButton btnTracert;
    private javax.swing.JButton btnVNC;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jtblListadoPC;
    public static javax.swing.JTextField txtBusqueda;
    // End of variables declaration//GEN-END:variables
}
