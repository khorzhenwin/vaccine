/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vaccine;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
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
      // set up date chooser
      dtpDate1.setMinSelectableDate(new Date());
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
      lblVaccineID = new javax.swing.JLabel();
      lblCentreID = new javax.swing.JLabel();
      jPanel1 = new javax.swing.JPanel();
      cmbTimeSlot1 = new javax.swing.JComboBox<>();
      jLabel9 = new javax.swing.JLabel();
      cmbCentreName = new javax.swing.JComboBox<>();
      jLabel6 = new javax.swing.JLabel();
      jLabel8 = new javax.swing.JLabel();
      jLabel12 = new javax.swing.JLabel();
      jLabel11 = new javax.swing.JLabel();
      txtIC = new javax.swing.JTextField();
      txtTimeSlot2 = new javax.swing.JTextField();
      dtpDate1 = new com.toedter.calendar.JDateChooser();
      jLabel7 = new javax.swing.JLabel();
      jLabel10 = new javax.swing.JLabel();
      jLabel13 = new javax.swing.JLabel();
      cmbVaccineName = new javax.swing.JComboBox<>();
      dtpDate2 = new com.toedter.calendar.JDateChooser();
      btnCreate = new javax.swing.JButton();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setResizable(false);

      btnBack.setText("Back ???");
      btnBack.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnBackActionPerformed(evt);
         }
      });

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

      cmbTimeSlot1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
      cmbTimeSlot1.addItemListener(new java.awt.event.ItemListener() {
         public void itemStateChanged(java.awt.event.ItemEvent evt) {
            cmbTimeSlot1ItemStateChanged(evt);
         }
      });

      jLabel9.setText("1st Dose Date");

      cmbCentreName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
      cmbCentreName.addItemListener(new java.awt.event.ItemListener() {
         public void itemStateChanged(java.awt.event.ItemEvent evt) {
            cmbCentreNameItemStateChanged(evt);
         }
      });
      cmbCentreName.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            cmbCentreNameMouseClicked(evt);
         }
      });

      jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
      jLabel6.setText("Create Appointment");
      jLabel6.setToolTipText("");
      jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

      jLabel8.setText("Vaccine Name");

      jLabel12.setText("Time Slot");

      jLabel11.setText("2nd Dose Date");

      txtIC.setForeground(new java.awt.Color(0, 0, 0));
      txtIC.setDisabledTextColor(new java.awt.Color(102, 102, 102));
      txtIC.setEnabled(false);
      txtIC.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtICActionPerformed(evt);
         }
      });

      txtTimeSlot2.setDisabledTextColor(new java.awt.Color(102, 102, 102));
      txtTimeSlot2.setEnabled(false);

      dtpDate1.setDateFormatString("dd/MM/yyyy");
      dtpDate1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
         public void propertyChange(java.beans.PropertyChangeEvent evt) {
            dtpDate1PropertyChange(evt);
         }
      });

      jLabel7.setText("IC. No ");

      jLabel10.setText("Time Slot");

      jLabel13.setText("Centre Name");

      cmbVaccineName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
      cmbVaccineName.addItemListener(new java.awt.event.ItemListener() {
         public void itemStateChanged(java.awt.event.ItemEvent evt) {
            cmbVaccineNameItemStateChanged(evt);
         }
      });

      dtpDate2.setBackground(new java.awt.Color(204, 204, 204));
      dtpDate2.setForeground(new java.awt.Color(0, 0, 0));
      dtpDate2.setDateFormatString("dd/MM/yyyy");
      dtpDate2.setEnabled(false);
      dtpDate2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
         public void propertyChange(java.beans.PropertyChangeEvent evt) {
            dtpDate2PropertyChange(evt);
         }
      });

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
               .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                     .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                     .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGap(33, 33, 33)
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cmbTimeSlot1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                     .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(dtpDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(txtTimeSlot2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(dtpDate2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
               .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                  .addGap(143, 143, 143)
                  .addComponent(jLabel6))
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIC, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
                     .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                           .addComponent(cmbVaccineName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                           .addComponent(cmbCentreName, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))))))
            .addContainerGap())
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(28, 28, 28)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(txtIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel7))
            .addGap(6, 6, 6)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(cmbCentreName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel13))
            .addGap(6, 6, 6)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(cmbVaccineName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel8))
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(dtpDate2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(jLabel9)
                     .addComponent(jLabel11))
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbTimeSlot1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10))
                     .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTimeSlot2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12))))
               .addComponent(dtpDate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap())
      );

      btnCreate.setText("Create Appointment");
      btnCreate.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnCreateActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addComponent(lblVaccineID, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 543, Short.MAX_VALUE)
            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
         .addGroup(layout.createSequentialGroup()
            .addGap(53, 53, 53)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
               .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(btnCreate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
         .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
               .addGap(10, 10, 10)
               .addComponent(lblCentreID, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addContainerGap(639, Short.MAX_VALUE)))
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                  .addContainerGap()
                  .addComponent(btnBack))
               .addComponent(lblVaccineID, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(38, 38, 38)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(31, 31, 31)
            .addComponent(btnCreate)
            .addContainerGap(51, Short.MAX_VALUE))
         .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
               .addGap(10, 10, 10)
               .addComponent(lblCentreID, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addContainerGap(403, Short.MAX_VALUE)))
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
      DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) cmbVaccineName.getModel();
      if (comboBoxModel.getSelectedItem() != null) {
         String selectedVaccine = cmbVaccineName.getSelectedItem().toString();
         VaccineSupply type = DataIO.checkSupply(cmbCentreName.getSelectedItem().toString(), selectedVaccine);
         lblVaccineID.setText(String.valueOf(type.getVaccineID()));
      }
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

   private void cmbTimeSlot1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbTimeSlot1ItemStateChanged
      DefaultComboBoxModel comboTime1 = (DefaultComboBoxModel) cmbTimeSlot1.getModel();
      if (comboTime1.getSelectedItem() != null) {
         String selected = comboTime1.getSelectedItem().toString().trim();
         String[] time1 = DataIO.getTimeSlot1();
         String[] time2 = DataIO.getTimeSlot2();
         int index = 0;
         for (int i = 0; i < time1.length; i++) {
            if (selected.equals(time1[i])) {
               index = i;
            }
         }
         txtTimeSlot2.setText(time2[index]);
      }
   }//GEN-LAST:event_cmbTimeSlot1ItemStateChanged

   private void dtpDate1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dtpDate1PropertyChange
      if (dtpDate1.getDate() != null) {
         Calendar c = Calendar.getInstance();
         c.setTime(dtpDate1.getDate());
         c.add(Calendar.DATE, 21);
         Date futureDate = c.getTime();
         dtpDate2.setDate(futureDate);

      }
   }//GEN-LAST:event_dtpDate1PropertyChange

   private void dtpDate2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dtpDate2PropertyChange
      // TODO add your handling code here:
   }//GEN-LAST:event_dtpDate2PropertyChange

   private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
      int confirmCreate = JOptionPane.showConfirmDialog(this, "Make an Appointment?", "Confirm all appointment details?", JOptionPane.YES_NO_OPTION);
      if (confirmCreate == JOptionPane.YES_OPTION) {

         // empty fields validation
         if (cmbCentreName.getSelectedItem() == null
                 || cmbVaccineName.getSelectedItem() == null
                 || dtpDate1.getDate() == null
                 || dtpDate2.getDate() == null
                 || cmbTimeSlot1.getSelectedItem() == null
                 || txtTimeSlot2.getText().isBlank()) {
            JOptionPane.showMessageDialog(btnCreate, "Please ensure all the appointment details are filled!");
         } else {
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            boolean found = DataIO.hasAppointment(cmbCentreName.getSelectedItem().toString(),
                    df.format(dtpDate1.getDate()),
                    cmbTimeSlot1.getSelectedItem().toString());
            if (found) {
               JOptionPane.showMessageDialog(btnCreate, "Another user has already booked this slot!");
            } else {
               boolean foundCentreSupply = DataIO.checkSupplyCentreExists(cmbCentreName.getSelectedItem().toString(), cmbVaccineName.getSelectedItem().toString());
               if (foundCentreSupply) {

                  Centre location = DataIO.checkCentre(cmbCentreName.getSelectedItem().toString());
                  VaccineSupply inventory = DataIO.checkSupply(Integer.valueOf(lblVaccineID.getText().trim()));
                  // -2 in inventory
                  for (int i = 0; i < DataIO.allVaccines.size(); i++) {
                     if (inventory.getVaccineID() == DataIO.allVaccines.get(i).getVaccineID()) {
                        DataIO.allVaccines.get(i).reserve2Dose();
                     }
                  }
                  Appointment newAppointment = new Appointment(Vaccine.login,
                          df.format(dtpDate1.getDate()),
                          df.format(dtpDate2.getDate()),
                          cmbTimeSlot1.getSelectedItem().toString(),
                          txtTimeSlot2.getText().trim(),
                          location,
                          cmbVaccineName.getSelectedItem().toString());
                  DataIO.allAppointments.add(newAppointment);
                  DataIO.write();
                  JOptionPane.showMessageDialog(btnCreate, "Appointment has successfully been made!\n"
                          + "Note: You may only cancel your appointment before the appointment date");
                  Vaccine.app = newAppointment;
                  UserStatus a = new UserStatus();
                  a.setVisible(true);
                  this.dispose();
               } else {
                  JOptionPane.showMessageDialog(btnCreate, "Vaccine doesn't exist at this centre");
               }
            }
         }
      }
   }//GEN-LAST:event_btnCreateActionPerformed

   private void cmbCentreNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbCentreNameMouseClicked
      DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) cmbCentreName.getModel();
      if (comboBoxModel.getSelectedItem() != null) {
         String selectedCentre = comboBoxModel.getSelectedItem().toString();
         Centre selected = DataIO.checkCentre(selectedCentre);
         lblCentreID.setText(String.valueOf(selected.getCentreId()));
      }
   }//GEN-LAST:event_cmbCentreNameMouseClicked

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
   private javax.swing.JButton btnCreate;
   private javax.swing.JComboBox<String> cmbCentreName;
   private javax.swing.JComboBox<String> cmbTimeSlot1;
   private javax.swing.JComboBox<String> cmbVaccineName;
   private com.toedter.calendar.JDateChooser dtpDate1;
   private com.toedter.calendar.JDateChooser dtpDate2;
   private javax.swing.JLabel jLabel10;
   private javax.swing.JLabel jLabel11;
   private javax.swing.JLabel jLabel12;
   private javax.swing.JLabel jLabel13;
   private javax.swing.JLabel jLabel6;
   private javax.swing.JLabel jLabel7;
   private javax.swing.JLabel jLabel8;
   private javax.swing.JLabel jLabel9;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JLabel lblCentreID;
   private javax.swing.JLabel lblVaccineID;
   private javax.swing.JTextField txtIC;
   private javax.swing.JTextField txtTimeSlot2;
   // End of variables declaration//GEN-END:variables
}
