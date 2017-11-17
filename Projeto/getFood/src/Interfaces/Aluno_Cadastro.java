package Interfaces;

import Classes.Aluno;
import Classes.Funcionario;
import DAO.AlunoDAO;
import DAO.CursoDAO;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Aluno_Cadastro extends javax.swing.JFrame implements KeyListener {

    BufferedReader txt;
    Aluno aluno;
    AlunoDAO alunoDao;
    CursoDAO cursoDao;
    String[] dadosAluno;
    FileReader arqReader;
    ArrayList<Aluno> listaAluno;
    Funcionario funLog;

    private Aluno_Cadastro() {
        initComponents();
        this.setLocationRelativeTo(null);
        txtArea.setEditable(false);
        txtArea.addKeyListener(this);
    }

    public Aluno_Cadastro(Funcionario fun) {
        initComponents();
        listaAluno = new ArrayList();
        alunoDao = new AlunoDAO();
        cursoDao = new CursoDAO();
        fun = this.funLog;
        txtNomeArquivo.addKeyListener(this);
        txtNomeArquivo.setEditable(false);
        txtArea.addKeyListener(this);
        txtArea.setEditable(false);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        txtNomeArquivo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem13.setText("jMenuItem13");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/LOGO_150px.png"))); // NOI18N

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        jLabel1.setFont(new java.awt.Font("Simplified Arabic", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(53, 72, 112));
        jLabel1.setText("Selecione um arquivo:");

        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/backward-arrow.png"))); // NOI18N
        btnVoltar.setToolTipText("Voltar");
        btnVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVoltarMouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btn_EscolherArquivo.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btn_Salvar.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNomeArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVoltar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 20, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNomeArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE))
                        .addGap(142, 142, 142)
                        .addComponent(btnVoltar)
                        .addGap(29, 29, 29))))
        );

        jMenu2.setBorder(null);
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/wallet.png"))); // NOI18N
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
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ticket.png"))); // NOI18N
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

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icon.png"))); // NOI18N
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

        jMenuItem6.setText("Resetar");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem6);

        jMenuItem15.setText("Buscar Aluno");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem15);

        jMenuItem16.setText("Adicionar foto");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem16);

        jMenuItem18.setText("Consultar Histórico");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem18);

        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/users.png"))); // NOI18N
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

        jMenuItem21.setText("Criar login");
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem21);

        jMenuBar1.add(jMenu5);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/padnote.png"))); // NOI18N
        jMenu6.setText("Relatório");
        jMenu6.setFont(new java.awt.Font("Simplified Arabic", 0, 18)); // NOI18N
        jMenu6.setMargin(new java.awt.Insets(10, 10, 10, 10));

        jMenuItem2.setText("Gerar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem2);

        jMenuBar1.add(jMenu6);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/curso_1.png"))); // NOI18N
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
        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/turma.png"))); // NOI18N
        jMenu8.setText("Turma");
        jMenu8.setFont(new java.awt.Font("Simplified Arabic", 0, 18)); // NOI18N
        jMenu8.setMargin(new java.awt.Insets(10, 35, 10, 35));
        jMenu8.setPreferredSize(new java.awt.Dimension(150, 33));
        jMenu8.setRequestFocusEnabled(false);
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
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarMouseClicked
        dispose();
        Inicio newInicio = new Inicio(funLog);
        newInicio.setVisible(true);
    }//GEN-LAST:event_btnVoltarMouseClicked

    private void escolherArquivo() {
        //VARIÁVEIS
        JFileChooser fileChooser = new JFileChooser();
        File arq;

        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Texto", "txt");
        int retornoFileChooser;

        //Configuração do JFileChooser
        fileChooser.setDialogTitle("Escolher Arquivo...");
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileChooser.setFileFilter(filtro);

        //Aviso sobre a formatação do arquivo.
        JOptionPane.showMessageDialog(null, "Certifique-se que o formato do arquivo está no padrão solicitado para executar o cadastro:\n"
                + "(Dados separados por '#' e na seguinte ordem:\n"
                + "-Matrícula\n"
                + "-Nome\n"
                + "-Curso\n"
                + "-Turma\n", "Aviso!", JOptionPane.WARNING_MESSAGE);

        //Abre a janela JFileChooser e guarda a resposta na variável 'retornoFileChooser'
        retornoFileChooser = fileChooser.showOpenDialog(this);

        if (retornoFileChooser == JFileChooser.APPROVE_OPTION) {
            arq = fileChooser.getSelectedFile();
            txtNomeArquivo.setText(arq.getName());
            try {
                arqReader = new FileReader(arq);
                txt = new BufferedReader(arqReader);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            try {
                String linha = txt.readLine();
                while (linha != null) {
                    String novaLinha = txtArea.getText() + linha + "\n";
                    txtArea.setText(novaLinha);

                    dadosAluno = linha.split("#");

                    aluno = new Aluno();
                    aluno.setMatricula(dadosAluno[0]);
                    aluno.setNome(dadosAluno[1]);
                    aluno.setCurso(cursoDao.getCodigoByNome(dadosAluno[2]));
                    aluno.setTurma(dadosAluno[3]);
                    aluno.setSaldo(0);
                    aluno.setBeneficiario(0);
                    System.out.println(aluno.toString());

                    listaAluno.add(aluno);

                    linha = txt.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void cadastrar() {
        for (Aluno al : listaAluno) {
            alunoDao.addAluno(al);
        }
        JOptionPane.showMessageDialog(null, "Cadastros realizados com sucesso.", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
        dispose();
        Inicio newInicio = new Inicio(funLog);
        newInicio.setVisible(true);

    }

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        escolherArquivo();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        cadastrar();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jMenuItem11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem11MouseEntered
        // TODO add your handling code here:

    }//GEN-LAST:event_jMenuItem11MouseEntered

    private void jMenuItem11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem11MouseExited

    }//GEN-LAST:event_jMenuItem11MouseExited

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        dispose();
        Venda_Ficha newVenda = new Venda_Ficha(funLog);
        newVenda.setVisible(true);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        dispose();
        Venda_Creditos newVenda = new Venda_Creditos(funLog);
        newVenda.setVisible(true);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
        dispose();
        Ficha_AlterarValor alt = new Ficha_AlterarValor(funLog);
        alt.setVisible(true);
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        dispose();
        Aluno_Cadastro newCD = new Aluno_Cadastro(funLog);
        newCD.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        dispose();
        Aluno_Cadastro_Beneficiarios newCD = new Aluno_Cadastro_Beneficiarios(funLog);
        newCD.setVisible(true);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        dispose();
        Reset newReset = new Reset(funLog);
        newReset.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        dispose();
        Aluno_Buscar newBuscar = new Aluno_Buscar(funLog);
        newBuscar.setVisible(true);
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        dispose();
        Aluno_Foto newFoto = new Aluno_Foto(funLog);
        newFoto.setVisible(true);

    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        dispose();
        Aluno_ConsultarHistorico consulta = new Aluno_ConsultarHistorico(funLog);
        consulta.setVisible(true);
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        dispose();
        Funcionario_Cadastro newCD = new Funcionario_Cadastro(funLog);
        newCD.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed
        dispose();
        Login_Cadastro newCD = new Login_Cadastro(funLog);
        newCD.setVisible(true);
    }//GEN-LAST:event_jMenuItem21ActionPerformed

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed
        dispose();
        Login_Cadastro newCD = new Login_Cadastro(funLog);
        newCD.setVisible(true);
    }//GEN-LAST:event_jMenu5ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        dispose();
        Relatório_Gerar gerarRelatorio = new Relatório_Gerar(funLog);
        gerarRelatorio.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        dispose();
        Curso_Cadastro c = new Curso_Cadastro(funLog);
        c.setVisible(true);
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenu7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu7ActionPerformed
        dispose();
        Curso_Cadastro newCD = new Curso_Cadastro(funLog);
        newCD.setVisible(true);
    }//GEN-LAST:event_jMenu7ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        dispose();
        Turma_Cadastro c = new Turma_Cadastro(funLog);
        c.setVisible(true);
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenu8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu8ActionPerformed
        dispose();
        Turma_Cadastro newCD = new Turma_Cadastro(funLog);
        newCD.setVisible(true);
    }//GEN-LAST:event_jMenu8ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aluno_Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
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
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtNomeArquivo;
    // End of variables declaration//GEN-END:variables

    @Override
    public void keyTyped(KeyEvent ke) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        int codigo = ke.getKeyCode();
        if (codigo == KeyEvent.VK_ENTER) {
            if (txtNomeArquivo.getText().length() == 0) {
                escolherArquivo();
            } else {
                cadastrar();
            }

        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
