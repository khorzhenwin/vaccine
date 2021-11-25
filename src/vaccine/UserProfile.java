/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vaccine;

import javax.swing.JOptionPane;
import vaccine.Class.DataIO;
import vaccine.Class.People;

/**
 *
 * @author User
 */
public class UserProfile extends javax.swing.JFrame {

   /**
    * Creates new form user_profile
    */
   public UserProfile() {
      initComponents();
      txtName.setText(Vaccine.login.getName());
      txtPassword.setText(Vaccine.login.getPassword());
      txtIC.setText(Vaccine.login.getIcno());
      txtContact.setText(Vaccine.login.getPhone());
      chkCitizen.setSelected(Vaccine.login.isCitizen());
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
      jLabel3 = new javax.swing.JLabel();
      btnBack = new javax.swing.JButton();
      txtContact = new javax.swing.JTextField();
      chkCitizen = new javax.swing.JCheckBox();
      txtName = new javax.swing.JTextField();
      jLabel2 = new javax.swing.JLabel();
      jLabel6 = new javax.swing.JLabel();
      jLabel4 = new javax.swing.JLabel();
      txtIC = new javax.swing.JTextField();
      jLabel5 = new javax.swing.JLabel();
      txtPassword = new javax.swing.JPasswordField();
      chkPassword = new javax.swing.JCheckBox();
      btnSave = new javax.swing.JButton();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setResizable(false);

      jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
      jLabel3.setText("User Profile");
      jLabel3.setToolTipText("");
      jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

      btnBack.setText("Back ➤");
      btnBack.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnBackActionPerformed(evt);
         }
      });

      txtContact.setForeground(new java.awt.Color(0, 0, 0));
      txtContact.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtContactActionPerformed(evt);
         }
      });
      txtContact.addKeyListener(new java.awt.event.KeyAdapter() {
         public void keyPressed(java.awt.event.KeyEvent evt) {
            txtContactKeyPressed(evt);
         }
         public void keyTyped(java.awt.event.KeyEvent evt) {
            txtContactKeyTyped(evt);
         }
      });

      chkCitizen.setText("Malaysian Citizen ?");
      chkCitizen.setEnabled(false);
      chkCitizen.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            chkCitizenActionPerformed(evt);
         }
      });

      txtName.setForeground(new java.awt.Color(0, 0, 0));
      txtName.setDisabledTextColor(new java.awt.Color(102, 102, 102));
      txtName.setEnabled(false);

      jLabel2.setText("Name :");

      jLabel6.setText("Password :");

      jLabel4.setText("IC. No :");

      txtIC.setForeground(new java.awt.Color(0, 0, 0));
      txtIC.setDisabledTextColor(new java.awt.Color(102, 102, 102));
      txtIC.setEnabled(false);

      jLabel5.setText("Phone Number :");

      txtPassword.setForeground(new java.awt.Color(0, 0, 0));

      chkPassword.setText("Show Password");
      chkPassword.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            chkPasswordActionPerformed(evt);
         }
      });

      btnSave.setText("Save Changes");
      btnSave.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnSaveActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                  .addGroup(jPanel1Layout.createSequentialGroup()
                     .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                           .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                           .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                           .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel5))
                     .addGap(28, 28, 28)
                     .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                           .addComponent(txtIC)
                           .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(chkPassword)
                        .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                     .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                     .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(chkCitizen, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                     .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)))))
            .addContainerGap())
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(47, 47, 47)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel2)
               .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(txtIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel4))
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel6))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(chkPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel5))
            .addGap(18, 18, 18)
            .addComponent(chkCitizen)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(btnBack)
               .addComponent(btnSave))
            .addContainerGap())
      );

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGap(63, 63, 63)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(69, Short.MAX_VALUE))
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGap(37, 37, 37)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGap(39, 39, 39))
      );

      pack();
      setLocationRelativeTo(null);
   }// </editor-fold>//GEN-END:initComponents

   private void txtContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_txtContactActionPerformed

   private void chkCitizenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCitizenActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_chkCitizenActionPerformed

   private void chkPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPasswordActionPerformed
      if (chkPassword.isSelected()) {
         txtPassword.setEchoChar((char) 0); //password = JPasswordField
      } else {
         txtPassword.setEchoChar('*');
      }
   }//GEN-LAST:event_chkPasswordActionPerformed

   private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
<<<<<<< HEAD
      UserMain a = new UserMain();
      a.setVisible(true);
      this.dispose();
=======
    UserMain um = new UserMain();
        um.setVisible(true);
        this.dispose();
        
>>>>>>> Nash
   }//GEN-LAST:event_btnBackActionPerformed

   private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

      //validation for empty fields
      if (txtPassword.getText().isBlank() || txtContact.getText().isBlank()) {
         JOptionPane.showMessageDialog(btnSave, "Please make sure all fields are filled!");
      } else {
         People foundPhone = DataIO.checkPeopleContact(txtContact.getText().trim());
         if (foundPhone != null && !foundPhone.getIcno().equals(txtIC.getText().trim())) {
            JOptionPane.showMessageDialog(btnSave, "Contact Number already exists!");
         } else {
            // updating user object with latest information
            Vaccine.login.setPassword(txtPassword.getText().trim());
            Vaccine.login.setPhone(txtContact.getText().trim());
            DataIO.write();
            JOptionPane.showMessageDialog(btnSave, "Saved Successfully!");
            UserMain a = new UserMain();
            a.setVisible(true);
            this.dispose();
         }
      }
   }//GEN-LAST:event_btnSaveActionPerformed

   private void txtContactKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactKeyPressed
      char c = evt.getKeyChar();
      if (Character.isLetter(c)) {
         txtContact.setEditable(false);
      } else {
         txtContact.setEditable(true);
      }
   }//GEN-LAST:event_txtContactKeyPressed

   private void txtContactKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactKeyTyped
      boolean maxno = txtContact.getText().length() > 11;
      if (maxno) {
         evt.consume();
      }
   }//GEN-LAST:event_txtContactKeyTyped

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
         java.util.logging.Logger.getLogger(UserProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (InstantiationException ex) {
         java.util.logging.Logger.getLogger(UserProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
         java.util.logging.Logger.getLogger(UserProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
         java.util.logging.Logger.getLogger(UserProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      //</editor-fold>
      //</editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            new UserProfile().setVisible(true);
         }
      });
   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton btnBack;
   private javax.swing.JButton btnSave;
   private javax.swing.JCheckBox chkCitizen;
   private javax.swing.JCheckBox chkPassword;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JLabel jLabel5;
   private javax.swing.JLabel jLabel6;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JTextField txtContact;
   private javax.swing.JTextField txtIC;
   private javax.swing.JTextField txtName;
   private javax.swing.JPasswordField txtPassword;
   // End of variables declaration//GEN-END:variables
}
