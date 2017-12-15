package Validacoes;

import DAO.ClienteDAO;
import Entidades.Cliente;
import Utilidades.Util;
import java.util.List;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Wolveraa
 */
public class ClienteValid {

    //////////////////VALIDA AS INFORMAÇÕES ANTES DE ENVIA
    private void validar(Cliente p) throws RuntimeException {
        /////VALIDA NOME
        if (p.getNome() == null || p.getNome().isEmpty())  {
            throw new RuntimeException("Nome é Obrigatorio!!!!");

        }

        /////VALIDADOR CPF --- CASO FOSSE NO FORM ESSA REGRA E VALIDA ===> (!)Util.isCPF(cpf) ele nega = false + false = false
        String cpf = p.getCpf();
        if (cpf == null || !Util.isCPF(cpf)) {
            throw new RuntimeException("CPF INVALIDO!!!!");

        }

    }

    ////////APLICA AS VALIDACOES
    public void inserir(Cliente p) throws RuntimeException {
        ///////VALIDA
        validar(p);

        ClienteDAO dao = new ClienteDAO();

        ////recupera id
        int id = dao.InsertId();
        p.setId(Long.valueOf(id + 1));
        //////////VAI INSERIR NO BD SE AS VALIDACOES ESTIVEREM OK
        dao.inserir(p);

    }

    ////ATUALIZA OS DADOS DO REGISTRO
    public void alterar(Cliente p) throws RuntimeException {
        ///////VALIDA
        validar(p);

        ClienteDAO dao = new ClienteDAO();

        //////////atualiza os dados do registro do banco
        dao.alterar(p);

    }
    ////apaga um registro do BD

    public void excluir(Long idCliente) throws RuntimeException {
        ClienteDAO dao = new ClienteDAO();

        dao.excluir(idCliente);

    }

    ////////executa a listagem de cliente
    public List<Cliente> listar() {
        return new ClienteDAO().listar();
    }

    //RECUPERA OS DADOS DO CLIENTE
    public Cliente consultar(Long idCliente) {
        return new ClienteDAO().consultar(idCliente);
    }

}
