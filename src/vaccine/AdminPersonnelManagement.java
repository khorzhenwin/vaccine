/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vaccine;

import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import vaccine.Class.*;

/**
 *
 * @author User
 */
public class AdminPersonnelManagement extends javax.swing.JFrame {

   /**
    * Creates new form admin_committee
    */
   public AdminPersonnelManagement() {
      initComponents();
      DefaultTableModel model = (DefaultTableModel) tblPersonnel.getModel();
      model.setRowCount(0);
      for (int i = 0; i < DataIO.allPersonnel.size(); i++) {
         String icno = DataIO.allPersonnel.get(i).getIcno();
         String name = DataIO.allPersonnel.get(i).getPersonnelName();
         String password = DataIO.allPersonnel.get(i).getPassword();
         String array[] = {icno, name, password};
         model.addRow(array);
      }
      tblPersonnel.getColumnModel().getColumn(2).setMinWidth(0);
      tblPersonnel.getColumnModel().getColumn(2).setMaxWidth(0);
   }

   /**
    * This method is called from within the constructor to initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is always
    * regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jLabel7 = new javax.swing.JLabel();
      btnBack = new javax.swing.JButton();
      jPanel1 = new javax.swing.JPanel();
      txtPassword = new javax.swing.JPasswordField();
      jLabel5 = new javax.swing.JLabel();
      jLabel4 = new javax.swing.JLabel();
      jLabel3 = new javax.swing.JLabel();
      chkPassword = new javax.swing.JCheckBox();
      txtName = new javax.swing.JTextField();
      txtIC = new javax.swing.JTextField();
      jPanel2 = new javax.swing.JPanel();
      btnClear = new javax.swing.JButton();
      btnRefresh = new javax.swing.JButton();
      btnRegister = new javax.swing.JButton();
      btnUpdate = new javax.swing.JButton();
      txtSearch = new javax.swing.JTextField();
      btnDelete = new javax.swing.JButton();
      jLabel1 = new javax.swing.JLabel();
      jScrollPane1 = new javax.swing.JScrollPane();
      tblPersonnel = new javax.swing.JTable();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setResizable(false);

      jLabel7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
      jLabel7.setText("Manage Personnel");
      jLabel7.setToolTipText("");
      jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

      btnBack.setText("Back ➤");
      btnBack.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnBackActionPerformed(evt);
         }
      });

      jLabel5.setText("IC No :");

      jLabel4.setText("Password :");

      jLabel3.setText("Name :");

      chkPassword.setText("Show Password");
      chkPassword.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            chkPasswordActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
               .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(jLabel4))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                  .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(chkPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addComponent(txtName)
               .addComponent(txtIC))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(txtIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel5))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel3))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel4)
               .addComponent(chkPassword))
            .addContainerGap())
      );

      btnClear.setText("Clear");
      btnClear.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnClearActionPerformed(evt);
         }
      });

      btnRefresh.setText("Refresh");
      btnRefresh.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnRefreshActionPerformed(evt);
         }
      });

      btnRegister.setText("Register");
      btnRegister.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnRegisterActionPerformed(evt);
         }
      });

      btnUpdate.setText("Update");
      btnUpdate.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnUpdateActionPerformed(evt);
         }
      });

      txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
         public void keyReleased(java.awt.event.KeyEvent evt) {
            txtSearchKeyReleased(evt);
         }
      });

      btnDelete.setText("Delete");
      btnDelete.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnDeleteActionPerformed(evt);
         }
      });

      jLabel1.setText("🔍");

      javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
      jPanel2.setLayout(jPanel2Layout);
      jPanel2Layout.setHorizontalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
               .addGroup(jPanel2Layout.createSequentialGroup()
                  .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                  .addComponent(txtSearch)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(btnRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                  .addGap(0, 0, Short.MAX_VALUE)
                  .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap())
      );

      jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnClear, btnDelete, btnRegister, btnUpdate});

      jPanel2Layout.setVerticalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
               .addComponent(btnDelete)
               .addComponent(btnClear)
               .addComponent(btnUpdate)
               .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(btnRefresh)
               .addComponent(jLabel1))
            .addContainerGap())
      );

      jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnClear, btnDelete, btnRegister, btnUpdate});

      tblPersonnel.setAutoCreateRowSorter(true);
      tblPersonnel.setBackground(new java.awt.Color(204, 204, 204));
      tblPersonnel.setForeground(new java.awt.Color(0, 0, 0));
      tblPersonnel.setModel(new javax.swing.table.DefaultTableModel(
         new Object [][] {
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null}
         },
         new String [] {
            "IC No", "Name", "Password"
         }
      ) {
         boolean[] canEdit = new boolean [] {
            false, false, false
         };

         public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
         }
      });
      tblPersonnel.setGridColor(new java.awt.Color(204, 204, 204));
      tblPersonnel.setSelectionBackground(new java.awt.Color(153, 153, 255));
      tblPersonnel.setSelectionForeground(new java.awt.Color(51, 51, 51));
      tblPersonnel.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
      tblPersonnel.setShowHorizontalLines(false);
      tblPersonnel.setShowVerticalLines(false);
      tblPersonnel.getTableHeader().setReorderingAllowed(false);
      tblPersonnel.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            tblPersonnelMouseClicked(evt);
         }
      });
      jScrollPane1.setViewportView(tblPersonnel);

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                  .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGroup(layout.createSequentialGroup()
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                           .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                           .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                     .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jLabel7))
                     .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)))
                  .addGap(0, 18, Short.MAX_VALUE)))
            .addContainerGap())
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(btnBack)
            .addGap(4, 4, 4)
            .addComponent(jLabel7)
            .addGap(27, 27, 27)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGap(18, 18, 18)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(16, 16, 16))
      );

      pack();
      setLocationRelativeTo(null);
   }// </editor-fold>//GEN-END:initComponents

   private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
      AdminMain a = new AdminMain();
      a.setVisible(true);
      this.dispose();
   }//GEN-LAST:event_btnBackActionPerformed

   private void chkPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPasswordActionPerformed
      if (chkPassword.isSelected()) {
         txtPassword.setEchoChar((char) 0); //password = JPasswordField
      } else {
         txtPassword.setEchoChar('*');
      }
   }//GEN-LAST:event_chkPasswordActionPerformed

   private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed

      int confirmReg = JOptionPane.showConfirmDialog(this, "Register New Personnel?", "Confirm Registration?", JOptionPane.YES_NO_OPTION);
      if (confirmReg == JOptionPane.YES_OPTION) {
         //validation for empty fields
         if (txtIC.getText().isBlank()
                 || txtPassword.getText().isBlank()
                 || txtName.getText().isBlank()) {
            JOptionPane.showMessageDialog(btnRegister, "Please fill in all the fields!");
         } else {
            Personnel found = DataIO.checkPersonnel(txtIC.getText().trim());

            // Check if IC exist, dont allow registration
            if (found != null) {
               JOptionPane.showMessageDialog(btnRegister, "Personnel already exists!");

            } else {
               Personnel user = new Personnel(txtIC.getText().trim(),
                       txtPassword.getText().trim(),
                       txtName.getText());
               DataIO.allPersonnel.add(user);
               DataIO.write();
               JOptionPane.showMessageDialog(btnRegister, "New Personnel Created!");
               btnRefreshActionPerformed(evt);
            }
         }
      }
   }//GEN-LAST:event_btnRegisterActionPerformed

   private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
      int confirmUpdate = JOptionPane.showConfirmDialog(this, "Update Profile", "Save Changes?", JOptionPane.YES_NO_OPTION);
      if (confirmUpdate == JOptionPane.YES_OPTION) {
         Personnel found = DataIO.checkPersonnel(txtIC.getText().trim());
         if (found == null) {
            JOptionPane.showMessageDialog(btnUpdate, "IC not found");
         } else {
            Vaccine.adminLogin = found;
            //validation for empty fields
            if (txtPassword.getText().isBlank()
                    || txtName.getText().isBlank()
                    || txtIC.getText().isBlank()) {
               JOptionPane.showMessageDialog(btnUpdate, "Please make sure all fields are filled!");
            } else {
               // updating user object with latest information
               Vaccine.adminLogin.setIcno(txtIC.getText().trim());
               Vaccine.adminLogin.setPersonnelName(txtName.getText());
               Vaccine.adminLogin.setPassword(txtPassword.getText().trim());
               DataIO.write();
               JOptionPane.showMessageDialog(btnUpdate, "Updated Successfully!");
               btnRefreshActionPerformed(evt);
            }
         }
      }
   }//GEN-LAST:event_btnUpdateActionPerformed

   private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
      txtIC.setText("");
      txtName.setText("");
      txtPassword.setText("");
      txtPassword.setEchoChar('*');
      chkPassword.setSelected(false);
      txtSearch.setText("");
      txtIC.enable(true);
      tblPersonnel.getSelectionModel().clearSelection();
   }//GEN-LAST:event_btnClearActionPerformed

   private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
      int confirmDelete = JOptionPane.showConfirmDialog(this, "Delete Personnel", "Confirm Deletion?", JOptionPane.YES_NO_OPTION);
      if (confirmDelete == JOptionPane.YES_OPTION) {
         Personnel found = DataIO.checkPersonnel(txtIC.getText().trim());
         if (found == null) {
            JOptionPane.showMessageDialog(btnDelete, "IC not found");
         } else {
            Vaccine.adminLogin = found;
            for (int i = 0; i < DataIO.allPersonnel.size(); i++) {
               if (Vaccine.adminLogin == DataIO.allPersonnel.get(i)) {
                  DataIO.allPersonnel.remove(i);
                  break;
               }
            }
            DataIO.write();
            JOptionPane.showMessageDialog(btnDelete, "Deleted Successfully!");
            btnRefreshActionPerformed(evt);
         }
      }
   }//GEN-LAST:event_btnDeleteActionPerformed

   private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
      DefaultTableModel model = (DefaultTableModel) tblPersonnel.getModel();
      String input = txtSearch.getText();
      TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
      tblPersonnel.setRowSorter(tr);
      tr.setRowFilter(RowFilter.regexFilter(input));
   }//GEN-LAST:event_txtSearchKeyReleased

   private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed

      DefaultTableModel model = (DefaultTableModel) tblPersonnel.getModel();
      model.setRowCount(0);
      for (int i = 0; i < DataIO.allPersonnel.size(); i++) {
         String icno = DataIO.allPersonnel.get(i).getIcno();
         String name = DataIO.allPersonnel.get(i).getPersonnelName();
         String password = DataIO.allPersonnel.get(i).getPassword();
         String array[] = {icno, name, password};
         model.addRow(array);
      }
      tblPersonnel.getColumnModel().getColumn(2).setMinWidth(0);
      tblPersonnel.getColumnModel().getColumn(2).setMaxWidth(0);
      btnClearActionPerformed(evt);
      txtIC.enable(true);

      TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
      tblPersonnel.setRowSorter(tr);
      tr.setRowFilter(RowFilter.regexFilter(""));
   }//GEN-LAST:event_btnRefreshActionPerformed

   private void tblPersonnelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPersonnelMouseClicked

      txtIC.setText(tblPersonnel.getValueAt(tblPersonnel.getSelectedRow(), 0).toString());
      txtName.setText(tblPersonnel.getValueAt(tblPersonnel.getSelectedRow(), 1).toString());
      txtPassword.setText(tblPersonnel.getValueAt(tblPersonnel.getSelectedRow(), 2).toString());

      txtIC.enable(false);
   }//GEN-LAST:event_tblPersonnelMouseClicked

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
         java.util.logging.Logger.getLogger(AdminPersonnelManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (InstantiationException ex) {
         java.util.logging.Logger.getLogger(AdminPersonnelManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
         java.util.logging.Logger.getLogger(AdminPersonnelManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
         java.util.logging.Logger.getLogger(AdminPersonnelManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      //</editor-fold>
      //</editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            new AdminPersonnelManagement().setVisible(true);
         }
      });
   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton btnBack;
   private javax.swing.JButton btnClear;
   private javax.swing.JButton btnDelete;
   private javax.swing.JButton btnRefresh;
   private javax.swing.JButton btnRegister;
   private javax.swing.JButton btnUpdate;
   private javax.swing.JCheckBox chkPassword;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JLabel jLabel5;
   private javax.swing.JLabel jLabel7;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JPanel jPanel2;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JTable tblPersonnel;
   private javax.swing.JTextField txtIC;
   private javax.swing.JTextField txtName;
   private javax.swing.JPasswordField txtPassword;
   private javax.swing.JTextField txtSearch;
   // End of variables declaration//GEN-END:variables
}
