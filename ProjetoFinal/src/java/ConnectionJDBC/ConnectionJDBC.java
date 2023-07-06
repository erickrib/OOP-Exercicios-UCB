/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConnectionJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Erick
 */
public class ConnectionJDBC {
    private static final String URL = "jdbc:mysql://localhost:3306/projeto_final";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    
    Connection con = null;
    
    //metodo de conexâo
        public Connection getConnection() throws ClassNotFoundException {
        try {
            if(con == null){
                Class.forName(DRIVER);
                con = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("Conexão Ativa");
            }
        } catch(SQLException e) {
            System.out.println("Conexão não ativa");
            e.getMessage();
        }
            
        return con;
    }
}
