/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import DAO.ClienteDAO;
import Entidades.Cliente;
import java.sql.SQLException;

/**
 *
 * @author Wolveraa
 */
public class Teste {

    public static void main(String[] args) throws SQLException {
         Cliente c = new Cliente();
        
        c.setNome("Lucas Mendes");
        c.setRua("Front.");
        c.setBairro("Fragata");
        c.setCidade("Pelotas");
        c.setCpf("111.111.111-11");
        
        new ClienteDAO().inserir(c);
        
        System.out.println("Funcionou");
        System.out.println("locao");
        System.out.println("locao");
       
    }

}
