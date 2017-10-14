package Interfaces;

import DAO.LoginDAO;
import javax.swing.JOptionPane;

public class CDLogin extends javax.swing.JFrame {

    public CDLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        in = new javax.swing.JButton();
        senha = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        matr = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        confirma = new javax.swing.JPasswordField();
        login = new javax.swing.JTextField();
        btnVoltar = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();
        jMenuItem23 = new javax.swing.JMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenuItem25 = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenu();
        jMenuItem26 = new javax.swing.JMenuItem();
        jMenuItem27 = new javax.swing.JMenuItem();
        jMenuItem28 = new javax.swing.JMenuItem();
        jRadioButtonMenuItem3 = new javax.swing.JRadioButtonMenuItem();
        jMenu13 = new javax.swing.JMenu();
        jMenuItem29 = new javax.swing.JMenuItem();
        jMenuItem30 = new javax.swing.JMenuItem();
        jMenu14 = new javax.swing.JMenu();
        jMenuItem31 = new javax.swing.JMenuItem();
        jMenuItem32 = new javax.swing.JMenuItem();
        jMenuItem33 = new javax.swing.JMenuItem();
        jMenu15 = new javax.swing.JMenu();
        jMenuItem34 = new javax.swing.JMenuItem();
        jMenuItem35 = new javax.swing.JMenuItem();
        jMenuItem36 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem13.setText("jMenuItem13");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Simplified Arabic", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(53, 72, 112));
        jLabel1.setText("Login:");

        jLabel4.setFont(new java.awt.Font("Simplified Arabic", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(53, 72, 112));
        jLabel4.setText("Senha:");

        jLabel5.setFont(new java.awt.Font("Simplified Arabic", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(53, 72, 112));
        jLabel5.setText("Confirme:");

        in.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        in.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\Telegram Desktop\\teste ai (BOTAO).png")); // NOI18N
        in.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Simplified Arabic", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(53, 72, 112));
        jLabel2.setText("Matrícula:");

        matr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matrActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/LOGO_150px.png"))); // NOI18N

        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(349, 349, 349))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVoltar)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(matr, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(confirma, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(in, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)))
                .addGap(0, 294, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnVoltar)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel6)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(matr, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(confirma, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(in)
                        .addGap(22, 22, 22)))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(204, 255, 255));

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

        jMenu10.setBorder(null);
        jMenu10.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Desktop\\ticket.png")); // NOI18N
        jMenu10.setText("Ficha");
        jMenu10.setFont(new java.awt.Font("Simplified Arabic", 0, 18)); // NOI18N
        jMenu10.setMargin(new java.awt.Insets(10, 10, 10, 10));

        jMenuItem22.setText("Alterar");
        jMenuItem22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem22ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem22);

        jMenuBar1.add(jMenu10);

        jMenu11.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Desktop\\icon.png")); // NOI18N
        jMenu11.setText("Aluno");
        jMenu11.setFont(new java.awt.Font("Simplified Arabic", 0, 18)); // NOI18N
        jMenu11.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jMenu11.setPreferredSize(new java.awt.Dimension(110, 52));

        jMenuItem23.setText("Adicionar listagem");
        jMenuItem23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem23ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem23);

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("Adicionar listagem beneficente");
        jRadioButtonMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem2ActionPerformed(evt);
            }
        });
        jMenu11.add(jRadioButtonMenuItem2);

        jMenuItem24.setText("Alterar");
        jMenu11.add(jMenuItem24);

        jMenuItem25.setText("Resetar");
        jMenuItem25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem25ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem25);

        jMenuBar1.add(jMenu11);

        jMenu12.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Desktop\\users.png")); // NOI18N
        jMenu12.setText("Funcionário");
        jMenu12.setFont(new java.awt.Font("Simplified Arabic", 0, 18)); // NOI18N
        jMenu12.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jMenu12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu12ActionPerformed(evt);
            }
        });

        jMenuItem26.setText("Cadastro");
        jMenuItem26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem26ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem26);

        jMenuItem27.setText("Alterar");
        jMenu12.add(jMenuItem27);

        jMenuItem28.setText("Desativar");
        jMenu12.add(jMenuItem28);

        jRadioButtonMenuItem3.setSelected(true);
        jRadioButtonMenuItem3.setText("Criar login");
        jMenu12.add(jRadioButtonMenuItem3);

        jMenuBar1.add(jMenu12);

        jMenu13.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Desktop\\padnote.png")); // NOI18N
        jMenu13.setText("Relatório");
        jMenu13.setFont(new java.awt.Font("Simplified Arabic", 0, 18)); // NOI18N
        jMenu13.setMargin(new java.awt.Insets(10, 10, 10, 10));

        jMenuItem29.setText("Semanal");
        jMenuItem29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem29ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem29);

        jMenuItem30.setText("Mensal");
        jMenu13.add(jMenuItem30);

        jMenuBar1.add(jMenu13);

        jMenu14.setText("Curso");
        jMenu14.setFont(new java.awt.Font("Simplified Arabic", 0, 18)); // NOI18N
        jMenu14.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jMenu14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu14ActionPerformed(evt);
            }
        });

        jMenuItem31.setText("Cadastrar");
        jMenuItem31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem31ActionPerformed(evt);
            }
        });
        jMenu14.add(jMenuItem31);

        jMenuItem32.setText("Alterar");
        jMenuItem32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem32ActionPerformed(evt);
            }
        });
        jMenu14.add(jMenuItem32);

        jMenuItem33.setText("Desativar");
        jMenu14.add(jMenuItem33);

        jMenuBar1.add(jMenu14);

        jMenu15.setBorder(null);
        jMenu15.setText("Turma");
        jMenu15.setFont(new java.awt.Font("Simplified Arabic", 0, 18)); // NOI18N
        jMenu15.setMargin(new java.awt.Insets(10, 35, 10, 35));
        jMenu15.setPreferredSize(new java.awt.Dimension(110, 33));
        jMenu15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu15ActionPerformed(evt);
            }
        });

        jMenuItem34.setText("Cadastrar");
        jMenuItem34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem34ActionPerformed(evt);
            }
        });
        jMenu15.add(jMenuItem34);

        jMenuItem35.setText("Alterar");
        jMenuItem35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem35ActionPerformed(evt);
            }
        });
        jMenu15.add(jMenuItem35);

        jMenuItem36.setText("Desativar");
        jMenu15.add(jMenuItem36);

        jMenuBar1.add(jMenu15);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inActionPerformed
        String s = new String(senha.getPassword());
        String c = new String(confirma.getPassword());
        if (login.getText().isEmpty() || matr.getText().isEmpty() || s.equals("") || c.equals("")) 
        {
            JOptionPane.showMessageDialog(null, "Um campo importante está vazio!");
        } else 
        {
            if (s.equals(c)) 
            {
                System.out.println("Senhas iguais");
                LoginDAO log = new LoginDAO();
                if (log.validaLogin(login.getText())) 
                {
                    System.out.println("vrau");
                    JOptionPane.showMessageDialog(null, "Esse login já existe.");
                } else 
                {
                    log.add(login.getText(), s, matr.getText());
                    int r = JOptionPane.showConfirmDialog(null,"Login cadastrado com sucesso. Deseja cadastrar outro login ?");
                    if(r == JOptionPane.YES_OPTION)
                    {
                        dispose();
                        CDLogin cadastro = new CDLogin();
                        cadastro.setVisible(true);
                    }else
                    {
                        dispose();
                        Inicio inicio = new Inicio();
                        inicio.setVisible(true);
                    }
                
                }
            }
        }


    }//GEN-LAST:event_inActionPerformed

    private void matrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_matrActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginActionPerformed

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

    private void jMenuItem22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem22ActionPerformed
        dispose();
        AltFicha alt = new AltFicha();
        alt.setVisible(true);
    }//GEN-LAST:event_jMenuItem22ActionPerformed

    private void jMenuItem23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem23ActionPerformed
        dispose();

    }//GEN-LAST:event_jMenuItem23ActionPerformed

    private void jRadioButtonMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem2ActionPerformed
        dispose();
        CDBeneficio newCD = new CDBeneficio();
        newCD.setVisible(true);
    }//GEN-LAST:event_jRadioButtonMenuItem2ActionPerformed

    private void jMenuItem25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem25ActionPerformed
        dispose();
        ResetAlunos newReset = new ResetAlunos();
        newReset.setVisible(true);
    }//GEN-LAST:event_jMenuItem25ActionPerformed

    private void jMenuItem26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem26ActionPerformed
        dispose();
        CDFun newCD = new CDFun();
        newCD.setVisible(true);
    }//GEN-LAST:event_jMenuItem26ActionPerformed

    private void jMenu12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu12ActionPerformed
        dispose();
        CDLogin newCD = new CDLogin();
        newCD.setVisible(true);
    }//GEN-LAST:event_jMenu12ActionPerformed

    private void jMenuItem29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem29ActionPerformed

    private void jMenuItem31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem31ActionPerformed
        dispose();
        CDCurso c=new CDCurso();
        c.setVisible(true);
    }//GEN-LAST:event_jMenuItem31ActionPerformed

    private void jMenuItem32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem32ActionPerformed
        dispose();
        AltrCurso alt = new AltrCurso();
        alt.setVisible(true);
    }//GEN-LAST:event_jMenuItem32ActionPerformed

    private void jMenu14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu14ActionPerformed
        dispose();
        CDCurso newCD = new CDCurso();
        newCD.setVisible(true);
    }//GEN-LAST:event_jMenu14ActionPerformed

    private void jMenuItem34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem34ActionPerformed
        dispose();
        CDTurma c=new CDTurma();
        c.setVisible(true);
    }//GEN-LAST:event_jMenuItem34ActionPerformed

    private void jMenuItem35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem35ActionPerformed
        dispose();
        AltrTurma alt = new AltrTurma();
        alt.setVisible(true);
    }//GEN-LAST:event_jMenuItem35ActionPerformed

    private void jMenu15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu15ActionPerformed
        dispose();
        CDTurma newCD = new CDTurma();
        newCD.setVisible(true);
    }//GEN-LAST:event_jMenu15ActionPerformed

    private void btnVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarMouseClicked
        dispose();
        Inicio newInicio = new Inicio();
        newInicio.setVisible(true);
    }//GEN-LAST:event_btnVoltarMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CDLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnVoltar;
    private javax.swing.JPasswordField confirma;
    private javax.swing.JButton in;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem27;
    private javax.swing.JMenuItem jMenuItem28;
    private javax.swing.JMenuItem jMenuItem29;
    private javax.swing.JMenuItem jMenuItem30;
    private javax.swing.JMenuItem jMenuItem31;
    private javax.swing.JMenuItem jMenuItem32;
    private javax.swing.JMenuItem jMenuItem33;
    private javax.swing.JMenuItem jMenuItem34;
    private javax.swing.JMenuItem jMenuItem35;
    private javax.swing.JMenuItem jMenuItem36;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem3;
    private javax.swing.JTextField login;
    private javax.swing.JTextField matr;
    private javax.swing.JPasswordField senha;
    // End of variables declaration//GEN-END:variables
}
