/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vaccine;

import java.util.Date;
import javax.swing.JOptionPane;
import vaccine.Class.Appointment;
import vaccine.Class.DataIO;

/**
 *
 * @author User
 */
public class UserReport extends javax.swing.JFrame {

   /**
    * Creates new form UserReport
    */
   public UserReport() {
      initComponents();

      txt_ic.setText(Vaccine.login.getIcno().toString());

      report();
   }

   private void report() {
      Appointment found = DataIO.checkAppointment(txt_ic.getText().trim());
      Vaccine.app = found;
      if (found != null) {

         txtf_report.setText("\t" + "=====VACCINATION PROGRAM=====" + "\n"
                 + "\t" + "Name : " + Vaccine.app.getPerson().getName() + "\n"
                 + "\t" + "IC Number : " + Vaccine.app.getPerson().getIcno() + "\n"
                 + "\t" + "Contact : " + Vaccine.app.getPerson().getPhone() + "\n"
                 + "\n"
                 + "\t" + "=====VACCINATION LOCATION=====" + "\n"
                 + "\t" + "Vaccination Venue : " + Vaccine.app.getLocation().getCentreName() + "\n"
                 + "\t" + "Address : " + Vaccine.app.getLocation().getAddress() + "\n"
                 + "\n"
                 + "\t" + "=====FIRST DOSE STATUS=====" + "\n"
                 + "\t" + "First Dose Date : " + Vaccine.app.getDate1() + "\n"
                 + "\t" + "First Dose Status : " + Vaccine.app.isDose1() + "\n"
                 + "\n"
                 + "\t" + "=====SECOND DOSE STATUS=====" + "\n"
                 + "\t" + "Second Dose Date : " + Vaccine.app.getDate2() + "\n"
                 + "\t" + "Second Dose Status : " + Vaccine.app.isDose2() + "\n");
      }
   }

   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jScrollPane1 = new javax.swing.JScrollPane();
      txtf_report = new javax.swing.JTextArea();
      txt_ic = new javax.swing.JTextField();
      back2 = new javax.swing.JButton();
      btn_print = new javax.swing.JButton();
      jLabel1 = new javax.swing.JLabel();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setResizable(false);

      txtf_report.setEditable(false);
      txtf_report.setColumns(20);
      txtf_report.setRows(5);
      jScrollPane1.setViewportView(txtf_report);

      txt_ic.setEditable(false);
      txt_ic.setForeground(new java.awt.Color(0, 0, 0));
      txt_ic.setDisabledTextColor(new java.awt.Color(0, 0, 0));
      txt_ic.setEnabled(false);

      back2.setText("Back ➤");
      back2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            back2ActionPerformed(evt);
         }
      });

      btn_print.setText("Print Vaccination Report");
      btn_print.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_printActionPerformed(evt);
         }
      });

      jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
      jLabel1.setText("Vaccination Status and Report");

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                  .addContainerGap()
                  .addComponent(txt_ic, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(back2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGroup(layout.createSequentialGroup()
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                           .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                           .addComponent(btn_print, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                     .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel1)))
                  .addGap(0, 18, Short.MAX_VALUE)))
            .addContainerGap())
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(txt_ic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(back2))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel1)
            .addGap(33, 33, 33)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(btn_print)
            .addContainerGap())
      );

      pack();
      setLocationRelativeTo(null);
   }// </editor-fold>//GEN-END:initComponents

    private void back2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back2ActionPerformed
      UserMain um = new UserMain();
      um.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_back2ActionPerformed

    private void btn_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printActionPerformed
      // TODO add your handling code here:
      Date today = new Date();
      try {

         txtf_report.setText(txtf_report.getText() + "\t" + "=====================================" + "\n" + "\t" + "Printed on: " + today);

         txtf_report.print();
      } catch (Exception e) {
         JOptionPane.showMessageDialog(null, e);
      }
    }//GEN-LAST:event_btn_printActionPerformed

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
         java.util.logging.Logger.getLogger(UserReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (InstantiationException ex) {
         java.util.logging.Logger.getLogger(UserReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
         java.util.logging.Logger.getLogger(UserReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
         java.util.logging.Logger.getLogger(UserReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      //</editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            new UserReport().setVisible(true);
         }
      });
   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton back2;
   private javax.swing.JButton btn_print;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JTextField txt_ic;
   private javax.swing.JTextArea txtf_report;
   // End of variables declaration//GEN-END:variables
}
