package cricboard.SecondInnings;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class executionSecondInnings extends javax.swing.JFrame {

    public executionSecondInnings()
    {
        initComponents();
        getTableData();
        loadBatsmanData();
        loadBowlerData();
        getNecessaryInfo();
    }

    public static int targetRuns;
    public static String firstTeam;
    public static String secondTeam;
    private void getNecessaryInfo()
    {
        try
        {
            Connection conn = null;
            Statement st = null;
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/cricboard","root","");
            st = conn.createStatement();
            String sql= "SELECT `Team`, `Total Runs` FROM battingscoreboard1";
            ResultSet res = st.executeQuery(sql);
            while(res.next())
            {
                targetRuns = res.getInt("Total Runs");
                firstTeam = res.getString("Team");
            }
            String sql1= "SELECT `Team` FROM battingscoreboard2";
            ResultSet rs = st.executeQuery(sql1);
            while(rs.next())
            {
                secondTeam = rs.getString("Team");
                System.out.println(secondTeam);
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    private void getTableData()
    {
        Connection conn = null;
        Statement st = null;
        try{
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/cricboard","root","");
            st = conn.createStatement();
            String sql= "SELECT * FROM battingscoreboard2";
            ResultSet rs = st.executeQuery(sql);
            DefaultTableModel model = new DefaultTableModel(new String[]{"Team", "Extra Runs", "Run Rate", "Req. Run Rate", "Total Over", "Total Runs"}, 0);
            while(rs.next())
            {
                String teamName = rs.getString("Team");
                String extraRuns = rs.getString("Extra Runs");
                String RR = rs.getString("Run Rate");                
                String RRR = rs.getString("Req. Run Rate");
                String totalOver = rs.getString("Total Over");                
                String totalRuns = rs.getString("Total Runs");
                model.addRow(new Object[]{teamName, extraRuns, RR, RRR, totalOver, totalRuns});
            }
            jBattingScoreboard2.setModel(model);
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    private void loadBatsmanData()
    {
        Connection conn = null;
        Statement st = null;
        try{
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/cricboard","root","");
            st = conn.createStatement();
            String sql= "SELECT * FROM batsman2";
            ResultSet res = st.executeQuery(sql);
            while(res.next()){
                jBatsman.addItem(res.getString("Name"));
            }          
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    private void loadBowlerData()
    {
        Connection conn = null;
        Statement st = null;
        try{
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/cricboard","root","");
            st = conn.createStatement();
            String sql= "SELECT * FROM bowler1";
            ResultSet res = st.executeQuery(sql);
            while(res.next()){
                jBowler.addItem(res.getString("Name"));
            }          
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void theQuery(String query)
    {
        Connection conn = null;
        Statement st = null;
        try
        {
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/cricboard","root","");
            st = conn.createStatement();
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Congratulations!! The operation done successfully.");
            //refreshMethod();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jaddFOURERBAT = new javax.swing.JButton();
        jaddONEOverBAT = new javax.swing.JButton();
        jaddONERunBOWL = new javax.swing.JButton();
        jaddTWORunBOWL = new javax.swing.JButton();
        jaddTHREERunBOWL = new javax.swing.JButton();
        jaddFOURRunBOWL = new javax.swing.JButton();
        jaddFIVERunBOWL = new javax.swing.JButton();
        jaddSIXBOWLBowl = new javax.swing.JButton();
        jBatsman = new javax.swing.JComboBox();
        jBowler = new javax.swing.JComboBox();
        jgotWicket = new javax.swing.JButton();
        jaddONERunBAT = new javax.swing.JButton();
        jaddTWORunBAT = new javax.swing.JButton();
        jaddTHREERunBAT = new javax.swing.JButton();
        jaddONEMaiden = new javax.swing.JButton();
        jaddONEOverBOWL = new javax.swing.JButton();
        jEXIT = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jBattingScoreboard2 = new javax.swing.JTable();
        jRefresh = new javax.swing.JButton();
        jaddFOURRunBAT = new javax.swing.JButton();
        jaddFIVERunBAT = new javax.swing.JButton();
        jaddSIXRunBAT = new javax.swing.JButton();
        jgotOUTBAT = new javax.swing.JButton();
        jaddONEBallBAT = new javax.swing.JButton();
        jaddONEERBAT = new javax.swing.JButton();
        jaddTWOERBAT = new javax.swing.JButton();
        jaddTHREEERBAT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jaddFOURERBAT.setText("4 ER");
        jaddFOURERBAT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jaddFOURERBATActionPerformed(evt);
            }
        });

        jaddONEOverBAT.setText("1 Over");
        jaddONEOverBAT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jaddONEOverBATActionPerformed(evt);
            }
        });

        jaddONERunBOWL.setText("Add 1");
        jaddONERunBOWL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jaddONERunBOWLActionPerformed(evt);
            }
        });

        jaddTWORunBOWL.setText("Add 2");
        jaddTWORunBOWL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jaddTWORunBOWLActionPerformed(evt);
            }
        });

        jaddTHREERunBOWL.setText("Add 3");
        jaddTHREERunBOWL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jaddTHREERunBOWLActionPerformed(evt);
            }
        });

        jaddFOURRunBOWL.setText("Add 4");
        jaddFOURRunBOWL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jaddFOURRunBOWLActionPerformed(evt);
            }
        });

        jaddFIVERunBOWL.setText("Add 5");
        jaddFIVERunBOWL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jaddFIVERunBOWLActionPerformed(evt);
            }
        });

        jaddSIXBOWLBowl.setText("Add 6");
        jaddSIXBOWLBowl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jaddSIXBOWLBowlActionPerformed(evt);
            }
        });

        jBatsman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBatsmanActionPerformed(evt);
            }
        });

        jBowler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBowlerActionPerformed(evt);
            }
        });

        jgotWicket.setText("Wicket");
        jgotWicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jgotWicketActionPerformed(evt);
            }
        });

        jaddONERunBAT.setText("Add 1");
        jaddONERunBAT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jaddONERunBATActionPerformed(evt);
            }
        });

        jaddTWORunBAT.setText("Add 2");
        jaddTWORunBAT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jaddTWORunBATActionPerformed(evt);
            }
        });

        jaddTHREERunBAT.setText("Add 3");
        jaddTHREERunBAT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jaddTHREERunBATActionPerformed(evt);
            }
        });

        jaddONEMaiden.setText("Maiden");
        jaddONEMaiden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jaddONEMaidenActionPerformed(evt);
            }
        });

        jaddONEOverBOWL.setText("1 Over");
        jaddONEOverBOWL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jaddONEOverBOWLActionPerformed(evt);
            }
        });

        jEXIT.setText("EXIT");
        jEXIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEXITActionPerformed(evt);
            }
        });

        jBattingScoreboard2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jBattingScoreboard2);

        jRefresh.setText("Refresh");
        jRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRefreshActionPerformed(evt);
            }
        });

        jaddFOURRunBAT.setText("Add 4");
        jaddFOURRunBAT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jaddFOURRunBATActionPerformed(evt);
            }
        });

        jaddFIVERunBAT.setText("Add 5");
        jaddFIVERunBAT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jaddFIVERunBATActionPerformed(evt);
            }
        });

        jaddSIXRunBAT.setText("Add 6");
        jaddSIXRunBAT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jaddSIXRunBATActionPerformed(evt);
            }
        });

        jgotOUTBAT.setText("OUT");
        jgotOUTBAT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jgotOUTBATActionPerformed(evt);
            }
        });

        jaddONEBallBAT.setText("1 Ball");
        jaddONEBallBAT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jaddONEBallBATActionPerformed(evt);
            }
        });

        jaddONEERBAT.setText("1 ER");
        jaddONEERBAT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jaddONEERBATActionPerformed(evt);
            }
        });

        jaddTWOERBAT.setText("2 ER");
        jaddTWOERBAT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jaddTWOERBATActionPerformed(evt);
            }
        });

        jaddTHREEERBAT.setText("3 ER");
        jaddTHREEERBAT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jaddTHREEERBATActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jEXIT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBatsman, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jaddFIVERunBAT)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jaddSIXRunBAT)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jgotOUTBAT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jaddONERunBAT)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jaddTWORunBAT)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jaddTHREERunBAT))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jaddONEERBAT, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jaddTWOERBAT, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jaddTHREEERBAT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(jaddONEOverBAT, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jaddFOURRunBAT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jaddONEBallBAT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jaddFOURERBAT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBowler, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jaddFOURRunBOWL, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                    .addComponent(jaddONERunBOWL, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                    .addComponent(jaddONEOverBOWL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jaddTWORunBOWL, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                    .addComponent(jaddFIVERunBOWL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jgotWicket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jaddSIXBOWLBowl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jaddTHREERunBOWL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jaddONEMaiden, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))))))
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jEXIT, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(jRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBatsman, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBowler, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jaddONERunBAT, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jaddTWORunBAT, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jaddTHREERunBAT, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jaddFOURRunBAT, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jaddONERunBOWL, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jaddTWORunBOWL, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jaddTHREERunBOWL, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jaddFIVERunBAT, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jaddSIXRunBAT, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jgotOUTBAT, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jaddONEBallBAT, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jaddFOURRunBOWL, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jaddFIVERunBOWL, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jaddSIXBOWLBowl, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jaddONEERBAT, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jaddTWOERBAT, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jaddTHREEERBAT, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jaddFOURERBAT, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jgotWicket, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jaddONEMaiden, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jaddONEOverBOWL, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jaddONEOverBAT, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setOver_RR_RRR()
    {
        Connection conn = null;
        Statement st = null;
        try
        {
            float updateOver, updateRunRate, updateReqRunRate;
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/cricboard","root","");
            st = conn.createStatement();
            String sql = "SELECT `Total Runs`, `Total Over` FROM battingscoreboard2";
            ResultSet res = st.executeQuery(sql);
            while(res.next())
            {
                updateRunRate = res.getFloat("Total Runs");
                updateOver = res.getFloat("Total Over");
                updateOver = updateOver + 1;
                updateRunRate = updateRunRate / updateOver;
                updateReqRunRate = (res.getFloat("Total Runs")) / (6 - updateOver);
                theQuery("UPDATE battingscoreboard2 SET `Run Rate` = " + updateRunRate + ", `Req. Run Rate` = " + updateReqRunRate + ", `Total Over` = " + updateOver + ";");
            }
        } 
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    private void setTeamInfo(int addRun, String str)
    {
        Connection conn = null;
        Statement st = null;
        try
        {
            int runUpdate, extrarunUpdate;
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/cricboard","root","");
            st = conn.createStatement();
            if(str.equals("Extra Runs"))
            {
                String sql= "SELECT `Extra Runs`, `Total Runs` FROM battingscoreboard2";
                ResultSet res = st.executeQuery(sql);
                while(res.next())
                {
                    extrarunUpdate = res.getInt("Extra Runs");
                    runUpdate = res.getInt("Total Runs");
                    extrarunUpdate = extrarunUpdate + addRun;
                    runUpdate = runUpdate + addRun;
                    if(runUpdate > targetRuns)
                    {
                        pushExit();
                        break;
                    }
                    theQuery("UPDATE battingscoreboard2 SET `Extra Runs` = " + extrarunUpdate + ", `Total Runs` = " + runUpdate + ";");
                }
            }
            else
            {
                String sql= "SELECT `Total Runs` FROM battingscoreboard2";
                ResultSet res = st.executeQuery(sql);
                while(res.next())
                {
                    runUpdate = res.getInt("Total Runs");
                    runUpdate = runUpdate + addRun;
                    theQuery("UPDATE battingscoreboard2 SET `Total Runs` = " + runUpdate + ";");
                }
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    private void setBatsmanInfo(int addRun)
    {
        Connection conn = null;
        Statement st = null;
        try
        {
            int runUpdate, ballUpdate;
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/cricboard","root","");
            st = conn.createStatement();
            String sql= "SELECT Runs FROM batsman2 where Name = '" + jBatsman.getSelectedItem().toString() + "';";
            ResultSet res = st.executeQuery(sql);
            while(res.next())
            {
                runUpdate = res.getInt("Runs");
                runUpdate = runUpdate + addRun;
                if(addRun == 4)
                {
                    theQuery("UPDATE batsman2 SET Runs = " + runUpdate + ", 4s = 1 WHERE Name = '" + jBatsman.getSelectedItem().toString() + "'");
                    theQuery("UPDATE batsman2 SET Runs = " + runUpdate + " WHERE Name = '" + jBatsman.getSelectedItem().toString() + "'");
                }
                else if(addRun == 6)
                {
                    theQuery("UPDATE batsman2 SET Runs = " + runUpdate + ", 6s = 1 WHERE Name = '" + jBatsman.getSelectedItem().toString() + "'");
                    theQuery("UPDATE batsman2 SET Runs = " + runUpdate + " WHERE Name = '" + jBatsman.getSelectedItem().toString() + "'");
                }
                else if(addRun == 0)
                    break;
                else
                    theQuery("UPDATE batsman2 SET Runs = " + runUpdate + " WHERE Name = '" + jBatsman.getSelectedItem().toString() + "'");
            }
            String sqlBall = "SELECT Balls FROM batsman2 where Name = '" + jBatsman.getSelectedItem().toString() + "';";
            ResultSet rs = st.executeQuery(sqlBall);
            while(rs.next())
            {
                ballUpdate = rs.getInt("Balls");
                ballUpdate = ballUpdate + 1;
                theQuery("UPDATE batsman2 SET Balls = " + ballUpdate + " WHERE Name = '" + jBatsman.getSelectedItem().toString() + "'");
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    private void setBowlerInfo(int addRun, int addWicket, int addMaiden, int addOver)
    {
        int updateRun, updateWicket, updateMaiden, updateOver;
        Connection conn = null;
        Statement st = null;
        try
        {
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/cricboard","root","");
            st = conn.createStatement();
            String sql = "SELECT Runs, Wickets, Maidens, Overs FROM bowler1 WHERE Name = '" + jBowler.getSelectedItem().toString() + "';";
            ResultSet res = st.executeQuery(sql);
            while(res.next())
            {
                updateRun = res.getInt("Runs");
                updateRun = updateRun + addRun;
                updateWicket = res.getInt("Wickets");
                updateWicket = updateWicket + addWicket;
                updateMaiden = res.getInt("Maidens");
                updateMaiden = updateMaiden + addMaiden;
                updateOver = res.getInt("Overs");
                updateOver = updateOver + addOver;
                theQuery("UPDATE bowler1 SET Runs = " + updateRun + ", Wickets = " + updateWicket + ", Maidens = " + updateMaiden + ", Overs = " + updateOver + " WHERE Name = '" + jBowler.getSelectedItem().toString() + "';");
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    public static int over = 0;
    public static int out = 0;
    private void outChecking(int value)
    {
        try
        {
            Connection conn = null;
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/cricboard","root","");
            out = out + value;
            if(out == 10)
            {
                JOptionPane.showMessageDialog(null, "First Inning is OVER");
                JOptionPane.showMessageDialog(null, "Please, ENTER THE EXIT BUTTON");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    private void overChecking(int value)
    {
        try
        {
            Connection conn = null;
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/cricboard","root","");
            over = over + value;
            if(over == 6)
            {
                JOptionPane.showMessageDialog(null, "First Inning is OVER");
                JOptionPane.showMessageDialog(null, "Please, Match is FINISHED");
                pushExit();
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    private void jaddFOURERBATActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jaddFOURERBATActionPerformed
        setTeamInfo(4, "Extra Runs");
    }//GEN-LAST:event_jaddFOURERBATActionPerformed

    private void jBatsmanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBatsmanActionPerformed
        
    }//GEN-LAST:event_jBatsmanActionPerformed

    private void jBowlerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBowlerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBowlerActionPerformed

    private void jaddONERunBATActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jaddONERunBATActionPerformed
        setBatsmanInfo(1);
        setTeamInfo(1, "Runs");
    }//GEN-LAST:event_jaddONERunBATActionPerformed

    private void jaddTHREERunBATActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jaddTHREERunBATActionPerformed
        setBatsmanInfo(3);
        setTeamInfo(3, "Runs");
    }//GEN-LAST:event_jaddTHREERunBATActionPerformed

    private void pushExit()
    {
        Connection conn = null;
        Statement st = null;
        try{
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/cricboard","root","");
            st = conn.createStatement();
            String sql= "SELECT `Total Runs` FROM battingscoreboard2";
            ResultSet res = st.executeQuery(sql);
            while(res.next()){
                int totalRuns = res.getInt("Total Runs");
                if(totalRuns < targetRuns)
                    JOptionPane.showMessageDialog(null, firstTeam + " WINS!!!!");
                else
                    JOptionPane.showMessageDialog(null, secondTeam + " WINS!!!!");
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        System.exit(0);
    }
    private void jEXITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEXITActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jEXITActionPerformed

    private void jRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRefreshActionPerformed
        getTableData();
    }//GEN-LAST:event_jRefreshActionPerformed

    private void jaddFIVERunBATActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jaddFIVERunBATActionPerformed
        setBatsmanInfo(5);
        setTeamInfo(5, "Runs");
    }//GEN-LAST:event_jaddFIVERunBATActionPerformed

    private void jgotOUTBATActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jgotOUTBATActionPerformed
        try
        {
            Connection conn = null;
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/cricboard","root","");
            JOptionPane.showMessageDialog(null, jBatsman.getSelectedItem().toString() + " is OUT..");
            JOptionPane.showMessageDialog(null, "Please, change the batsman!");         
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        outChecking(1);
    }//GEN-LAST:event_jgotOUTBATActionPerformed

    private void jaddONEERBATActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jaddONEERBATActionPerformed
        setTeamInfo(1, "Extra Runs");
    }//GEN-LAST:event_jaddONEERBATActionPerformed

    private void jaddTHREEERBATActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jaddTHREEERBATActionPerformed
        setTeamInfo(3, "Extra Runs");
    }//GEN-LAST:event_jaddTHREEERBATActionPerformed

    private void jaddONEOverBATActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jaddONEOverBATActionPerformed
        overChecking(1);
        setOver_RR_RRR();
    }//GEN-LAST:event_jaddONEOverBATActionPerformed

    private void jaddTWORunBATActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jaddTWORunBATActionPerformed
        setBatsmanInfo(2);
        setTeamInfo(2, "Runs");
    }//GEN-LAST:event_jaddTWORunBATActionPerformed

    private void jaddFOURRunBATActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jaddFOURRunBATActionPerformed
        try
        {
            Connection conn = null;
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/cricboard","root","");
            JOptionPane.showMessageDialog(null, jBatsman.getSelectedItem().toString() + " hits a FOUR..");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        setBatsmanInfo(4);
        setTeamInfo(4, "Runs");
    }//GEN-LAST:event_jaddFOURRunBATActionPerformed

    private void jaddSIXRunBATActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jaddSIXRunBATActionPerformed
        try
        {
            Connection conn = null;
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/cricboard","root","");
            JOptionPane.showMessageDialog(null, jBatsman.getSelectedItem().toString() + " hits a SIX..");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        setBatsmanInfo(6);
        setTeamInfo(6, "Runs");
    }//GEN-LAST:event_jaddSIXRunBATActionPerformed

    private void jaddONEBallBATActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jaddONEBallBATActionPerformed
        setBatsmanInfo(0);
    }//GEN-LAST:event_jaddONEBallBATActionPerformed

    private void jaddTWOERBATActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jaddTWOERBATActionPerformed
        setTeamInfo(2, "Extra Runs");
    }//GEN-LAST:event_jaddTWOERBATActionPerformed

    private void jaddONERunBOWLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jaddONERunBOWLActionPerformed
        setBowlerInfo(1, 0, 0, 0);
    }//GEN-LAST:event_jaddONERunBOWLActionPerformed

    private void jaddTWORunBOWLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jaddTWORunBOWLActionPerformed
        setBowlerInfo(2, 0, 0, 0);
    }//GEN-LAST:event_jaddTWORunBOWLActionPerformed

    private void jaddTHREERunBOWLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jaddTHREERunBOWLActionPerformed
        setBowlerInfo(3, 0, 0, 0);
    }//GEN-LAST:event_jaddTHREERunBOWLActionPerformed

    private void jaddFOURRunBOWLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jaddFOURRunBOWLActionPerformed
        setBowlerInfo(4, 0, 0, 0);
    }//GEN-LAST:event_jaddFOURRunBOWLActionPerformed

    private void jaddFIVERunBOWLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jaddFIVERunBOWLActionPerformed
        setBowlerInfo(5, 0, 0, 0);
    }//GEN-LAST:event_jaddFIVERunBOWLActionPerformed

    private void jaddSIXBOWLBowlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jaddSIXBOWLBowlActionPerformed
        setBowlerInfo(6, 0, 0, 0);
    }//GEN-LAST:event_jaddSIXBOWLBowlActionPerformed

    private void jaddONEOverBOWLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jaddONEOverBOWLActionPerformed
        try
        {
            Connection conn = null;
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/cricboard","root","");
            JOptionPane.showMessageDialog(null, "Change the bowler, " + jBowler.getSelectedItem().toString());
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        setBowlerInfo(0, 0, 0, 1);
    }//GEN-LAST:event_jaddONEOverBOWLActionPerformed

    private void jaddONEMaidenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jaddONEMaidenActionPerformed
        try
        {
            Connection conn = null;
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/cricboard","root","");
            JOptionPane.showMessageDialog(null, jBowler.getSelectedItem().toString() + " bowls a MAIDEN");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        setBowlerInfo(0, 0, 1, 0);
    }//GEN-LAST:event_jaddONEMaidenActionPerformed

    private void jgotWicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jgotWicketActionPerformed
        try
        {
            Connection conn = null;
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/cricboard","root","");
            JOptionPane.showMessageDialog(null, jBowler.getSelectedItem().toString() + " got a WICKET");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        setBowlerInfo(0, 1, 0, 0);
    }//GEN-LAST:event_jgotWicketActionPerformed

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
            java.util.logging.Logger.getLogger(executionSecondInnings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(executionSecondInnings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(executionSecondInnings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(executionSecondInnings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new executionSecondInnings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jBatsman;
    private javax.swing.JTable jBattingScoreboard2;
    private javax.swing.JComboBox jBowler;
    private javax.swing.JButton jEXIT;
    private javax.swing.JButton jRefresh;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jaddFIVERunBAT;
    private javax.swing.JButton jaddFIVERunBOWL;
    private javax.swing.JButton jaddFOURERBAT;
    private javax.swing.JButton jaddFOURRunBAT;
    private javax.swing.JButton jaddFOURRunBOWL;
    private javax.swing.JButton jaddONEBallBAT;
    private javax.swing.JButton jaddONEERBAT;
    private javax.swing.JButton jaddONEMaiden;
    private javax.swing.JButton jaddONEOverBAT;
    private javax.swing.JButton jaddONEOverBOWL;
    private javax.swing.JButton jaddONERunBAT;
    private javax.swing.JButton jaddONERunBOWL;
    private javax.swing.JButton jaddSIXBOWLBowl;
    private javax.swing.JButton jaddSIXRunBAT;
    private javax.swing.JButton jaddTHREEERBAT;
    private javax.swing.JButton jaddTHREERunBAT;
    private javax.swing.JButton jaddTHREERunBOWL;
    private javax.swing.JButton jaddTWOERBAT;
    private javax.swing.JButton jaddTWORunBAT;
    private javax.swing.JButton jaddTWORunBOWL;
    private javax.swing.JButton jgotOUTBAT;
    private javax.swing.JButton jgotWicket;
    // End of variables declaration//GEN-END:variables
}