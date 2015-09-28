package cricboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

/**
 *
 * @author ahsan_000
 */
public class teamInitialization extends javax.swing.JFrame
{
    String TeamA,TeamB;
    public teamInitialization()
    {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JTeamB = new javax.swing.JTextField();
        JTeamA = new javax.swing.JTextField();
        JfirstNext = new javax.swing.JButton();
        jDefualt = new javax.swing.JTextField();
        jDefualt1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JTeamB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTeamBActionPerformed(evt);
            }
        });

        JTeamA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTeamAActionPerformed(evt);
            }
        });

        JfirstNext.setText("NEXT");
        JfirstNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JfirstNextActionPerformed(evt);
            }
        });

        jDefualt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jDefualt.setText("ENTER NAME OF TEAMS");
        jDefualt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDefualtActionPerformed(evt);
            }
        });

        jDefualt1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jDefualt1.setText("CricBoard");
        jDefualt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDefualt1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(230, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JTeamB, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTeamA, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDefualt, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(209, 209, 209))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(JfirstNext, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jDefualt1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(278, 278, 278))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jDefualt1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(jDefualt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(JTeamA, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JTeamB, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(JfirstNext, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTeamBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTeamBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTeamBActionPerformed

    private void JfirstNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JfirstNextActionPerformed
        TeamA = JTeamA.getText();
        TeamB = JTeamB.getText();
        new teamMembers();
    }//GEN-LAST:event_JfirstNextActionPerformed

    private void jDefualtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDefualtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDefualtActionPerformed

    private void jDefualt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDefualt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDefualt1ActionPerformed

    private void JTeamAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTeamAActionPerformed
        JTeamA.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String input = JTeamA.getText();
            }
        });
    }//GEN-LAST:event_JTeamAActionPerformed

    public String getTeamA()
    {
        return TeamA;
    }
    public String getTeamB()
    {
        return TeamB;
    }
    //public String nameTeamA = JTeamA.getText();
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
            java.util.logging.Logger.getLogger(teamInitialization.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(teamInitialization.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(teamInitialization.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(teamInitialization.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new teamInitialization().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTeamA;
    private javax.swing.JTextField JTeamB;
    private javax.swing.JButton JfirstNext;
    private javax.swing.JTextField jDefualt;
    private javax.swing.JTextField jDefualt1;
    // End of variables declaration//GEN-END:variables
}