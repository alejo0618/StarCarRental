/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starcarrental;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

/**
 *
 * @author Alejandro
 */
public class sqlManagement {
    
    public static final String HOST_NAME = "jdbc:sqlserver://54.159.175.152\\SQLEXPRESS";
    public static final String USER = "aarcilam";
    public static final String PASSWORD = "Pe3cOeh6lOL5";
    public static final String DATABASE = "STAR_CAR_RENTAL";
    public static final String DRIVER_CLASS = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    
    public static void dbConnect(String db_connect_string,String db_userid,String db_password)
    {
        try
        {
            //Class.forName(DRIVER_CLASS);   
            String connectionUrl =
                HOST_NAME + ";"
                + "database=" + DATABASE + ";"
                + "user=" + USER + ";"
                + "password="+ PASSWORD + ";"
                + "loginTimeout=30;";
            
            Connection connection = DriverManager.getConnection(connectionUrl);
            System.out.println("connected");
            
            Statement statement = connection.createStatement();
            String queryString = "select s.id,s.name from dbo.store as s";
            ResultSet rs = statement.executeQuery(queryString);
            while (rs.next()) {
              System.out.println(rs.getString(1) +" - " + rs.getString(2));
            }
            
            rs.close();
            statement.close();
            connection.close();
            
        } catch (Exception e) 
        {
           e.printStackTrace();
        }
    }
    
    public static void main(String[] args)
    {
       sqlManagement connServer = new sqlManagement();
       connServer.dbConnect(HOST_NAME,USER,PASSWORD);
    }
    
    public static void executeQuery(Connection connection)
    {
    
    }    

}
