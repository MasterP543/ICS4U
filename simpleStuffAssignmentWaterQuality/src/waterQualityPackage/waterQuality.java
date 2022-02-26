package waterQualityPackage;

/**
 * Daniel Ghita
 * February 12 2022
 */
public class waterQuality extends javax.swing.JFrame {
int[] pollutant = new int[100];
 int totalReadings;
 int count;
 
    public waterQuality() {
        initComponents();
        pnlInput.setVisible(false);
        pnlOutput.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        spinReadings = new javax.swing.JSpinner();
        btnStart = new javax.swing.JButton();
        pnlInput = new javax.swing.JPanel();
        lblEnterReading = new javax.swing.JLabel();
        txtReading = new javax.swing.JTextField();
        btnEnter = new javax.swing.JButton();
        pnlOutput = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtOutput = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Number of Readings:");

        btnStart.setText("Enter Data");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        pnlInput.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlInput.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEnterReading.setText("lblEnterReading");
        pnlInput.add(lblEnterReading, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 95, -1));
        pnlInput.add(txtReading, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 55, -1));

        btnEnter.setText("OK");
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });
        pnlInput.add(btnEnter, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        pnlOutput.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtOutput.setColumns(20);
        txtOutput.setRows(5);
        jScrollPane1.setViewportView(txtOutput);

        javax.swing.GroupLayout pnlOutputLayout = new javax.swing.GroupLayout(pnlOutput);
        pnlOutput.setLayout(pnlOutputLayout);
        pnlOutputLayout.setHorizontalGroup(
            pnlOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOutputLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        pnlOutputLayout.setVerticalGroup(
            pnlOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOutputLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(spinReadings, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(btnStart)
                .addGap(48, 48, 48))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(spinReadings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStart))
                .addGap(31, 31, 31)
                .addComponent(pnlInput, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        totalReadings = (Integer) spinReadings.getValue();
        pnlInput.setVisible(true);
        count = 1;
        lblEnterReading.setText("Enter reading " + Integer.toString(count));
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed
        pollutant[count] = Integer.parseInt(txtReading.getText());
        txtReading.setText("");
        count++;
        if (count <= totalReadings) {
            lblEnterReading.setText("Enter reading " + Integer.toString(count));
        } else {
            pnlInput.setVisible(false);
            pnlOutput.setVisible(true);
            String s = "";
            s += "Readings: \n";
            
            double sum = 0;
            double mean;
            
            int max = pollutant[1];
            int min = pollutant[1];
            
            for (int i = 1; i <= totalReadings; i++) {
                s += " " + Integer.toString(pollutant[i]) + "\n";
                sum += pollutant[i];
                if (pollutant[i] > max) {
                    max = pollutant[i];
                }
                if (pollutant[i] < min) {
                    min = pollutant[i];
                }
            }
            mean = sum / totalReadings;
            s += "Mean: " + String.format("%.1f", mean) + "\n";
            s += "Maximum: " + Integer.toString(max) + "\n";
            s += "Minimum: " + Integer.toString(min) + "\n";
            txtOutput.setText(s);
        }
    }//GEN-LAST:event_btnEnterActionPerformed

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
            java.util.logging.Logger.getLogger(waterQuality.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(waterQuality.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(waterQuality.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(waterQuality.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new waterQuality().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnter;
    private javax.swing.JButton btnStart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEnterReading;
    private javax.swing.JPanel pnlInput;
    private javax.swing.JPanel pnlOutput;
    private javax.swing.JSpinner spinReadings;
    private javax.swing.JTextArea txtOutput;
    private javax.swing.JTextField txtReading;
    // End of variables declaration//GEN-END:variables
}
