/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.login;

/**
 *
 * @author Faaiz Soomro
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * 
 */
public class Connect {

    static Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    Connection con=null;
   
        public static Connection ConnectDB(){
          
          String dbURL = "jdbc:ucanaccess://D:/Pharmacy.accdb";
        try{
            Connection con = DriverManager.getConnection(dbURL); 
            
            return con;
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
    
    }      
        
    
    
        }
        public int grChecker() throws SQLException{
            ResultSet result=null;
            int counter=0;
        try {
            PreparedStatement addData=ConnectDB().prepareStatement("");
            result=addData.executeQuery();
        } catch (SQLException ex) {
        
        }
        while(result.next()){
            counter++;
        }
            return counter;
        }
        
}
