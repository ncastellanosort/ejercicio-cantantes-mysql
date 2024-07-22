/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import logica.UtilsDB;

/**
 *
 * @author Nicolas
 */
public class EditarCantante extends javax.swing.JFrame {

    Fondo fondo = new Fondo();

    /**
     * Creates new form EliminarCantante
     */
    public EditarCantante() {

        this.setContentPane(fondo);
        initComponents();
        UtilsDB.Conectar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtfIngresarNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtfIndiceEditarCantante = new javax.swing.JTextField();
        btnEditarCantanteFrame = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre");

        txtfIngresarNombre.setBackground(new java.awt.Color(153, 153, 153));
        txtfIngresarNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtfIngresarNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtfIngresarNombre.setBorder(null);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(637, 326));
        setMinimumSize(new java.awt.Dimension(637, 326));
        setPreferredSize(new java.awt.Dimension(637, 326));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Harlow Solid Italic", 0, 64)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 102));
        jLabel1.setText(" Editar Cantante ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        txtfIndiceEditarCantante.setBackground(new java.awt.Color(102, 0, 102));
        txtfIndiceEditarCantante.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfIndiceEditarCantante.setForeground(new java.awt.Color(255, 255, 255));
        txtfIndiceEditarCantante.setBorder(null);
        txtfIndiceEditarCantante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfIndiceEditarCantanteActionPerformed(evt);
            }
        });
        getContentPane().add(txtfIndiceEditarCantante, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 210, 40));

        btnEditarCantanteFrame.setBackground(new java.awt.Color(102, 0, 102));
        btnEditarCantanteFrame.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEditarCantanteFrame.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarCantanteFrame.setText("Editar");
        btnEditarCantanteFrame.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnEditarCantanteFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarCantanteFrameActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditarCantanteFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 170, 50));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarCantanteFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarCantanteFrameActionPerformed

        EditarDatosCantante editarDatosCantante = new EditarDatosCantante();
        try {

            editarDatosCantante.nombreC = txtfIndiceEditarCantante.getText();
            editarDatosCantante.setLocationRelativeTo(null);
            editarDatosCantante.setResizable(false);
            editarDatosCantante.setVisible(true);

            UtilsDB.traerCantante(txtfIndiceEditarCantante.getText(), editarDatosCantante.getTxtfIngresarNombreNuevo(), editarDatosCantante.getTxtfDiscoConMasVentasNuevo(), editarDatosCantante.getTxtfNuevoNumeroTotalVentas());

            this.dispose();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Ingrese algo valido.");
            this.dispose();
        }


    }//GEN-LAST:event_btnEditarCantanteFrameActionPerformed

    private void txtfIndiceEditarCantanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfIndiceEditarCantanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfIndiceEditarCantanteActionPerformed

    public static void setTxtfnombreEliminarCantante(JTextField txtfnombreEliminarCantante) {
        EditarCantante.txtfIndiceEditarCantante = txtfnombreEliminarCantante;
    }

    public static JTextField getTxtfnombreEliminarCantante() {
        return txtfIndiceEditarCantante;
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditarCantanteFrame;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    public static javax.swing.JTextField txtfIndiceEditarCantante;
    private javax.swing.JTextField txtfIngresarNombre;
    // End of variables declaration//GEN-END:variables

}
