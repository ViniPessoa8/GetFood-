/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Vinicius
 */
public class ConnectionFactory {

    public Connection getConnection() {
        try {
           return DriverManager.getConnection("jdbc:mysql://localhost:3306/getFood", "root", "root");
           //return DriverManager.getConnection("jdbc:mysql://localhost/getFood", "root", "rockdesaia");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
