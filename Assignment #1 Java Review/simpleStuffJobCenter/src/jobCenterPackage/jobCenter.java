/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobCenterPackage;
import javax.swing.JToggleButton;

/**
 * Daniel Ghita
 * February 13 2022
 */
public class jobCenter extends javax.swing.JFrame {

    /**
     * Creates new form jobCenter
     */
    public jobCenter() {
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

        lblJob1 = new javax.swing.JLabel();
        lblJob2 = new javax.swing.JLabel();
        lblJob3 = new javax.swing.JLabel();
        lblJob4 = new javax.swing.JLabel();
        btnJob1 = new javax.swing.JToggleButton();
        btnJob2 = new javax.swing.JToggleButton();
        btnJob3 = new javax.swing.JToggleButton();
        btnJob4 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblJob1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jobCenterPackage/resources/carpentry.png"))); // NOI18N
        getContentPane().add(lblJob1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, -1, -1));

        lblJob2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jobCenterPackage/resources/catering.png"))); // NOI18N
        getContentPane().add(lblJob2, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 13, -1, -1));

        lblJob3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jobCenterPackage/resources/officework.png"))); // NOI18N
        getContentPane().add(lblJob3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 29, -1, -1));

        lblJob4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jobCenterPackage/resources/barwork.png"))); // NOI18N
        getContentPane().add(lblJob4, new org.netbeans.lib.awtextra.AbsoluteConstraints(803, 13, -1, -1));

        btnJob1.setText("Off");
        btnJob1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJob1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnJob1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, -1, -1));

        btnJob2.setText("Off");
        btnJob2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJob2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnJob2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, -1, -1));

        btnJob3.setText("Off");
        btnJob3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJob3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnJob3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 310, -1, -1));

        btnJob4.setText("Off");
        btnJob4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJob4ActionPerformed(evt);
            }
        });
        getContentPane().add(btnJob4, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 310, -1, -1));

        setBounds(0, 0, 1089, 417);
    }// </editor-fold>//GEN-END:initComponents

    private void btnJob1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJob1ActionPerformed
        JToggleButton btn = (JToggleButton) evt.getSource();
        if (btn.isSelected()) {
            lblJob1.setVisible(true);
            btnJob1.setText("Off");
        } else {
            lblJob1.setVisible(false);
            btnJob1.setText("On");
        }

    }//GEN-LAST:event_btnJob1ActionPerformed

    private void btnJob2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJob2ActionPerformed
        JToggleButton btn = (JToggleButton) evt.getSource();
        if (btn.isSelected()) {
            lblJob2.setVisible(true);
            btnJob2.setText("Off");
        } else {
            lblJob2.setVisible(false);
            btnJob2.setText("On");
        }

    }//GEN-LAST:event_btnJob2ActionPerformed

    private void btnJob3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJob3ActionPerformed
        JToggleButton btn = (JToggleButton) evt.getSource();
        if (btn.isSelected()) {
            lblJob3.setVisible(true);
            btnJob3.setText("Off");
        } else {
            lblJob3.setVisible(false);
            btnJob3.setText("On");
        }

    }//GEN-LAST:event_btnJob3ActionPerformed

    private void btnJob4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJob4ActionPerformed
        JToggleButton btn = (JToggleButton) evt.getSource();
        if (btn.isSelected()) {
            lblJob4.setVisible(true);
            btnJob4.setText("Off");
        } else {
            lblJob4.setVisible(false);
            btnJob4.setText("On");
        }

    }//GEN-LAST:event_btnJob4ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(jobCenter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jobCenter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jobCenter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jobCenter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jobCenter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnJob1;
    private javax.swing.JToggleButton btnJob2;
    private javax.swing.JToggleButton btnJob3;
    private javax.swing.JToggleButton btnJob4;
    private javax.swing.JLabel lblJob1;
    private javax.swing.JLabel lblJob2;
    private javax.swing.JLabel lblJob3;
    private javax.swing.JLabel lblJob4;
    // End of variables declaration//GEN-END:variables
}
