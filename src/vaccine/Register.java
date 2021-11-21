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
public class Register extends javax.swing.JFrame {

   /**
    * Creates new form regis_user
    */
   public Register() {
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

      jLabel1 = new javax.swing.JLabel();
      jLabel2 = new javax.swing.JLabel();
      jLabel3 = new javax.swing.JLabel();
      jLabel5 = new javax.swing.JLabel();
      chkCitizen = new javax.swing.JCheckBox();
      txtIC = new javax.swing.JTextField();
      txtName = new javax.swing.JTextField();
      txtContact = new javax.swing.JTextField();
      btnRegister = new javax.swing.JButton();
      btnClear = new javax.swing.JButton();
      btnBack = new javax.swing.JButton();
      jLabel4 = new javax.swing.JLabel();
      txtPassword = new javax.swing.JPasswordField();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setResizable(false);

      jLabel1.setText("IC No");

      jLabel2.setText("Full Name");

      jLabel3.setText("Password");

      jLabel5.setText("Contact No");

      chkCitizen.setText("Are you a Citizen of Malaysia ?");
      chkCitizen.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            chkCitizenActionPerformed(evt);
         }
      });

      txtIC.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtICActionPerformed(evt);
         }
      });
      txtIC.addKeyListener(new java.awt.event.KeyAdapter() {
         public void keyPressed(java.awt.event.KeyEvent evt) {
            txtICKeyPressed(evt);
         }
      });

      txtName.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtNameActionPerformed(evt);
         }
      });

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

      btnRegister.setText("Register");
      btnRegister.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnRegisterActionPerformed(evt);
         }
      });

      btnClear.setText("Clear");
      btnClear.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnClearActionPerformed(evt);
         }
      });

      btnBack.setText("Back ➤");
      btnBack.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnBackActionPerformed(evt);
         }
      });

      jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
      jLabel4.setText("Register");
      jLabel4.setToolTipText("");
      jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(106, 106, 106))
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
               .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                  .addGap(79, 79, 79)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(layout.createSequentialGroup()
                        .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                     .addComponent(btnRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
               .addGroup(layout.createSequentialGroup()
                  .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                           .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                           .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                           .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                           .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                           .addComponent(txtName, javax.swing.GroupLayout.Alignment.TRAILING)
                           .addComponent(txtContact)
                           .addComponent(txtIC)))
                     .addComponent(chkCitizen, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGap(70, 70, 70))
      );

      layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3, jLabel5});

      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap(31, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(22, 22, 22)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel1)
               .addComponent(txtIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel3)
               .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(12, 12, 12)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel2)
               .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel5)
               .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addComponent(chkCitizen)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(btnRegister)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(btnClear)
               .addComponent(btnBack))
            .addGap(49, 49, 49))
      );

      layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3, jLabel5});

      layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtContact, txtIC, txtName});

      pack();
      setLocationRelativeTo(null);
   }// </editor-fold>//GEN-END:initComponents

   private void txtICActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtICActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_txtICActionPerformed

   private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_txtNameActionPerformed

   private void txtContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_txtContactActionPerformed

   private void chkCitizenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCitizenActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_chkCitizenActionPerformed

   private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
      Login back = new Login();
      back.setVisible(true);
      this.dispose();
   }//GEN-LAST:event_btnBackActionPerformed

   private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
      txtIC.setText("");
      txtPassword.setText("");
      txtName.setText("");
      txtContact.setText("");
      chkCitizen.setSelected(false);
   }//GEN-LAST:event_btnClearActionPerformed

   private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed

      //validation for empty fields
      if (txtIC.getText().isBlank()
              || txtPassword.getText().isBlank()
              || txtName.getText().isBlank()
              || txtContact.getText().isBlank()) {
         JOptionPane.showMessageDialog(btnRegister, "Please fill in all the fields!");
      } else {
         People found = DataIO.checkPeople(txtIC.getText().trim());
         People foundPhone = DataIO.checkPeopleContact(txtContact.getText().trim());
         // Check if IC or phone exist, dont allow registration
         if (found != null) {
            JOptionPane.showMessageDialog(btnRegister, "User already exists!");
         } else if (foundPhone != null) {
            JOptionPane.showMessageDialog(btnRegister, "Contact Number already exists!");
         } else {
            People user = new People(txtIC.getText().trim(),
                    txtPassword.getText().trim(),
                    txtName.getText(),
                    txtContact.getText().trim(),
                    chkCitizen.isSelected());
            DataIO.allPeople.add(user);
            DataIO.write();
            JOptionPane.showMessageDialog(btnRegister, "Account Successfully Registered!");
            Login back = new Login();
            back.setVisible(true);
            this.dispose();
         }
      }
   }//GEN-LAST:event_btnRegisterActionPerformed

   private void txtContactKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactKeyTyped
      boolean maxno = txtContact.getText().length() > 11;
      if (maxno) {
         evt.consume();
      }
   }//GEN-LAST:event_txtContactKeyTyped

   private void txtContactKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactKeyPressed
      char c = evt.getKeyChar();
      if (Character.isLetter(c)) {
         txtContact.setEditable(false);
      } else {
         txtContact.setEditable(true);
      }
   }//GEN-LAST:event_txtContactKeyPressed

   private void txtICKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtICKeyPressed

   }//GEN-LAST:event_txtICKeyPressed

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
         java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (InstantiationException ex) {
         java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
         java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
         java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      //</editor-fold>
      //</editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            new Register().setVisible(true);
         }
      });
   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton btnBack;
   private javax.swing.JButton btnClear;
   private javax.swing.JButton btnRegister;
   private javax.swing.JCheckBox chkCitizen;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JLabel jLabel5;
   private javax.swing.JTextField txtContact;
   private javax.swing.JTextField txtIC;
   private javax.swing.JTextField txtName;
   private javax.swing.JPasswordField txtPassword;
   // End of variables declaration//GEN-END:variables
}
