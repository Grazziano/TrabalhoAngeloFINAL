/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jFramesSecundarios;

import Entidades.Cliente;
import Utilidades.Util;
import Validacoes.ClienteValid;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Wolveraa
 */
public class ExibirClientes extends javax.swing.JFrame {

   
    /**
     * Creates new form FormularioClientes
     */
    public ExibirClientes() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        pegarResolucao();
        Util.centralizar(this);
        pesquisar();

    }

    //////AJUSTA A JANELA
    private void pegarResolucao() {
        Toolkit t = Toolkit.getDefaultToolkit();
        Dimension dimensao = t.getScreenSize();
        this.setSize((dimensao.width - 50), (dimensao.height - 200));

    }

    ////BUSCA NO BANCO DE DADOS A LISTA DE CLIENTES E EXIBE NA TABELA
    public  void pesquisar() {
///////////constroi a tabela
        String[] colunas = new String[]{"Código", "Nome", "CPF", "Rua", "Bairro", "Cidade"};
        DefaultTableModel listModel = new DefaultTableModel(colunas, 0);

        ////puxa a lista de clientes do bd
        List<Cliente> ls = new ClienteValid().listar();
        for (Cliente c : ls) {
            /////////////VETOR APRIMORADO
            listModel.addRow(new Object[]{c.getId(), c.getNome(), c.getCpf(), c.getRua(), c.getBairro(), c.getCidade()});

        }

        jTabelaClientes.setModel(listModel);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTabelaClientes = new javax.swing.JTable();
        jButtonExcluir = new javax.swing.JToggleButton();
        jButtonAlterar = new javax.swing.JToggleButton();
        jButtonNovoCadastro = new javax.swing.JToggleButton();
        JButtonAtt = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Listar Clientes");

        jTabelaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTabelaClientes);

        jButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if_list-delete_59948.png"))); // NOI18N
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Excluir(evt);
            }
        });

        jButtonAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if_edit_66728.png"))); // NOI18N
        jButtonAlterar.setText("Alterar");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editar(evt);
            }
        });

        jButtonNovoCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if_document-new_38981.png"))); // NOI18N
        jButtonNovoCadastro.setText("Novo Cadastro");
        jButtonNovoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novocliente(evt);
            }
        });

        JButtonAtt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if_update_64935.png"))); // NOI18N
        JButtonAtt.setText("Atualizar ");
        JButtonAtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Atualizar(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JButtonAtt)
                .addGap(44, 44, 44)
                .addComponent(jButtonNovoCadastro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonExcluir)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JButtonAtt)
                    .addComponent(jButtonNovoCadastro)
                    .addComponent(jButtonAlterar)
                    .addComponent(jButtonExcluir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void novocliente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novocliente
        CadastrarClientes c = new CadastrarClientes();
        c.setVisible(true);
    }//GEN-LAST:event_novocliente

    private void Atualizar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Atualizar
        pesquisar();
    }//GEN-LAST:event_Atualizar

    private void Excluir(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Excluir
   int indice = jTabelaClientes.getSelectedRow();
        if (indice == -1) {
            return;

        }
        int opcao = JOptionPane.showConfirmDialog(this, "Desejas Excluir este Registro ?", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
        if (opcao == 0) {
//// /recupera o indice da linha selecionada
       
           
                
            

                /// recupera o id presente na linha
                Long idcliente = (Long) jTabelaClientes.getValueAt(indice, 0);
                //// apaga o registro
                new ClienteValid().excluir(idcliente);
                //ATUALIZA A LISTA
                pesquisar();

            }
    }//GEN-LAST:event_Excluir

    private void editar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editar
        //// /recupera o indice da linha selecionada
        int indice = jTabelaClientes.getSelectedRow();
        if (indice == -1) {
            return;

        }
        /// recupera o id presente na linha
        Long idcliente = (Long) jTabelaClientes.getValueAt(indice, 0);

        /////INSTANCIA O FORMULARIO DE EDIÇÃO PASSANDO O ID
        EditarDadosCliente c = new EditarDadosCliente(idcliente);
        c.setVisible(true);


    }//GEN-LAST:event_editar

 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton JButtonAtt;
    private javax.swing.JToggleButton jButtonAlterar;
    private javax.swing.JToggleButton jButtonExcluir;
    private javax.swing.JToggleButton jButtonNovoCadastro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabelaClientes;
    // End of variables declaration//GEN-END:variables
}
