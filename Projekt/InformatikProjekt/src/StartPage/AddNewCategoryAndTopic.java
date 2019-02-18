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
public class AddNewCategoryAndTopic extends javax.swing.JInternalFrame {

    private Connection con;
    private MethodService methodService;

    /**
     * Creates new form EditBlogInternalFrame
     */
    public AddNewCategoryAndTopic(Connection con) {
        initComponents();
        this.con = con;
        methodService = new MethodService(con);
        methodService.fillComboboxBranchKat1(cBoxKategori);
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
        lblRubrikCategory = new javax.swing.JLabel();
        lblRubrikTopic = new javax.swing.JLabel();
        lblCategoriName = new javax.swing.JLabel();
        lblTopicNamn = new javax.swing.JLabel();
        tflKategori = new javax.swing.JTextField();
        tflTopicNamn = new javax.swing.JTextField();
        cBoxKategori = new javax.swing.JComboBox<>();
        lblKategori = new javax.swing.JLabel();
        btnAddKategori = new javax.swing.JButton();
        btnAddTopic = new javax.swing.JButton();
        lblText = new javax.swing.JLabel();
        lblText2 = new javax.swing.JLabel();

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

        lblRubrikCategory.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 18)); // NOI18N
        lblRubrikCategory.setText("Create a new category");

        lblRubrikTopic.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 18)); // NOI18N
        lblRubrikTopic.setText("Create a new topic");

        lblCategoriName.setText("Write a name for your category:");

        lblTopicNamn.setText("Write a name for your topic:");

        tflKategori.setColumns(5);

        tflTopicNamn.setColumns(8);

        cBoxKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Category" }));

        lblKategori.setText("Choose category:");

        btnAddKategori.setText("Add");
        btnAddKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddKategoriActionPerformed(evt);
            }
        });

        btnAddTopic.setText("Add");
        btnAddTopic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTopicActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblRubrikCategory)
                        .addGap(242, 242, 242)
                        .addComponent(lblRubrikTopic))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAddKategori)
                            .addComponent(lblText, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(135, 135, 135)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTopicNamn)
                                    .addComponent(lblKategori))
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cBoxKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tflTopicNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnAddTopic, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblText2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCategoriName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tflKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRubrikCategory)
                    .addComponent(lblRubrikTopic))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCategoriName)
                    .addComponent(tflKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cBoxKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblKategori))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTopicNamn)
                    .addComponent(tflTopicNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblText2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblText, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddTopic)
                    .addComponent(btnAddKategori))
                .addContainerGap(31, Short.MAX_VALUE))
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

    private void btnAddKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddKategoriActionPerformed

        if (Validation.textfieldWithValue(tflKategori)) {

            Statement stmt = null;
            String nykategori = tflKategori.getText();

            try {

                String frcheck = "select * from KAT1 where KAT1_NAMN = " + nykategori; // Added check

                PreparedStatement check = con.prepareStatement(frcheck);
                check.setString(1, nykategori);
                ResultSet rscheck = check.executeQuery();

                String befintlig = rscheck.getString("KAT1_NAMN");
                System.out.println(befintlig); // Stop of check

                if (befintlig != null) {

                    String query = "Select max(Kat1_ID) as Kat1_ID From Kat1;";

                    stmt = con.createStatement();

                    ResultSet rs = stmt.executeQuery(query);

                    rs.next();
                    int maxKID = rs.getInt("Kat1_ID");
                    int maxInt = maxKID + 1;
                    System.out.println(maxInt);

                    String fraga = "insert into Kat1 (KAT1_ID, KAT1_NAMN) VALUES (?,?)";

                    PreparedStatement ps = con.prepareStatement(fraga);
                    ps.setInt(1, maxInt);
                    ps.setString(2, nykategori);
                    ps.executeUpdate();

                    lblText.setText("Category successfully added.");
                } else {
                    JOptionPane.showMessageDialog(null, "That category already exists.");
                }

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Something went wrong.");
            }
        }
    }//GEN-LAST:event_btnAddKategoriActionPerformed

    private void btnAddTopicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTopicActionPerformed

        if (Validation.textfieldWithValue(tflTopicNamn) && Validation.elementSelectedInCombobox(cBoxKategori, "Select an option from the combobox.")) {
            try {

                String kategori = cBoxKategori.getSelectedItem().toString();
                String topic = tflTopicNamn.getText();
                System.out.println(kategori + " " + topic);

                String query = "Select max(Kat2_ID) as Kat2_ID From Kat2;";

                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(query);
                rs.next();
                int maxKID = rs.getInt("Kat2_ID");
                int maxInt = maxKID + 1;

                String check = "select * from KAT2 where KAT2_NAMN = " + topic; // Checks if there already is a topic with that name

                Statement stmt3 = con.createStatement();
                ResultSet rs3 = stmt3.executeQuery(check);

                String befintlig = rs3.getString("KAT2_NAMN");
                System.out.println(befintlig);

                if (befintlig != null) {

                    query = "select KAT1_ID from KAT1 where KAT1_NAMN = '" + kategori + "';";

                    rs = stmt.executeQuery(query);
                    rs.next();
                    int kategoriID = rs.getInt("KAT1_ID");
                    String fraga = "insert into KAT2 values(?,?,?);";
                    PreparedStatement ps = con.prepareStatement(fraga);
                    ps.setInt(1, maxInt);
                    ps.setInt(2, kategoriID);
                    ps.setString(3, topic);
                    ps.executeUpdate();

                    lblText2.setText("Topic successfully added.");
                } else {
                    JOptionPane.showMessageDialog(null, "That topic already exists.");
                }

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Something went wrong.");
            }
        }
    }//GEN-LAST:event_btnAddTopicActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddKategori;
    private javax.swing.JButton btnAddTopic;
    private javax.swing.JComboBox<String> cBoxKategori;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCategoriName;
    private javax.swing.JLabel lblKategori;
    private javax.swing.JLabel lblRubrikCategory;
    private javax.swing.JLabel lblRubrikTopic;
    private javax.swing.JLabel lblText;
    private javax.swing.JLabel lblText2;
    private javax.swing.JLabel lblTopicNamn;
    private javax.swing.JTextField tflKategori;
    private javax.swing.JTextField tflTopicNamn;
    // End of variables declaration//GEN-END:variables
}
