
package Interfaces;

import Classes.Aluno;
import DAO.AlunoDAO;
import DAO.FichaDAO;
import DAO.VendaDAO;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class Venda extends javax.swing.JFrame {

    AlunoDAO aluno;
    FichaDAO ficha;
    VendaDAO venda;
    Aluno al;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    Calendar data = Calendar.getInstance();
    public Venda() 
    {
        initComponents();
        btnExe.setVisible(false);
        aluno = new AlunoDAO();
        ficha = new FichaDAO();
        venda = new VendaDAO();
        lblVenda.setVisible(false);
        cxBeneficio.setVisible(false);
        cxCredito.setVisible(false);
        cxDinheiro.setVisible(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtMatr = new javax.swing.JTextField();
        btnExe = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 90), new java.awt.Dimension(0, 90), new java.awt.Dimension(32767, 90));
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        PainelDados = new javax.swing.JTextPane();
        btnVerificar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblVenda = new javax.swing.JLabel();
        cxCredito = new javax.swing.JCheckBox();
        cxBeneficio = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        txtMatrFun = new javax.swing.JTextField();
        cxDinheiro = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jRadioButtonMenuItem3 = new javax.swing.JRadioButtonMenuItem();
        jMenu6 = new javax.swing.JMenu();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setText("Matrícula:");

        txtMatr.setPreferredSize(new java.awt.Dimension(6, 34));
        txtMatr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatrActionPerformed(evt);
            }
        });

        btnExe.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnExe.setText("Efetuar venda");
        btnExe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExeActionPerformed(evt);
            }
        });

        jTextPane1.setEnabled(false);
        jScrollPane1.setViewportView(jTextPane1);

        PainelDados.setEnabled(false);
        jScrollPane3.setViewportView(PainelDados);

        btnVerificar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnVerificar.setText("Verificar");
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });

        lblVenda.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblVenda.setText("Venda a partir de :");

        cxCredito.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        cxCredito.setText("Créditos");

        cxBeneficio.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        cxBeneficio.setText("Benefício");

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel3.setText("MatrFun:");

        txtMatrFun.setPreferredSize(new java.awt.Dimension(6, 34));
        txtMatrFun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatrFunActionPerformed(evt);
            }
        });

        cxDinheiro.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        cxDinheiro.setText("Dinheiro");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/LOGO_150px.png"))); // NOI18N

        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/backward-arrow.png"))); // NOI18N
        btnVoltar.setToolTipText("Voltar");
        btnVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVoltarMouseClicked(evt);
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
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtMatrFun, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtMatr, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(btnVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnExe, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(187, 187, 187)
                                .addComponent(jLabel7)))
                        .addGap(103, 103, 103)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtMatr, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtMatrFun, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(cxCredito)))
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVoltar)
                .addGap(35, 35, 35))
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 204));

        jMenu2.setBorder(null);
        jMenu2.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Desktop\\cash.png")); // NOI18N
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

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("Créditos");
        jRadioButtonMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jRadioButtonMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu3.setBorder(null);
        jMenu3.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Desktop\\ticket.png")); // NOI18N
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

        jMenu4.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Desktop\\icon.png")); // NOI18N
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

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("Adicionar listagem beneficente");
        jRadioButtonMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jRadioButtonMenuItem2);

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

        jMenu5.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Desktop\\users.png")); // NOI18N
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

        jRadioButtonMenuItem3.setSelected(true);
        jRadioButtonMenuItem3.setText("Criar login");
        jMenu5.add(jRadioButtonMenuItem3);

        jMenuBar1.add(jMenu5);

        jMenu6.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Desktop\\padnote.png")); // NOI18N
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

        jMenuItem15.setText("Alterar");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem15);

        jMenuItem16.setText("Desativar");
        jMenu7.add(jMenuItem16);

        jMenuBar1.add(jMenu7);

        jMenu8.setBorder(null);
        jMenu8.setText("Turma");
        jMenu8.setFont(new java.awt.Font("Simplified Arabic", 0, 18)); // NOI18N
        jMenu8.setMargin(new java.awt.Insets(10, 35, 10, 35));
        jMenu8.setPreferredSize(new java.awt.Dimension(110, 33));
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
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem18);

        jMenuItem19.setText("Desativar");
        jMenu8.add(jMenuItem19);

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

    private void btnExeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExeActionPerformed
        //System.out.println("voce clicou nesta merda filha da puta");
        if(!cxCredito.isSelected() && !cxDinheiro.isSelected() && !cxBeneficio.isSelected()  )
        {
            JOptionPane.showMessageDialog(null,"Selecione a forma de pagamento.");
        }else
        {
            if(cxDinheiro.isSelected())
            {
               // System.out.println("vc vai comprar no money");
                venda.efetuarVenda(txtMatr.getText(),txtMatrFun.getText(),0,new Date(data.getTimeInMillis()),4);
            }else if (cxCredito.isSelected())
            {
                venda.efetuarVenda(txtMatr.getText(),txtMatrFun.getText(),5,new Date(data.getTimeInMillis()),1);
            }else
            {
                if(cxBeneficio.isSelected())
                {
                    ArrayList<Aluno> lista = aluno.getListaAlunosBeneficio(1);
                    for(Aluno al : lista)
                    {
                      if(txtMatr.getText().equals(al.getMatricula()))
                      {
                           venda.efetuarVenda(txtMatr.getText(),txtMatrFun.getText(),0,new Date(data.getTimeInMillis()),4);
                      }else
                      {
                        JOptionPane.showMessageDialog(null,"Esse aluno não é beneficiário.");
                      }
                    }
                }
            }
            int resp = JOptionPane.showConfirmDialog(null,"Deseja executar outra venda ?");
            if(resp == JOptionPane.YES_OPTION)
            {
                dispose();
                Venda newVenda = new Venda();
                newVenda.setVisible(true);
            }else
            {
                dispose();
                Inicio newInicio = new Inicio();
                newInicio.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnExeActionPerformed

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        txtMatr.setEditable(false);
        btnVerificar.setVisible(false);
        btnExe.setVisible(true);
        if(txtMatr.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Um campo importante está vazio.");
        }else
        {   
            double valor = ficha.getVal();
            Aluno al = aluno.getAlunoMatricula(txtMatr.getText());
            PainelDados.setText("Saldo(R$):"+al.getSaldo());
            if(al.getSaldo() >= valor)
            {
                cxCredito.setVisible(true);
            }else
            {
                JOptionPane.showMessageDialog(null,"O aluno não possui crédito.");
                cxCredito.setVisible(false);
            }
            btnVerificar.setVisible(false);
            btnExe.setVisible(true);
            lblVenda.setVisible(true);
            cxDinheiro.setVisible(true);
            cxBeneficio.setVisible(true);
        }
    }//GEN-LAST:event_btnVerificarActionPerformed

    private void txtMatrFunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatrFunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatrFunActionPerformed

    private void jMenuItem11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem11MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem11MouseEntered

    private void jMenuItem11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem11MouseExited

    }//GEN-LAST:event_jMenuItem11MouseExited

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        dispose();
        Venda newVenda = new Venda();
        newVenda.setVisible(true);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jRadioButtonMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem1ActionPerformed
        dispose();
        VendaCreditus newVenda = new VendaCreditus();
        newVenda.setVisible(true);
    }//GEN-LAST:event_jRadioButtonMenuItem1ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
        dispose();
        AltFicha alt = new AltFicha();
        alt.setVisible(true);
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jRadioButtonMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem2ActionPerformed
        dispose();
        CDBeneficio newCD = new CDBeneficio();
        newCD.setVisible(true);
    }//GEN-LAST:event_jRadioButtonMenuItem2ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        dispose();
        ResetAlunos newReset = new ResetAlunos();
        newReset.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        dispose();
        CDFun newCD = new CDFun();
        newCD.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed
        dispose();
        CDLogin newCD = new CDLogin();
        newCD.setVisible(true);
    }//GEN-LAST:event_jMenu5ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        dispose();
        CDCurso c=new CDCurso();
        c.setVisible(true);
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        dispose();
        AltrCurso alt = new AltrCurso();
        alt.setVisible(true);
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenu7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu7ActionPerformed
        dispose();
        CDCurso newCD = new CDCurso();
        newCD.setVisible(true);
    }//GEN-LAST:event_jMenu7ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        dispose();
        CDTurma c=new CDTurma();
        c.setVisible(true);
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        dispose();
        AltrTurma alt = new AltrTurma();
        alt.setVisible(true);
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenu8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu8ActionPerformed
        dispose();
        CDTurma newCD = new CDTurma();
        newCD.setVisible(true);
    }//GEN-LAST:event_jMenu8ActionPerformed

    private void btnVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarMouseClicked
        dispose();
        Inicio newInicio = new Inicio();
        newInicio.setVisible(true);
    }//GEN-LAST:event_btnVoltarMouseClicked

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
    private javax.swing.JButton btnExe;
    private javax.swing.JButton btnVerificar;
    private javax.swing.JLabel btnVoltar;
    private javax.swing.JCheckBox cxBeneficio;
    private javax.swing.JCheckBox cxCredito;
    private javax.swing.JCheckBox cxDinheiro;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel lblVenda;
    private javax.swing.JTextField txtMatr;
    private javax.swing.JTextField txtMatrFun;
    // End of variables declaration//GEN-END:variables
}
