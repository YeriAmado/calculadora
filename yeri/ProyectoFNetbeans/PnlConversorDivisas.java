/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ConversorDivisas;

import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author Yeri
 */
public class PnlConversorDivisas extends javax.swing.JPanel {

    int cantidad = 0;
    double conversion = 0;
    String de = "EUR";
    String a = "EUR";

    public PnlConversorDivisas() {
        initComponents();
        /*this.setTitle("Conversor de Divisas");
        Image icono = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/imagesFr.jpg"));
        this.setIconImage(icono);
        this.setLocationRelativeTo(null);*/
    }

    public String aMoneda(double cantidad, String moneda) {
        return "$ " + Math.round(cantidad * 100.0) / 100.0 + " " + moneda;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        spnCantidad = new javax.swing.JSlider();
        lblCantidad = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cboDe = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cboA = new javax.swing.JComboBox<>();
        lblResultado = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 153));
        setForeground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Cantidad");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, -1, -1));

        spnCantidad.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        spnCantidad.setMajorTickSpacing(1);
        spnCantidad.setMinimum(1);
        spnCantidad.setPaintTicks(true);
        spnCantidad.setValue(1);
        spnCantidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnCantidadStateChanged(evt);
            }
        });
        add(spnCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 310, -1));

        lblCantidad.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblCantidad.setForeground(new java.awt.Color(255, 51, 102));
        lblCantidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCantidad.setText("1");
        add(lblCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 50, 40));

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("DE:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, -1));

        cboDe.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        cboDe.setForeground(new java.awt.Color(255, 102, 102));
        cboDe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EUR", "USD", "MXN" }));
        cboDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboDeActionPerformed(evt);
            }
        });
        add(cboDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, 30));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("A:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, -1, -1));

        cboA.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        cboA.setForeground(new java.awt.Color(255, 102, 102));
        cboA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EUR", "USD", "MXN" }));
        cboA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboAActionPerformed(evt);
            }
        });
        add(cboA, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, -1, -1));

        lblResultado.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        lblResultado.setForeground(new java.awt.Color(0, 102, 102));
        lblResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(lblResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 350, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 51));
        jLabel2.setText("RESULTADO:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        jLabel5.setFont(new java.awt.Font("Bodoni MT", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 0));
        jLabel5.setText("***** CONVERSOR DE DIVISAS*****");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void spnCantidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnCantidadStateChanged
        cantidad = spnCantidad.getValue();
        lblCantidad.setText("" + cantidad);
        convertir();
    }//GEN-LAST:event_spnCantidadStateChanged

    private void cboDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboDeActionPerformed
        de = cboDe.getSelectedItem().toString();
        convertir();
    }//GEN-LAST:event_cboDeActionPerformed

    private void cboAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboAActionPerformed
        de = cboDe.getSelectedItem().toString();
        convertir();
    }//GEN-LAST:event_cboAActionPerformed

    public void convertir() {
        switch (de) {
            case "EUR":
                if (a.equals("USD")) {
                    conversion = cantidad * 1.13;
                } else if (a.equals("MXN")) {
                    conversion = cantidad * 23.23;
                } else {
                    conversion = cantidad;
                }

                break;

            case "USD":
                if (a.equals("EUR")) {
                    conversion = cantidad * 0.88;
                } else if (a.equals("MXN")) {
                    conversion = cantidad * 20.52;
                } else {//USD
                    conversion = cantidad;
                }

                break;

            case "MXN":
                if (a.equals("EUR")) {
                    conversion = cantidad * 0.043;
                } else if (a.equals("USD")) {
                    conversion = cantidad * 0.049;
                } else {//MXN
                    conversion = cantidad;
                }
                break;
        }
        lblResultado.setText(aMoneda(cantidad, de) + "    ->    " + aMoneda(conversion, a));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboA;
    private javax.swing.JComboBox<String> cboDe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JSlider spnCantidad;
    // End of variables declaration//GEN-END:variables

}
