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
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }
    

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Usuario = new javax.swing.JLabel();
        Login = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Usuario.setFont(new java.awt.Font("DialogInput", 3, 18)); // NOI18N
        Usuario.setForeground(new java.awt.Color(153, 0, 0));
        Usuario.setText("Senha:");
        getContentPane().add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, -1, -1));

        Login.setFont(new java.awt.Font("DialogInput", 3, 18)); // NOI18N
        Login.setForeground(new java.awt.Color(153, 0, 0));
        Login.setText("Usuario:");
        getContentPane().add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, -1, -1));
        getContentPane().add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 390, 40));

        jLabel2.setFont(new java.awt.Font("DialogInput", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("Login");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 110, 50));

        txtLogin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtLogin.setForeground(new java.awt.Color(153, 0, 153));
        txtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginActionPerformed(evt);
            }
        });
        getContentPane().add(txtLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 390, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/locadoraproject/imagens/LoginFundo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jButton1.setText("START");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 600, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoginActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        if(txtLogin.getText().equals("Cyber") && new String(txtSenha.getPassword()).equals("Tec")) {
            JOptionPane.showMessageDialog(null, "Logado");

            // Exibir o MenuPrincipal
            MenuPrincipal menuPrincipal = new MenuPrincipal();
            menuPrincipal.setVisible(true);

            // Fechar a tela de login
            this.dispose(); 
        } else {
            JOptionPane.showMessageDialog(null, "Usuario ou Senha invalido");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JLabel Login;
    private javax.swing.JLabel Usuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
