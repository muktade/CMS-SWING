/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cafemanagementsystem;

import DAO.userDao;
import javax.swing.JOptionPane;
import model.User;

/**
 *
 * @author M. A. MUKTADEER
 */
public class ChangePassword extends javax.swing.JFrame {

    private String userEmail;
    private String partten = "^[a-zA-Z._0-9]+[@]+[a-zA-Z]+[.]+[a-zA-z]+$";

    /**
     * Creates new form Signup
     */
    public ChangePassword() {
        initComponents();
    }

    public ChangePassword(String email) {
        initComponents();
        this.userEmail = email;
        btnUpdatePass.setEnabled(false);
        txtOldPassword.setEditable(true);
    }

    public void clear() {
        btnUpdatePass.setEnabled(false);
        txtOldPassword.setText("");
        txtNewPass.setText("");
        txtConfirmPss.setText("");
    }

    public void valideFild() {
        String newPass = txtNewPass.getText();
        String oldPass = txtOldPassword.getText();
        String confirmPass = txtConfirmPss.getText();
        if (!newPass.equals("") && !confirmPass.equals("")) {
            btnUpdatePass.setEnabled(true);
        } else {
            btnUpdatePass.setEnabled(false);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtOldPassword = new javax.swing.JPasswordField();
        txtConfirmPss = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        btnUpdatePass = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        txtNewPass = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("cafemanagementsystem/Bundle"); // NOI18N
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.black, java.awt.Color.darkGray, java.awt.Color.lightGray), bundle.getString("ChangePassword.jPanel1.border.title"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 36), new java.awt.Color(0, 0, 204))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText(bundle.getString("ChangePassword.jLabel7.text")); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText(bundle.getString("ChangePassword.jLabel8.text")); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 130, 30));

        txtOldPassword.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtOldPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOldPassword.setText(bundle.getString("ChangePassword.txtOldPassword.text")); // NOI18N
        txtOldPassword.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(txtOldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 213, 30));

        txtConfirmPss.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtConfirmPss.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtConfirmPss.setText(bundle.getString("ChangePassword.txtConfirmPss.text")); // NOI18N
        txtConfirmPss.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtConfirmPss.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtConfirmPssKeyReleased(evt);
            }
        });
        jPanel1.add(txtConfirmPss, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 213, 30));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText(bundle.getString("ChangePassword.jLabel9.text")); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 100, 30));

        btnUpdatePass.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnUpdatePass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/save.png"))); // NOI18N
        btnUpdatePass.setText(bundle.getString("ChangePassword.btnUpdatePass.text")); // NOI18N
        btnUpdatePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatePassActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdatePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        btnClear.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/clear.png"))); // NOI18N
        btnClear.setText(bundle.getString("ChangePassword.btnClear.text")); // NOI18N
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel1.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, -1, -1));

        btnExit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/exit small.png"))); // NOI18N
        btnExit.setText(bundle.getString("ChangePassword.btnExit.text")); // NOI18N
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel1.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, -1, -1));

        txtNewPass.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtNewPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNewPass.setText(bundle.getString("ChangePassword.txtNewPass.text")); // NOI18N
        txtNewPass.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtNewPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNewPassKeyReleased(evt);
            }
        });
        jPanel1.add(txtNewPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 213, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 470, 330));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/first page background800.png"))); // NOI18N
        jLabel2.setText(bundle.getString("ChangePassword.jLabel2.text")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdatePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatePassActionPerformed
        // TODO add your handling code here:

        String newPassword = txtNewPass.getText();
        String confirmPassword = txtConfirmPss.getText();
        if (newPassword.equals(confirmPassword)) {
            User user = userDao.getPassword(userEmail);
            String oldPassword = user.getPassword();
            String machPass = txtOldPassword.getText();
            if (!machPass.equals(oldPassword)) {
                JOptionPane.showMessageDialog(this, "<html><b style=\"color:red\">Incrrect Password</b></html>", "mgs", JOptionPane.ERROR_MESSAGE);
            } else { 
                userDao.update(userEmail, newPassword);
                clear();
            }
        } else {
            JOptionPane.showMessageDialog(this, "<html><b style=\"color:red\">Password not Match</b></html>", "mgs", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnUpdatePassActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(this, "Do you want to close?", "Yes", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            dispose();
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtNewPassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNewPassKeyReleased
        // TODO add your handling code here:
        valideFild();
    }//GEN-LAST:event_txtNewPassKeyReleased

    private void txtConfirmPssKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConfirmPssKeyReleased
        // TODO add your handling code here:
        valideFild();
    }//GEN-LAST:event_txtConfirmPssKeyReleased

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
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnUpdatePass;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtConfirmPss;
    private javax.swing.JPasswordField txtNewPass;
    private javax.swing.JPasswordField txtOldPassword;
    // End of variables declaration//GEN-END:variables
}
