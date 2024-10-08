/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import java.awt.Graphics;
import java.awt.Image;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import static logica.UtilsDB.Conectar;

/**
 *
 * @author Nicolas
 */
public class Pantalla extends javax.swing.JFrame {

    Fondo fondo = new Fondo();

    DefaultTableModel modelo = new DefaultTableModel();

    String[] columnas = {"Nombre", "Disco mas vendido", "Numero ventas"};

    /**
     * Creates new form Pantalla
     *
     *
     */
    public Pantalla() {

        this.setContentPane(fondo);

        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);

        modelo.setColumnIdentifiers(columnas);

        tablaCantantes.setModel(modelo);

        tablaCantantes.setRowHeight(40);
        
        llenarTabla();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnEliminarCantante = new javax.swing.JButton();
        btnAgregarCantante1 = new javax.swing.JButton();
        btnSalirApp = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCantantes = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btnEditarCantante1 = new javax.swing.JButton();
        btnVerTablaOrdenada1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 0, 0));
        jLabel1.setFont(new java.awt.Font("Harlow Solid Italic", 0, 64)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 102));
        jLabel1.setText("Rgb Music Label Records");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        btnEliminarCantante.setBackground(new java.awt.Color(102, 0, 102));
        btnEliminarCantante.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEliminarCantante.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarCantante.setText("Eliminar cantante");
        btnEliminarCantante.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        btnEliminarCantante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCantanteActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminarCantante, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 410, 250, 50));

        btnAgregarCantante1.setBackground(new java.awt.Color(102, 0, 102));
        btnAgregarCantante1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAgregarCantante1.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarCantante1.setText("Agregar cantante");
        btnAgregarCantante1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        btnAgregarCantante1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCantante1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarCantante1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 170, 250, 50));

        btnSalirApp.setBackground(new java.awt.Color(153, 0, 102));
        btnSalirApp.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSalirApp.setForeground(new java.awt.Color(255, 255, 255));
        btnSalirApp.setText("Salir");
        btnSalirApp.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        btnSalirApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirAppActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalirApp, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 570, 250, 50));

        tablaCantantes.setBackground(new java.awt.Color(0, 0, 0));
        tablaCantantes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tablaCantantes.setForeground(new java.awt.Color(255, 255, 255));
        tablaCantantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaCantantes.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tablaCantantes.setAutoscrolls(false);
        tablaCantantes.setFocusable(false);
        tablaCantantes.setGridColor(new java.awt.Color(153, 0, 153));
        tablaCantantes.setMaximumSize(new java.awt.Dimension(800, 234242342));
        tablaCantantes.setMinimumSize(new java.awt.Dimension(800, 600));
        tablaCantantes.setPreferredSize(new java.awt.Dimension(800, 600));
        tablaCantantes.setRowSelectionAllowed(false);
        tablaCantantes.setSelectionBackground(new java.awt.Color(102, 0, 102));
        tablaCantantes.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tablaCantantes);
        if (tablaCantantes.getColumnModel().getColumnCount() > 0) {
            tablaCantantes.getColumnModel().getColumn(0).setResizable(false);
            tablaCantantes.getColumnModel().getColumn(1).setResizable(false);
            tablaCantantes.getColumnModel().getColumn(2).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 670, 450));

        jButton1.setBackground(new java.awt.Color(102, 0, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Actualizar tabla");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 330, 250, 50));

        btnEditarCantante1.setBackground(new java.awt.Color(102, 0, 102));
        btnEditarCantante1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEditarCantante1.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarCantante1.setText("Editar cantante");
        btnEditarCantante1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        btnEditarCantante1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarCantante1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditarCantante1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 250, 250, 50));

        btnVerTablaOrdenada1.setBackground(new java.awt.Color(102, 0, 102));
        btnVerTablaOrdenada1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnVerTablaOrdenada1.setForeground(new java.awt.Color(255, 255, 255));
        btnVerTablaOrdenada1.setText("Top global de vistas");
        btnVerTablaOrdenada1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        btnVerTablaOrdenada1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerTablaOrdenada1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnVerTablaOrdenada1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 490, 250, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarCantante1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarCantante1ActionPerformed

        EditarCantante editarCantante = new EditarCantante();

        editarCantante.setLocationRelativeTo(null);
        editarCantante.setResizable(false);
        editarCantante.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarCantante1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        llenarTabla();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSalirAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirAppActionPerformed

        this.dispose();
    }//GEN-LAST:event_btnSalirAppActionPerformed

    private void btnAgregarCantante1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCantante1ActionPerformed

        AgregarCantante agregarCantante = new AgregarCantante();

        agregarCantante.setLocationRelativeTo(null);
        agregarCantante.setResizable(false);
        agregarCantante.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarCantante1ActionPerformed

    private void btnEliminarCantanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCantanteActionPerformed

        EliminarCantante eliminar = new EliminarCantante();

        eliminar.setLocationRelativeTo(null);
        eliminar.setResizable(false);
        eliminar.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarCantanteActionPerformed

    private void btnVerTablaOrdenada1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerTablaOrdenada1ActionPerformed
        // TODO add your handling code here:

        ListaOrdenada listaOrdenada = new ListaOrdenada();

        listaOrdenada.setLocationRelativeTo(null);
        listaOrdenada.setResizable(false);
        listaOrdenada.setVisible(true);


    }//GEN-LAST:event_btnVerTablaOrdenada1ActionPerformed

    public void llenarTabla() {
        DefaultTableModel modelo = new DefaultTableModel(new String[]{"Nombre", "Disco mas vendido", "Numero ventas"},
                0);

        Connection conexion;

        String sql = "SELECT * FROM cantantes";

        try {
            conexion = Conectar();

            Statement stat = conexion.createStatement();
            ResultSet res = stat.executeQuery(sql);

            while (res.next()) {
                int id = res.getInt("id");
                String nombre_cantan = res.getString("nombre_cantante");
                String disco = res.getString("nombre_disco_ventas");
                long cant = res.getLong("cantidad_ventas");

                Object[] fila = {nombre_cantan, disco, cant};
                modelo.addRow(fila);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

        tablaCantantes.setModel(modelo);

    }

    class Fondo extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/imagenes/imagenFondo.jpg")).getImage();

            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);

            setOpaque(false);

            super.paint(g);

        }

    }

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
            java.util.logging.Logger.getLogger(EliminarCantante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EliminarCantante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EliminarCantante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EliminarCantante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Pantalla().setVisible(true);
            }
        });
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCantante1;
    private javax.swing.JButton btnEditarCantante1;
    private javax.swing.JButton btnEliminarCantante;
    private javax.swing.JButton btnSalirApp;
    private javax.swing.JButton btnVerTablaOrdenada1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaCantantes;
    // End of variables declaration//GEN-END:variables
}
