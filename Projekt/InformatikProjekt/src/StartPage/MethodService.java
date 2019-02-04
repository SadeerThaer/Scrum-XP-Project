/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StartPage;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JComboBox;
import javax.swing.JTabbedPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author ellin
 */
public class MethodService {
    
    private static InfDB idb;
    
    public MethodService(InfDB idb) {
        this.idb = idb;

    }
    
    public void setDesign(JTabbedPane oneTabbedPane) {
        for (int i = 0; i < oneTabbedPane.getTabCount(); i++) {
            oneTabbedPane.setBackgroundAt(i, Color.WHITE);
            oneTabbedPane.getComponentAt(i).setBackground(Color.WHITE);
        }
    }
    
    public void fillComboboxAllCategory1(JComboBox<String> enCombobox) {
        try {
            //Hämtar en lista på namnen på alla kategori1 i databasen
            ArrayList<HashMap<String, String>> categoryList = idb.fetchRows("SELECT kat1_ID FROM kat1");
            //Loopar igenom listan och lägger till alla kategorier till kategorilistan
            for (int i = 0; i < categoryList.size(); i++) {
                String categoryName = categoryList.get(i).get("KAt1_ID");
                enCombobox.addItem(categoryName);
            } 
        }
        catch (InfException oneException) {
            oneException.getMessage();
        }
        catch (NullPointerException anotherException) {
            anotherException.getMessage();
        }   
    }
    
}
