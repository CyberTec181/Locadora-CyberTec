/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package locadoraproject;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
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

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Jogo = new javax.swing.JButton();
        App = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 0, 0));
        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 0, 80, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/locadoraproject/imagens/MenuPrincipal.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Jogo.setText("jButton1");
        Jogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JogoActionPerformed(evt);
            }
        });
        getContentPane().add(Jogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 230, 120));

        App.setText("jButton1");
        App.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AppActionPerformed(evt);
            }
        });
        getContentPane().add(App, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, 230, 120));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AppActionPerformed
        // TODO add your handling code here:
         // Exibir o Agendapp
            Agendapp Agendapp = new Agendapp();
            Agendapp.setVisible(true);

            // Fechar a tela de MenuPrincpal
            this.dispose(); 
    }//GEN-LAST:event_AppActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //Exibir tela de Login
            Login login = new Login();
            login.setVisible(true);
            
            // Fechar a tela de MenuPrincipal
            this.dispose(); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void JogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JogoActionPerformed
        // TODO add your handling code here:
        // Exibir o Jogo
           Jogo Jogo = new Jogo();
           Jogo.setVisible(true);
           
           //Fechar a tela de MenuPrincipal
           this.dispose();
    }//GEN-LAST:event_JogoActionPerformed
 
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton App;
    private javax.swing.JButton Jogo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
