package Interfaces;

import Classes.Funcionario;
import DAO.CursoDAO;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;

public class AltrCurso extends javax.swing.JFrame {

    CursoDAO cursoDAO;
    String codigo;
    int i = 0;
    Funcionario funLog;

    public AltrCurso(Funcionario fun) {
        initComponents();
        cursoDAO = new CursoDAO();
        Vector vetorCursos = null;
        ArrayList ListaCursos, s;
        ListaCursos = cursoDAO.getListaCursos();
        vetorCursos = new Vector<String>();
        for (int i = 0; i < ListaCursos.size(); i++) {
            vetorCursos.add(ListaCursos.get(i).toString());
        }
        ComboBoxModel cbm = new DefaultComboBoxModel(vetorCursos);
        cxCurso.setModel(cbm);
        lblNome.setVisible(false);
        cxN.setVisible(false);
        btnAlt.setVisible(false);
        lblCodigo.setVisible(false);
        cxCodigo.setVisible(false);
        codigo = "";
        this.funLog = fun;
    }
    
    private AltrCurso(){
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        cxN = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cxCurso = new javax.swing.JComboBox<>();
        csNome = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        csCodigo = new javax.swing.JCheckBox();
        lblCodigo = new javax.swing.JLabel();
        cxCodigo = new javax.swing.JTextField();
        btnAlt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem13.setText("jMenuItem13");

        jCheckBox1.setText("jCheckBox1");

        jButton1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNome.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblNome.setText("Novo nome:");

        cxN.setPreferredSize(new java.awt.Dimension(6, 34));
        cxN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxNActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel2.setText("Curso:");

        cxCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxCursoActionPerformed(evt);
            }
        });

        csNome.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        csNome.setText("Nome");
        csNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                csNomeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel3.setText("O que você deseja alterar?");

        csCodigo.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        csCodigo.setText("Código");
        csCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                csCodigoActionPerformed(evt);
            }
        });

        lblCodigo.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblCodigo.setText("Novo código:");

        cxCodigo.setPreferredSize(new java.awt.Dimension(6, 34));
        cxCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxCodigoActionPerformed(evt);
            }
        });

        btnAlt.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnAlt.setText("Alterar");
        btnAlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("/home/vinicius/Área de Trabalho/LOGO_150px.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(478, 478, 478)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(72, 72, 72))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNome)
                                .addGap(18, 18, 18)
                                .addComponent(cxN, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCodigo)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cxCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(cxCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(178, 178, 178)
                        .addComponent(csNome)
                        .addGap(33, 33, 33)
                        .addComponent(csCodigo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(359, 359, 359)
                        .addComponent(jLabel1)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(csNome)
                            .addComponent(csCodigo)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cxCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxN, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cxCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigo))
                .addGap(30, 30, 30)
                .addComponent(btnAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jMenuBar1.setBackground(new java.awt.Color(204, 255, 255));

        jMenu2.setText("Venda");
        jMenu2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jMenu2.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jMenu2.setPreferredSize(new java.awt.Dimension(70, 25));

        jMenuItem11.setText("Benefício");
        jMenu2.add(jMenuItem11);

        jMenuItem12.setText("Pago");
        jMenu2.add(jMenuItem12);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Ficha");
        jMenu3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jMenu3.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Aluno");
        jMenu4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jMenu4.setMargin(new java.awt.Insets(10, 10, 10, 10));

        jMenuItem4.setText("Cadastrar");
        jMenu4.add(jMenuItem4);

        jMenuItem5.setText("Alterar");
        jMenu4.add(jMenuItem5);

        jMenuItem6.setText("Desativar");
        jMenu4.add(jMenuItem6);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Funcionário");
        jMenu5.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jMenu5.setMargin(new java.awt.Insets(10, 10, 10, 10));

        jMenuItem7.setText("Cadastro");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem7);

        jMenuItem8.setText("Alterar");
        jMenu5.add(jMenuItem8);

        jMenuItem9.setText("Desativar");
        jMenu5.add(jMenuItem9);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Relatório");
        jMenu6.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jMenu6.setMargin(new java.awt.Insets(10, 10, 10, 10));

        jMenuItem10.setText("Diário");
        jMenuItem10.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jMenu6.add(jMenuItem10);

        jMenuItem2.setText("Semanal");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem2);

        jMenuItem3.setText("Mensal");
        jMenu6.add(jMenuItem3);

        jMenuBar1.add(jMenu6);

        jMenu7.setText("Curso");
        jMenu7.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jMenu7.setMargin(new java.awt.Insets(10, 10, 10, 10));

        jMenuItem14.setText("Cadastrar");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem14);

        jMenuItem15.setText("Alterar");
        jMenu7.add(jMenuItem15);

        jMenuItem16.setText("Desativar");
        jMenu7.add(jMenuItem16);

        jMenuBar1.add(jMenu7);

        jMenu8.setText("Turma");
        jMenu8.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jMenu8.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jMenu8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu8ActionPerformed(evt);
            }
        });

        jMenuItem17.setText("Cadastrar");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem17);

        jMenuItem18.setText("Alterar");
        jMenu8.add(jMenuItem18);

        jMenuItem19.setText("Desativar");
        jMenu8.add(jMenuItem19);

        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        dispose();
        CDCurso c = new CDCurso(funLog);
        c.setVisible(true);
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenu8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu8ActionPerformed

    }//GEN-LAST:event_jMenu8ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        dispose();
        CDTurma cadastroTurma = new CDTurma(funLog);
        cadastroTurma.setVisible(true);
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        dispose();
        CDFun CadastroFuncionario = new CDFun(funLog);
        CadastroFuncionario.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void cxNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxNActionPerformed

    private void cxCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxCursoActionPerformed
        String curso = (String) cxCurso.getSelectedItem();
        codigo = cursoDAO.busca(curso);
    }//GEN-LAST:event_cxCursoActionPerformed

    private void cxCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxCodigoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltActionPerformed
        if (csNome.isSelected()) {
            System.out.println(codigo);
            System.out.println(cxN.getText());
            cursoDAO.alteraNome(codigo, cxN.getText());
        }
        if (csCodigo.isSelected()) {
            System.out.println(codigo);
            System.out.println(cxCodigo.getText());
            cursoDAO.alteraCodigo(codigo, cxCodigo.getText());
        }
    }//GEN-LAST:event_btnAltActionPerformed

    private void csNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_csNomeActionPerformed
        i = 1;
        if (csNome.isSelected()) {
            lblNome.setVisible(true);
            cxN.setVisible(true);
            btnAlt.setVisible(true);
        } else {
            lblNome.setVisible(false);
            cxN.setVisible(false);
            btnAlt.setVisible(false);
        }
    }//GEN-LAST:event_csNomeActionPerformed

    private void csCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_csCodigoActionPerformed
        i = 2;
        if (csCodigo.isSelected()) {
            lblCodigo.setVisible(true);
            cxCodigo.setVisible(true);
            btnAlt.setVisible(true);
        } else {
            lblCodigo.setVisible(false);
            cxCodigo.setVisible(false);
            btnAlt.setVisible(false);
        }

    }//GEN-LAST:event_csCodigoActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AltrCurso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlt;
    private javax.swing.JCheckBox csCodigo;
    private javax.swing.JCheckBox csNome;
    private javax.swing.JTextField cxCodigo;
    private javax.swing.JComboBox<String> cxCurso;
    private javax.swing.JTextField cxN;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblNome;
    // End of variables declaration//GEN-END:variables
}
