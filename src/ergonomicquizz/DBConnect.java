/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ergonomicquizz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author yamada
 */
public class DBConnect {
    
    private Connection con;
    private Statement st;
    private ResultSet rs;
    
    public DBConnect(){
        try{
            
           Class.forName("com.mysql.jdbc.Driver");
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quizz", "root", "senh@3120");
           st = con.createStatement();
            
        }catch(Exception ex){
            System.out.println("Erro: "+ex);
        }        
    }
    
}
