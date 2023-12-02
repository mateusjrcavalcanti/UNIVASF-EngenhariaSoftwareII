/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;
import Controller.UserController;


/**
 *
 * @author toim6
 */
public class TelaAdmin extends javax.swing.JFrame {
   
     UserController sla = new  UserController();
    /**
     * Creates new form TelaInicio
     */
    public TelaAdmin() {
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

        jPanel3 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jButton_Taxa_Infos = new javax.swing.JButton();
        jButton_Cadastro_Morador = new javax.swing.JButton();
        jButton_Cadastro_Residencia = new javax.swing.JButton();
        jButton_Relatorio = new javax.swing.JButton();
        jButton_Reservar_Area = new javax.swing.JButton();
        jButton_Controle_Visitante = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton_Controle_Acesso = new javax.swing.JButton();
        jButton_Cadastro_Veiculo = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 980, 10));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel1.setText("Comunicação: ");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, -1, -1));

        jButton_Taxa_Infos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nota.png"))); // NOI18N
        jButton_Taxa_Infos.setText("Taxas e Informações");
        jButton_Taxa_Infos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Taxa_InfosActionPerformed(evt);
            }
        });
        jPanel3.add(jButton_Taxa_Infos, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 192, -1));

        jButton_Cadastro_Morador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/userpropietario.png"))); // NOI18N
        jButton_Cadastro_Morador.setText("Cadastro Morador");
        jButton_Cadastro_Morador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Cadastro_MoradorActionPerformed(evt);
            }
        });
        jPanel3.add(jButton_Cadastro_Morador, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 192, -1));

        jButton_Cadastro_Residencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/casa.png"))); // NOI18N
        jButton_Cadastro_Residencia.setText("Cadastro Residências");
        jButton_Cadastro_Residencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Cadastro_ResidenciaActionPerformed(evt);
            }
        });
        jPanel3.add(jButton_Cadastro_Residencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 192, -1));

        jButton_Relatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/relatorio-de-lucro.png"))); // NOI18N
        jButton_Relatorio.setText("Relatório Mensal");
        jPanel3.add(jButton_Relatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 192, -1));

        jButton_Reservar_Area.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reserva.png"))); // NOI18N
        jButton_Reservar_Area.setText("Reservas de Áreas");
        jButton_Reservar_Area.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Reservar_AreaActionPerformed(evt);
            }
        });
        jPanel3.add(jButton_Reservar_Area, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 192, -1));

        jButton_Controle_Visitante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/visita-a-casa.png"))); // NOI18N
        jButton_Controle_Visitante.setText("Controle de Visitantes");
        jButton_Controle_Visitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Controle_VisitanteActionPerformed(evt);
            }
        });
        jPanel3.add(jButton_Controle_Visitante, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 192, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel3.setText("Solicitações:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 104, -1));

        jButton_Controle_Acesso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cartao-de-visita.png"))); // NOI18N
        jButton_Controle_Acesso.setText("Controles de Acesso");
        jButton_Controle_Acesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Controle_AcessoActionPerformed(evt);
            }
        });
        jPanel3.add(jButton_Controle_Acesso, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 192, -1));

        jButton_Cadastro_Veiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/carro-compacto.png"))); // NOI18N
        jButton_Cadastro_Veiculo.setText("Cadastro Veículos");
        jButton_Cadastro_Veiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Cadastro_VeiculoActionPerformed(evt);
            }
        });
        jPanel3.add(jButton_Cadastro_Veiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 192, -1));

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, 390, 260));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LogosCondomínioMenor.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/condoInfo.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Condomínio Residencial Univasf");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 452, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 129, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(11, Short.MAX_VALUE)))
        );

        jPanel5.setBackground(new java.awt.Color(88, 88, 86));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1033, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );

        jMenu1.setText("Opções");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ferramentas");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Ajuda");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_Cadastro_VeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Cadastro_VeiculoActionPerformed
          sla.delete(7);
    }//GEN-LAST:event_jButton_Cadastro_VeiculoActionPerformed

    private void jButton_Controle_AcessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Controle_AcessoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_Controle_AcessoActionPerformed

    private void jButton_Controle_VisitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Controle_VisitanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_Controle_VisitanteActionPerformed

    private void jButton_Reservar_AreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Reservar_AreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_Reservar_AreaActionPerformed

    private void jButton_Cadastro_ResidenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Cadastro_ResidenciaActionPerformed

        TelaCadastroResidencia tela = new TelaCadastroResidencia();
        tela.setVisible(true);
        tela.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton_Cadastro_ResidenciaActionPerformed

    private void jButton_Cadastro_MoradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Cadastro_MoradorActionPerformed
        //  TelaLoading tela = new TelaLoading();
        TelaCadastroUsuario tela = new TelaCadastroUsuario();
        tela.setVisible(true);
        tela.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton_Cadastro_MoradorActionPerformed

    private void jButton_Taxa_InfosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Taxa_InfosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_Taxa_InfosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Cadastro_Morador;
    private javax.swing.JButton jButton_Cadastro_Residencia;
    private javax.swing.JButton jButton_Cadastro_Veiculo;
    private javax.swing.JButton jButton_Controle_Acesso;
    private javax.swing.JButton jButton_Controle_Visitante;
    private javax.swing.JButton jButton_Relatorio;
    private javax.swing.JButton jButton_Reservar_Area;
    private javax.swing.JButton jButton_Taxa_Infos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
