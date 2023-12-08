/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.CommonAreaController;
import Controller.ReservationController;
import Model.CommonArea;
import Model.Reservation;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class TelaReservaAreasComuns extends javax.swing.JFrame {
   
    DefaultTableModel tblModel;
    
    CommonAreaController commonAreaController = new CommonAreaController();
    ReservationController reservationController = new ReservationController();
    
    SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
    
    public TelaReservaAreasComuns() {
        
        initComponents();    
        
         for (CommonArea areas : commonAreaController.all()) {           
            jComboBox_areas.addItem(String.valueOf(areas.getName()));
        }

        tblModel = (DefaultTableModel)jTAreasReservadas.getModel();
        for (Reservation area : reservationController.all()) {  
            String[] rowData = {"dono", String.valueOf(area.getUser()), String.valueOf(area.getArea()), String.valueOf(area.getDate())};
            tblModel.addRow(rowData);
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
        NomeReserva = new javax.swing.JLabel();
        jTmoradorNome = new javax.swing.JTextField();
        jComboBox_areas = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jtTdateReserva = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btn_excluir = new javax.swing.JButton();
        btn_adicionar = new javax.swing.JButton();
        btn_salvarqaa = new javax.swing.JButton();
        jTidReserva = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTAreasReservadas = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        btn_salvar = new javax.swing.JButton();
        btn_refreshTable = new javax.swing.JButton();
        pesquisaCampo = new javax.swing.JTextField();
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

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Reserva de Áreas Comuns", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 16))); // NOI18N
        jPanel3.setToolTipText("");
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NomeReserva.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        NomeReserva.setText("Morador:");
        jPanel3.add(NomeReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 30));

        jTmoradorNome.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jTmoradorNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTmoradorNomeActionPerformed(evt);
            }
        });
        jPanel3.add(jTmoradorNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 270, 30));

        jComboBox_areas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar Área", " " }));
        jComboBox_areas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_areasActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBox_areas, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 270, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel7.setText("Data:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, -1, 30));

        jtTdateReserva.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jtTdateReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtTdateReservaActionPerformed(evt);
            }
        });
        jPanel3.add(jtTdateReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 130, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Insira as informações para reservar alguma área");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

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

        jTidReserva.setEditable(false);
        jTidReserva.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jTidReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTidReservaActionPerformed(evt);
            }
        });
        jPanel3.add(jTidReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 260, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel10.setText("ID da área:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel11.setText("Área:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 40, 30));

        jTAreasReservadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "ID", "Área Reservada", "Data"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTAreasReservadas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTAreasReservadasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTAreasReservadas);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 1000, 230));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Pesquisar:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 70, 30));

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
        jPanel3.add(pesquisaCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, 240, 30));

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

    private void jTmoradorNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTmoradorNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTmoradorNomeActionPerformed

    private void jtTdateReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtTdateReservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtTdateReservaActionPerformed

    private void jTidReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTidReservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTidReservaActionPerformed

    private void jComboBox_areasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_areasActionPerformed
        //ADD MÉTODO DE PEGAR NOMES E COLOCAR NA LISTA
          
    }//GEN-LAST:event_jComboBox_areasActionPerformed

    private void btn_adicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adicionarActionPerformed
        /*
        String nomeMorador = jTmoradorNome.getText();
        String nomeArea = jComboBox_areas.getToolTipText();
        String idReserva = jTidReserva.getText();
        Date dataReserva = formatter.parse(jtTdateReserva.getText());
        
        if(nomeMorador.isEmpty() ||  nomeArea.isEmpty() || idReserva.isEmpty() || dataReserva.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos.", "Erro", JOptionPane.ERROR_MESSAGE);
        }  else {
            reservationController.insert(dataReserva, user, area);
            refreshTable();
        }
        */
        
        

    }//GEN-LAST:event_btn_adicionarActionPerformed

    private void jTAreasReservadasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTAreasReservadasMouseClicked



    }//GEN-LAST:event_jTAreasReservadasMouseClicked

    private void btn_salvarqaaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarqaaActionPerformed
      
    }//GEN-LAST:event_btn_salvarqaaActionPerformed

    private void btn_refreshTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshTableActionPerformed
       
    }//GEN-LAST:event_btn_refreshTableActionPerformed

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed
        

    }//GEN-LAST:event_btn_excluirActionPerformed

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed

       
    }//GEN-LAST:event_btn_salvarActionPerformed

    void refreshTable() {
       /*
         DefaultTableModel tblModelUsers = (DefaultTableModel) jTAreasReservadas.getModel();
        tblModelUsers.setRowCount(0);
        for (Reservation reserva : reservationController.all()) {
            String[] rowData = {"morador", reserva.getName(), String.valueOf(user.getId())};
            tblModelUsers.addRow(rowData);
        }
        */
    }
  
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NomeReserva;
    private javax.swing.JButton btn_adicionar;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JButton btn_refreshTable;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JButton btn_salvarqaa;
    private javax.swing.JComboBox<String> jComboBox_areas;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTAreasReservadas;
    private javax.swing.JTextField jTidReserva;
    private javax.swing.JTextField jTmoradorNome;
    private javax.swing.JTextField jtTdateReserva;
    private javax.swing.JTextField pesquisaCampo;
    // End of variables declaration//GEN-END:variables
}
