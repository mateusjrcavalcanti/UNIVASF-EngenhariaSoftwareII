/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.CommonAreaController;
import Model.CommonArea;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaCadastroAreasComuns extends javax.swing.JFrame {
    
    CommonAreaController commonAreaController = new CommonAreaController();

    public TelaCadastroAreasComuns() {
        
       initComponents();    
       
        DefaultTableModel tblModelUsers = (DefaultTableModel) jTAreas.getModel();
        for (CommonArea user : commonAreaController.all() ) {                 
            
            String[] rowData = {String.valueOf(user.getName()), String.valueOf(user.getId()) };
            tblModelUsers.addRow(rowData);
          
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TxfAreaName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btn_excluir = new javax.swing.JButton();
        btn_adicionar = new javax.swing.JButton();
        btn_salvarqaa = new javax.swing.JButton();
        TxfAreaID = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTAreas = new javax.swing.JTable();
        TxfAreaSearch = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btn_salvar = new javax.swing.JButton();
        btn_refreshTable = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setResizable(false);

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

        jPanel5.setBackground(new java.awt.Color(88, 88, 86));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro de áreas Comuns", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 16))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel1.setText("Nome da área:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, 30));

        TxfAreaName.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TxfAreaName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxfAreaNameActionPerformed(evt);
            }
        });
        jPanel3.add(TxfAreaName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 250, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Insira as informações para cadastrar uma nova área comum");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 430, -1));

        btn_excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/excluir.png"))); // NOI18N
        btn_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirActionPerformed(evt);
            }
        });
        jPanel3.add(btn_excluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 50, 50));

        btn_adicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/adicionar_1.png"))); // NOI18N
        btn_adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adicionarActionPerformed(evt);
            }
        });
        jPanel3.add(btn_adicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 50, 50));

        btn_salvarqaa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lupa.png"))); // NOI18N
        btn_salvarqaa.setIconTextGap(3);
        btn_salvarqaa.setMaximumSize(new java.awt.Dimension(25, 30));
        btn_salvarqaa.setMinimumSize(new java.awt.Dimension(25, 30));
        btn_salvarqaa.setPreferredSize(new java.awt.Dimension(25, 30));
        btn_salvarqaa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarqaaActionPerformed(evt);
            }
        });
        jPanel3.add(btn_salvarqaa, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 250, 40, 40));

        TxfAreaID.setEditable(false);
        TxfAreaID.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        TxfAreaID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxfAreaIDActionPerformed(evt);
            }
        });
        jPanel3.add(TxfAreaID, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, 250, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel10.setText("ID da área:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, -1, 30));

        jTAreas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Nome da Aárea", "#ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTAreas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTAreasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTAreas);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 1000, 230));

        TxfAreaSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxfAreaSearchActionPerformed(evt);
            }
        });
        jPanel3.add(TxfAreaSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 230, 40));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Pesquisar:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 70, 30));

        btn_salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/salvar.png"))); // NOI18N
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });
        jPanel3.add(btn_salvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 50, 50));

        btn_refreshTable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/remover.png"))); // NOI18N
        btn_refreshTable.setIconTextGap(3);
        btn_refreshTable.setMaximumSize(new java.awt.Dimension(25, 30));
        btn_refreshTable.setMinimumSize(new java.awt.Dimension(25, 30));
        btn_refreshTable.setPreferredSize(new java.awt.Dimension(25, 30));
        btn_refreshTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshTableActionPerformed(evt);
            }
        });
        jPanel3.add(btn_refreshTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 250, 40, 40));

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1020, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(124, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(576, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxfAreaNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxfAreaNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxfAreaNameActionPerformed

    private void TxfAreaIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxfAreaIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxfAreaIDActionPerformed

 

    private void btn_adicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adicionarActionPerformed
            
        String nomeArea = TxfAreaName.getText();
        if(nomeArea.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos.", "Erro", JOptionPane.ERROR_MESSAGE);
        }  else {
            commonAreaController.insert(nomeArea);
            refreshTable();
        }
        
    }//GEN-LAST:event_btn_adicionarActionPerformed

    private void jTAreasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTAreasMouseClicked
        
        int selectedRow = jTAreas.getSelectedRow();
        DefaultTableModel tblModelAreas = (DefaultTableModel) jTAreas.getModel();
        TxfAreaID.setText(tblModelAreas.getValueAt(selectedRow, 1).toString());
        TxfAreaName.setText(tblModelAreas.getValueAt(selectedRow, 0).toString());
        
    }//GEN-LAST:event_jTAreasMouseClicked

    private void TxfAreaSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxfAreaSearchActionPerformed

    }//GEN-LAST:event_TxfAreaSearchActionPerformed

    private void btn_salvarqaaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarqaaActionPerformed
        DefaultTableModel tblModelAreas = (DefaultTableModel) jTAreas.getModel();
        String termoBusca = TxfAreaSearch.getText().toLowerCase();
        tblModelAreas.setRowCount(0);
        for (CommonArea user : commonAreaController.all()) {
            if (user.getName().toLowerCase().contains(termoBusca)) {
                String[] rowData = {user.getName(), String.valueOf(user.getId())};
                tblModelAreas.addRow(rowData);
            } 
        }
    }//GEN-LAST:event_btn_salvarqaaActionPerformed

    private void btn_refreshTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshTableActionPerformed
        limparCampos();
        refreshTable();
    }//GEN-LAST:event_btn_refreshTableActionPerformed

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed
        
        try {
            int idSelected = Integer.parseInt(TxfAreaID.getText());
            commonAreaController.delete(idSelected);
            refreshTable();
        } catch (NumberFormatException e) {
            // Se o texto não puder ser convertido para um número inteiro
            JOptionPane.showMessageDialog(this, "Por favor, insira um ID válido.", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            // Captura de exceções genéricas
            JOptionPane.showMessageDialog(this, "Ocorreu um erro durante a exclusão do usuário.", "Erro", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }

    }//GEN-LAST:event_btn_excluirActionPerformed

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
       
        try {
            String nomeArea = TxfAreaName.getText();
            int idSelected = Integer.parseInt(TxfAreaID.getText());
           
            commonAreaController.update(idSelected, nomeArea);
            
            JOptionPane.showMessageDialog(this, "Área atualizada com sucesso.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            refreshTable();
        
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(this, "Ocorreu um erro durante a atualização da área.", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ocorreu um erro durante a atualização da área.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
       
    }//GEN-LAST:event_btn_salvarActionPerformed

    void refreshTable() {
        DefaultTableModel tblModelUsers = (DefaultTableModel) jTAreas.getModel();
        tblModelUsers.setRowCount(0);
        for (CommonArea user : commonAreaController.all()) {
            String[] rowData = {user.getName(), String.valueOf(user.getId())};
            tblModelUsers.addRow(rowData);
        }
    }

    private void limparCampos() {
        TxfAreaName.setText("");
        TxfAreaID.setText("");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxfAreaID;
    private javax.swing.JTextField TxfAreaName;
    private javax.swing.JTextField TxfAreaSearch;
    private javax.swing.JButton btn_adicionar;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JButton btn_refreshTable;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JButton btn_salvarqaa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTAreas;
    // End of variables declaration//GEN-END:variables
}
