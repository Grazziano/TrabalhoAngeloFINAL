/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidades.Funcionario;
import Utilidades.Conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Wolveraa
 */
public class FuncionarioDAO {

    private Connection conexao;

    public FuncionarioDAO() {
        this.conexao = new Conectar().getConnection();
    }

    ///inserir um cliente no banco de dados
    public void inserir(Funcionario c) {

       
        String sql = "INSERT INTO funcionario (id, nome, cpf, sexo, funcao, endereco, datanasc, telefone, salario) VALUES(?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);

            stmt.setLong(1, c.getId());
            stmt.setString(2, c.getNome());
            stmt.setString(3, c.getCpf());
            stmt.setString(4, c.getSexo());
            stmt.setString(5, c.getFuncao());
            stmt.setString(6, c.getEndereco());
            stmt.setString(7, c.getDatanas());
            stmt.setString(8, c.getTelefone());
            stmt.setString(9, c.getSalario());

           
            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    } 
    public void alterar(Funcionario c) {

        
        String sql = "UPDATE funcionario SET nome = ?, cpf = ?, sexo = ?, funcao = ?, endereco= ?, datanas = ?, telefone = ?, salario = ? WHERE ID = " + c.getId();
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getCpf());
            stmt.setString(3, c.getSexo());
            stmt.setString(4, c.getFuncao());
            stmt.setString(5, c.getEndereco());
            stmt.setString(6, c.getDatanas());
            stmt.setString(7, c.getTelefone());
            stmt.setString(8, c.getSalario());
            
            
            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

 
    public void excluir(Long idFuncionario) {
      
        String sql = "DELETE FROM funcionario WHERE id = " + idFuncionario;
        try {
          
            PreparedStatement stmt = conexao.prepareStatement(sql);
           
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public int InsertId() {
       
        String sql = "SELECT max(id) as codigo FROM funcionario";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet res = stmt.executeQuery();
            res.next();
            return res.getInt("codigo");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public List<Funcionario> listar() throws RuntimeException {
        String sql = "SELECT id, nome, cpf, sexo, funcao, endereco, datanasc, telefone, salario from funcionario";
        try {
           
            List<Funcionario> retorno = new ArrayList<Funcionario>();

          
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet res = stmt.executeQuery();

           
            while (res.next()) {
                Funcionario c = new Funcionario();
                c.setId(res.getLong("id"));
                c.setNome(res.getString("nome"));
                c.setCpf(res.getString("cpf"));
                c.setSexo(res.getString("sexo"));
                c.setFuncao(res.getString("funcao"));
                c.setEndereco(res.getString("endereco"));
                c.setDatanas(res.getString("datanasc"));
                c.setTelefone(res.getString("telefone"));
                c.setSalario(res.getString("salario"));

                /////ADD CLIENTE NA LISTA
                retorno.add(c);
            }
            return retorno;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }


    public Funcionario consultar(Long idFuncionario) throws RuntimeException {
        String sql = "SELECT id, nome, cpf, sexo, funcao, endereco, datanasc, telefone, salario from funcionario WHERE id = " + idFuncionario;
        try {
           
            Funcionario retorno = new Funcionario();

           
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet res = stmt.executeQuery();

         
            while (res.next()) {
                retorno.setId(res.getLong("id"));
                retorno.setNome(res.getString("nome"));
                retorno.setCpf(res.getString("cpf"));
                retorno.setSexo(res.getString("sexo"));
                retorno.setFuncao(res.getString("funcao"));
                retorno.setEndereco(res.getString("endereco"));
                retorno.setDatanas(res.getString("datanasc"));
                retorno.setTelefone(res.getString("telefone"));
                retorno.setSalario(res.getString("salario"));
               

            }
            return retorno;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
