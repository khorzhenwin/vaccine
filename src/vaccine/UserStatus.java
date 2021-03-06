/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vaccine;

import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import vaccine.Class.*;

/**
 *
 * @author User
 */
public class UserStatus extends javax.swing.JFrame {

   /**
    * Creates new form user_status
    */
   public UserStatus() {
      initComponents();
      //icno
      txtIC.setText(Vaccine.login.getIcno());
      //centre
      txtCentreName.setText(Vaccine.app.getLocation().getCentreName());
      // vaccine name
      txtVaccineName.setText(Vaccine.app.getVaccineName());
      // 1st & 2nd dose date
      dtpDate1.setMinSelectableDate(new Date());
      try {
         SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
         Date date1, date2;
         date1 = df.parse(Vaccine.app.getDate1());
         date2 = df.parse(Vaccine.app.getDate2());
         dtpDate1.setDate(date1);
         dtpDate2.setDate(date2);

      } catch (ParseException ex) {
         Logger.getLogger(UserStatus.class.getName()).log(Level.SEVERE, null, ex);
      }
      // time slot 1
      DefaultComboBoxModel comboTime1 = (DefaultComboBoxModel) cmbTimeSlot1.getModel();
      comboTime1.removeAllElements();
      String[] time1 = DataIO.getTimeSlot1();
      for (String slot : time1) {
         comboTime1.addElement(slot);
         if (Vaccine.app.getTime1().equals(slot)) {
            comboTime1.setSelectedItem(slot);
         }
      }
      // Dose 1 & 2 checkbox
      lblStatus.setText("No doses completed");
      lblStatus.setForeground(Color.BLUE);
      if (Vaccine.app.isDose1()) {
         chbDose1.setSelected(true);
         dtpDate1.setEnabled(false);
         cmbTimeSlot1.setEnabled(false);
         btnUpdate.setEnabled(false);
         btnDelete.setEnabled(false);
         lblStatus.setText("1st Dose Completed");
         lblStatus.setForeground(Color.ORANGE);
      }
      if (Vaccine.app.isDose2()) {
         chbDose2.setSelected(true);
         lblStatus.setText("Fully Vaccinated");
         lblStatus.setForeground(Color.GREEN);
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
      jLabel10 = new javax.swing.JLabel();
      jLabel11 = new javax.swing.JLabel();
      txtIC = new javax.swing.JTextField();
      jLabel12 = new javax.swing.JLabel();
      txtCentreName = new javax.swing.JTextField();
      jLabel13 = new javax.swing.JLabel();
      txtVaccineName = new javax.swing.JTextField();
      dtpDate1 = new com.toedter.calendar.JDateChooser();
      jLabel14 = new javax.swing.JLabel();
      chbDose1 = new javax.swing.JCheckBox();
      cmbTimeSlot1 = new javax.swing.JComboBox<>();
      jLabel15 = new javax.swing.JLabel();
      dtpDate2 = new com.toedter.calendar.JDateChooser();
      txtTimeSlot2 = new javax.swing.JTextField();
      chbDose2 = new javax.swing.JCheckBox();
      jLabel16 = new javax.swing.JLabel();
      jLabel17 = new javax.swing.JLabel();
      btnUpdate = new javax.swing.JButton();
      btnDelete = new javax.swing.JButton();
      jLabel1 = new javax.swing.JLabel();
      lblStatus = new javax.swing.JLabel();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setResizable(false);

      btnBack.setText("Back ???");
      btnBack.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnBackActionPerformed(evt);
         }
      });

      jLabel10.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
      jLabel10.setText("Appointment Details");
      jLabel10.setToolTipText("");
      jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

      jLabel11.setText("IC No");

      txtIC.setForeground(new java.awt.Color(0, 0, 0));
      txtIC.setDisabledTextColor(new java.awt.Color(102, 102, 102));
      txtIC.setEnabled(false);

      jLabel12.setText("Centre Name");

      txtCentreName.setForeground(new java.awt.Color(0, 0, 0));
      txtCentreName.setDisabledTextColor(new java.awt.Color(102, 102, 102));
      txtCentreName.setEnabled(false);

      jLabel13.setText("Vaccine Name");

      txtVaccineName.setForeground(new java.awt.Color(0, 0, 0));
      txtVaccineName.setDisabledTextColor(new java.awt.Color(102, 102, 102));
      txtVaccineName.setEnabled(false);

      dtpDate1.setDateFormatString("dd/MM/yyyy");
      dtpDate1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
         public void propertyChange(java.beans.PropertyChangeEvent evt) {
            dtpDate1PropertyChange(evt);
         }
      });

      jLabel14.setText("1st Dose Date");

      chbDose1.setBackground(new java.awt.Color(255, 255, 255));
      chbDose1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
      chbDose1.setForeground(new java.awt.Color(51, 255, 0));
      chbDose1.setEnabled(false);

      cmbTimeSlot1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
      cmbTimeSlot1.addItemListener(new java.awt.event.ItemListener() {
         public void itemStateChanged(java.awt.event.ItemEvent evt) {
            cmbTimeSlot1ItemStateChanged(evt);
         }
      });

      jLabel15.setText("Time Slot 1");

      dtpDate2.setBackground(new java.awt.Color(204, 204, 204));
      dtpDate2.setForeground(new java.awt.Color(0, 0, 0));
      dtpDate2.setDateFormatString("dd/MM/yyyy");
      dtpDate2.setEnabled(false);
      dtpDate2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
         public void propertyChange(java.beans.PropertyChangeEvent evt) {
            dtpDate2PropertyChange(evt);
         }
      });

      txtTimeSlot2.setDisabledTextColor(new java.awt.Color(102, 102, 102));
      txtTimeSlot2.setEnabled(false);

      chbDose2.setBackground(new java.awt.Color(255, 255, 255));
      chbDose2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
      chbDose2.setForeground(new java.awt.Color(51, 255, 0));
      chbDose2.setEnabled(false);

      jLabel16.setText("2nd Dose Date");

      jLabel17.setText("Time Slot 2");

      btnUpdate.setText("Update");
      btnUpdate.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnUpdateActionPerformed(evt);
         }
      });

      btnDelete.setText("Delete Appointment");
      btnDelete.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnDeleteActionPerformed(evt);
         }
      });

      jLabel1.setText("Vaccination Status :");

      lblStatus.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                  .addContainerGap()
                  .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGroup(layout.createSequentialGroup()
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                           .addGroup(layout.createSequentialGroup()
                              .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                              .addComponent(txtCentreName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                           .addGroup(layout.createSequentialGroup()
                              .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                              .addComponent(txtIC, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                           .addGroup(layout.createSequentialGroup()
                              .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addGap(6, 6, 6))
                           .addGroup(layout.createSequentialGroup()
                              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                 .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                 .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                 .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                 .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                 .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                 .addComponent(txtVaccineName)
                                 .addComponent(cmbTimeSlot1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                 .addComponent(txtTimeSlot2)
                                 .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                       .addGroup(layout.createSequentialGroup()
                                          .addComponent(dtpDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addGap(18, 18, 18)
                                          .addComponent(chbDose1))
                                       .addGroup(layout.createSequentialGroup()
                                          .addComponent(dtpDate2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addGap(18, 18, 18)
                                          .addComponent(chbDose2)))
                                    .addGap(0, 0, Short.MAX_VALUE))))))
                     .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                  .addGap(0, 37, Short.MAX_VALUE)))
            .addContainerGap())
         .addGroup(layout.createSequentialGroup()
            .addGap(106, 106, 106)
            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(btnBack)
                  .addComponent(jLabel1))
               .addComponent(lblStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(20, 20, 20)
            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel11)
               .addComponent(txtIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel12)
               .addComponent(txtCentreName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel13)
               .addComponent(txtVaccineName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
               .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(dtpDate1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(chbDose1))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(cmbTimeSlot1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel15))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(dtpDate2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(chbDose2))
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(txtTimeSlot2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(jLabel17)))
               .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(23, 23, 23))
      );

      pack();
      setLocationRelativeTo(null);
   }// </editor-fold>//GEN-END:initComponents

   private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
      UserMain a = new UserMain();
      a.setVisible(true);
      this.dispose();
   }//GEN-LAST:event_btnBackActionPerformed

   private void dtpDate1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dtpDate1PropertyChange
      if (dtpDate1.getDate() != null) {
         Calendar c = Calendar.getInstance();
         c.setTime(dtpDate1.getDate());
         c.add(Calendar.DATE, 21);
         Date futureDate = c.getTime();
         dtpDate2.setDate(futureDate);

      }
   }//GEN-LAST:event_dtpDate1PropertyChange

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

   private void dtpDate2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dtpDate2PropertyChange
      // TODO add your handling code here:
   }//GEN-LAST:event_dtpDate2PropertyChange

   private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
      int confirmCreate = JOptionPane.showConfirmDialog(this, "Change appointment details?", "Confirm all appointment details?", JOptionPane.YES_NO_OPTION);
      if (confirmCreate == JOptionPane.YES_OPTION) {

         // empty fields validation
         if (dtpDate1.getDate() == null
                 || dtpDate2.getDate() == null
                 || cmbTimeSlot1.getSelectedItem() == null
                 || txtTimeSlot2.getText().isBlank()) {
            JOptionPane.showMessageDialog(btnUpdate, "Please ensure all the appointment details are filled!");
         } else {
            try {
               SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
               Date today = new Date();
               String date1 = df.format(dtpDate1.getDate());
               String dateToday = df.format(today);
               boolean allow = false;
               // Allow to update if today is before existing record date + today has to be before new date requested
               if (df.parse(dateToday).before(df.parse(Vaccine.app.getDate1()))
                       && df.parse(dateToday).before(df.parse(date1))) {
                  allow = true;
               }
               // if nothing changed
               if (df.parse(date1).equals(df.parse(Vaccine.app.getDate1())) && cmbTimeSlot1.getSelectedItem().toString().equals(Vaccine.app.getTime1())) {
                  allow = true;
               }
               // if dose1 not done and appointment is missed, allow to reschedule to later date
               if (!chbDose1.isSelected()
                       && df.parse(Vaccine.app.getDate1()).before(df.parse(dateToday))
                       && df.parse(dateToday).before(df.parse(date1))) {
                  allow = true;
               }
               if (allow) {
                  boolean found = DataIO.hasAppointment(txtCentreName.getText(),
                          df.format(dtpDate1.getDate()),
                          cmbTimeSlot1.getSelectedItem().toString());
                  Appointment comparison = DataIO.hasAppointment(txtCentreName.getText(),
                          df.format(dtpDate1.getDate()),
                          cmbTimeSlot1.getSelectedItem().toString(),
                          df.format(dtpDate2.getDate()),
                          txtTimeSlot2.getText().trim());
                  // if the record is found and its not the current owners appointment
                  if (found && !txtIC.getText().equals(comparison.getPerson().getIcno())) {
                     JOptionPane.showMessageDialog(btnUpdate, "Another user has already booked this slot!");
                  } else {
                     Vaccine.app.setDate1(date1);
                     Vaccine.app.setDate2(df.format(dtpDate2.getDate()));
                     Vaccine.app.setTime1(cmbTimeSlot1.getSelectedItem().toString());
                     Vaccine.app.setTime2(txtTimeSlot2.getText().trim());
                     DataIO.write();
                     JOptionPane.showMessageDialog(btnUpdate, "Appointment successfully updated!");
                     UserStatus a = new UserStatus();
                     a.setVisible(true);
                     this.dispose();
                  }
               } else {
                  JOptionPane.showMessageDialog(btnUpdate, "The date chosen is not allowed");
               }

            } catch (ParseException ex) {
               Logger.getLogger(UserStatus.class.getName()).log(Level.SEVERE, null, ex);
            }
         }
      }
   }//GEN-LAST:event_btnUpdateActionPerformed

   private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
      int confirmCreate = JOptionPane.showConfirmDialog(this, "DELETE APPOINTMENT?", "Confirm deletion?", JOptionPane.YES_NO_OPTION);
      if (confirmCreate == JOptionPane.YES_OPTION) {
         try {
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            Date today = new Date();
            String dateRecorded = Vaccine.app.getDate1();
            String date1 = df.format(dtpDate1.getDate());
            String dateToday = df.format(today);
            // if have not reached the appointment date, allow to be deleted
            if (df.parse(dateToday).before(df.parse(dateRecorded))) {

               for (int i = 0; i < DataIO.allAppointments.size(); i++) {
                  if (Vaccine.app == DataIO.allAppointments.get(i)) {
                     DataIO.allAppointments.remove(i);
                     break;
                  }
               }

               VaccineSupply inventory = DataIO.checkSupply(txtCentreName.getText().trim(), txtVaccineName.getText().trim());
               // +2 back in inventory
               for (int i = 0; i < DataIO.allVaccines.size(); i++) {
                  if (inventory.getVaccineID() == DataIO.allVaccines.get(i).getVaccineID()) {
                     DataIO.allVaccines.get(i).unreserve2Dose();
                  }
               }
               DataIO.write();
               JOptionPane.showMessageDialog(btnDelete, "The appointment has been deleted");
               UserMain a = new UserMain();
               a.setVisible(true);
               this.dispose();
            } else {
               JOptionPane.showMessageDialog(btnDelete, "This appointment cannot be deleted");
            }

         } catch (ParseException ex) {
            Logger.getLogger(UserStatus.class.getName()).log(Level.SEVERE, null, ex);
         }
      }
   }//GEN-LAST:event_btnDeleteActionPerformed

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
         java.util.logging.Logger.getLogger(UserStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (InstantiationException ex) {
         java.util.logging.Logger.getLogger(UserStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
         java.util.logging.Logger.getLogger(UserStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
         java.util.logging.Logger.getLogger(UserStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      //</editor-fold>
      //</editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            new UserStatus().setVisible(true);
         }
      });
   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton btnBack;
   private javax.swing.JButton btnDelete;
   private javax.swing.JButton btnUpdate;
   private javax.swing.JCheckBox chbDose1;
   private javax.swing.JCheckBox chbDose2;
   private javax.swing.JComboBox<String> cmbTimeSlot1;
   private com.toedter.calendar.JDateChooser dtpDate1;
   private com.toedter.calendar.JDateChooser dtpDate2;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel10;
   private javax.swing.JLabel jLabel11;
   private javax.swing.JLabel jLabel12;
   private javax.swing.JLabel jLabel13;
   private javax.swing.JLabel jLabel14;
   private javax.swing.JLabel jLabel15;
   private javax.swing.JLabel jLabel16;
   private javax.swing.JLabel jLabel17;
   private javax.swing.JLabel lblStatus;
   private javax.swing.JTextField txtCentreName;
   private javax.swing.JTextField txtIC;
   private javax.swing.JTextField txtTimeSlot2;
   private javax.swing.JTextField txtVaccineName;
   // End of variables declaration//GEN-END:variables
}
