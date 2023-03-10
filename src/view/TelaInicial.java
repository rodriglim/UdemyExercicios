/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import interface_pack.AnimationInterface;
import interface_pack.WindowInterface;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.text.View;

/**
 *
 * @author rodri
 */
public class TelaInicial extends javax.swing.JFrame implements AnimationInterface, WindowInterface {

    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
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

        jPanel1 = new javax.swing.JPanel();
        imgMan = new javax.swing.JLabel();
        btnEntrarWhite = new javax.swing.JLabel();
        btnEntrarGreen = new javax.swing.JLabel();
        txtCadastrarWhite = new javax.swing.JLabel();
        txtCadastrarGreen = new javax.swing.JLabel();
        txtInformacoesWhite = new javax.swing.JLabel();
        txtInformacoesGreen = new javax.swing.JLabel();
        textoInicial = new javax.swing.JLabel();
        fundoImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(869, 459));
        setMinimumSize(new java.awt.Dimension(869, 459));
        setName("Tela Inicial"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(869, 459));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMaximumSize(new java.awt.Dimension(869, 459));
        jPanel1.setMinimumSize(new java.awt.Dimension(869, 459));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(869, 459));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgMan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/man.png"))); // NOI18N
        jPanel1.add(imgMan, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, -1, -1));

        btnEntrarWhite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button (2).png"))); // NOI18N
        btnEntrarWhite.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEntrarWhiteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEntrarWhiteMouseExited(evt);
            }
        });
        jPanel1.add(btnEntrarWhite, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 13, -1, -1));

        btnEntrarGreen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Group 1 (1).png"))); // NOI18N
        jPanel1.add(btnEntrarGreen, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 13, -1, -1));

        txtCadastrarWhite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cadastrar.png"))); // NOI18N
        txtCadastrarWhite.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCadastrarWhiteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtCadastrarWhiteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtCadastrarWhiteMouseExited(evt);
            }
        });
        jPanel1.add(txtCadastrarWhite, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, -1, -1));

        txtCadastrarGreen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cadastrar (1).png"))); // NOI18N
        txtCadastrarGreen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCadastrarGreenMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtCadastrarGreenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtCadastrarGreenMouseExited(evt);
            }
        });
        jPanel1.add(txtCadastrarGreen, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, -1, -1));

        txtInformacoesWhite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Informa????es.png"))); // NOI18N
        txtInformacoesWhite.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtInformacoesWhiteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtInformacoesWhiteMouseExited(evt);
            }
        });
        jPanel1.add(txtInformacoesWhite, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, -1, -1));

        txtInformacoesGreen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Informa????es (1).png"))); // NOI18N
        jPanel1.add(txtInformacoesGreen, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, -1, -1));

        textoInicial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Controle Financeiro com facilidade_ ?? com a Pay.png"))); // NOI18N
        jPanel1.add(textoInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        fundoImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Tela Inicial.png"))); // NOI18N
        fundoImg.setMaximumSize(new java.awt.Dimension(900, 469));
        fundoImg.setMinimumSize(new java.awt.Dimension(900, 469));
        fundoImg.setPreferredSize(new java.awt.Dimension(900, 469));
        jPanel1.add(fundoImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 880, 460));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 869, 459));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCadastrarWhiteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCadastrarWhiteMouseClicked
        // TODO add your handling code here:
        TelaCadastro cadastro = new TelaCadastro();
        openWindow(cadastro);


    }//GEN-LAST:event_txtCadastrarWhiteMouseClicked

    private void txtCadastrarWhiteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCadastrarWhiteMouseEntered
        // TODO add your handling code here:
        turnOnAnimation(txtCadastrarWhite, txtCadastrarGreen);


    }//GEN-LAST:event_txtCadastrarWhiteMouseEntered

    private void txtCadastrarWhiteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCadastrarWhiteMouseExited
        // TODO add your handling code here:
        turnOffAnimation(txtCadastrarWhite, txtCadastrarGreen);

    }//GEN-LAST:event_txtCadastrarWhiteMouseExited

    private void txtCadastrarGreenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCadastrarGreenMouseClicked
        // TODO add your handling code here:
        TelaCadastro cadastro = new TelaCadastro();
        openWindow(cadastro);
    }//GEN-LAST:event_txtCadastrarGreenMouseClicked

    private void txtCadastrarGreenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCadastrarGreenMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCadastrarGreenMouseEntered

    private void txtCadastrarGreenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCadastrarGreenMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCadastrarGreenMouseExited

    private void txtInformacoesWhiteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtInformacoesWhiteMouseEntered
        // TODO add your handling code here:
        turnOnAnimation(txtInformacoesWhite, txtInformacoesGreen);
    }//GEN-LAST:event_txtInformacoesWhiteMouseEntered

    private void txtInformacoesWhiteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtInformacoesWhiteMouseExited
        // TODO add your handling code here:
        turnOffAnimation(txtInformacoesWhite, txtInformacoesGreen);
    }//GEN-LAST:event_txtInformacoesWhiteMouseExited

    private void btnEntrarWhiteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarWhiteMouseEntered
        // TODO add your handling code here:
        turnOnAnimation(btnEntrarWhite, btnEntrarGreen);
    }//GEN-LAST:event_btnEntrarWhiteMouseEntered

    private void btnEntrarWhiteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarWhiteMouseExited
        // TODO add your handling code here:
        turnOffAnimation(btnEntrarWhite, btnEntrarGreen);
    }//GEN-LAST:event_btnEntrarWhiteMouseExited

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnEntrarGreen;
    private javax.swing.JLabel btnEntrarWhite;
    private javax.swing.JLabel fundoImg;
    private javax.swing.JLabel imgMan;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel textoInicial;
    private javax.swing.JLabel txtCadastrarGreen;
    private javax.swing.JLabel txtCadastrarWhite;
    private javax.swing.JLabel txtInformacoesGreen;
    private javax.swing.JLabel txtInformacoesWhite;
    // End of variables declaration//GEN-END:variables

    @Override
    public void turnOnAnimation(JLabel l1, JLabel l2) {
        l1.setVisible(false);
        l2.setVisible(true);
    }

    @Override
    public void turnOffAnimation(JLabel l1, JLabel l2) {
        l1.setVisible(true);
        l2.setVisible(false);
    }

    @Override
    public void openWindow(JFrame window) {
        window.setVisible(true);
    }

    @Override
    public void closedWindow(JFrame window) {
        dispose();
    }

}
