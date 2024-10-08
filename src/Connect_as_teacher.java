/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Yassine
 */
 import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Connect_as_teacher extends javax.swing.JFrame {
String sql ="select teacher_password from teacher where teacher_id= ?";

    /**
     * Creates new form Connect_as_teacher
     */
    public Connect_as_teacher() {
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

        Login = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        user = new javax.swing.JTextField();
        pass = new javax.swing.JTextField();
        passlabel = new javax.swing.JLabel();
        userlabel = new javax.swing.JLabel();
        errormsg = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Login.setFont(new java.awt.Font("Segoe Print", 0, 36)); // NOI18N
        Login.setText("Login");
        getContentPane().add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, -1, -1));

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        jButton1.setText("Confirm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 130, 60));

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, 130, 60));
        getContentPane().add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 230, 40));
        getContentPane().add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 230, 40));

        passlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-password.gif"))); // NOI18N
        getContentPane().add(passlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 50, 60));

        userlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-user.gif"))); // NOI18N
        getContentPane().add(userlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 50, 60));

        errormsg.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        errormsg.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(errormsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 220, -1, -1));

        Back.setBackground(new java.awt.Color(204, 204, 255));
        Back.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 130, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/abstract-connections-banner-design-vector.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
                        try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        try {
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management_system","root","12345") ;
            PreparedStatement ps= c.prepareStatement(sql);
                ps.setString(1,user.getText());
                ResultSet rs = ps.executeQuery();
                if(rs.next())
                {
                    String returnedpass = rs.getString("teacher_password");
                    if(returnedpass.equals(pass.getText()))
                    {
                     Teacher t = new Teacher();
                     t.show();
                     dispose();
                    }
      
                }

            
            

   
            c.close();
        } catch (SQLException ex) {
            Logger.getLogger(Add_teacher.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(Add_teacher.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        RoleSelect a = new RoleSelect();
        a.show();
        dispose();
    }//GEN-LAST:event_BackActionPerformed

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
            java.util.logging.Logger.getLogger(Connect_as_teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Connect_as_teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Connect_as_teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Connect_as_teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Connect_as_teacher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JLabel Login;
    private javax.swing.JLabel errormsg;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField pass;
    private javax.swing.JLabel passlabel;
    private javax.swing.JTextField user;
    private javax.swing.JLabel userlabel;
    // End of variables declaration//GEN-END:variables
}
