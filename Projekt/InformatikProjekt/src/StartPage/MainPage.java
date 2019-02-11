/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StartPage;

import java.beans.PropertyVetoException;
import oru.inf.InfDB;
import org.seamless.swing.ClosableTabbedPane;

/**
 *
 * @author Java Grupp 1
 */
public class MainPage extends javax.swing.JFrame {
    
    private static InfDB idb;
    private MethodService methodService;
    private ClosableTabbedPane paneMainPageTabs;
    private CreateBlogInternalFrame createBlogInternalFrame;
    private EditBlogInternalFrame editBlogInternalFrame;
    private RemoveBlogInternalFrame removeBlogInternalFrame;
    private FeedBlogInternalFrame feedBlogInternalFrame;
    private RemoveEmployeeFromTheSystem removeEmployeeFromTheSystem;
    private ShowUserInformation showUserInformation;
    private EditUserInformation editUserInformation;
    private AddNewEmployee addNewEmployee;
    private boolean loggedInAsAdmin;  
    private AddNewCategoryAndTopic addNewCategoryAndTopic;
    private AddNewTopic addNewTopic;
    
    private CreateMeeting createMeeting;
        
        
    /**
     * Creates new form ColorPage
     * @param idb
     */
    public MainPage(InfDB idb) {
        initComponents();
        this.setSize(1000, 800);
        this.idb = idb;
        //Instansierar ett nytt methodServiceobjekt
        methodService = new MethodService(idb);
        paneMainPageTabs = new ClosableTabbedPane();
        getContentPane().add(paneMainPageTabs);
        //methodService.setDesign(paneMainPageTabs);
        setMenuVisible(true);
        adminFunktions();
        setStartPage();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        superMenyBar = new javax.swing.JMenuBar();
        mainMenu = new javax.swing.JMenu();
        logOutMnuItm = new javax.swing.JMenuItem();
        closeWindowsMnuItm = new javax.swing.JMenuItem();
        exitMnuItm = new javax.swing.JMenuItem();
        blog = new javax.swing.JMenu();
        blogFeedMnuItm = new javax.swing.JMenuItem();
        createBlogMnuItm = new javax.swing.JMenuItem();
        editBlogMnuItm = new javax.swing.JMenuItem();
        removeBlogMnuItm = new javax.swing.JMenuItem();
        addCategory = new javax.swing.JMenuItem();
        addTopic = new javax.swing.JMenuItem();
        user = new javax.swing.JMenu();
        userInformation = new javax.swing.JMenuItem();
        addUser = new javax.swing.JMenuItem();
        editUser = new javax.swing.JMenuItem();
        removeUser = new javax.swing.JMenuItem();
        createMetting = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("File");
        jMenuBar3.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar3.add(jMenu6);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainMenu.setText("Main menu");

        logOutMnuItm.setText("Log out");
        logOutMnuItm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutMnuItmActionPerformed(evt);
            }
        });
        mainMenu.add(logOutMnuItm);

        closeWindowsMnuItm.setText("Close all windows");
        closeWindowsMnuItm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeWindowsMnuItmActionPerformed(evt);
            }
        });
        mainMenu.add(closeWindowsMnuItm);

        exitMnuItm.setText("Exit");
        exitMnuItm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMnuItmActionPerformed(evt);
            }
        });
        mainMenu.add(exitMnuItm);

        superMenyBar.add(mainMenu);

        blog.setText("Blog");

        blogFeedMnuItm.setText("Blog feed");
        blogFeedMnuItm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blogFeedMnuItmActionPerformed(evt);
            }
        });
        blog.add(blogFeedMnuItm);

        createBlogMnuItm.setText("Create blog");
        createBlogMnuItm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBlogMnuItmActionPerformed(evt);
            }
        });
        blog.add(createBlogMnuItm);

        editBlogMnuItm.setText("Edit blog");
        editBlogMnuItm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBlogMnuItmActionPerformed(evt);
            }
        });
        blog.add(editBlogMnuItm);

        removeBlogMnuItm.setText("Remove blog");
        removeBlogMnuItm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBlogMnuItmActionPerformed(evt);
            }
        });
        blog.add(removeBlogMnuItm);

        addCategory.setText("Add category");
        addCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCategoryActionPerformed(evt);
            }
        });
        blog.add(addCategory);

        addTopic.setText("Add topic");
        addTopic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTopicActionPerformed(evt);
            }
        });
        blog.add(addTopic);

        superMenyBar.add(blog);

        user.setText("User");

        userInformation.setText("User information");
        userInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userInformationActionPerformed(evt);
            }
        });
        user.add(userInformation);

        addUser.setText("Add user");
        addUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserActionPerformed(evt);
            }
        });
        user.add(addUser);

        editUser.setText("Edit user");
        editUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editUserActionPerformed(evt);
            }
        });
        user.add(editUser);

        removeUser.setText("Remove user");
        removeUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeUserActionPerformed(evt);
            }
        });
        user.add(removeUser);

        superMenyBar.add(user);

        createMetting.setText("Calender");

        jMenuItem3.setText("View calender");
        createMetting.add(jMenuItem3);

        jMenuItem4.setText("Create meeting");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        createMetting.add(jMenuItem4);

        superMenyBar.add(createMetting);

        setJMenuBar(superMenyBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setStartPage() {
        
        //Ett fönster instansieras och öppnas i en flik om ett likadant fönster inte redan finns.
        if(!tabExists("Blog feed")) {
            //imageHandling = new ImageHandling(idb);
            //openTab(imageHandling, "Image testing");
            feedBlogInternalFrame = new FeedBlogInternalFrame(idb);
            openTab(feedBlogInternalFrame, "Blog feed");
        }       
        //Flyttar fokus till filken, om det redan finns en sådan öppen.
        else{
            moveFocusToTab("Blog feed");
        }
    }
    
    private void openTab(javax.swing.JInternalFrame oneTab, String tabName) {
        // Metoden hjälper till att öppna en flik och kan göra detta utifrån basklassen.       
        paneMainPageTabs.addTab(tabName, oneTab);
        paneMainPageTabs.setSelectedIndex(paneMainPageTabs.getTabCount()-1);
            // Maximerar fliken.
            try { 
                oneTab.setMaximum(true);
            }catch (PropertyVetoException ettUndantag) {
                System.out.println(ettUndantag.getMessage());
            }
            
            // Tar bort ramen och huvudet från fönstret.
            oneTab.setBorder(null);
            ((javax.swing.plaf.basic.BasicInternalFrameUI)oneTab.getUI()).setNorthPane(null); 
        }
    
    private void moveFocusToTab(String flikTitel) {
        //Flyttar fokus till fliken
        int tabCount = paneMainPageTabs.getTabCount();
        for (int i=0; i < tabCount; i++) 
        {
            String tabTitle = paneMainPageTabs.getTitleAt(i);
            if (tabTitle.equals(flikTitel)){ 
                paneMainPageTabs.setSelectedIndex(i);
            }
        }
    }
    
    private boolean tabExists(String flikTitel) {
        boolean tabExists = false;
                int tabCount = paneMainPageTabs.getTabCount();
        for (int i=0; i < tabCount; i++) 
        {
            String tabTitle = paneMainPageTabs.getTitleAt(i);
            if (tabTitle.equals(flikTitel)){ 
                tabExists = true;
            }
        }
        return tabExists;
    }
    
    private void setMenuVisible(boolean enBoolean) {
        
        
        
        
    }
    
    private void exitMnuItmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMnuItmActionPerformed
        //Avslutar applikationen
        System.exit(1);
    }//GEN-LAST:event_exitMnuItmActionPerformed

    private void createBlogMnuItmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBlogMnuItmActionPerformed
        //Ett fönster instansieras och öppnas i en flik om ett likadant fönster inte redan finns.
        if(!tabExists("Create blog")) {
            createBlogInternalFrame = new CreateBlogInternalFrame(idb);
            openTab(createBlogInternalFrame, "Create blog");
        }       
        //Flyttar fokus till filken, om det redan finns en sådan öppen.
        else{
            moveFocusToTab("Create blog");
        }
    }//GEN-LAST:event_createBlogMnuItmActionPerformed

    private void editBlogMnuItmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBlogMnuItmActionPerformed
        //Ett fönster instansieras och öppnas i en flik om ett likadant fönster inte redan finns.
        if(!tabExists("Edit blog")) {
            editBlogInternalFrame = new EditBlogInternalFrame(idb);
            openTab(editBlogInternalFrame, "Edit blog");
        }  
        //Flyttar fokus till filken, om det redan finns en sådan öppen.
        else{
            moveFocusToTab("Edit blog");
        }
    }//GEN-LAST:event_editBlogMnuItmActionPerformed

    private void removeBlogMnuItmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBlogMnuItmActionPerformed
        //Ett fönster instansieras och öppnas i en flik om ett likadant fönster inte redan finns.
        if(!tabExists("Remove blog")) {
            removeBlogInternalFrame = new RemoveBlogInternalFrame(idb);
            openTab(removeBlogInternalFrame, "Remove blog");
        }       
        //Flyttar fokus till filken, om det redan finns en sådan öppen.
        else{
            moveFocusToTab("Remove blog");
        }
    }//GEN-LAST:event_removeBlogMnuItmActionPerformed

    private void closeWindowsMnuItmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeWindowsMnuItmActionPerformed
        //Stänger alla fönster i applikationen förutom MainPage
        paneMainPageTabs.removeAll();
    }//GEN-LAST:event_closeWindowsMnuItmActionPerformed

    private void blogFeedMnuItmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blogFeedMnuItmActionPerformed
        //Ett fönster instansieras och öppnas i en flik om ett likadant fönster inte redan finns.
        if(!tabExists("Blog feed")) {
            feedBlogInternalFrame = new FeedBlogInternalFrame(idb);
            openTab(feedBlogInternalFrame, "Blog feed");
        }       
        //Flyttar fokus till filken, om det redan finns en sådan öppen.
        else{
            moveFocusToTab("Blog feed");
        }
    }//GEN-LAST:event_blogFeedMnuItmActionPerformed

    private void userInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userInformationActionPerformed
        //Ett fönster instansieras och öppnas i en flik om ett likadant fönster inte redan finns.
        if(!tabExists("User information")) {
            showUserInformation = new ShowUserInformation(idb);
            openTab(showUserInformation, "User information");
        }       
        //Flyttar fokus till filken, om det redan finns en sådan öppen.
        else{
            moveFocusToTab("User information");
        }
    }//GEN-LAST:event_userInformationActionPerformed

    private void removeUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeUserActionPerformed
        //Ett fönster instansieras och öppnas i en flik om ett likadant fönster inte redan finns.
        if(!tabExists("Remove user")) {
            removeEmployeeFromTheSystem = new RemoveEmployeeFromTheSystem(idb);
            openTab(removeEmployeeFromTheSystem, "Remove user");
        }       
        //Flyttar fokus till filken, om det redan finns en sådan öppen.
        else{
            moveFocusToTab("Remove user");
        }
    }//GEN-LAST:event_removeUserActionPerformed

    private void editUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editUserActionPerformed
        //Ett fönster instansieras och öppnas i en flik om ett likadant fönster inte redan finns.
        if(!tabExists("Edit user")) {
            editUserInformation = new EditUserInformation(idb);
            openTab(editUserInformation, "Edit user");
        }       
        //Flyttar fokus till filken, om det redan finns en sådan öppen.
        else{
            moveFocusToTab("Edit user");
        }
    }//GEN-LAST:event_editUserActionPerformed

    private void addUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserActionPerformed
        //Ett fönster instansieras och öppnas i en flik om ett likadant fönster inte redan finns.
        if(!tabExists("Add user")) {
            addNewEmployee = new AddNewEmployee(idb);
            openTab(addNewEmployee, "Add user");
        }       
        //Flyttar fokus till filken, om det redan finns en sådan öppen.
        else{
            moveFocusToTab("Add user");
        }
    }//GEN-LAST:event_addUserActionPerformed
    //Metoden körs i konstruktorn och kollar om användaren har admin behörighet.
    private void adminFunktions(){
        loggedInAsAdmin = MethodClass.isAdmin();
        if(!loggedInAsAdmin){
            user.setVisible(false);
        }
    }
    private void addCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCategoryActionPerformed
        //Ett fönster instansieras och öppnas i en flik om ett likadant fönster inte redan finns.
        if(!tabExists("Add category")) {
            addNewCategoryAndTopic = new AddNewCategoryAndTopic(idb);
            openTab(addNewCategoryAndTopic, "Add category");
        }       
        //Flyttar fokus till filken, om det redan finns en sådan öppen.
        else{
            moveFocusToTab("Add category");
        }
    }//GEN-LAST:event_addCategoryActionPerformed

    private void logOutMnuItmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutMnuItmActionPerformed
        //Skapar ett nytt LoginWindow och gör det synligt och stänger ner MainPage 
        new LoginWindow(idb).setVisible(true); 
        this.dispose();
    }//GEN-LAST:event_logOutMnuItmActionPerformed

    private void addTopicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTopicActionPerformed
        //Ett fönster instansieras och öppnas i en flik om ett likadant fönster inte redan finns.
        if(!tabExists("Add topic")) {
            addNewTopic = new AddNewTopic(idb);
            openTab(addNewTopic, "Add topiccategory");
        }       
        //Flyttar fokus till filken, om det redan finns en sådan öppen.
        else{
            moveFocusToTab("Add category");
        }
    }//GEN-LAST:event_addTopicActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        //Ett fönster instansieras och öppnas i en flik om ett likadant fönster inte redan finns.
        if(!tabExists("Create meeting")) {
            createMeeting = new CreateMeeting(idb);
            openTab(createMeeting, "Create meeting");
        }       
        //Flyttar fokus till filken, om det redan finns en sådan öppen.
        else{
            moveFocusToTab("Create meeting");
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addCategory;
    private javax.swing.JMenuItem addTopic;
    private javax.swing.JMenuItem addUser;
    private javax.swing.JMenu blog;
    private javax.swing.JMenuItem blogFeedMnuItm;
    private javax.swing.JMenuItem closeWindowsMnuItm;
    private javax.swing.JMenuItem createBlogMnuItm;
    private javax.swing.JMenu createMetting;
    private javax.swing.JMenuItem editBlogMnuItm;
    private javax.swing.JMenuItem editUser;
    private javax.swing.JMenuItem exitMnuItm;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem logOutMnuItm;
    private javax.swing.JMenu mainMenu;
    private javax.swing.JMenuItem removeBlogMnuItm;
    private javax.swing.JMenuItem removeUser;
    private javax.swing.JMenuBar superMenyBar;
    private javax.swing.JMenu user;
    private javax.swing.JMenuItem userInformation;
    // End of variables declaration//GEN-END:variables
}
