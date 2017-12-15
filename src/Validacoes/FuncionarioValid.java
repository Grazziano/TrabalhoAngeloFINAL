package Validacoes;

import DAO.ClienteDAO;
import DAO.FuncionarioDAO;
import Entidades.Cliente;
import Entidades.Funcionario;
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
public class FuncionarioValid {

    
    private void validar(Funcionario p) throws RuntimeException {

        if (p.getNome() == null || p.getNome().isEmpty())  {
            throw new RuntimeException("Nome é Obrigatorio!!!!");

        }

        
        String cpf = p.getCpf();
        if (cpf == null || !Util.isCPF(cpf)) {
            throw new RuntimeException("CPF INVALIDO!!!!");

        }

    }

    
    public void inserir(Funcionario p) throws RuntimeException {
        
        validar(p);

        FuncionarioDAO dao = new FuncionarioDAO();

        ////recupera id
        int id = dao.InsertId();
        p.setId(Long.valueOf(id + 1));
       
        dao.inserir(p);

    }

    public void alterar(Funcionario p) throws RuntimeException {
        
        validar(p);

        FuncionarioDAO dao = new FuncionarioDAO();

        dao.alterar(p);

    }
  

    public void excluir(Long idFuncionario) throws RuntimeException {
        FuncionarioDAO dao = new FuncionarioDAO();

        dao.excluir(idFuncionario);

    }

    
    public List<Funcionario> listar() {
        return new FuncionarioDAO().listar();
    }

  
    public Funcionario consultar(Long idFuncionario) {
        return new FuncionarioDAO().consultar(idFuncionario);
    }

}
