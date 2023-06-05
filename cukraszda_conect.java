package cukraszda2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class cukraszda_conect {
    static void DBconnect(String data1,String data2,String data3,String data4) throws SQLException {
        String url = "jdbc:mysql://127.0.0.1:3306/cukraszda";
        String userName = "root";
        String password = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection connection = DriverManager.getConnection(url,userName,password);
            
            Statement statement=connection.createStatement();
            
            statement.execute("INSERT INTO suti (id,nev,tipus,dijazott) VALUES('"+data1+"','"+data2+"','"+data3+"','"+data4+"')");
            
            connection.close();
            
        } catch (ClassNotFoundException ex) {
            System.out.println("A Connector not found!");
        }
  }
}