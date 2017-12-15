/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidades.Cliente;
import Entidades.Produto;
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
public class ProdutoDAO {

    private Connection conexao;

    public ProdutoDAO() {
        this.conexao = new Conectar().getConnection();
    }

    ///alterar informaçoes no bd
    public void atualizar(Produto p) {

        ////inserçao no bd 
        String sql = "UPDATE PRODUTO SET nome = ?, fornecedor = ?, validade = ?, quantidade = ?, valorvenda = ?, valorcusto = ?, ncm = ?, cfop = ?, csosn = ?, cst = ?, icm = ?, mva = ? WHERE ID = " + p.getId();
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getFornecedor());
            stmt.setString(3, p.getValidade());
            stmt.setString(4, p.getQuantidade());
            stmt.setString(5, p.getValor_venda());
            stmt.setString(6, p.getValor_custo());
            stmt.setString(7, p.getNCM());
            stmt.setString(8, p.getCFOP());
            stmt.setString(9, p.getCSOSN());
            stmt.setString(10, p.getCST());
            stmt.setString(11, p.getICM());
            stmt.setString(12, p.getMVA());
            /////////////FAVOR N ESQUECER OS COMANDOS ABAIXO SE NAO TILTA TUDO E TU FICA RATIANDO
            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    ///inserir um cliente no banco de dados
    public void inserir(Produto p) {
        ////inserçao no bd 
        String sql = "INSERT INTO produto (id, nome, fornecedor, validade, quantidade, valorvenda, valorcusto, ncm, cfop, csosn, cst, icm, mva) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);

            stmt.setLong(1, p.getId());
            stmt.setString(2, p.getNome());
            stmt.setString(3, p.getFornecedor());
            stmt.setString(4, p.getValidade());
            stmt.setString(5, p.getQuantidade());
            stmt.setString(6, p.getValor_venda());
            stmt.setString(7, p.getValor_custo());
            stmt.setString(8, p.getNCM());
            stmt.setString(9, p.getCFOP());
            stmt.setString(10, p.getCSOSN());
            stmt.setString(11, p.getCST());
            stmt.setString(12, p.getICM());
            stmt.setString(13, p.getMVA());
            /////////////FAVOR N ESQUECER OS COMANDOS ABAIXO SE NAO TILTA TUDO E TU FICA RATIANDO
            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public int InsertId() {
        ///////PEGA O ULTIMO ID DECLARADO NO BD
        String sql = "SELECT max(id) as codigo FROM produto";
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet res = stmt.executeQuery();
            res.next();
            return res.getInt("codigo");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Produto> listar() throws RuntimeException {
        String sql = "SELECT id, nome, fornecedor, validade, quantidade, valorvenda, valorcusto, ncm, cfop, csosn, cst, icm, mva FROM produto";
        try {
            ////////////RETORNO
            List<Produto> retorno = new ArrayList<Produto>();

            ////////EXECUTA COMANDO SQL LISTANDO OS CLIENT
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet res = stmt.executeQuery();

            ///PERCORRE O BANCO PARA PEGAR OS DADOS
            while (res.next()) {
                Produto c = new Produto();
                c.setId(res.getLong("id"));
                c.setNome(res.getString("nome"));
                c.setFornecedor(res.getString("fornecedor"));
                c.setValidade(res.getString("validade"));
                c.setQuantidade(res.getString("quantidade"));
                c.setValor_venda(res.getString("valorvenda"));
                c.setValor_custo(res.getString("valorcusto"));
                c.setNCM(res.getString("ncm"));
                c.setCFOP(res.getString("cfop"));
                c.setCSOSN(res.getString("csosn"));
                c.setCST(res.getString("cst"));
                c.setICM(res.getString("icm"));
                c.setMVA(res.getString("mva"));

                /////ADD CLIENTE NA LISTA
                retorno.add(c);
            }
            return retorno;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    ////EXCLUIR O REGISTRO NO BD
    public void excluir(Long idproduto) {
        ////inserçao no bd 
        String sql = "DELETE FROM produto WHERE id = " + idproduto;
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

    public Produto consultar(Long idProduto) throws RuntimeException {
        String sql = "SELECT id, nome, quantidade, fornecedor, validade, valorvenda, valorcusto, ncm, cfop, csosn, cst, icm, mva from produto WHERE id = " + idProduto;
        try {
            ////////////RETORNO
            Produto retorno = new Produto();

            ////////EXECUTA COMANDO SQL LISTANDO OS CLIENT
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet res = stmt.executeQuery();

            ///PERCORRE O BANCO PARA PEGAR OS DADOS
            while (res.next()) {
                retorno.setId(res.getLong("id"));
                retorno.setNome(res.getString("nome"));
                retorno.setFornecedor(res.getString("fornecedor"));
                retorno.setValidade(res.getString("validade"));
                retorno.setQuantidade(res.getString("quantidade"));
                retorno.setValor_venda(res.getString("valorvenda"));
                retorno.setValor_custo(res.getString("valorcusto"));
                retorno.setNCM(res.getString("ncm"));
                retorno.setCFOP(res.getString("cfop"));
                retorno.setCSOSN(res.getString("csosn"));
                retorno.setCST(res.getString("cst"));
                retorno.setICM(res.getString("icm"));
                retorno.setMVA(res.getString("mva"));

            }
            return retorno;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
