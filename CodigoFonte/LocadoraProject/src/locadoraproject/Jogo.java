/*x
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package locadoraproject;

import javax.swing.JOptionPane;


/**
 *
 * @author User
 */
public class Jogo extends javax.swing.JFrame {
    
    boolean Jogador1Ativo = true;
    boolean Jogador2Ativo = false;
    
    int NumeroDeVitoriaDoJogador1 = 0;
    int NumeroDeVitoriaDoJogador2 = 0;
    int NumeroDePartidasEmpatadas = 0;

    /**
     * Creates new form Jogo
     */
    public Jogo() {
        initComponents();
    }

    public void JogadorAtivo(){
        if (Jogador1Ativo == true) {
            Jogador1Ativo = false ;
            Jogador2Ativo = true;
        } else {
            Jogador1Ativo = true;
            Jogador2Ativo = false;
        }
        
        JogadorVencedor("X");
        JogadorVencedor("0");
        
    }
    
    public void JogadorVencedor(String Jogador) {
        
        if (B1.getText().equals(Jogador) &&
                B2.getText().equals(Jogador) &&
                B3.getText().equals(Jogador)) {
            
            if (B1.getText().equals("X"))
                Vencedor("Jogador 1");
            else
                Vencedor("Jogador 2");
        }
        
        if (B4.getText().equals(Jogador) &&
                B5.getText().equals(Jogador) &&
                B6.getText().equals(Jogador)) {
            
            if (B4.getText().equals("X"))
                Vencedor("Jogador 1");
            else
                Vencedor("Jogador 2");
        }
        
        if (B7.getText().equals(Jogador) &&
                B8.getText().equals(Jogador) &&
                B9.getText().equals(Jogador)) {
            
            if (B7.getText().equals("X"))
                Vencedor("Jogador 1");
            else
                Vencedor("Jogador 2");
        }
        
        if (B1.getText().equals(Jogador) &&
                B4.getText().equals(Jogador) &&
                B7.getText().equals(Jogador)) {
            
            if (B1.getText().equals("X"))
                Vencedor("Jogador 1");
            else
                Vencedor("Jogador 2");
        }
        
        if (B2.getText().equals(Jogador) &&
                B5.getText().equals(Jogador) &&
                B8.getText().equals(Jogador)) {
            
            if (B2.getText().equals("X"))
                Vencedor("Jogador 1");
            else
                Vencedor("Jogador 2");
        }
        
        if (B3.getText().equals(Jogador) &&
                B6.getText().equals(Jogador) &&
                B9.getText().equals(Jogador)) {
            
            if (B3.getText().equals("X"))
                Vencedor("Jogador 1");
            else
                Vencedor("Jogador 2");
        }
        
        if (B1.getText().equals(Jogador) &&
                B5.getText().equals(Jogador) &&
                B9.getText().equals(Jogador)) {
            
            if (B1.getText().equals("X"))
                Vencedor("Jogador 1");
            else
                Vencedor("Jogador 2");
        }
        
        if (B3.getText().equals(Jogador) &&
                B5.getText().equals(Jogador) &&
                B7.getText().equals(Jogador)) {
            
            if (B3.getText().equals("X"))
                Vencedor("Jogador 1");
            else
                Vencedor("Jogador 2");
        }
        
        if ( !B1.getText().equals("") &&
                !B2.getText().equals("") &&
                !B3.getText().equals("") &&
                !B4.getText().equals("") &&
                !B5.getText().equals("") &&
                !B6.getText().equals("") &&
                !B7.getText().equals("") &&
                !B8.getText().equals("") &&
                !B9.getText().equals("") ) {
        
            Vencedor("Empate");      
        }                    
    }
    
    public void Vencedor(String JogadorVencedor) {
    if (JogadorVencedor.equals("Jogador 1")) {
        JOptionPane.showMessageDialog(null, "Parabéns, Jogador 1");
        NumeroDeVitoriaDoJogador1++;
        NumeroDeVitoriasDoJogador1.setText("Vitorias: " + NumeroDeVitoriaDoJogador1);
        LimparCampos();
        
    } else if (JogadorVencedor.equals("Jogador 2")) {
        JOptionPane.showMessageDialog(null, "Parabéns, Jogador 2");
        NumeroDeVitoriaDoJogador2++;
        jLabel4.setText("Vitorias: " + NumeroDeVitoriaDoJogador2);
        LimparCampos();
        
    } else if (JogadorVencedor.equals("Empate")) {
        JOptionPane.showMessageDialog(null, "Jogo Empatado!");
        NumeroDePartidasEmpatadas++;
        jLabel5.setText("EMPATE: " + NumeroDePartidasEmpatadas);
        LimparCampos();
    }
 }
    
public void LimparCampos(){
    
    B1.setText("");
    B2.setText("");
    B3.setText("");
    B4.setText("");
    B5.setText("");
    B6.setText("");
    B7.setText("");
    B8.setText("");
    B9.setText("");

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
        jLabel1 = new javax.swing.JLabel();
        NumeroDeVitoriasDoJogador1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        FundoInfo = new javax.swing.JLabel();
        NovoJogo = new javax.swing.JButton();
        SairdoJogo = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B1 = new javax.swing.JButton();
        B9 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        B7 = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        FundoJogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Jogador 1    Simbolo: X");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        NumeroDeVitoriasDoJogador1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        NumeroDeVitoriasDoJogador1.setForeground(new java.awt.Color(255, 255, 255));
        NumeroDeVitoriasDoJogador1.setText("Vitorias: 0");
        jPanel1.add(NumeroDeVitoriasDoJogador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 100, 20));

        jLabel3.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Jogador 2    Simbolo: 0");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Vitorias: 0");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 100, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("EMPATE: 0");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 110, -1));

        FundoInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/locadoraproject/imagens/Informações.png"))); // NOI18N
        FundoInfo.setText("jLabel2");
        jPanel1.add(FundoInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 420));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 110, 190, 420));

        NovoJogo.setBackground(new java.awt.Color(0, 0, 0));
        NovoJogo.setForeground(new java.awt.Color(204, 0, 0));
        NovoJogo.setText("Novo Jogo");
        NovoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NovoJogoActionPerformed(evt);
            }
        });
        getContentPane().add(NovoJogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        SairdoJogo.setBackground(new java.awt.Color(0, 0, 0));
        SairdoJogo.setForeground(new java.awt.Color(204, 0, 0));
        SairdoJogo.setText("Sair do Jogo");
        SairdoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairdoJogoActionPerformed(evt);
            }
        });
        getContentPane().add(SairdoJogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, -1, -1));

        B5.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });
        getContentPane().add(B5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 90, 90));

        B4.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });
        getContentPane().add(B4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 80, 90));

        B2.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });
        getContentPane().add(B2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 90, 80));

        B1.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });
        getContentPane().add(B1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 80, 80));

        B9.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        B9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B9ActionPerformed(evt);
            }
        });
        getContentPane().add(B9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, 80, 80));

        B3.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });
        getContentPane().add(B3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 80, 80));

        B6.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });
        getContentPane().add(B6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 280, 80, 90));

        B7.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });
        getContentPane().add(B7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 80, 80));

        B8.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });
        getContentPane().add(B8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 90, 80));

        FundoJogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/locadoraproject/imagens/FundoJogo.png"))); // NOI18N
        getContentPane().add(FundoJogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
        // TODO add your handling code here:
        if (Jogador1Ativo == true) {
           if (B6.getText().equals("")){
               B6.setText("X");
               JogadorAtivo();
           }
       } else {
           if (B6.getText().equals("")) {
               B6.setText("0");
               JogadorAtivo();
           }
       }            
    }//GEN-LAST:event_B6ActionPerformed

    private void SairdoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairdoJogoActionPerformed
        // TODO add your handling code here:
        // Exibir o MenuPrincipal
            MenuPrincipal menuPrincipal = new MenuPrincipal();
            menuPrincipal.setVisible(true);

            // Fechar a tela de jogo
            this.dispose();
        
    }//GEN-LAST:event_SairdoJogoActionPerformed

    private void NovoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovoJogoActionPerformed
        // TODO add your handling code here:
        LimparCampos();
    }//GEN-LAST:event_NovoJogoActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        // TODO add your handling code here:
       if (Jogador1Ativo == true) {
           if (B1.getText().equals("")){
               B1.setText("X");
               JogadorAtivo();
           }
       } else {
           if (B1.getText().equals("")) {
               B1.setText("0");
               JogadorAtivo();
           }
       }
    }//GEN-LAST:event_B1ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        // TODO add your handling code here:
        if (Jogador1Ativo == true) {
           if (B2.getText().equals("")){
               B2.setText("X");
               JogadorAtivo();
           }
       } else {
           if (B2.getText().equals("")) {
               B2.setText("0");
               JogadorAtivo();
           }
       }                 
    }//GEN-LAST:event_B2ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
        // TODO add your handling code here:
        if (Jogador1Ativo == true) {
           if (B5.getText().equals("")){
               B5.setText("X");
               JogadorAtivo();
           }
       } else {
           if (B5.getText().equals("")) {
               B5.setText("0");
               JogadorAtivo();
           }
       }            
    }//GEN-LAST:event_B5ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        // TODO add your handling code here:
        if (Jogador1Ativo == true) {
           if (B3.getText().equals("")){
               B3.setText("X");
               JogadorAtivo();
           }
       } else {
           if (B3.getText().equals("")) {
               B3.setText("0");
               JogadorAtivo();
           }
       }            
    }//GEN-LAST:event_B3ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
        // TODO add your handling code here:
        if (Jogador1Ativo == true) {
           if (B4.getText().equals("")){
               B4.setText("X");
               JogadorAtivo();
           }
       } else {
           if (B4.getText().equals("")) {
               B4.setText("0");
               JogadorAtivo();
           }
       }            
    }//GEN-LAST:event_B4ActionPerformed

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B7ActionPerformed
        // TODO add your handling code here:
        if (Jogador1Ativo == true) {
           if (B7.getText().equals("")){
               B7.setText("X");
               JogadorAtivo();
           }
       } else {
           if (B7.getText().equals("")) {
               B7.setText("0");
               JogadorAtivo();
           }
       }            
    }//GEN-LAST:event_B7ActionPerformed

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B8ActionPerformed
        // TODO add your handling code here:
        if (Jogador1Ativo == true) {
           if (B8.getText().equals("")){
               B8.setText("X");
               JogadorAtivo();
           }
       } else {
           if (B8.getText().equals("")) {
               B8.setText("0");
               JogadorAtivo();
           }
       }            
    }//GEN-LAST:event_B8ActionPerformed

    private void B9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B9ActionPerformed
        // TODO add your handling code here:
        if (Jogador1Ativo == true) {
           if (B9.getText().equals("")){
               B9.setText("X");
               JogadorAtivo();
           }
       } else {
           if (B9.getText().equals("")) {
               B9.setText("0");
               JogadorAtivo();
           }
       }            
    }//GEN-LAST:event_B9ActionPerformed

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
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton B7;
    private javax.swing.JButton B8;
    private javax.swing.JButton B9;
    private javax.swing.JLabel FundoInfo;
    private javax.swing.JLabel FundoJogo;
    private javax.swing.JButton NovoJogo;
    private javax.swing.JLabel NumeroDeVitoriasDoJogador1;
    private javax.swing.JButton SairdoJogo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
