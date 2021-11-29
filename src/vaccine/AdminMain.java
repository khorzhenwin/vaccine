/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vaccine;

/**
 *
 * @author User
 */
public class AdminMain extends javax.swing.JFrame {

   /**
    * Creates new form Main_Admin
    */
   public AdminMain() {
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

      btnLogout = new javax.swing.JButton();
      jLabel3 = new javax.swing.JLabel();
      btnPeople = new javax.swing.JButton();
      btnPersonnel = new javax.swing.JButton();
      btnVaccineSupply = new javax.swing.JButton();
      btnCentre = new javax.swing.JButton();
      btnAppointment = new javax.swing.JButton();
      btnReports = new javax.swing.JButton();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setResizable(false);

      btnLogout.setText("Log Out ➤");
      btnLogout.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnLogoutActionPerformed(evt);
         }
      });

      jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
      jLabel3.setText("Personnel Dashboard");
      jLabel3.setToolTipText("");
      jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

      btnPeople.setText("People Profiles");
      btnPeople.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnPeopleActionPerformed(evt);
         }
      });

      btnPersonnel.setText("Personnel Profiles");
      btnPersonnel.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnPersonnelActionPerformed(evt);
         }
      });

      btnVaccineSupply.setText("Manage Vaccines");
      btnVaccineSupply.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnVaccineSupplyActionPerformed(evt);
         }
      });

      btnCentre.setText("Manage Centres");
      btnCentre.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnCentreActionPerformed(evt);
         }
      });

      btnAppointment.setText("Manage Appointments");
      btnAppointment.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnAppointmentActionPerformed(evt);
         }
      });

      btnReports.setText("Statistical Reports");

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                  .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addContainerGap())
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                  .addComponent(jLabel3)
                  .addGap(113, 113, 113))))
         .addGroup(layout.createSequentialGroup()
            .addGap(95, 95, 95)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
               .addComponent(btnAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(btnReports, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addGroup(layout.createSequentialGroup()
                  .addComponent(btnCentre, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(btnVaccineSupply, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGroup(layout.createSequentialGroup()
                  .addComponent(btnPeople, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(btnPersonnel, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(0, 97, Short.MAX_VALUE))
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(btnLogout)
            .addGap(18, 18, 18)
            .addComponent(jLabel3)
            .addGap(31, 31, 31)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(btnPeople, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(btnPersonnel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(btnCentre, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(btnVaccineSupply, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(btnAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(btnReports, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(43, Short.MAX_VALUE))
      );

      pack();
      setLocationRelativeTo(null);
   }// </editor-fold>//GEN-END:initComponents

   private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed

      Login a = new Login();
      a.setVisible(true);
      this.dispose();
   }//GEN-LAST:event_btnLogoutActionPerformed

   private void btnPeopleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPeopleActionPerformed
      AdminPeopleManagement a = new AdminPeopleManagement();
      a.setVisible(true);
      this.dispose();

   }//GEN-LAST:event_btnPeopleActionPerformed

   private void btnPersonnelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonnelActionPerformed
      AdminPersonnelManagement a = new AdminPersonnelManagement();
      a.setVisible(true);
      this.dispose();
   }//GEN-LAST:event_btnPersonnelActionPerformed

   private void btnCentreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCentreActionPerformed
      AdminCentreManagement a = new AdminCentreManagement();
      a.setVisible(true);
      this.dispose();
   }//GEN-LAST:event_btnCentreActionPerformed

   private void btnVaccineSupplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVaccineSupplyActionPerformed
      AdminVaccineManagement a = new AdminVaccineManagement();
      a.setVisible(true);
      this.dispose();
   }//GEN-LAST:event_btnVaccineSupplyActionPerformed

   private void btnAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAppointmentActionPerformed
      AdminAppointment a = new AdminAppointment();
      a.setVisible(true);
      this.dispose();
   }//GEN-LAST:event_btnAppointmentActionPerformed

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
         java.util.logging.Logger.getLogger(AdminMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (InstantiationException ex) {
         java.util.logging.Logger.getLogger(AdminMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
         java.util.logging.Logger.getLogger(AdminMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
         java.util.logging.Logger.getLogger(AdminMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      //</editor-fold>
      //</editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            new AdminMain().setVisible(true);
         }
      });
   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton btnAppointment;
   private javax.swing.JButton btnCentre;
   private javax.swing.JButton btnLogout;
   private javax.swing.JButton btnPeople;
   private javax.swing.JButton btnPersonnel;
   private javax.swing.JButton btnReports;
   private javax.swing.JButton btnVaccineSupply;
   private javax.swing.JLabel jLabel3;
   // End of variables declaration//GEN-END:variables
}
