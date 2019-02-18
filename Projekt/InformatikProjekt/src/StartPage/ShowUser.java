/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StartPage;

import java.sql.Connection;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author ellin
 */
public class ShowUser extends javax.swing.JInternalFrame {

    private static Connection con;
     private MethodService methodService;

    //private JList listAllUsers;
    /**
     * Creates new form EditBlogInternalFrame
     *
     * @param idb
     */
    public ShowUser(Connection con) {
        initComponents();
        this.con = con;
        methodService = new MethodService(con);
        fillListWithUsers();

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
        jScrollPane1 = new javax.swing.JScrollPane();
        listAllUsers = new javax.swing.JList<>();
        btnShowInformation = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        taInformation = new javax.swing.JTextArea();

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
                .addContainerGap(550, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 42, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(listAllUsers);

        btnShowInformation.setText("Show information");
        btnShowInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowInformationActionPerformed(evt);
            }
        });

        taInformation.setColumns(20);
        taInformation.setRows(5);
        jScrollPane2.setViewportView(taInformation);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnShowInformation)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnShowInformation)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnShowInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowInformationActionPerformed

        if (Validation.valtVarde(listAllUsers.getSelectedValue())) {
            try {
                               
                String personInfo = listAllUsers.getSelectedValue();
                String id = personInfo.substring(0, 2);
                String fraga = "SELECT PERSONER.MAIL, PERSONER.TELEFON, PERSONER.FNAMN, PERSONER.ENAMN, PERSONER.LOSENORD, SYSTEMTILLGANG.BEHORIGHET from PERSONER"
                        + " join systemtillgang on SYSTEMTILLGANG.SID = PERSONER.SID"
                        + " where ID =" + id;
              
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(fraga);

                String rL = "";
                while(rs.next()) {
                    rL += "\n"+"Firstname: ";
                    rL += rs.getString("FNAMN");
                    rL += "\n" + "Surname: ";
                    rL += rs.getString("ENAMN");
                    rL += "\n" + "Access type: ";
                    rL += rs.getString("BEHORIGHET");
                    rL += "\n" + "Phone number: ";
                    rL += rs.getString("TELEFON");
                    rL += "\n" + "E-mail: ";
                    rL += rs.getString("LOSENORD");

                }

                taInformation.setText(rL);
            } catch (SQLException ex) {
                Logger.getLogger(ShowUser.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_btnShowInformationActionPerformed

    private void fillListWithUsers() {

        try {
            DefaultListModel allUsers = new DefaultListModel();
            
                Statement stmt = con.createStatement();
                ResultSet nameList = stmt.executeQuery("SELECT id, fnamn, enamn FROM personer;");



            //Loopar genom listan för att hämta ut alla för- och efternamn
            while(nameList.next()){
            String user="";
            user+=nameList.getString("ID");
            user+=" ";
            user+=nameList.getString("FNAMN");
            user+=" ";
            user+=nameList.getString("ENAMN");
            user+="\n";
             allUsers.addElement(user);       
                    
            
            }
//            for (int i = 0; i < nameList.getFetchSize(); i++) {
//                String id = nameList.getString(i).get("ID");
//                String firstName = nameList.get(i).get("FNAMN");
//                String surName = nameList.get(i).get("ENAMN");
//                String user = (id + " " + firstName + " " + surName + "\n");
//                allUsers.addElement(user);
//            }

            listAllUsers.setModel(allUsers);
            listAllUsers.getSelectedValue();

        } catch (SQLException e) {
         
            JOptionPane.showMessageDialog(null, "Something went wrong.");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnShowInformation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listAllUsers;
    private javax.swing.JTextArea taInformation;
    // End of variables declaration//GEN-END:variables
}
