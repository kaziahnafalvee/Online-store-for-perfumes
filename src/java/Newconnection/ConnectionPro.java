
package Newconnection;


import java.sql.*;
public class ConnectionPro {
    public static Connection con;
    
    public static Connection getConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/online_shop","root","");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return con;
    }
}
