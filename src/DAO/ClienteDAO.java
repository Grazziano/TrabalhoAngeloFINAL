/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidades.Cliente;
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
public class ClienteDAO {

    private Connection conexao;

    public ClienteDAO() {
        this.conexao = new Conectar().getConnection();
    }

    ///inserir um cliente no banco de dados
    public void inserir(Cliente c) {

        ////inserçao no bd 
        String sql = "INSERT INTO cliente (id, nome, rua, bairro, cidade, cpf) VALUES(?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);

            stmt.setLong(1, c.getId());
            stmt.setString(2, c.getNome());
            stmt.setString(3, c.getRua());
            stmt.setString(4, c.getBairro());
            stmt.setString(5, c.getCidade());
            stmt.setString(6, c.getCpf());

            /////////////FAVOR N ESQUECER OS COMANDOS ABAIXO SE NAO TILTA TUDO E TU FICA RATIANDO
            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    ///alterar informaçoes no bd
    public void alterar(Cliente c) {

        ////inserçao no bd 
        String sql = "UPDATE CLIENTE SET nome = ?, cpf = ?. rua = ?, bairro = ?, cidade = ? WHERE ID = " + c.getId();
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getCpf());
            stmt.setString(3, c.getRua());
            stmt.setString(4, c.getBairro());
            stmt.setString(5, c.getCidade());
            /////////////FAVOR N ESQUECER OS COMANDOS ABAIXO SE NAO TILTA TUDO E TU FICA RATIANDO
            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    ////EXCLUIR O REGISTRO NO BD
    public void excluir(Long idCliente) {
        ////inserçao no bd 
        String sql = "DELETE FROM cliente WHERE id = " + idCliente;
        try {
            ////EXECUTA O COMANDO SQL
            PreparedStatement stmt = conexao.prepareStatement(sql);
            /////////////FAVOR N ESQUECER OS COMANDOS ABAIXO SE NAO TILTA TUDO E TU FICA RATIANDO
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public int InsertId() {
        ///////PEGA O ULTIMO ID DECLARADO NO BD
        String sql = "SELECT max(id) as codigo FROM cliente";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet res = stmt.executeQuery();
            res.next();
            return res.getInt("codigo");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
/////////LISTA OS CLIENTES DO BANCO

    public List<Cliente> listar() throws RuntimeException {
        String sql = "SELECT id, nome, cpf, rua, bairro, cidade from cliente";
        try {
            ////////////RETORNO
            List<Cliente> retorno = new ArrayList<Cliente>();

            ////////EXECUTA COMANDO SQL LISTANDO OS CLIENT
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet res = stmt.executeQuery();

            ///PERCORRE O BANCO PARA PEGAR OS DADOS
            while (res.next()) {
                Cliente c = new Cliente();
                c.setId(res.getLong("id"));
                c.setNome(res.getString("nome"));
                c.setCpf(res.getString("cpf"));
                c.setRua(res.getString("rua"));
                c.setBairro(res.getString("bairro"));
                c.setCidade(res.getString("cidade"));

                /////ADD CLIENTE NA LISTA
                retorno.add(c);
            }
            return retorno;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
//RECUPERA OS DADOS DE UM CLIENTE NO BD

    public Cliente consultar(Long idCliente) throws RuntimeException {
        String sql = "SELECT id, nome, cpf, rua, bairro, cidade from cliente WHERE id =" + idCliente;
        try {
            ////////////RETORNO
            Cliente retorno = new Cliente();

            ////////EXECUTA COMANDO SQL LISTANDO OS CLIENT
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet res = stmt.executeQuery();

            ///PERCORRE O BANCO PARA PEGAR OS DADOS
            while (res.next()) {
                retorno.setId(res.getLong("id"));
                retorno.setNome(res.getString("nome"));
                retorno.setCpf(res.getString("cpf"));
                retorno.setRua(res.getString("rua"));
                retorno.setBairro(res.getString("bairro"));
                retorno.setCidade(res.getString("cidade"));

            }
            return retorno;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
