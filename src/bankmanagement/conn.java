
package bankmanagement;

import java.sql.*;  

public class conn{
    Connection c;
    Statement s;
    public conn(){ 
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            System.out.println("Driver Loaded: ");
             c = DriverManager.getConnection("jdbc:mysql://localhost:3306/project2","root","");
           
            System.out.println("Connection established.");
             s =c.createStatement();
             
            
        }
        catch(ClassNotFoundException e){ 
            System.out.println("Exception "+e.getMessage());
        }  
        catch(SQLException e){ 
            System.out.println("SQL Exception "+e.getMessage());
        }  
        
    }  
}  