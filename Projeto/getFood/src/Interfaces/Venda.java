package Interfaces;

import Classes.Aluno;
import Classes.Funcionario;
import DAO.AlunoDAO;
import DAO.FichaDAO;
import DAO.VendaDAO;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Venda extends javax.swing.JFrame {

    AlunoDAO aluno;
    FichaDAO ficha;
    VendaDAO venda;
    Aluno al;
    Funcionario funLog;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    Calendar data = Calendar.getInstance();

    private Venda() {
        initComponents();
    }

    public Venda(Funcionario fun) {
        initComponents();
        btnExe.setVisible(false);
        aluno = new AlunoDAO();
        ficha = new FichaDAO();
        venda = new VendaDAO();
        lblVenda.setVisible(false);
        cxBeneficio.setVisible(false);
        cxCredito.setVisible(false);
        cxDinheiro.setVisible(false);
        this.funLog = fun;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtMatr = new javax.swing.JTextField();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 90), new java.awt.Dimension(0, 90), new java.awt.Dimension(32767, 90));
        jScrollPane3 = new javax.swing.JScrollPane();
        PainelDados = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();
        lblVenda = new javax.swing.JLabel();
        cxCredito = new javax.swing.JCheckBox();
        cxBeneficio = new javax.swing.JCheckBox();
        cxDinheiro = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JLabel();
        btnVerificar = new javax.swing.JLabel();
        btnExe = new javax.swing.JLabel();
        txtFotoAluno = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setText("Matrícula:");

        txtMatr.setPreferredSize(new java.awt.Dimension(6, 34));
        txtMatr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatrActionPerformed(evt);
            }
        });

        PainelDados.setEnabled(false);
        jScrollPane3.setViewportView(PainelDados);

        lblVenda.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblVenda.setText("Venda a partir de :");

        cxCredito.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        cxCredito.setText("Créditos");
        cxCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxCreditoActionPerformed(evt);
            }
        });

        cxBeneficio.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        cxBeneficio.setText("Benefício");
        cxBeneficio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxBeneficioActionPerformed(evt);
            }
        });

        cxDinheiro.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        cxDinheiro.setText("Dinheiro");
        cxDinheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxDinheiroActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/LOGO_150px.png"))); // NOI18N

        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/backward-arrow.png"))); // NOI18N
        btnVoltar.setToolTipText("Voltar");
        btnVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVoltarMouseClicked(evt);
            }
        });

        btnVerificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/btn_Verificar.png"))); // NOI18N
        btnVerificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVerificarMouseClicked(evt);
            }
        });

        btnExe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/btn_Vender.png"))); // NOI18N
        btnExe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtMatr, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(btnVerificar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnExe))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(187, 187, 187)
                                .addComponent(jLabel7)))
                        .addGap(91, 91, 91)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addComponent(lblVenda))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(btnVoltar)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cxDinheiro)
                            .addComponent(cxBeneficio)
                            .addComponent(cxCredito))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(txtFotoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtMatr, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnExe, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(162, 162, 162)
                                .addComponent(jLabel2)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblVenda)
                            .addComponent(cxBeneficio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cxDinheiro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cxCredito)
                        .addContainerGap(81, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(txtFotoAluno, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVoltar)
                .addGap(35, 35, 35))
        );

        jMenu2.setBorder(null);
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/wallet.png"))); // NOI18N
        jMenu2.setText("Venda");
        jMenu2.setFont(new java.awt.Font("Simplified Arabic", 0, 18)); // NOI18N
        jMenu2.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jMenu2.setPreferredSize(new java.awt.Dimension(110, 25));

        jMenuItem11.setText("Ticket");
        jMenuItem11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenuItem11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jMenuItem11MouseExited(evt);
            }
        });
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem11);

        jMenuItem10.setText("Créditos");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem10);

        jMenuBar1.add(jMenu2);

        jMenu3.setBorder(null);
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/ticket.png"))); // NOI18N
        jMenu3.setText("Ficha");
        jMenu3.setFont(new java.awt.Font("Simplified Arabic", 0, 18)); // NOI18N
        jMenu3.setMargin(new java.awt.Insets(10, 10, 10, 10));

        jMenuItem20.setText("Alterar");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem20);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/icon.png"))); // NOI18N
        jMenu4.setText("Aluno");
        jMenu4.setFont(new java.awt.Font("Simplified Arabic", 0, 18)); // NOI18N
        jMenu4.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jMenu4.setPreferredSize(new java.awt.Dimension(110, 52));

        jMenuItem4.setText("Adicionar listagem");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        jMenuItem12.setText("Adicionar listagem beneficente");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem12);

        jMenuItem5.setText("Alterar");
        jMenu4.add(jMenuItem5);

        jMenuItem6.setText("Resetar");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem6);

        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/users.png"))); // NOI18N
        jMenu5.setText("Funcionário");
        jMenu5.setFont(new java.awt.Font("Simplified Arabic", 0, 18)); // NOI18N
        jMenu5.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });

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

        jMenuItem21.setText("Criar login");
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem21);

        jMenuBar1.add(jMenu5);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/padnote.png"))); // NOI18N
        jMenu6.setText("Relatório");
        jMenu6.setFont(new java.awt.Font("Simplified Arabic", 0, 18)); // NOI18N
        jMenu6.setMargin(new java.awt.Insets(10, 10, 10, 10));

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

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/curso_1.png"))); // NOI18N
        jMenu7.setText("Curso");
        jMenu7.setFont(new java.awt.Font("Simplified Arabic", 0, 18)); // NOI18N
        jMenu7.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jMenu7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu7ActionPerformed(evt);
            }
        });

        jMenuItem14.setText("Cadastrar");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem14);

        jMenuBar1.add(jMenu7);

        jMenu8.setBorder(null);
        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/turma.png"))); // NOI18N
        jMenu8.setText("Turma");
        jMenu8.setFont(new java.awt.Font("Simplified Arabic", 0, 18)); // NOI18N
        jMenu8.setMargin(new java.awt.Insets(10, 35, 10, 35));
        jMenu8.setPreferredSize(new java.awt.Dimension(115, 33));
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

        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 878, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMatrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatrActionPerformed

    private void btnVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarMouseClicked
        dispose();
        Inicio newInicio = new Inicio(funLog);
        newInicio.setVisible(true);
    }//GEN-LAST:event_btnVoltarMouseClicked

    private void btnVerificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerificarMouseClicked
        al = null;
        txtMatr.setEditable(false);
        btnVerificar.setVisible(false);
        //jLabel4.setVisible(true);
        if (txtMatr.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Um campo importante está vazio.");
        } else {
            double valor = ficha.getVal();
            Aluno al = aluno.getAlunoMatricula(txtMatr.getText());
            if (al == null) {
                JOptionPane.showMessageDialog(null, "Aluno não encontrado");
            } else {
                //foto aluno
                txtFotoAluno.setIcon(new ImageIcon(al.getFoto()));
                System.out.println(al.getFoto().toString());
                //Dados aluno
                PainelDados.setText("" + al.toString());
                if (al.getSaldo() >= valor) {
                    cxCredito.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "O aluno não possui crédito.");
                    cxCredito.setVisible(false);
                }
                btnVerificar.setVisible(false);
                //jLabel4.setVisible(true);
                lblVenda.setVisible(true);
                cxDinheiro.setVisible(true);
                cxBeneficio.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnVerificarMouseClicked

    private void btnExeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExeMouseClicked
        //System.out.println("voce clicou nesta merda filha da puta");
        if (!cxCredito.isSelected() && !cxDinheiro.isSelected() && !cxBeneficio.isSelected()) {
            JOptionPane.showMessageDialog(null, "Selecione a forma de pagamento.");
        } else {
            if (cxDinheiro.isSelected()) {
                // System.out.println("vc vai comprar no money");
                venda.efetuarVenda(txtMatr.getText(), funLog.getMatricula(), 0, new Date(data.getTimeInMillis()), 4);
            } else if (cxCredito.isSelected()) {
                venda.efetuarVenda(txtMatr.getText(), funLog.getMatricula(), 5, new Date(data.getTimeInMillis()), 1);
            } else {
                if (cxBeneficio.isSelected()) {
                    ArrayList<Aluno> lista = aluno.getListaAlunosBeneficio(1);
                    for (Aluno al : lista) {
                        if (txtMatr.getText().equals(al.getMatricula())) {
                            venda.efetuarVenda(txtMatr.getText(), funLog.getMatricula(), 0, new Date(data.getTimeInMillis()), 4);
                        } else {
                            JOptionPane.showMessageDialog(null, "Esse aluno não é beneficiário.");
                        }
                    }
                }
            }
            int resp = JOptionPane.showConfirmDialog(null, "Deseja executar outra venda ?");
            if (resp == JOptionPane.YES_OPTION) {
                dispose();
                Venda newVenda = new Venda();
                newVenda.setVisible(true);
            } else {
                dispose();
                Inicio newInicio = new Inicio(funLog);
                newInicio.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnExeMouseClicked

    private void jMenuItem11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem11MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem11MouseEntered

    private void jMenuItem11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem11MouseExited

    }//GEN-LAST:event_jMenuItem11MouseExited

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        dispose();
        Venda newVenda = new Venda(funLog);
        newVenda.setVisible(true);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        dispose();
        VendaCreditus newVenda = new VendaCreditus(funLog);
        newVenda.setVisible(true);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
        dispose();
        AltFicha alt = new AltFicha(funLog);
        alt.setVisible(true);
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        dispose();
        CDAlunos newCD = new CDAlunos(funLog);
        newCD.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        dispose();
        CDBeneficio newCD = new CDBeneficio(funLog);
        newCD.setVisible(true);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        dispose();
        ResetAlunos newReset = new ResetAlunos(funLog);
        newReset.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        dispose();
        CDFun newCD = new CDFun(funLog);
        newCD.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed
        dispose();
        CDLogin newCD = new CDLogin(funLog);
        newCD.setVisible(true);
    }//GEN-LAST:event_jMenuItem21ActionPerformed

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed
        dispose();
        CDLogin newCD = new CDLogin(funLog);
        newCD.setVisible(true);
    }//GEN-LAST:event_jMenu5ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        dispose();
        CDCurso c = new CDCurso(funLog);
        c.setVisible(true);
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenu7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu7ActionPerformed
        dispose();
        CDCurso newCD = new CDCurso(funLog);
        newCD.setVisible(true);
    }//GEN-LAST:event_jMenu7ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        dispose();
        CDTurma c = new CDTurma(funLog);
        c.setVisible(true);
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenu8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu8ActionPerformed
        dispose();
        CDTurma newCD = new CDTurma(funLog);
        newCD.setVisible(true);
    }//GEN-LAST:event_jMenu8ActionPerformed

    private void cxBeneficioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxBeneficioActionPerformed
        if (cxBeneficio.isSelected() && (cxDinheiro.isSelected() || cxCredito.isSelected())) {
            cxBeneficio.setSelected(false);
        }
    }//GEN-LAST:event_cxBeneficioActionPerformed

    private void cxDinheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxDinheiroActionPerformed
        if (cxDinheiro.isSelected() && (cxBeneficio.isSelected() || cxCredito.isSelected())) {
            cxDinheiro.setSelected(false);
        }
    }//GEN-LAST:event_cxDinheiroActionPerformed

    private void cxCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxCreditoActionPerformed
        if (cxCredito.isSelected() && (cxDinheiro.isSelected() || cxBeneficio.isSelected())) {
            cxCredito.setSelected(false);
        }
    }//GEN-LAST:event_cxCreditoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Venda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane PainelDados;
    private javax.swing.JLabel btnExe;
    private javax.swing.JLabel btnVerificar;
    private javax.swing.JLabel btnVoltar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JCheckBox cxBeneficio;
    private javax.swing.JCheckBox cxCredito;
    private javax.swing.JCheckBox cxDinheiro;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
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
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblVenda;
    private javax.swing.JLabel txtFotoAluno;
    private javax.swing.JTextField txtMatr;
    // End of variables declaration//GEN-END:variables
}
