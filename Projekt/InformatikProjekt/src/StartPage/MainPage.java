/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StartPage;

import static StartPage.MethodClass.isAdmin;
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
    private boolean isAdministrator;
    
    private RemoveEmployeeFromTheSystem removeEmployeeFromTheSystem;
        
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
        showAdminWindow();
        
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
        mRegisterUser = new javax.swing.JMenu();
        addUser = new javax.swing.JMenuItem();
        editUser = new javax.swing.JMenuItem();
        removeUser = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

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

        superMenyBar.add(blog);

        mRegisterUser.setText("User");

        addUser.setText("Add user");
        mRegisterUser.add(addUser);

        editUser.setText("Edit user");
        mRegisterUser.add(editUser);

        removeUser.setText("Remove user");
        removeUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeUserActionPerformed(evt);
            }
        });
        mRegisterUser.add(removeUser);

        superMenyBar.add(mRegisterUser);

        setJMenuBar(superMenyBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void logOutMnuItmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutMnuItmActionPerformed
        //Stänger applikationen och får ej upp inloggningsfönstret
        System.exit(1);
     
        
    }//GEN-LAST:event_logOutMnuItmActionPerformed

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
    private void showAdminWindow(){
        //Tar bort om personen som loggar in inte är admin.
            isAdministrator = isAdmin();
            if(!isAdministrator){
                mRegisterUser.setVisible(false);
            }
    
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addUser;
    private javax.swing.JMenu blog;
    private javax.swing.JMenuItem blogFeedMnuItm;
    private javax.swing.JMenuItem closeWindowsMnuItm;
    private javax.swing.JMenuItem createBlogMnuItm;
    private javax.swing.JMenuItem editBlogMnuItm;
    private javax.swing.JMenuItem editUser;
    private javax.swing.JMenuItem exitMnuItm;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem logOutMnuItm;
    private javax.swing.JMenu mRegisterUser;
    private javax.swing.JMenu mainMenu;
    private javax.swing.JMenuItem removeBlogMnuItm;
    private javax.swing.JMenuItem removeUser;
    private javax.swing.JMenuBar superMenyBar;
    // End of variables declaration//GEN-END:variables
}
