/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vaccine;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import vaccine.Class.*;

/**
 *
 * @author User
 */
public class AdminCentreManagement extends javax.swing.JFrame {

   /**
    * Creates new form admin_vaccine
    */
   public AdminCentreManagement() {
      initComponents();
      DefaultTableModel model = (DefaultTableModel) tblCentre.getModel();
      model.setRowCount(0);
      for (int i = 0; i < DataIO.allCentres.size(); i++) {
         String id = String.valueOf(DataIO.allCentres.get(i).getCentreId());
         String name = DataIO.allCentres.get(i).getCentreName();
         String address = DataIO.allCentres.get(i).getAddress();
         String status = DataIO.allCentres.get(i).getStatus();
         String array[] = {id, name, address, status};
         model.addRow(array);
      }
      tblCentre.getColumnModel().getColumn(0).setMinWidth(0);
      tblCentre.getColumnModel().getColumn(0).setMaxWidth(0);
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
      jLabel2 = new javax.swing.JLabel();
      btnCreate = new javax.swing.JButton();
      txtSearch = new javax.swing.JTextField();
      btnInactive = new javax.swing.JButton();
      jLabel4 = new javax.swing.JLabel();
      txtName = new javax.swing.JTextField();
      btnUpdate = new javax.swing.JButton();
      btnRefresh = new javax.swing.JButton();
      txtAddress = new javax.swing.JTextField();
      jLabel6 = new javax.swing.JLabel();
      btnActive = new javax.swing.JButton();
      jLabel1 = new javax.swing.JLabel();
      jScrollPane1 = new javax.swing.JScrollPane();
      tblCentre = new javax.swing.JTable();
      txtID = new javax.swing.JTextField();
      jLabel7 = new javax.swing.JLabel();
      btnClear = new javax.swing.JButton();
      jLabel3 = new javax.swing.JLabel();
      btnBack = new javax.swing.JButton();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setResizable(false);

      jLabel2.setText("Centre Name");

      btnCreate.setText("Create");
      btnCreate.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnCreateActionPerformed(evt);
         }
      });

      txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
         public void keyReleased(java.awt.event.KeyEvent evt) {
            txtSearchKeyReleased(evt);
         }
      });

      btnInactive.setText("Inactive");
      btnInactive.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnInactiveActionPerformed(evt);
         }
      });

      jLabel4.setText("Address");

      btnUpdate.setText("Update");
      btnUpdate.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnUpdateActionPerformed(evt);
         }
      });

      btnRefresh.setText("Refresh");
      btnRefresh.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnRefreshActionPerformed(evt);
         }
      });

      jLabel6.setText("????");

      btnActive.setText("Active");
      btnActive.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnActiveActionPerformed(evt);
         }
      });

      jLabel1.setText("Update Status  :");

      tblCentre.setAutoCreateRowSorter(true);
      tblCentre.setBackground(new java.awt.Color(204, 204, 204));
      tblCentre.setForeground(new java.awt.Color(0, 0, 0));
      tblCentre.setModel(new javax.swing.table.DefaultTableModel(
         new Object [][] {
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null}
         },
         new String [] {
            "CentreID", "CentreName", "Address", "Status"
         }
      ) {
         boolean[] canEdit = new boolean [] {
            false, false, false, false
         };

         public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
         }
      });
      tblCentre.setGridColor(new java.awt.Color(204, 204, 204));
      tblCentre.setSelectionBackground(new java.awt.Color(153, 153, 255));
      tblCentre.setSelectionForeground(new java.awt.Color(51, 51, 51));
      tblCentre.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
      tblCentre.setShowHorizontalLines(false);
      tblCentre.setShowVerticalLines(false);
      tblCentre.getTableHeader().setReorderingAllowed(false);
      tblCentre.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            tblCentreMouseClicked(evt);
         }
      });
      jScrollPane1.setViewportView(tblCentre);

      txtID.setDisabledTextColor(new java.awt.Color(102, 102, 102));
      txtID.setEnabled(false);

      jLabel7.setText("Centre ID");

      btnClear.setText("Clear");
      btnClear.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnClearActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                     .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                     .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                     .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActive, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnInactive, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                     .addComponent(txtAddress)
                     .addComponent(txtName)))
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                     .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                     .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                     .addComponent(btnRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))))
            .addContainerGap())
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel7)
               .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(btnInactive)
               .addComponent(btnActive)
               .addComponent(jLabel1))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel2)
               .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel4))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(btnCreate)
               .addComponent(btnUpdate)
               .addComponent(btnClear))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(btnRefresh)
               .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
      );

      jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
      jLabel3.setText("Centre Management");
      jLabel3.setToolTipText("");
      jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

      btnBack.setText("Back ???");
      btnBack.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnBackActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGap(54, 54, 54)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(54, Short.MAX_VALUE))
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                  .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addContainerGap())
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                  .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(198, 198, 198))))
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(btnBack)
            .addGap(26, 26, 26)
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(35, Short.MAX_VALUE))
      );

      pack();
      setLocationRelativeTo(null);
   }// </editor-fold>//GEN-END:initComponents

   private void tblCentreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCentreMouseClicked

      txtID.setText(tblCentre.getValueAt(tblCentre.getSelectedRow(), 0).toString());
      txtName.setText(tblCentre.getValueAt(tblCentre.getSelectedRow(), 1).toString());
      txtAddress.setText(tblCentre.getValueAt(tblCentre.getSelectedRow(), 2).toString());

   }//GEN-LAST:event_tblCentreMouseClicked

   private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
      txtID.setText("");
      txtName.setText("");
      txtAddress.setText("");
      txtSearch.setText("");
      tblCentre.getSelectionModel().clearSelection();
   }//GEN-LAST:event_btnClearActionPerformed

   private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
      if (txtID.getText().trim().equals("")) {
         JOptionPane.showMessageDialog(btnUpdate, "Select a centre to update!");
      } else {
         int confirmUpdate = JOptionPane.showConfirmDialog(this, "Update Centre", "Save Changes?", JOptionPane.YES_NO_OPTION);
         if (confirmUpdate == JOptionPane.YES_OPTION) {
            // allow only if a row is selected
            if (!txtID.getText().isBlank()) {
               Centre found = DataIO.checkCentre(Integer.valueOf(txtID.getText()));
               Vaccine.editCentre = found;
               // empty fields validation
               if (txtName.getText().isBlank()
                       || txtAddress.getText().isBlank()) {
                  JOptionPane.showMessageDialog(btnCreate, "Please fill in all the fields!");
               } else {
                  Vaccine.editCentre.setCentreName(txtName.getText());
                  Vaccine.editCentre.setAddress(txtAddress.getText());
                  DataIO.write();
                  btnRefreshActionPerformed(evt);
                  JOptionPane.showMessageDialog(btnUpdate, "Updated Successfully!");
               }
            } else {
               JOptionPane.showMessageDialog(btnCreate, "Please select a row");
            }
         }
      }
   }//GEN-LAST:event_btnUpdateActionPerformed

   private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
      int confirmReg = JOptionPane.showConfirmDialog(this, "Create a New Centre?", "Confirm Creation?", JOptionPane.YES_NO_OPTION);
      if (confirmReg == JOptionPane.YES_OPTION) {
         // allow only if a row is not selected
         if (txtID.getText().isBlank() || tblCentre.getSelectionModel().isSelectionEmpty()) {
            // empty fields validation
            if (txtName.getText().isBlank()
                    || txtAddress.getText().isBlank()) {
               JOptionPane.showMessageDialog(btnCreate, "Please fill in all the fields!");
            } else {
               Centre newCentre = new Centre(DataIO.getCentreSize() + 1,
                       txtName.getText(),
                       txtAddress.getText(),
                       "Active");
               DataIO.allCentres.add(newCentre);
               DataIO.write();
               btnRefreshActionPerformed(evt);
               JOptionPane.showMessageDialog(btnCreate, "Centre Sucessfully Created!");
            }
         } else {
            JOptionPane.showMessageDialog(btnCreate, "Please unselect the row");
         }
      }
   }//GEN-LAST:event_btnCreateActionPerformed

   private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed

      DefaultTableModel model = (DefaultTableModel) tblCentre.getModel();
      model.setRowCount(0);
      for (int i = 0; i < DataIO.allCentres.size(); i++) {
         String id = String.valueOf(DataIO.allCentres.get(i).getCentreId());
         String name = DataIO.allCentres.get(i).getCentreName();
         String address = DataIO.allCentres.get(i).getAddress();
         String status = DataIO.allCentres.get(i).getStatus();
         String array[] = {id, name, address, status};
         model.addRow(array);
      }
      tblCentre.getColumnModel().getColumn(0).setMinWidth(0);
      tblCentre.getColumnModel().getColumn(0).setMaxWidth(0);
      btnClearActionPerformed(evt);

      TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
      tblCentre.setRowSorter(tr);
      tr.setRowFilter(RowFilter.regexFilter(""));
   }//GEN-LAST:event_btnRefreshActionPerformed

   private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
      DefaultTableModel model = (DefaultTableModel) tblCentre.getModel();
      String input = txtSearch.getText();
      TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
      tblCentre.setRowSorter(tr);
      tr.setRowFilter(RowFilter.regexFilter(input));
   }//GEN-LAST:event_txtSearchKeyReleased

   private void btnActiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActiveActionPerformed
      int activate = JOptionPane.showConfirmDialog(this, "Activate the Centre?", "Confirm Activation?", JOptionPane.YES_NO_OPTION);
      if (activate == JOptionPane.YES_OPTION) {
         if (!txtID.getText().isBlank()) {
            Centre found = DataIO.checkCentre(Integer.valueOf(txtID.getText()));
            Vaccine.editCentre = found;
            if (Vaccine.editCentre.getStatus().equals("Active")) {
               JOptionPane.showMessageDialog(btnActive, "Centre is already active!");
            } else {
               Vaccine.editCentre.setStatus("Active");
               for (int i = 0; i < DataIO.allVaccines.size(); i++) {
                  if (DataIO.allVaccines.get(i).getCentre().getCentreName().equals(Vaccine.editCentre.getCentreName())) {
                     DataIO.allVaccines.get(i).setCentre(Vaccine.editCentre);
                  }
               }
               DataIO.write();
               JOptionPane.showMessageDialog(btnActive, "Activated Successfully!");
               btnRefreshActionPerformed(evt);
            }
         } else {
            JOptionPane.showMessageDialog(btnActive, "Please select a row");
         }
      }
   }//GEN-LAST:event_btnActiveActionPerformed

   private void btnInactiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInactiveActionPerformed
      int deactivate = JOptionPane.showConfirmDialog(this, "Close down the Centre?", "Confirm Deactivation?", JOptionPane.YES_NO_OPTION);
      if (deactivate == JOptionPane.YES_OPTION) {
         if (!txtID.getText().isBlank()) {
            Centre found = DataIO.checkCentre(Integer.valueOf(txtID.getText()));
            Vaccine.editCentre = found;
            if (Vaccine.editCentre.getStatus().equals("Inactive")) {
               JOptionPane.showMessageDialog(btnInactive, "Centre is already inactive!");
            } else {
               Vaccine.editCentre.setStatus("Inactive");
               for (int i = 0; i < DataIO.allVaccines.size(); i++) {
                  if (DataIO.allVaccines.get(i).getCentre().getCentreName().equals(Vaccine.editCentre.getCentreName())) {
                     DataIO.allVaccines.get(i).setCentre(Vaccine.editCentre);
                  }
               }
               DataIO.write();
               JOptionPane.showMessageDialog(btnInactive, "Centre is now Inactive!");
               btnRefreshActionPerformed(evt);
            }
         } else {
            JOptionPane.showMessageDialog(btnInactive, "Please select a row");
         }
      }
   }//GEN-LAST:event_btnInactiveActionPerformed

   private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
      AdminMain a = new AdminMain();
      a.setVisible(true);
      this.dispose();
   }//GEN-LAST:event_btnBackActionPerformed

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
         java.util.logging.Logger.getLogger(AdminCentreManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (InstantiationException ex) {
         java.util.logging.Logger.getLogger(AdminCentreManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
         java.util.logging.Logger.getLogger(AdminCentreManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
         java.util.logging.Logger.getLogger(AdminCentreManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      //</editor-fold>
      //</editor-fold>
      //</editor-fold>
      //</editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            new AdminCentreManagement().setVisible(true);
         }
      });
   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton btnActive;
   private javax.swing.JButton btnBack;
   private javax.swing.JButton btnClear;
   private javax.swing.JButton btnCreate;
   private javax.swing.JButton btnInactive;
   private javax.swing.JButton btnRefresh;
   private javax.swing.JButton btnUpdate;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JLabel jLabel6;
   private javax.swing.JLabel jLabel7;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JTable tblCentre;
   private javax.swing.JTextField txtAddress;
   private javax.swing.JTextField txtID;
   private javax.swing.JTextField txtName;
   private javax.swing.JTextField txtSearch;
   // End of variables declaration//GEN-END:variables
}
