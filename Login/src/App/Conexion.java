package App;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Conexion {
    
    //Variables
    
    public String usario = "RayCode";
    public String pass = "121781";
    public String url = "jdbc:sqlserver://Localhost:1433;databaseName=Crud;";
    public Connection cn = null;
    public  Statement st = null;
    
    
    //Metodo de conexion con Statement
    public Statement conectar()
    {
        
        //exención de errores
        try{
            
            Connection cn = DriverManager.getConnection(url, usario, pass);
            st = cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return st;  
    }
    
    
    //Metodo de conexion con Connection

    public static Connection getConexion()
    {
        //Variables
        String url = "jdbc:sqlserver://Localhost:1433;databaseName=Crud;"
                + "database=Crud;"
                + "User=RayCode;"
                + "Password=121781;";
        
        //exención de errores
        try {
            Connection con = DriverManager.getConnection(url);
            return con;
                    
        } catch (SQLException e) {
            
          JOptionPane.showMessageDialog(null, e);
          return null;

        }
                 
    }
    
    
    
}
