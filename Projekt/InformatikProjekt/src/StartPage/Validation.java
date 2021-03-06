package StartPage;

import com.toedter.calendar.JDateChooser;
import java.util.Date;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Sadeer
 */
// metod som leta efter bokstäverna a-z, A-Z och åäö / ÅÄÖ, inga andra tecken tillåts
public class Validation {

    public boolean one(String one) {
        String check = "[a-öA-Ö0-9 ]+";
        boolean b = one.matches(check);
        return b;

    }

    public boolean two(String two) {
        String check = "[0-9_.]+";
        boolean b = two.matches(check);
        return b;

    }

    public boolean three(String three) {
        String check = "-?[0-9]+";
        boolean b = three.matches(check);
        return b;

    }

    public boolean four(String four) {
        String check = "[a-öA-Ö]+";
        boolean b = four.matches(check);
        return b;

    }

    public boolean five(String five) {
        String check = "[a-öA-Ö0-9]+";
        boolean b = five.matches(check);
        return b;

    }

    //Kollar om textfältet har ett värde
    public static boolean textfieldWithValue(JTextField tf) {

        boolean value = true;

        if (tf.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "The text field is empty!");
            tf.requestFocus();
            return false;
        }
        return value;
    }
    
    public static boolean isValidEmailAddress(String email) {
        
        boolean result = true;
        
        try {
            
            InternetAddress emailAddr = new InternetAddress(email);
            emailAddr.validate();
            
        } catch (AddressException ex) {
            JOptionPane.showMessageDialog(null, "Use the right format for E-mail!");
            
            JOptionPane.showMessageDialog(null, "That's not a valid email!");
            result = false;
            JOptionPane.showMessageDialog(null, "Not a valid email");
            
        }
        
        return result;
    }

    //Kollar om textfältet har ett värde
    public static boolean textareaWithValueTA(JTextArea ta) {

        boolean value = true;

        if (ta.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "The text field is empty!");
            ta.requestFocus();
            return false;
        }
        return value;
    }

    public static boolean pwdFieldHasValue(JPasswordField rutaAttValidera) { // kontrollerar ifall det finns något värde i ett passwordfält

        boolean resultat = true;

        if (rutaAttValidera.getPassword().length == 0) {
            JOptionPane.showMessageDialog(null, "You have to type in a password!");
            resultat = false;
        }

        return resultat;
    }

    //Kollar om ett element har valts i en combobox
    public static boolean elementSelectedInCombobox(JComboBox<String> enCombobox, String oneMessage) {

        boolean elementSelected = true;

        if (enCombobox.getSelectedIndex() <= 0) {
            JOptionPane.showMessageDialog(null, oneMessage);
            enCombobox.requestFocusInWindow();
            return false;
        }
        return elementSelected;
    }

    public static boolean idTesting(JTextField id, Connection con) {

        //Kollar så att ID:et finns med i tabellen PERONSER.
        boolean resultat = true;

        try {
            

            String personID = id.getText(); //Hämta värdet i fältet.

            String fraga = "select FNAMN from PERSONER where ID = ?;";
            PreparedStatement ps = con.prepareStatement(fraga);
            ps.setString(1, personID);
            ResultSet rs = ps.executeQuery();

            //Försöker att hämta förnamn som matchar ID:et.
            if (!rs.next()) {
                
                //Kollar om värdet som man vill hämta finns.
                JOptionPane.showMessageDialog(null, "The ID is incorrect.");
                
                //Om man får null som värde.
                resultat = false;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Something went wrong.");
        }
        
        return resultat;
    }

    //Kollar om man har valt ett värde i en jList
    public static boolean valtVarde(String text){
        boolean resultat=true;
            if(text==null){
                JOptionPane.showMessageDialog(null, "You must select an alternative");
                resultat=false;
        }
        return resultat;
    }
    
    //Kollar om textfältet är ett heltal.
    public static boolean textfaltTal(JTextField tf) {
   
        boolean ettTal = true; 
        
        try{
            String instring = tf.getText();
            Integer.parseInt(instring);   
            tf.requestFocus();  
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Use numbers!");
            ettTal = false;    
        }    
        return ettTal;
    }

    public static boolean emailExisting(JTextField tf, Connection con) {
        boolean resultat = true;
        
        String instring = tf.getText();
        Statement stmt = null;

        try {
            stmt = con.createStatement();
            
            String fraga = "select ID from PERSONER where MAIL = ?;";
            PreparedStatement ps = con.prepareStatement(fraga);
            ps.setString(1, instring);
            ResultSet rs = stmt.executeQuery(fraga);
            rs.next();
            
            String test = rs.getString("ID");


            if (test == null) {
                JOptionPane.showMessageDialog(null, "The email is incorrect");
                resultat = false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Something went wrong.");
        }
        return resultat;
    }
    
    //Kollar om datumväljaren har ett värde.
    public static boolean datumValjareHarVarde(JDateChooser enDatumValjare) {
        
        boolean harVarde = true;
        Date ettDatum = enDatumValjare.getDate();
        if(ettDatum == null) {
            JOptionPane.showMessageDialog(null, "Fyll i ett datum");
            enDatumValjare.requestFocus();
            return false;
        } 
        return harVarde;
    }  
    public static boolean losenordsKrav(JTextField losenord)
    {
        boolean losenKrav = true;
        
        String ettLosenord = losenord.getText();
        
        int digit=0;
        int upCount = 0;
        int loCount = 0;
        
        for(int i = 0; i < ettLosenord.length(); i++){
                
            char c = ettLosenord.charAt(i);
            
            if(Character.isUpperCase(c)){
                upCount++;
            }
            if(Character.isLowerCase(c)){
                loCount++;
            }
            if(Character.isDigit(c)){
                digit++;
            }
            }
        
        if(ettLosenord.length() >= 8)    
        {
            if(loCount == 0) 
            {
            losenKrav = false;
            JOptionPane.showMessageDialog(null, "The password needs to have at least one lowercase letter.");
            }
            else if(upCount == 0)
            {
            losenKrav = false;
            JOptionPane.showMessageDialog(null, "The password needs to have at least one upercase letter.");
            }
            else if(digit == 0)
            {
            losenKrav = false;
            JOptionPane.showMessageDialog(null, "The password needs to have at least one digit.");    
            }
        }
        else
        {
            losenKrav = false;
            JOptionPane.showMessageDialog(null, "The password is to short, it needs to be at least 8 symbols.");
        }
        
        return losenKrav;
    }

}

