/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StartPage;

import com.jidesoft.swing.AutoCompletion;
import java.awt.Color;
import java.sql.Connection;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author ellin
 */
public class EditUserInformation extends javax.swing.JInternalFrame {

    private static Connection con;
    private static InfDB idb;
    private MethodService methodService;
    private String firstname;
    private String surname;
    private String ID;
    

    /**
     * Creates new form EditBlogInternalFrame
     */
    public EditUserInformation(InfDB idb) {
        initComponents();
        this.idb = idb;
        ID = null;
        methodService = new MethodService(con);
        //Gör panelen vit som backgrunden
        pnlMainPanel.setBackground(Color.WHITE);
        //Gör panelen osynlig
        pnlMainPanel.setVisible(false);
        //Lägger in alla personer i comboboxen
        methodService.fillComboboxAllUsers(cbUsers);
        //Lägger in alla behörigheter i comboboxen
        methodService.fillComboboxAccessTypes(cbAccessType);
        //Gör comboboxarna sökbara.
        AutoCompletion searchableUserList = new AutoCompletion(cbUsers);
        AutoCompletion searchableAccessTypeList = new AutoCompletion(cbAccessType);
        
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
        lblSelectToEdit = new javax.swing.JLabel();
        cbUsers = new javax.swing.JComboBox<>();
        btnSelect = new javax.swing.JButton();
        pnlMainPanel = new javax.swing.JPanel();
        lblFirstname = new javax.swing.JLabel();
        tfFirstname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfSurname = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        lblPhoneNumber = new javax.swing.JLabel();
        tfPhone = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        tfPassword = new javax.swing.JTextField();
        lblAccessType = new javax.swing.JLabel();
        cbAccessType = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();

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
                .addContainerGap(729, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 42, Short.MAX_VALUE))
        );

        lblSelectToEdit.setText("Select user you want to edit");

        cbUsers.setEditable(true);
        cbUsers.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select user" }));

        btnSelect.setText("Select");
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });

        lblFirstname.setText("Firstname:");

        tfFirstname.setColumns(10);

        jLabel2.setText("Surname:");

        tfSurname.setColumns(15);

        lblEmail.setText("E-mail:");

        tfEmail.setColumns(10);

        lblPhoneNumber.setText("Phone number:");

        tfPhone.setColumns(10);

        lblPassword.setText("Password:");

        tfPassword.setColumns(12);

        lblAccessType.setText("Access type:");

        cbAccessType.setEditable(true);
        cbAccessType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select access type" }));

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMainPanelLayout = new javax.swing.GroupLayout(pnlMainPanel);
        pnlMainPanel.setLayout(pnlMainPanelLayout);
        pnlMainPanelLayout.setHorizontalGroup(
            pnlMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainPanelLayout.createSequentialGroup()
                .addContainerGap(130, Short.MAX_VALUE)
                .addGroup(pnlMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFirstname)
                    .addComponent(jLabel2)
                    .addComponent(lblEmail)
                    .addComponent(lblPhoneNumber)
                    .addComponent(lblPassword)
                    .addComponent(lblAccessType))
                .addGap(40, 40, 40)
                .addGroup(pnlMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfFirstname)
                    .addComponent(tfSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(tfEmail)
                    .addComponent(tfPhone)
                    .addComponent(tfPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(cbAccessType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(130, 130, 130))
            .addGroup(pnlMainPanelLayout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addComponent(btnSave)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlMainPanelLayout.setVerticalGroup(
            pnlMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(pnlMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFirstname)
                    .addComponent(tfFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(pnlMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(pnlMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(pnlMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhoneNumber)
                    .addComponent(tfPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(pnlMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPassword)
                    .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(pnlMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbAccessType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAccessType))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(btnSave)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblSelectToEdit)
                                .addGap(32, 32, 32)
                                .addComponent(cbUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSelect))
                            .addComponent(pnlMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSelect)
                    .addComponent(lblSelectToEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(pnlMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
        //Kontorllerar att man har valt ett värde i comboboxen
        if (Validation.elementSelectedInCombobox(cbUsers, "Select user")) {

            //Delar strängen som användaren skickar in i namnfältet i för- och efternamn.
            String[] user = cbUsers.getSelectedItem().toString().trim().split("\\s+");
            firstname = user[0];
            surname = user[1];

            try {
                HashMap<String, String> resultatLista = idb.fetchRow("SELECT PERSONER.ID, PERSONER.MAIL, PERSONER.TELEFON, PERSONER.LOSENORD, SYSTEMTILLGANG.BEHORIGHET from PERSONER"
                        + " join systemtillgang on SYSTEMTILLGANG.SID = PERSONER.SID"
                        + " where FNAMN ='" + firstname + "' and ENAMN='" + surname + "'");
                ID = resultatLista.get("ID");
                tfFirstname.setText(firstname);
                tfSurname.setText(surname);
                String email = resultatLista.get("MAIL");
                tfEmail.setText(email);
                String phone = resultatLista.get("TELEFON");
                tfPhone.setText(phone);
                String password = resultatLista.get("LOSENORD");
                tfPassword.setText(password);
                
                
                //Tar bort alla tidigare värden i comboboxen
                cbAccessType.removeAllItems();

                //Lägger in alla behörigheter i comboboxen
                methodService.fillComboboxAccessTypes(cbAccessType);
                cbAccessType.setSelectedItem(resultatLista.get("BEHORIGHET"));

                //Gör panelen synlig
                pnlMainPanel.setVisible(true);
                
                //Gör funktioner osynliga
                lblSelectToEdit.setVisible(false);
                cbUsers.setVisible(false);
                btnSelect.setVisible(false);

            } catch (InfException oneException) {
                oneException.getMessage();
                JOptionPane.showMessageDialog(null, "Something went wrong");
            }
        }
    }//GEN-LAST:event_btnSelectActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        
        String email = tfEmail.getText();
        
        if(Validation.textfieldWithValue(tfFirstname) && Validation.textfieldWithValue(tfSurname) 
                && Validation.isValidEmailAddress(email) && Validation.textfaltTal(tfPhone) 
                && Validation.textfieldWithValue(tfPassword) && Validation.elementSelectedInCombobox(cbAccessType, "Select Access type")
                && Validation.losenordsKrav(tfPassword)) {
          
            //Hämtar det som finns i textfälten och lägger in värdena i lokala variabler
            firstname = tfFirstname.getText();
            surname = tfSurname.getText();
            String phone = tfPhone.getText();
            String password = tfPassword.getText();
            String access = cbAccessType.getSelectedItem().toString();
            
            try {
                //Hämtar behörighetsID med hjälp av dess namn
                String accessID = idb.fetchSingle("SELECT sid FROM systemtillgang  WHERE behorighet = \'" + access + "\'");
                
                //Uppdaterar tabellen med de nya värdena
                idb.update("UPDATE personer SET mail = \'" + email + "\', telefon = \'" + phone +"\', fnamn = \'" + firstname + "\', enamn = \'" + surname +"\', losenord = \'" + password + "\', sid = \'" + accessID + "\' WHERE id = " + ID);
                 
                //SKirver ut ett meddelande om att ändringarna har sparats
                JOptionPane.showMessageDialog(null, "The changes have been saved");
                
                //Gör panelen osynlig
                pnlMainPanel.setVisible(false);
                
                //Gör funktioner synliga
                lblSelectToEdit.setVisible(true);
                cbUsers.setVisible(true);
                btnSelect.setVisible(true);
                
            }
            catch (InfException oneException) {
                oneException.getMessage();
                JOptionPane.showMessageDialog(null, "Something went wrong");
            }
            
            
            
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSelect;
    private javax.swing.JComboBox<String> cbAccessType;
    private javax.swing.JComboBox<String> cbUsers;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAccessType;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFirstname;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblSelectToEdit;
    private javax.swing.JPanel pnlMainPanel;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfFirstname;
    private javax.swing.JTextField tfPassword;
    private javax.swing.JTextField tfPhone;
    private javax.swing.JTextField tfSurname;
    // End of variables declaration//GEN-END:variables
}
