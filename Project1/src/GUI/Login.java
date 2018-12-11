/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.spi.DirStateFactory.Result;
import javax.swing.JOptionPane;
import user.controller.UserController;
//import user.controller.UserController;

/**
 *
 * @author Nguyen Thanh Binh
 */
public class Login extends javax.swing.JFrame {
static boolean canPress =false ;

    /**
     * Creates new form GUI
     */
    public Login() {
        setTitle("Login");
        initComponents();
        canPress=true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        LoginButton = new javax.swing.JButton();
        EmailTextField = new javax.swing.JTextField();
        PasswordTextField = new javax.swing.JPasswordField();
        UserNameLabel = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        LoginLable = new javax.swing.JLabel();
        CancelButton = new javax.swing.JButton();
        StatusTextField = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LoginButton.setText("Login");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });
        LoginButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                LoginButtonKeyPressed(evt);
            }
        });

        EmailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailTextFieldActionPerformed(evt);
            }
        });

        PasswordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordTextFieldActionPerformed(evt);
            }
        });
        PasswordTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PasswordTextFieldKeyPressed(evt);
            }
        });

        UserNameLabel.setText("Email");

        PasswordLabel.setText("Password");

        LoginLable.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        LoginLable.setText("Login");

        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LoginLable, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UserNameLabel)
                            .addComponent(PasswordLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(StatusTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                            .addComponent(EmailTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                            .addComponent(PasswordTextField))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(LoginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LoginLable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserNameLabel)
                    .addComponent(LoginButton))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordLabel)
                    .addComponent(CancelButton))
                .addGap(41, 41, 41)
                .addComponent(StatusTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
       login();
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void EmailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailTextFieldActionPerformed

    private void PasswordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordTextFieldActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        // TODO add your handling code here:
        RegisterLoginForm rlform = new RegisterLoginForm();
        rlform.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void LoginButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LoginButtonKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER&&canPress){
            login();
        }
// TODO add your handling code here:
    }//GEN-LAST:event_LoginButtonKeyPressed

    private void PasswordTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PasswordTextFieldKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER&&canPress){
            login();
        }
    }//GEN-LAST:event_PasswordTextFieldKeyPressed

    private void login(){
        String u = EmailTextField.getText().toLowerCase();
        String p = new String(PasswordTextField.getPassword());
      //  String pass = AccountHelper.MD5encrypt(p);// nếu có bảo mật
        boolean check = true;
        if(check&u.isEmpty()){
            EmailTextField.setText("Error: email must have");
       }else
        
        
        if(check&p.isEmpty()){
            PasswordTextField.setText("Error: password must have");
        }else
        
        if(check){
            try {
                switch (UserController.getInstance().checkLogin(u, p)){
                    case 0:
                        JOptionPane.showMessageDialog(this,"Account is locked");
                        break;
                    case 1:
                        canPress=false;
                        int input = JOptionPane.showOptionDialog(null, "Request change account password ", "Request change account password", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
                        if(input == JOptionPane.OK_OPTION){
                            ChangePassword cPF = new ChangePassword(p, u);
                            cPF.setVisible(true);
                            this.dispose();
                        }
                        canPress=true;
                        break;
                    case 2:
                        HomePage hp = new HomePage();
                        hp.setVisible(true);
                        this.dispose();
                        break;
                    case 3:
                        canPress=false;
                        JOptionPane.showMessageDialog(this,"Password is wrong");
                        canPress=true;
                        break;
                    default:
                        canPress=false;
                        JOptionPane.showMessageDialog(this,"Email is not exist");
                        canPress=true;
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Occur error when connect database","Error!", JOptionPane.ERROR_MESSAGE);
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(this, "Occur error durring run: "+ex.toString(),"Error!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JTextField EmailTextField;
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel LoginLable;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JPasswordField PasswordTextField;
    private javax.swing.JLabel StatusTextField;
    private javax.swing.JLabel UserNameLabel;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables
}
