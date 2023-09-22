/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.siga.dao;

import com.siga.dao.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DAO {
    
    private Connection cn;

    public Connection getCn() {
        return cn;
    }

    public void setCn(Connection cn) {
        this.cn = cn;
    }
    public void Conectar() throws Exception {
        try {
            Class.forName("com.mysql.jdbc.Driver");
           cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sigadb?user=root&password=Fabiansk69");
        
        }catch (ClassNotFoundException | SQLException e){
            throw e;
        }
        
    }
    
    public void Cerrar() throws Exception {
        try {
            if (cn != null) {
                if (cn.isClosed() == false){
                    cn.close();
                }
            }
        } catch (SQLException e) {
            throw e;
        }
    }
      
}
