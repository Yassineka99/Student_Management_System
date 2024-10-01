/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Yassine
 */
public class Teacher extends javax.swing.JFrame {

    /**
     * Creates new form Teacher
     */
    public Teacher() {
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
        AddT = new javax.swing.JButton();
        DelT = new javax.swing.JButton();
        AddS = new javax.swing.JButton();
        DelS = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Login.setFont(new java.awt.Font("Segoe Print", 0, 36)); // NOI18N
        Login.setText("Select group");
        getContentPane().add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, -1, -1));

        AddT.setBackground(new java.awt.Color(204, 204, 255));
        AddT.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        AddT.setText("A");
        AddT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddTActionPerformed(evt);
            }
        });
        getContentPane().add(AddT, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 210, -1));

        DelT.setBackground(new java.awt.Color(204, 204, 255));
        DelT.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        DelT.setText("B");
        DelT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelTActionPerformed(evt);
            }
        });
        getContentPane().add(DelT, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 210, -1));

        AddS.setBackground(new java.awt.Color(204, 204, 255));
        AddS.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        AddS.setText("C");
        AddS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddSActionPerformed(evt);
            }
        });
        getContentPane().add(AddS, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 210, -1));

        DelS.setBackground(new java.awt.Color(204, 204, 255));
        DelS.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        DelS.setText("D");
        DelS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelSActionPerformed(evt);
            }
        });
        getContentPane().add(DelS, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 210, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/abstract-connections-banner-design-vector.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddTActionPerformed
        // TODO add your handling code here:
        Group_A g = new Group_A();
        g.show();
        dispose();
        
    }//GEN-LAST:event_AddTActionPerformed

    private void AddSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddSActionPerformed
                Group_C g = new Group_C();
        g.show();
        dispose();
    }//GEN-LAST:event_AddSActionPerformed

    private void DelTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelTActionPerformed
        // TODO add your handling code here:
                Group_B g = new Group_B();
        g.show();
        dispose();
    }//GEN-LAST:event_DelTActionPerformed

    private void DelSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelSActionPerformed
        // TODO add your handling code here:
                Group_D g = new Group_D();
        g.show();
        dispose();
    }//GEN-LAST:event_DelSActionPerformed

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
            java.util.logging.Logger.getLogger(Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teacher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddS;
    private javax.swing.JButton AddT;
    private javax.swing.JButton DelS;
    private javax.swing.JButton DelT;
    private javax.swing.JLabel Login;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
