package View;

import Controller.AuthController;
import Model.User;
import javax.swing.JOptionPane;


public class LoginPage extends javax.swing.JFrame {

    public LoginPage() {
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
        jPanel2 = new javax.swing.JPanel();
        login_User = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        password_user = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jButton_Logar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(88, 88, 86));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1040, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 20));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        login_User.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        login_User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_UserActionPerformed(evt);
            }
        });
        jPanel2.add(login_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 350, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel3.setText("LOGIN");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 70, 30));

        jLabel2.setText("Usuário");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 70, -1));

        jLabel4.setText("Senha");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 70, -1));

        password_user.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        password_user.setToolTipText("");
        jPanel2.add(password_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 350, 40));

        jCheckBox1.setText("Manter logado");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 170, -1));

        jLabel5.setForeground(new java.awt.Color(51, 0, 255));
        jLabel5.setText("Esqueceu a senha?");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 110, -1));

        jButton_Logar.setBackground(new java.awt.Color(51, 0, 255));
        jButton_Logar.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton_Logar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Logar.setText("Entrar");
        jButton_Logar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LogarActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_Logar, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 400, 350, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/painelTransparente.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 430, 400));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 530, 590));

        jPanel4.setBackground(new java.awt.Color(51, 0, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoBranca.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Entrou mas não vai sair...");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(136, 136, 136))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addContainerGap(249, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 510, 590));

        jMenu2.setText("      ");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void login_UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_UserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_login_UserActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jButton_LogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LogarActionPerformed
        // TBotão ao clicar faz a verificação e entra no sistema
        AuthController controller = new AuthController();
        User user = controller.auth(login_User.getText(), password_user.getText());

        if(user == null){
            JOptionPane.showMessageDialog(rootPane, "Usuário ou senha Incorreto!!!");
        }else{
            if(login_User.getText().equals("dono"))
            {
                TelaLoading tela = new TelaLoading();
                tela.setVisible(true);
                dispose();
            } else if(user.getIs_admin()){
                TelaAdmin tela = new TelaAdmin();
                tela.setVisible(true);
                dispose();
            } else if(user.getIs_resident()){
                TelaMorador tela = new TelaMorador();
                tela.setVisible(true);
                dispose();

            }else{
                JOptionPane.showMessageDialog(rootPane, "Usuário ou senha Incorreto!!!");
            }
        }

    }//GEN-LAST:event_jButton_LogarActionPerformed

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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Logar;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField login_User;
    private javax.swing.JPasswordField password_user;
    // End of variables declaration//GEN-END:variables
}
