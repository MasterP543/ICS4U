package studentGradesPackage;
import javax.swing.JOptionPane;

/**
 * Daniel Ghita
 * February 10 2022
 */
public class studentGrades extends javax.swing.JFrame {

    /**
     * Creates new form studentGrades
     */
    public studentGrades() {
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
        txtStudentName = new javax.swing.JTextField();
        txtMark = new javax.swing.JTextField();
        cmbSubmission = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        btnGrade = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtGrade = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Student Name:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 26, -1, -1));

        jLabel2.setText("Mark Recieved:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 63, -1, -1));

        jLabel3.setText("Submission Type:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 103, -1, -1));

        txtStudentName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStudentNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtStudentName, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 24, 130, -1));
        getContentPane().add(txtMark, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 61, 35, -1));

        cmbSubmission.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "First", "Second" }));
        getContentPane().add(cmbSubmission, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 98, -1, -1));

        jLabel4.setText("%");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 63, -1, -1));

        btnGrade.setText("Submit");
        btnGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGradeActionPerformed(evt);
            }
        });
        getContentPane().add(btnGrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 140, -1, -1));

        txtGrade.setColumns(20);
        txtGrade.setRows(5);
        jScrollPane1.setViewportView(txtGrade);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 183, 260, 120));

        setBounds(0, 0, 333, 362);
    }// </editor-fold>//GEN-END:initComponents

    private void txtStudentNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStudentNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStudentNameActionPerformed

    private void btnGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGradeActionPerformed
    int studentMark;
    String grade;
    String submission;
    
    try {
        studentMark = Integer.parseInt(txtMark.getText());
        if(studentMark<0 || studentMark>100) {
            JOptionPane.showMessageDialog(studentGrades.this, "Mark Must be between 0% and 100%");
        } else {
            String s="";
            s += txtStudentName.getText();
            submission = (String)cmbSubmission.getSelectedItem();
            if(submission.equals("Second")){
                if(studentMark>40){
                    studentMark = 40;
                }
            }
            s+="\nMark: " + Integer.toString(studentMark) + "%";
            if (studentMark >= 70) {
                grade = "Distinction";
            } else {
                if (studentMark >= 60) {
                    grade = "Merit";
                } else {
                    if (studentMark >= 40) {
                        grade = "Pass";
                    } else {
                        grade = "Fail";
                    }
                }
            }
            s += "\nGrade: " + grade;
            txtGrade.setText(s);
        }
    } 
    
    catch(NumberFormatException e) {
        JOptionPane.showMessageDialog(studentGrades.this, "Enter Number Value in % field");
    }
    }//GEN-LAST:event_btnGradeActionPerformed

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
            java.util.logging.Logger.getLogger(studentGrades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studentGrades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studentGrades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentGrades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studentGrades().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGrade;
    private javax.swing.JComboBox<String> cmbSubmission;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtGrade;
    private javax.swing.JTextField txtMark;
    private javax.swing.JTextField txtStudentName;
    // End of variables declaration//GEN-END:variables
}