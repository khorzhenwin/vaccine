/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vaccine;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import vaccine.Class.*;
import vaccine.Class.DataIO;

/**
 *
 * @author User
 */
public class AdminReport extends javax.swing.JFrame {

   public AdminReport() {
      initComponents();

      StatisticalReport();
      inventory();

   }

   public void StatisticalReport() {
      //counter for vaccination count
      int have2 = 0;
      int have1 = 0;
      int have0 = 0;
      int countnon = DataIO.allPeople.size() - DataIO.allAppointments.size();
      int vaccinecount = 0;
      int active = 0;
      int inactive = 0;

      for (int i = 0; i < DataIO.allCentres.size(); i++) {
         if (DataIO.allCentres.get(i).getStatus().equals("Active")) {
            active++;
         }
         if (DataIO.allCentres.get(i).getStatus().equals("Inactive")) {
            inactive++;
         }
      }

      for (int i = 0; i < DataIO.allAppointments.size(); i++) {
         if (DataIO.allAppointments.get(i).isDose1() == true && DataIO.allAppointments.get(i).isDose2() == true) {
            have2++;

         } else if (DataIO.allAppointments.get(i).isDose1() == true && DataIO.allAppointments.get(i).isDose2() == false) {
            have1++;

         } else {
            have0++;
         }
      }

      //set report
      txtf_appointment.setText("\t" + "VACCINATION MANAGEMENT SYSTEM" + "\n"
              + "\n"
              + "\t" + "=====SYSTEM REPORT=====" + "\n"
              + "\n"
              + "\t" + "Total Registered Profiles in System : " + DataIO.allPeople.size() + "\n"
              + "\t" + "Total Registered Personnel in System : " + DataIO.allPersonnel.size() + "\n"
              + "\n"
              + "\t" + "Total Vaccination Appointment : " + DataIO.allAppointments.size() + "\n"
              + "\t" + "Total of No Dose Done : " + have0 + "\n"
              + "\t" + "Total of First Dose Done : " + have1 + "\n"
              + "\t" + "Total of Second Dose Done : " + have2 + "\n"
              + "\n"
              + "\t" + "Total of Non Booking Profile : " + countnon + "\n"
              + "\n"
              + "\t" + "Total Centres Registered : " + DataIO.allCentres.size() + "\n"
              + "\t" + "Active Centre : " + active + "\n"
              + "\t" + "Inactive Centre : " + inactive + "\n"
      );

   }

   public void inventory() {

      for (int i = 0; i < DataIO.allVaccines.size(); i++) {

         String centre = DataIO.allVaccines.get(i).getCentre().getCentreName();
         String vaccine = DataIO.allVaccines.get(i).getVaccineName();
         int count = DataIO.allVaccines.get(i).getInventory();

         txtf_inventory.append("\t" + "Centre : " + centre + "\n"
                 + "\t" + "Status : " + DataIO.allVaccines.get(i).getCentre().getStatus() + "\n"
                 + "\t" + "Vaccine Name : " + vaccine + "\n"
                 + "\t" + "Vaccine storage count : " + count + "\n"
                 + "\n");
      }

   }

   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtf_appointment = new javax.swing.JTextArea();
        btn_printreport = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtf_inventory = new javax.swing.JTextArea();
        btn_printinventory = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Admin Reports");

        btnBack.setText("Back ➤");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtf_appointment.setEditable(false);
        txtf_appointment.setColumns(20);
        txtf_appointment.setRows(5);
        jScrollPane4.setViewportView(txtf_appointment);

        btn_printreport.setText("Print System Report");
        btn_printreport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printreportActionPerformed(evt);
            }
        });

        txtf_inventory.setEditable(false);
        txtf_inventory.setColumns(20);
        txtf_inventory.setRows(5);
        jScrollPane1.setViewportView(txtf_inventory);

        btn_printinventory.setText("Print Vaccine Inventory");
        btn_printinventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printinventoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(206, 206, 206)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(btn_printreport, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_printinventory, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1)))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_printreport)
                    .addComponent(btn_printinventory))
                .addGap(57, 57, 57))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
      AdminMain a = new AdminMain();
      a.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btn_printreportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printreportActionPerformed
      Date today = new Date();
      try {

         txtf_appointment.setText(txtf_appointment.getText() + "\t" + "=====================================" + "\n" + "\t" + "Printed on: " + today);

         txtf_appointment.print();
      } catch (Exception e) {
         JOptionPane.showMessageDialog(null, e);
      }

      //refresh screen for repeat printing and no duplicate footer
      AdminReport ap = new AdminReport();
      ap.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_btn_printreportActionPerformed

    private void btn_printinventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printinventoryActionPerformed
      Date today = new Date();
      try {

         txtf_inventory.setText(txtf_inventory.getText() + "\t" + "=====================================" + "\n" + "\t" + "Printed on: " + today);

         txtf_inventory.print();
      } catch (Exception e) {
         JOptionPane.showMessageDialog(null, e);
      }
      //refresh screen for repeat printing and no duplicate footer
      AdminReport ap = new AdminReport();
      ap.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_btn_printinventoryActionPerformed

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
         java.util.logging.Logger.getLogger(AdminReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (InstantiationException ex) {
         java.util.logging.Logger.getLogger(AdminReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
         java.util.logging.Logger.getLogger(AdminReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
         java.util.logging.Logger.getLogger(AdminReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      //</editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            new AdminReport().setVisible(true);
         }
      });
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btn_printinventory;
    private javax.swing.JButton btn_printreport;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea txtf_appointment;
    private javax.swing.JTextArea txtf_inventory;
    // End of variables declaration//GEN-END:variables
}
