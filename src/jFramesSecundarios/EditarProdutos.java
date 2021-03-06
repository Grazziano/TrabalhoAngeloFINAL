/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jFramesSecundarios;

import Entidades.Cliente;
import Entidades.Produto;
import Utilidades.Util;
import Validacoes.ClienteValid;
import Validacoes.ProdutoValid;
import javax.swing.JOptionPane;

/**
 *
 * @author Wolveraa
 */
public class EditarProdutos extends javax.swing.JFrame {

    /**
     * Creates new form CadastrarClientes
     */
    private Long idProduto;

    public EditarProdutos(Long idProduto) {
        initComponents();
        Util.centralizar(this);
        ///chave primaria do cliente que esta sendo editado   
        this.idProduto = idProduto;
        Util.centralizar(this);
        consultar();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbNomeProd = new javax.swing.JLabel();
        tfNomeProd = new javax.swing.JTextField();
        lbFornec = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbCFOP = new javax.swing.JLabel();
        lbCST = new javax.swing.JLabel();
        lbSUB = new javax.swing.JLabel();
        lbMVA = new javax.swing.JLabel();
        tfNCM = new javax.swing.JTextField();
        lbCSOSN = new javax.swing.JLabel();
        jComboBoxCFOP = new javax.swing.JComboBox<>();
        jComboBoxCSOSN = new javax.swing.JComboBox<>();
        jComboBoxCST = new javax.swing.JComboBox<>();
        jComboBoxSUB = new javax.swing.JComboBox<>();
        lbNCM1 = new javax.swing.JLabel();
        tfMVA = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        lbEnd = new javax.swing.JLabel();
        jbAtualizar = new javax.swing.JButton();
        lbValidade = new javax.swing.JLabel();
        lbValorVenda = new javax.swing.JLabel();
        lbValorCompra = new javax.swing.JLabel();
        lbQuant = new javax.swing.JLabel();
        tfFornecedor = new javax.swing.JTextField();
        tfValidade = new javax.swing.JFormattedTextField();
        tfValorVenda = new javax.swing.JTextField();
        tfValorCusto = new javax.swing.JTextField();
        tfQuant = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jCodigo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro");

        lbNomeProd.setText("Nome do Produto :");

        lbFornec.setText("Fornecedor:");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        lbCFOP.setText("CFOP:");

        lbCST.setText("CST:");

        lbSUB.setText("ICM/SUB.TRIBUT:");

        lbMVA.setText("MVA:");

        lbCSOSN.setText("CSOSN");

        jComboBoxCFOP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5102\t", "5405" }));

        jComboBoxCSOSN.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "500", "102", " " }));
        jComboBoxCSOSN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCSOSNActionPerformed(evt);
            }
        });

        jComboBoxCST.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "060", "000" }));
        jComboBoxCST.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCSTActionPerformed(evt);
            }
        });

        jComboBoxSUB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Substituição Tributaria", "Isento" }));
        jComboBoxSUB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSUBActionPerformed(evt);
            }
        });

        lbNCM1.setText("NCM:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbCFOP, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbCSOSN, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jComboBoxCFOP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(lbSUB)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBoxSUB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jComboBoxCSOSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbCST, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxCST, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(lbMVA)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfMVA, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(tfNCM, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(159, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(139, 139, 139)
                    .addComponent(lbNCM1)
                    .addContainerGap(344, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCFOP, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxCFOP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCSOSN, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxCSOSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbSUB, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBoxSUB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2)
                .addComponent(tfNCM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxCST, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMVA, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCST, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfMVA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(119, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(97, 97, 97)
                    .addComponent(lbNCM1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(147, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        lbEnd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbEnd.setText("Dados Fiscais");

        jbAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/if_editprofile_101844.png"))); // NOI18N
        jbAtualizar.setText("Atualizar");
        jbAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizar(evt);
            }
        });

        lbValidade.setText("Validade:");

        lbValorVenda.setText("Valor Venda:");

        lbValorCompra.setText("Valor Custo:");

        lbQuant.setText("Quantidade:");

        try {
            tfValidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel1.setText("Codigo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbEnd)
                .addGap(455, 455, 455))
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbFornec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbQuant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbValidade, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbValorVenda, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                            .addComponent(lbValorCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfValidade, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfQuant, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfValorCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(433, 433, 433)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jbAtualizar)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbNomeProd, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNomeProd, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCodigo)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jCodigo))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNomeProd, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNomeProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbQuant, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfQuant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFornec, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbValidade, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfValidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfValorCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(lbEnd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbAtualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void consultar() {
        Produto p = new ProdutoValid().consultar(this.idProduto);

        /////RECUPERAR AS INFORMÇOES NO DB E PREENCHER OS CAMPOS
        tfNomeProd.setText(p.getNome());
        tfQuant.setText(p.getQuantidade());
        tfFornecedor.setText(p.getFornecedor());
        tfValidade.setText(p.getValidade());
        tfValorVenda.setText(p.getValor_venda());
        tfValorCusto.setText(p.getValor_custo());
        jCodigo.setText(p.getId().toString());
        tfNCM.setText(p.getNCM());
        tfMVA.setText(p.getMVA());
        jComboBoxCFOP.setSelectedItem(p.getCFOP());
        jComboBoxCSOSN.setSelectedItem(p.getCSOSN());
        jComboBoxCST.setSelectedItem(p.getCST());
        jComboBoxSUB.setSelectedItem(p.getICM());

    }


    private void atualizar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizar

        Produto p = new Produto();
        p.setNome(this.tfNomeProd.getText());
        p.setQuantidade(this.tfQuant.getText());
        p.setFornecedor(this.tfFornecedor.getText());
        p.setValidade(this.tfValidade.getText());
        p.setValor_venda(this.tfValorVenda.getText());
        p.setValor_custo(this.tfValorCusto.getText());
        p.setNCM(this.tfNCM.getText());
        p.setCFOP((String) this.jComboBoxCFOP.getSelectedItem());
        p.setCSOSN((String) this.jComboBoxCSOSN.getSelectedItem());
        p.setCST((String) this.jComboBoxCST.getSelectedItem());
        p.setICM((String) this.jComboBoxSUB.getSelectedItem());
        p.setMVA(this.tfMVA.getText());
          p.setId(Long.valueOf(jCodigo.getText()));

        try {
            /////CADASTRA INFORMAÇOES NA BASE DE DADOS
            new ProdutoValid().alterar(p);
            /////////////MSG DE SUCESSO
            JOptionPane.showMessageDialog(this, "Alteração Realizado com Sucesso", "SUCESSO", JOptionPane.INFORMATION_MESSAGE);
        } catch (RuntimeException r) {
            JOptionPane.showMessageDialog(this, r.getMessage(), "ATENÇÃO!!!", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_atualizar

    private void jComboBoxCSTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCSTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCSTActionPerformed

    private void jComboBoxCSOSNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCSOSNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCSOSNActionPerformed

    private void jComboBoxSUBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSUBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSUBActionPerformed

  


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jCodigo;
    private javax.swing.JComboBox<String> jComboBoxCFOP;
    private javax.swing.JComboBox<String> jComboBoxCSOSN;
    private javax.swing.JComboBox<String> jComboBoxCST;
    private javax.swing.JComboBox<String> jComboBoxSUB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton jbAtualizar;
    private javax.swing.JLabel lbCFOP;
    private javax.swing.JLabel lbCSOSN;
    private javax.swing.JLabel lbCST;
    private javax.swing.JLabel lbEnd;
    private javax.swing.JLabel lbFornec;
    private javax.swing.JLabel lbMVA;
    private javax.swing.JLabel lbNCM1;
    private javax.swing.JLabel lbNomeProd;
    private javax.swing.JLabel lbQuant;
    private javax.swing.JLabel lbSUB;
    private javax.swing.JLabel lbValidade;
    private javax.swing.JLabel lbValorCompra;
    private javax.swing.JLabel lbValorVenda;
    private javax.swing.JTextField tfFornecedor;
    private javax.swing.JTextField tfMVA;
    private javax.swing.JTextField tfNCM;
    private javax.swing.JTextField tfNomeProd;
    private javax.swing.JTextField tfQuant;
    private javax.swing.JFormattedTextField tfValidade;
    private javax.swing.JTextField tfValorCusto;
    private javax.swing.JTextField tfValorVenda;
    // End of variables declaration//GEN-END:variables
}
