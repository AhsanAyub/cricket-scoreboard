package cricboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import static javafx.scene.input.KeyCode.K;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class teamMembers extends javax.swing.JFrame
    {
        public teamMembers()
        {
            initComponents();
            getTablebatsman1();
            getTablebatsman2();
            getTablebowler1();
            getTablebowler2();            
        }
        
        public String teamA = new teamInitialization().getTeamA();
        public String teamB = new teamInitialization().getTeamB();
        private void getTablebatsman1()
        {
            Connection conn1 = null;
            Statement st1 = null;
            try
            {
                conn1 = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/cricboard","root","");
                st1 = conn1.createStatement();
                String sql1 = "SELECT * FROM batsman1";
                ResultSet rs = st1.executeQuery(sql1);                
                while(rs.next())
                {
                    
                }
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null,ex.getMessage());
            }
        }
    
        private void getTablebatsman2()
        {
            Connection conn2 = null;
            Statement st2 = null;
            try
            {
                conn2 = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/cricboard","root","");
                st2 = conn2.createStatement();
                String sql2 = "SELECT * FROM batsman2";
                ResultSet rs = st2.executeQuery(sql2);
                while(rs.next())
                {
                    
                }
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null,ex.getMessage());
            }
        }

        private void getTablebowler1()
        {
            Connection conn3 = null;
            Statement st3 = null;
            try
            {
                conn3 = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/cricboard","root","");
                st3 = conn3.createStatement();
                String sql = "SELECT * FROM bowler1";
                ResultSet rs = st3.executeQuery(sql);
                while(rs.next())
                {
                    
                }
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null,ex.getMessage());
            }
        }

        private void getTablebowler2()
        {
            Connection conn4 = null;
            Statement st4 = null;
            try
            {
                conn4 = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/cricboard","root","");
                st4 = conn4.createStatement();
                String sql = "SELECT * FROM bowler2";
                ResultSet rs = st4.executeQuery(sql);
                while(rs.next())
                {
                    
                }
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null,ex.getMessage());
            }
        }
        
        public void theQuery(String query)
        {
            Connection conn=null;
            Statement st=null;
            try
            {
                conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/cricboard","root","");
                st = conn.createStatement();
                st.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Congratulations!! The operation done successfully.");
                refreshMethod();
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
        private void refreshMethod()
        {
            jteamName1.setText("");
            jteamName2.setText("");
            JplayerName.setText("");
            jCheckCaptain.setSelected(false);
            jCheckWicketkeeper.setSelected(false);
            jCheckBowler.setSelected(false);
        }
        
        @SuppressWarnings("unchecked")
        
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDefualt1 = new javax.swing.JTextField();
        jteamName1 = new javax.swing.JTextField();
        jCheckCaptain = new javax.swing.JCheckBox();
        jCheckWicketkeeper = new javax.swing.JCheckBox();
        jCheckBowler = new javax.swing.JCheckBox();
        JSecondNext = new javax.swing.JButton();
        JplayerName = new javax.swing.JTextField();
        jteamName2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDefualt1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jDefualt1.setText("CricBoard");
        jDefualt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDefualt1ActionPerformed(evt);
            }
        });

        jteamName1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jteamName1.setText("1st Team Name");
        jteamName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jteamName1ActionPerformed(evt);
            }
        });

        jCheckCaptain.setText("Captain");
        jCheckCaptain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckCaptainActionPerformed(evt);
            }
        });

        jCheckWicketkeeper.setText("Wicketkeeper");
        jCheckWicketkeeper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckWicketkeeperActionPerformed(evt);
            }
        });

        jCheckBowler.setText("Bowler");

        JSecondNext.setText("NEXT");
        JSecondNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JSecondNextActionPerformed(evt);
            }
        });

        JplayerName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JplayerName.setText("Player Name");
        JplayerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JplayerNameActionPerformed(evt);
            }
        });

        jteamName2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jteamName2.setText("2nd Team Name");
        jteamName2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jteamName2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jDefualt1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(304, 304, 304))
            .addGroup(layout.createSequentialGroup()
                .addGap(259, 259, 259)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCheckWicketkeeper, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                            .addComponent(jCheckCaptain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBowler, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                        .addComponent(JSecondNext, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JplayerName, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jteamName1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jteamName2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jDefualt1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jteamName1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jteamName2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(JplayerName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jCheckCaptain, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jCheckWicketkeeper, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBowler, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(JSecondNext, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jDefualt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDefualt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDefualt1ActionPerformed

    private void jteamName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jteamName1ActionPerformed
        
    }//GEN-LAST:event_jteamName1ActionPerformed

    private void jCheckCaptainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckCaptainActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckCaptainActionPerformed

    private void JSecondNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JSecondNextActionPerformed
        boolean captainFlag = jCheckCaptain.isSelected();
        boolean wicketkeeperFlag = jCheckWicketkeeper.isSelected();
        boolean bowlergFlag = jCheckBowler.isSelected();
        String setTeamName1 = jteamName1.getText().toString();
        String setTeamName2 = jteamName2.getText().toString();
        String setPlayerName = JplayerName.getText().toString();
        
        if(!jteamName1.getText().equals("") && !JplayerName.getText().equals(""))
        {
            if(captainFlag)
            {   
                if(wicketkeeperFlag)
                {
                    theQuery("INSERT INTO `batsman1` (`Team`, `Name`, `4s`, `6s`, `Runs`, `Balls`) VALUES ('" + setTeamName1 + "', '(c/w) " + setPlayerName + "','0', '0', '0', '0');");
                }
                else if(bowlergFlag)
                {
                    theQuery("INSERT INTO `bowler1` (`Team`, `Name`, `Runs`, `Wickets`, `Maidens`, `Overs`) VALUES ('" + setTeamName1 + "', '(c) " + setPlayerName + "','0', '0', '0', '0');");
                    theQuery("INSERT INTO `batsman1` (`Team`, `Name`, `4s`, `6s`, `Runs`, `Balls`) VALUES ('" + setTeamName1 + "', '(c) " + setPlayerName + "','0', '0', '0', '0');");
                }
                else
                {
                    theQuery("UPDATE `battingscoreboard1` SET `Team`= '" + setTeamName1  + "';");
                    theQuery("INSERT INTO `batsman1` (`Team`, `Name`, `4s`, `6s`, `Runs`, `Balls`) VALUES ('" + setTeamName1 + "', '(c) " + setPlayerName + "','0', '0', '0', '0');");
                }
                //jCheckCaptain.setVisible(false);
            }
            else if(wicketkeeperFlag)
            {
                theQuery("INSERT INTO `batsman1` (`Team`, `Name`, `4s`, `6s`, `Runs`, `Balls`) VALUES ('" + setTeamName1 + "', '(w) " + setPlayerName + "','0', '0', '0', '0');");
            }
            else
            {
                theQuery("INSERT INTO `batsman1` (`Team`, `Name`, `4s`, `6s`, `Runs`, `Balls`) VALUES ('" + setTeamName1 + "', '" + setPlayerName + "','0', '0', '0', '0');");
                theQuery("INSERT INTO `bowler1` (`Team`, `Name`, `Runs`, `Wickets`, `Maidens`, `Overs`) VALUES ('" + setTeamName1 + "', '" + setPlayerName + "','0', '0', '0', '0');");
            }
        }
        else if(!jteamName2.getText().equals("") && !JplayerName.getText().equals(""))
        {
            if(captainFlag)
            {
                if(wicketkeeperFlag)
                {
                    theQuery("INSERT INTO `batsman2` (`Team`, `Name`, `4s`, `6s`, `Runs`, `Balls`) VALUES ('" + setTeamName2 + "', '(c/w) " + setPlayerName + "','0', '0', '0', '0');");
                    //jCheckWicketkeeper.setVisible(false);
                }
                else if(bowlergFlag)
                {
                    theQuery("INSERT INTO `batsman2` (`Team`, `Name`, `4s`, `6s`, `Runs`, `Balls`) VALUES ('" + setTeamName2 + "', '(c) " + setPlayerName + "','0', '0', '0', '0');");
                    theQuery("INSERT INTO `bowler2` (`Team`, `Name`, `Runs`, `Wickets`, `Maidens`, `Overs`) VALUES ('"+ setTeamName2 +"', '(c) "+ setPlayerName +"','0', '0', '0', '0');");
                }
                else
                {
                    theQuery("UPDATE `battingscoreboard2` SET `Team`= '" + setTeamName2  + "';");
                    theQuery("INSERT INTO `batsman2` (`Team`, `Name`, `4s`, `6s`, `Runs`, `Balls`) VALUES ('" + setTeamName2 + "', '(c) " + setPlayerName + "','0', '0', '0', '0');");
                }
                //jCheckCaptain.setVisible(false);
            }
            else if(wicketkeeperFlag)
            {
                theQuery("INSERT INTO `batsman2` (`Team`, `Name`, `4s`, `6s`, `Runs`, `Balls`) VALUES ('" + setTeamName2 + "', '(w) " + setPlayerName + "','0', '0', '0', '0');");
            }
            else
            {
                theQuery("INSERT INTO `batsman2` (`Team`, `Name`, `4s`, `6s`, `Runs`, `Balls`) VALUES ('" + setTeamName2 + "', '" + setPlayerName + "','0', '0', '0', '0');");
                theQuery("INSERT INTO `bowler2` (`Team`, `Name`, `Runs`, `Wickets`, `Maidens`, `Overs`) VALUES ('" + setTeamName2 + "', '" + setPlayerName + "','0', '0', '0', '0');");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Error: Team Name and Player Name have to be entered.");
        }
    }//GEN-LAST:event_JSecondNextActionPerformed

    private void jCheckWicketkeeperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckWicketkeeperActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckWicketkeeperActionPerformed

    private void JplayerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JplayerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JplayerNameActionPerformed

    private void jteamName2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jteamName2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jteamName2ActionPerformed

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
            java.util.logging.Logger.getLogger(teamMembers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(teamMembers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(teamMembers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(teamMembers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new teamMembers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JSecondNext;
    private javax.swing.JTextField JplayerName;
    private javax.swing.JCheckBox jCheckBowler;
    private javax.swing.JCheckBox jCheckCaptain;
    private javax.swing.JCheckBox jCheckWicketkeeper;
    private javax.swing.JTextField jDefualt1;
    private javax.swing.JTextField jteamName1;
    private javax.swing.JTextField jteamName2;
    // End of variables declaration//GEN-END:variables
}