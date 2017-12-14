/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Wolveraa
 */
public class Conectar {
    ////////conexao com db
       
        public static Connection getConnection(){
       
            try {
                /////RETORNA CONEXAO COM DB
                return DriverManager.getConnection("jdbc:mysql://localhost/cliente", "root", "");
            } catch (SQLException ex) {
                Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
                throw new RuntimeException("ERRO DE CONEXAO COM CONECTAR", ex);
            }
            
        }
        
}
                        
          
              
          
         
            
        
   

