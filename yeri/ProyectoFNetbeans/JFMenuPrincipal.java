/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MenuPrincipal;

import Calculadora.PnlCalculadora;
import ConversorDivisas.PnlConversorDivisas;
import Fibonacci.PnlFibonacci;
import ListaDeCompras.pnlListaDeCompras;
import SumaNnumeros.pnlSumaNnumeros;
import TablaDeMultiplicar.pnlTablaMultiplicar;
import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Yeri
 */
public class JFMenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JFMenuPrincipal
     */
    public JFMenuPrincipal() {
        initComponents();
        //lblImagenSuma.setIcon(new ImageIcon(icono.getScaledInstance(lblImagenSuma.getWidth(), lblImagenSuma.getHeight(), Image.SCALE_SMOOTH)));

    }
/*
    private void colocarIconos() {
        //BUTTON CALCULADORA - ICONO
        JButton btnCalculadora = new JButton();
        btnCalculadora.setBounds(100, 100, 100, 40);
        btnCalculadora.setOpaque(true);
        ImageIcon iCalculadora = new ImageIcon("/imag/iCalculadora.png");
        btnCalculadora.setIcon(new ImageIcon(iCalculadora.getImage().getScaledInstance(btnCalculadora.getWidth(), btnCalculadora.getHeight(), Image.SCALE_SMOOTH)));
        //btnCalculadora.setBackground(Color.red);
        pnIzq.add(btnCalculadora);

    }
*/

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnIzq = new javax.swing.JPanel();
        btnFibonacci = new javax.swing.JButton();
        btnTablaMult = new javax.swing.JButton();
        btnDivisas = new javax.swing.JButton();
        btnCalculadora = new javax.swing.JButton();
        btnListaDeCompras = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnSumaNnumeros = new javax.swing.JButton();
        pnlDerechaPrincipal = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnIzq.setBackground(new java.awt.Color(0, 153, 153));
        pnIzq.setPreferredSize(new java.awt.Dimension(200, 500));

        btnFibonacci.setBackground(new java.awt.Color(255, 204, 51));
        btnFibonacci.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnFibonacci.setForeground(new java.awt.Color(51, 51, 0));
        btnFibonacci.setText("Fibonacci");
        btnFibonacci.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnFibonacci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFibonacciActionPerformed(evt);
            }
        });

        btnTablaMult.setBackground(new java.awt.Color(255, 204, 51));
        btnTablaMult.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnTablaMult.setForeground(new java.awt.Color(51, 51, 0));
        btnTablaMult.setText("Tabla de Multiplicar");
        btnTablaMult.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnTablaMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTablaMultActionPerformed(evt);
            }
        });

        btnDivisas.setBackground(new java.awt.Color(255, 204, 51));
        btnDivisas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDivisas.setForeground(new java.awt.Color(51, 51, 0));
        btnDivisas.setText("Conversor de Divisas");
        btnDivisas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDivisas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisasActionPerformed(evt);
            }
        });

        btnCalculadora.setBackground(new java.awt.Color(255, 204, 51));
        btnCalculadora.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCalculadora.setForeground(new java.awt.Color(51, 51, 0));
        btnCalculadora.setText("Calculadora");
        btnCalculadora.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCalculadora.setPreferredSize(new java.awt.Dimension(615, 521));
        btnCalculadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculadoraActionPerformed(evt);
            }
        });

        btnListaDeCompras.setBackground(new java.awt.Color(255, 204, 51));
        btnListaDeCompras.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnListaDeCompras.setForeground(new java.awt.Color(51, 51, 0));
        btnListaDeCompras.setText("Lista de Compras");
        btnListaDeCompras.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnListaDeCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaDeComprasActionPerformed(evt);
            }
        });

        btnInicio.setBackground(new java.awt.Color(102, 255, 102));
        btnInicio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnInicio.setForeground(new java.awt.Color(0, 51, 51));
        btnInicio.setText("INICIO");
        btnInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInicioMouseClicked(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(102, 255, 102));
        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(0, 51, 51));
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnSumaNnumeros.setBackground(new java.awt.Color(255, 204, 51));
        btnSumaNnumeros.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSumaNnumeros.setForeground(new java.awt.Color(51, 51, 0));
        btnSumaNnumeros.setText("Suma de N números");
        btnSumaNnumeros.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSumaNnumeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaNnumerosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnIzqLayout = new javax.swing.GroupLayout(pnIzq);
        pnIzq.setLayout(pnIzqLayout);
        pnIzqLayout.setHorizontalGroup(
            pnIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnIzqLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSumaNnumeros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnListaDeCompras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCalculadora, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(btnDivisas, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(btnTablaMult, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFibonacci, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnIzqLayout.setVerticalGroup(
            pnIzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnIzqLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCalculadora, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDivisas, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnListaDeCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTablaMult, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSumaNnumeros, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFibonacci, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        pnlDerechaPrincipal.setBackground(new java.awt.Color(204, 102, 255));
        pnlDerechaPrincipal.setPreferredSize(new java.awt.Dimension(800, 500));

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setForeground(new java.awt.Color(153, 153, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes2/tulipanRosa.jpg"))); // NOI18N

        javax.swing.GroupLayout pnlDerechaPrincipalLayout = new javax.swing.GroupLayout(pnlDerechaPrincipal);
        pnlDerechaPrincipal.setLayout(pnlDerechaPrincipalLayout);
        pnlDerechaPrincipalLayout.setHorizontalGroup(
            pnlDerechaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDerechaPrincipalLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        pnlDerechaPrincipalLayout.setVerticalGroup(
            pnlDerechaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDerechaPrincipalLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pnIzq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDerechaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnlDerechaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnIzq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFibonacciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFibonacciActionPerformed

        PnlFibonacci f = new PnlFibonacci();
        f.setLocation(0, 0);
        f.setSize(500, 500);
        pnlDerechaPrincipal.removeAll();
        pnlDerechaPrincipal.add(f);
        pnlDerechaPrincipal.repaint();
        pnlDerechaPrincipal.revalidate();
    }//GEN-LAST:event_btnFibonacciActionPerformed

    private void btnTablaMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTablaMultActionPerformed

        pnlTablaMultiplicar m = new pnlTablaMultiplicar();
        m.setLocation(0, 0);
        m.setSize(500, 500);
        pnlDerechaPrincipal.removeAll();
        pnlDerechaPrincipal.add(m);
        pnlDerechaPrincipal.repaint();
        pnlDerechaPrincipal.revalidate();
    }//GEN-LAST:event_btnTablaMultActionPerformed

    private void btnSumaNnumerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaNnumerosActionPerformed

        pnlSumaNnumeros s = new pnlSumaNnumeros();
        s.setLocation(0, 0);
        s.setSize(500, 500);
        pnlDerechaPrincipal.removeAll();
        pnlDerechaPrincipal.add(s);
        pnlDerechaPrincipal.repaint();
        pnlDerechaPrincipal.revalidate();
    }//GEN-LAST:event_btnSumaNnumerosActionPerformed

    private void btnListaDeComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaDeComprasActionPerformed

        pnlListaDeCompras l = new pnlListaDeCompras();
        l.setLocation(0, 0);
        l.setSize(500, 500);
        pnlDerechaPrincipal.removeAll();
        pnlDerechaPrincipal.add(l);
        pnlDerechaPrincipal.repaint();
        pnlDerechaPrincipal.revalidate();
    }//GEN-LAST:event_btnListaDeComprasActionPerformed

    private void btnDivisasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisasActionPerformed
        PnlConversorDivisas d = new PnlConversorDivisas();
        d.setLocation(0, 0);
        d.setSize(500, 500);
        pnlDerechaPrincipal.removeAll();
        pnlDerechaPrincipal.add(d);
        pnlDerechaPrincipal.repaint();
        pnlDerechaPrincipal.revalidate();

    }//GEN-LAST:event_btnDivisasActionPerformed

    private void btnCalculadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculadoraActionPerformed
        PnlCalculadora cal = new PnlCalculadora();
        cal.setLocation(0, 0);
        cal.setSize(500, 500);
        pnlDerechaPrincipal.removeAll();
        pnlDerechaPrincipal.add(cal);
        pnlDerechaPrincipal.repaint();
        pnlDerechaPrincipal.revalidate();
    }//GEN-LAST:event_btnCalculadoraActionPerformed

    private void btnInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseClicked
        JFMenuPrincipal p = new JFMenuPrincipal();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnInicioMouseClicked

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(JFMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculadora;
    private javax.swing.JButton btnDivisas;
    private javax.swing.JButton btnFibonacci;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnListaDeCompras;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSumaNnumeros;
    private javax.swing.JButton btnTablaMult;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel pnIzq;
    private javax.swing.JPanel pnlDerechaPrincipal;
    // End of variables declaration//GEN-END:variables
}
