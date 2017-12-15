/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validacoes;

import DAO.ClienteDAO;
import DAO.ProdutoDAO;
import Entidades.Cliente;
import Entidades.Produto;
import Utilidades.Util;
import java.util.List;

/**
 *
 * @author Wolveraa
 */
public class ProdutoValid {
    
     ////ATUALIZA OS DADOS DO REGISTRO
    public void alterar(Produto p) throws RuntimeException {
        ///////VALIDA
        validar(p);

        ProdutoDAO dao = new ProdutoDAO();

        //////////atualiza os dados do registro do banco
        dao.atualizar(p);

    }

    //////////////////VALIDA AS INFORMAÇÕES ANTES DE ENVIA
    private void validar(Produto p) throws RuntimeException {
        /////VALIDA NOME
        if (p.getNome() == null || p.getNome().isEmpty()) {
            throw new RuntimeException("Nome do Produto é Obrigatorio!!!!");

        }
        if (p.getFornecedor() == null || p.getFornecedor().isEmpty()) {
            throw new RuntimeException("Nome do Fornecedor é Obrigatorio!!!!");

        }

        
        if (p.getValor_venda() == null || p.getValor_venda().isEmpty()) {
            throw new RuntimeException("Favor Preencha o Campo do Valor de Venda");

        }
          if (p.getNCM()== null || p.getNCM().isEmpty()) {
            throw new RuntimeException("Favor Preencha o Campo do NCM");
            
          }

    }

    public void inserir(Produto p) throws RuntimeException {
        ///////VALIDA
        validar(p);

        ProdutoDAO dao = new ProdutoDAO();

        ////recupera id
        int id = dao.InsertId();
        p.setId(Long.valueOf(id + 1));
        //////////VAI INSERIR NO BD SE AS VALIDACOES ESTIVEREM OK
        dao.inserir(p);

    }
    
       ////////executa a listagem de cliente
    public List<Produto> listar() {
        return new ProdutoDAO().listar();
    }
    
    public void excluir(Long idproduto) throws RuntimeException {
        ProdutoDAO dao = new ProdutoDAO();

        dao.excluir(idproduto);


    }  

      //RECUPERA OS DADOS DO CLIENTE
    public Produto consultar(Long idProduto) {
        return new ProdutoDAO().consultar(idProduto);
    }
    
    

}
