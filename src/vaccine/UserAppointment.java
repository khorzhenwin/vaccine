/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vaccine;

import javax.swing.DefaultComboBoxModel;
import vaccine.Class.*;

/**
 *
 * @author User
 */
public class UserAppointment extends javax.swing.JFrame {

   /**
    * Creates new form user_vaccine
    */
   public UserAppointment() {
      initComponents();
      DefaultComboBoxModel comboCentre = (DefaultComboBoxModel) cmbCentreName.getModel();
      DefaultComboBoxModel comboVaccine = (DefaultComboBoxModel) cmbVaccineName.getModel();
      DefaultComboBoxModel comboTime1 = (DefaultComboBoxModel) cmbTimeSlot1.getModel();
      comboCentre.removeAllElements();
      comboVaccine.removeAllElements();
      comboTime1.removeAllElements();

      // setting IC value
      txtIC.setText(Vaccine.login.getIcno());

      // setting Centre dropdown values
      for (int i = 0; i < DataIO.allCentres.size(); i++) {
         if (DataIO.allCentres.get(i).getStatus().equals("Active") && DataIO.allCentres.get(i).getMyInventory() != null) {
            comboCentre.addElement(DataIO.allCentres.get(i).getCentreName());
            lblCentreID.setText(String.valueOf(DataIO.allCentres.get(i).getCentreId()));
         }
      }
      // setting Vaccine Name dropdown values
      if (comboCentre.getSize() == 0) {
         comboCentre.addElement("No Centres available");
      } else {
         Vaccine.editCentre = DataIO.checkCentre(comboCentre.getSelectedItem().toString());
         for (int j = 0; j < DataIO.allVaccines.size(); j++) {
            if (Vaccine.editCentre.getCentreId() == DataIO.allVaccines.get(j).getCentre().getCentreId()) {
               if (DataIO.allVaccines.get(j).getInventory() >= 2) {
                  Vaccine.editCentre.getMyInventory().add(DataIO.allVaccines.get(j));
                  comboVaccine.addElement(DataIO.allVaccines.get(j).getVaccineName());
               }
            }
         }
      }
      // set up date dropdown values
      // set up time dropdown values
      String[] time1 = DataIO.getTimeSlot1();
      for (String slot : time1) {
         comboTime1.addElement(slot);
      }
   }

   /**
    * This method is called from within the constructor to initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is always
    * regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      btnBack = new javax.swing.JButton();
      txtTimeSlot2 = new javax.swing.JTextField();
      jLabel12 = new javax.swing.JLabel();
      jLabel11 = new javax.swing.JLabel();
      txtDate2 = new javax.swing.JTextField();
      cmbTimeSlot1 = new javax.swing.JComboBox<>();
      jLabel10 = new javax.swing.JLabel();
      jLabel9 = new javax.swing.JLabel();
      jLabel8 = new javax.swing.JLabel();
      cmbVaccineName = new javax.swing.JComboBox<>();
      cmbCentreName = new javax.swing.JComboBox<>();
      jLabel13 = new javax.swing.JLabel();
      jLabel7 = new javax.swing.JLabel();
      txtIC = new javax.swing.JTextField();
      jLabel6 = new javax.swing.JLabel();
      lblVaccineID = new javax.swing.JLabel();
      lblCentreID = new javax.swing.JLabel();
      dtpDate1 = new com.toedter.calendar.JDateChooser();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setResizable(false);

      btnBack.setText("Back ➤");
      btnBack.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnBackActionPerformed(evt);
         }
      });

      txtTimeSlot2.setDisabledTextColor(new java.awt.Color(102, 102, 102));
      txtTimeSlot2.setEnabled(false);

      jLabel12.setText("Time Slot");

      jLabel11.setText("2nd Dose Date");

      txtDate2.setDisabledTextColor(new java.awt.Color(102, 102, 102));
      txtDate2.setEnabled(false);

      cmbTimeSlot1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

      jLabel10.setText("Time Slot");

      jLabel9.setText("1st Dose Date");

      jLabel8.setText("Vaccine Name");

      cmbVaccineName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
      cmbVaccineName.addItemListener(new java.awt.event.ItemListener() {
         public void itemStateChanged(java.awt.event.ItemEvent evt) {
            cmbVaccineNameItemStateChanged(evt);
         }
      });

      cmbCentreName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
      cmbCentreName.addItemListener(new java.awt.event.ItemListener() {
         public void itemStateChanged(java.awt.event.ItemEvent evt) {
            cmbCentreNameItemStateChanged(evt);
         }
      });

      jLabel13.setText("Centre Name");

      jLabel7.setText("IC. No ");

      txtIC.setForeground(new java.awt.Color(0, 0, 0));
      txtIC.setDisabledTextColor(new java.awt.Color(102, 102, 102));
      txtIC.setEnabled(false);
      txtIC.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtICActionPerformed(evt);
         }
      });

      jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
      jLabel6.setText("Create Appointment");
      jLabel6.setToolTipText("");
      jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

      lblVaccineID.setBackground(new java.awt.Color(255, 255, 255));
      lblVaccineID.setFont(new java.awt.Font("Dialog", 0, 3)); // NOI18N
      lblVaccineID.setForeground(new java.awt.Color(255, 255, 255));
      lblVaccineID.setEnabled(false);
      lblVaccineID.setFocusable(false);
      lblVaccineID.setInheritsPopupMenu(false);
      lblVaccineID.setRequestFocusEnabled(false);
      lblVaccineID.setVerifyInputWhenFocusTarget(false);

      lblCentreID.setBackground(new java.awt.Color(255, 255, 255));
      lblCentreID.setFont(new java.awt.Font("Dialog", 0, 3)); // NOI18N
      lblCentreID.setForeground(new java.awt.Color(255, 255, 255));
      lblCentreID.setEnabled(false);
      lblCentreID.setFocusable(false);
      lblCentreID.setInheritsPopupMenu(false);
      lblCentreID.setRequestFocusEnabled(false);
      lblCentreID.setVerifyInputWhenFocusTarget(false);
      lblCentreID.addInputMethodListener(new java.awt.event.InputMethodListener() {
         public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
         }
         public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            lblCentreIDInputMethodTextChanged(evt);
         }
      });
      lblCentreID.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
         public void propertyChange(java.beans.PropertyChangeEvent evt) {
            lblCentreIDPropertyChange(evt);
         }
      });

      dtpDate1.setDateFormatString("dd/MM/yyyy");

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addComponent(lblVaccineID, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
         .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
               .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                  .addGap(104, 104, 104)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                     .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                     .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                  .addGap(33, 33, 33)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                     .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbTimeSlot1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                     .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(dtpDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                     .addComponent(txtDate2, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                     .addComponent(txtTimeSlot2)))
               .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                  .addGap(247, 247, 247)
                  .addComponent(jLabel6))
               .addGroup(layout.createSequentialGroup()
                  .addContainerGap(112, Short.MAX_VALUE)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIC, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
                     .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                           .addComponent(cmbVaccineName, 0, 402, Short.MAX_VALUE)
                           .addComponent(cmbCentreName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGap(110, 110, 110))
         .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
               .addGap(10, 10, 10)
               .addComponent(lblCentreID, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addContainerGap(730, Short.MAX_VALUE)))
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                  .addContainerGap()
                  .addComponent(btnBack))
               .addComponent(lblVaccineID, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(32, 32, 32)
            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(28, 28, 28)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(txtIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel7))
            .addGap(6, 6, 6)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(cmbCentreName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel13))
            .addGap(6, 6, 6)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(cmbVaccineName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel8))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(txtDate2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(jLabel11)
                     .addComponent(jLabel9))
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbTimeSlot1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10))
                     .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTimeSlot2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12))))
               .addComponent(dtpDate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(84, Short.MAX_VALUE))
         .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
               .addGap(10, 10, 10)
               .addComponent(lblCentreID, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addContainerGap(363, Short.MAX_VALUE)))
      );

      pack();
      setLocationRelativeTo(null);
   }// </editor-fold>//GEN-END:initComponents

   private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
      UserMain a = new UserMain();
      a.setVisible(true);
      this.dispose();
   }//GEN-LAST:event_btnBackActionPerformed

   private void txtICActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtICActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_txtICActionPerformed

   private void cmbVaccineNameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbVaccineNameItemStateChanged
//      // setting Centre dropdown values
//      DefaultComboBoxModel comboCentre = (DefaultComboBoxModel) cmbCentreName.getModel();
//      DefaultComboBoxModel comboVaccine = (DefaultComboBoxModel) cmbVaccineName.getModel();
//
//      if (comboCentre.getSelectedItem() != null) {
//
//         // setting Vaccine Name
//         Vaccine.editCentre = DataIO.checkCentre(comboCentre.getSelectedItem().toString());
//         for (int j = 0; j < DataIO.allVaccines.size(); j++) {
//            if (Vaccine.editCentre.getCentreId() == DataIO.allVaccines.get(j).getCentre().getCentreId()) {
//               if (DataIO.allVaccines.get(j).getInventory() >= 2) {
//
//                  comboVaccine.addElement(DataIO.allVaccines.get(j).getVaccineName());
//               }
//            }
//         }
//      }
   }//GEN-LAST:event_cmbVaccineNameItemStateChanged

   private void cmbCentreNameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCentreNameItemStateChanged
      DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) cmbCentreName.getModel();
      if (comboBoxModel.getSelectedItem() != null) {
         String selectedCentre = comboBoxModel.getSelectedItem().toString();
         Centre selected = DataIO.checkCentre(selectedCentre);
         lblCentreID.setText(String.valueOf(selected.getCentreId()));
      }
   }//GEN-LAST:event_cmbCentreNameItemStateChanged

   private void lblCentreIDInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_lblCentreIDInputMethodTextChanged

   }//GEN-LAST:event_lblCentreIDInputMethodTextChanged

   private void lblCentreIDPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_lblCentreIDPropertyChange
      DefaultComboBoxModel comboVaccine = (DefaultComboBoxModel) cmbVaccineName.getModel();
      if (!lblCentreID.getText().equals("")) {
         // setting Vaccine Name
         comboVaccine.removeAllElements();
         Centre selected = DataIO.checkCentre(Integer.valueOf(lblCentreID.getText().trim()));
         if (selected != null) {
            for (int j = 0; j < DataIO.allVaccines.size(); j++) {
               if (selected.getCentreId() == DataIO.allVaccines.get(j).getCentre().getCentreId()) {
                  if (DataIO.allVaccines.get(j).getInventory() >= 2) {
                     comboVaccine.addElement(DataIO.allVaccines.get(j).getVaccineName());
                  }
               }
            }
         }
      }
   }//GEN-LAST:event_lblCentreIDPropertyChange

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
         java.util.logging.Logger.getLogger(UserAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (InstantiationException ex) {
         java.util.logging.Logger.getLogger(UserAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
         java.util.logging.Logger.getLogger(UserAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
         java.util.logging.Logger.getLogger(UserAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      //</editor-fold>
      //</editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            new UserAppointment().setVisible(true);
         }
      });
   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton btnBack;
   private javax.swing.JComboBox<String> cmbCentreName;
   private javax.swing.JComboBox<String> cmbTimeSlot1;
   private javax.swing.JComboBox<String> cmbVaccineName;
   private com.toedter.calendar.JDateChooser dtpDate1;
   private javax.swing.JLabel jLabel10;
   private javax.swing.JLabel jLabel11;
   private javax.swing.JLabel jLabel12;
   private javax.swing.JLabel jLabel13;
   private javax.swing.JLabel jLabel6;
   private javax.swing.JLabel jLabel7;
   private javax.swing.JLabel jLabel8;
   private javax.swing.JLabel jLabel9;
   private javax.swing.JLabel lblCentreID;
   private javax.swing.JLabel lblVaccineID;
   private javax.swing.JTextField txtDate2;
   private javax.swing.JTextField txtIC;
   private javax.swing.JTextField txtTimeSlot2;
   // End of variables declaration//GEN-END:variables
}
