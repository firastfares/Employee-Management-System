/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phase3;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author firasfares
 */
public class Myconnection {
    
    public static Connection getconnection(){
        
        Connection conn = null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mysql","root","Number");
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        return conn;
    }
    
   
    
    
}
