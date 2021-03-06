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

public class AddNewEmployee extends javax.swing.JInternalFrame {

    private static Connection con;

    private MethodService methodService;
    private boolean firstNameFocused = false; // Used in focusGain
    private boolean lastNameFocused = false; // Used in focusGain
    private boolean mailFocused = false; // Used in focusGain
    private boolean phoneFocused = false; // Used in focusGain
    private boolean passFocused = false; // Used in focusGain

    /**
     * Creates new form EditBlogInternalFrame
     */
    public AddNewEmployee(Connection con) {
        initComponents();
        methodService = new MethodService(con);
        this.con = con;
        //fillCombobox();
        comboboxAlternatives();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblAddNewEmployee = new javax.swing.JLabel();
        jLabelSureName = new javax.swing.JLabel();
        jLabelEmailAdress = new javax.swing.JLabel();
        jLabelPhoneNumber = new javax.swing.JLabel();
        jLabelAccessType = new javax.swing.JLabel();
        jTextFieldLastName = new javax.swing.JTextField();
        jTextFieldMail = new javax.swing.JTextField();
        jTextFieldPhone = new javax.swing.JTextField();
        jAccessType = new javax.swing.JComboBox();
        jLabelFirstName = new javax.swing.JLabel();
        jTextFieldFirstName = new javax.swing.JTextField();
        jLabelPassword = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButtonSaveNewEmployee = new javax.swing.JButton();
        lEmployeeAdded = new javax.swing.JLabel();

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

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

        lblAddNewEmployee.setFont(lblAddNewEmployee.getFont().deriveFont(lblAddNewEmployee.getFont().getStyle() | java.awt.Font.BOLD, lblAddNewEmployee.getFont().getSize()+5));
        lblAddNewEmployee.setText("Add new employee");

        jLabelSureName.setText("Last name:");

        jLabelEmailAdress.setText("E-Mail:");

        jLabelPhoneNumber.setText("Phone number:");

        jLabelAccessType.setText("Access type:");

        jTextFieldLastName.setText("Your last name");
        jTextFieldLastName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldLastNameFocusGained(evt);
            }
        });

        jTextFieldMail.setText("email@example.com");
        jTextFieldMail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldMailFocusGained(evt);
            }
        });

        jTextFieldPhone.setText("0X-XX XXX XX");

        jAccessType.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabelFirstName.setText("First name:");

        jTextFieldFirstName.setText("Your first name");
        jTextFieldFirstName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldFirstNameFocusGained(evt);
            }
        });

        jLabelPassword.setText("Password:");

        jPasswordField1.setText("jPasswordField1");

        jButtonSaveNewEmployee.setText("Save");
        jButtonSaveNewEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveNewEmployeeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonSaveNewEmployee)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelSureName)
                            .addComponent(jLabelEmailAdress)
                            .addComponent(jLabelPhoneNumber)
                            .addComponent(jLabelAccessType)
                            .addComponent(jLabelFirstName)
                            .addComponent(jLabelPassword)
                            .addComponent(lEmployeeAdded))
                        .addGap(62, 62, 62)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblAddNewEmployee)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldLastName)
                                .addComponent(jTextFieldPhone)
                                .addComponent(jTextFieldMail)
                                .addComponent(jAccessType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldFirstName)
                                .addComponent(jPasswordField1, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lblAddNewEmployee)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFirstName)
                    .addComponent(jTextFieldFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelSureName)
                    .addComponent(jTextFieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEmailAdress)
                    .addComponent(jTextFieldMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPhoneNumber)
                    .addComponent(jTextFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelAccessType)
                    .addComponent(jAccessType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPassword)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(lEmployeeAdded)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonSaveNewEmployee)
                .addGap(0, 25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSaveNewEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveNewEmployeeActionPerformed
        //Metoden skapar nya användare.
        if (Validation.textfieldWithValue(jTextFieldMail) && Validation.isValidEmailAddress(jTextFieldMail.getText()) && Validation.textfieldWithValue(jTextFieldPhone)
                && Validation.textfaltTal(jTextFieldPhone) && Validation.textfieldWithValue(jTextFieldFirstName) && Validation.textfieldWithValue(jTextFieldLastName)
                && Validation.textfieldWithValue(jPasswordField1) && Validation.losenordsKrav(jPasswordField1)) {

            try {
                int id = createId();
                int phonenumber = Integer.parseInt(jTextFieldPhone.getText());
                String mail = jTextFieldMail.getText();
                String firstname = jTextFieldFirstName.getText();
                String lastname = jTextFieldLastName.getText();
                String password = jPasswordField1.getText();
                String access = jAccessType.getSelectedItem().toString();
                System.out.println(access);
                int sid = getSID(access);
                String fraga = "select * from personer where Mail=? or TELEFON=?";

                PreparedStatement ps = con.prepareStatement(fraga);
                ps.setString(1, mail);
                ps.setInt(2, phonenumber);
                ResultSet rs = ps.executeQuery();
                if (!rs.next()) {
                    String fraga2 = "insert into personer (ID, MAIL, TELEFON, FNAMN, ENAMN, LOSENORD, SID) values(?,?,?,?,?,?,?)";

                    ps = con.prepareStatement(fraga2);
                    ps.setInt(1, id);
                    ps.setString(2, mail);
                    ps.setInt(3, phonenumber);
                    ps.setString(4, firstname);
                    ps.setString(5, lastname);
                    ps.setString(6, password);
                    ps.setInt(7, sid);
                    ps.executeUpdate();
                    lEmployeeAdded.setText("The person is now added to the employee list.");
                } else {
                    String checkMail = rs.getString("MAIL");

                    if (mail.equals(checkMail)) {
                        JOptionPane.showMessageDialog(null, "E-Mail is already in use!");

                    } else {
                        JOptionPane.showMessageDialog(null, "Phonenumber is already in use!");
                    }
                }
            } catch (SQLException ex) { // Catches an error from a faulty database connection
                JOptionPane.showMessageDialog(null, "Something went wrong.");
            }
        }
    }

    private void comboboxAlternatives() {

        int sid = LoggedUser.getBehorighet();

        switch (sid) {
            case 1:
                System.out.println("SID");
                fillCombobox();
                break;
            case 2:
                System.out.println("SID");
                fillComboboxEducation();

                break;
            case 3:
                System.out.println("SID");
                fillComboboxResearch();
                break;

        }
    }

    private void fillComboboxEducation() {
        Statement stmt = null;
        String query = "select BEHORIGHET from SYSTEMTILLGANG where SID = 3 or SID = 4 or SID = 6";
        try {
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                String oneBox = rs.getString("BEHORIGHET");
                jAccessType.addItem(oneBox);
            }
        } catch (SQLException e) {
            //JDBCTutorialUtilities.printSQLException(e);
        }
    }

    private void fillComboboxResearch() {
        Statement stmt = null;
        String query = "select BEHORIGHET from SYSTEMTILLGANG where SID = 2 or SID = 5";
        try {
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                String oneBox = rs.getString("BEHORIGHET");
                jAccessType.addItem(oneBox);
            }
        } catch (SQLException e) {
            //JDBCTutorialUtilities.printSQLException(e);
        }
    }//GEN-LAST:event_jButtonSaveNewEmployeeActionPerformed

    private void jTextFieldFirstNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldFirstNameFocusGained

        if (firstNameFocused == false) { // If the field is focused the box is cleared
            jTextFieldFirstName.setText("");
            firstNameFocused = true;
        }

    }//GEN-LAST:event_jTextFieldFirstNameFocusGained

    private void jTextFieldLastNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldLastNameFocusGained

        if (lastNameFocused == false) { // If the field is focused the box is cleared
            jTextFieldLastName.setText("");
            lastNameFocused = true;
        }

    }//GEN-LAST:event_jTextFieldLastNameFocusGained

    private void jTextFieldMailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldMailFocusGained

        if (mailFocused == false) { // If the field is focused the box is cleared
            jTextFieldMail.setText("");
            mailFocused = true;
        }

    }//GEN-LAST:event_jTextFieldMailFocusGained

    private void jPasswordField1FocusGained(java.awt.event.FocusEvent evt) {                                            

        if (passFocused == false) { // If the field is focused the box is cleared
            jPasswordField1.setText("");
            passFocused = true;
        }
    }                                           

    private void jTextFieldPhoneFocusGained(java.awt.event.FocusEvent evt) {                                            

        if (phoneFocused == false) { // If the field is focused the box is cleared
            jTextFieldPhone.setText("");
            phoneFocused = true;
        }
    }                                           

    private int createId() {   
           Statement stmt = null;
        int id = 1;
        boolean finns = true;
        try {
           stmt = con.createStatement();
            while(id<100){
            String fraga = "select ID from PERSONER where ID ="+id;
            ResultSet rs = stmt.executeQuery(fraga);
            if(!rs.next()) {
               return id; 
            }
            else{id++;
            }
            
           }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Something went wrong!");
            System.out.println("Internt felmeddelande" + e.getMessage());
            return 0;
        }
        return 0;
    }

    //Metoden fyller comboboxen vad för användare som finns i databasen.
    private void fillCombobox() {
        Statement stmt = null;
        String query = "select BEHORIGHET from SYSTEMTILLGANG";
        try {
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                String oneBox = rs.getString("BEHORIGHET");
                jAccessType.addItem(oneBox);
            }
        } catch (SQLException e) {
            //JDBCTutorialUtilities.printSQLException(e);
        }
    }

    //Metoden jämför namnet den användare man ska skapa och hämtar ut SID och skickar tillbaka det.
    private int getSID(String access) {
        Statement stmt = null;
        try {
            String fraga = "SELECT SID from SYSTEMTILLGANG where behorighet ='" + access + "'";
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(fraga);
            while (rs.next()) {
                int oneBox = rs.getInt("SID");
                // jAccessType.addItem(oneBox);
                return oneBox;
            }

        } catch (SQLException e) {
            //JDBCTutorialUtilities.printSQLException(e);
        }
        return 0;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jAccessType;
    private javax.swing.JButton jButtonSaveNewEmployee;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAccessType;
    private javax.swing.JLabel jLabelEmailAdress;
    private javax.swing.JLabel jLabelFirstName;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelPhoneNumber;
    private javax.swing.JLabel jLabelSureName;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextFieldFirstName;
    private javax.swing.JTextField jTextFieldLastName;
    private javax.swing.JTextField jTextFieldMail;
    private javax.swing.JTextField jTextFieldPhone;
    private javax.swing.JLabel lEmployeeAdded;
    private javax.swing.JLabel lblAddNewEmployee;
    // End of variables declaration//GEN-END:variables
}
