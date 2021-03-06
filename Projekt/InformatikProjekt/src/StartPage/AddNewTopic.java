/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StartPage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ellin
 */
public class AddNewTopic extends javax.swing.JInternalFrame {

    private static Connection con;
    private MethodService methodService;

    /**
     * Creates new form EditBlogInternalFrame
     */
    public AddNewTopic(Connection con) {
        initComponents();
        this.con=con;
        methodService = new MethodService(con);
        fyllComboBox();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbxCategory = new javax.swing.JComboBox<>();
        lblCategory = new javax.swing.JLabel();
        lblTopicName = new javax.swing.JLabel();
        txtTopicName = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        lblText = new javax.swing.JLabel();
        lblHeader = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Örebro universitet");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 42, Short.MAX_VALUE))
        );

        lblCategory.setText("Choose category:");

        lblTopicName.setText("Write topic name:");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        lblHeader.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblHeader.setText("Create a new topic.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHeader)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnAdd)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblText, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTopicName)
                                    .addComponent(lblCategory))
                                .addGap(55, 55, 55)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbxCategory, 0, 133, Short.MAX_VALUE)
                                    .addComponent(txtTopicName))))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lblHeader)
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCategory)
                    .addComponent(cbxCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTopicName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTopicName))
                .addGap(18, 18, 18)
                .addComponent(lblText, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdd)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fyllComboBox() {
        try {
            int behorighet = LoggedUser.getBehorighet();
            Statement stmt = con.createStatement();
            String fraga = "select COUNT(KAT1_NAMN) as KAT1_NAMN from KAT1;";
            ResultSet rows = stmt.executeQuery(fraga);
            rows.next();
            int countRows=rows.getInt("KAT1_NAMN");
           
            fraga = "select KAT1_NAMN from KAT1;";
            ResultSet categories = stmt.executeQuery(fraga);
            
           

           
            
            if (behorighet == 2) {
                //ResultSet categories = stmt.executeQuery("select KAT1_NAMN from KAT1;");
                
                System.out.println(categories);
                for (int i = 0; i < countRows; i++)
                {
                    categories.next();
                    System.out.println(i);
                    if (i == 0 || i == 2) {
                        String oneCat = categories.getString("KAT1_NAMN");

                        cbxCategory.addItem(oneCat);
                    }
                }
            } else if (behorighet == 3) {
           // ResultSet categories = stmt.executeQuery("select KAT1_NAMN from KAT1;");
                for (int i = 0; i < countRows; i++) {
                    categories.next();
                    if(i>0){
                    String oneCat2 = categories.getString("KAT1_NAMN");

                    cbxCategory.addItem(oneCat2);
                    }
               }
            }
        } catch (SQLException e ) {
            JOptionPane.showMessageDialog(null, "Something went wrong.");
        }
    }
    
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if (Validation.textfieldWithValue(txtTopicName)) {
            try {

                String topic = txtTopicName.getText();
                String kat1 = cbxCategory.getSelectedItem().toString();
                
                String query = "Select max(Kat2_ID) as Kat2_ID From Kat2;";
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(query);
                rs.next();
                int maxKID = rs.getInt("Kat2_ID");
                int maxInt = maxKID + 1;
                
                query = "select KAT1_ID from KAT1 where KAT1_NAMN = '" + kat1 + "';";
                rs = stmt.executeQuery(query);
                rs.next();
                int kategoriID = rs.getInt("KAT1_ID");                
                String fraga = "insert into KAT2 values(?,?,?);";
                PreparedStatement ps = con.prepareStatement(fraga);
                ps.setInt(1, maxInt);
                ps.setInt(2, kategoriID);
                ps.setString(3, topic);
                ps.executeUpdate();
                lblText.setText("Topic successfully added.");
//
//                String kat1ID = idb.fetchSingle("select KAT1_ID from KAT1 where KAT1_NAMN = '" + kat1 + "';");
//
//                String maxID = idb.fetchSingle("Select max(Kat2_ID) From Kat2;");
//                int maxIdInt = Integer.parseInt(maxID);
//                int maxInt = maxIdInt + 1;
//
//                idb.insert("insert into KAT2 values(" + maxInt + ",'" + kat1ID + "', '" + topicName + "');");
//
//                
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Something went wrong.");
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JComboBox<String> cbxCategory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCategory;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblText;
    private javax.swing.JLabel lblTopicName;
    private javax.swing.JTextField txtTopicName;
    // End of variables declaration//GEN-END:variables
}
