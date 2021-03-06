package Interfaces;

import Classes.Funcionario;
import Classes.Turma;
import DAO.AlunoDAO;
import DAO.CursoDAO;
import DAO.FunDAO;
import DAO.TurmaDAO;
import DAO.VendaDAO;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Turma_Cadastro extends javax.swing.JFrame implements KeyListener {

    Funcionario funLog;
    BufferedReader txt;
    Turma turma;
    String[] dadosTurma;
    FileReader arqReader;
    ArrayList<Turma> listaTurma;
    TurmaDAO turmaDao;
    CursoDAO cursoDao;
    AlunoDAO alunoDao;
    VendaDAO vendaDao;
    FunDAO funDao;

    private Turma_Cadastro() {
        initComponents();
        this.setLocationRelativeTo(null);
        txtArea.setEditable(false);
        txtArea.addKeyListener(this);
        btnSalvar.setEnabled(false);
    }

    public Turma_Cadastro(Funcionario fun) {
        initComponents();
        listaTurma = new ArrayList();
        cursoDao = new CursoDAO();
        turmaDao = new TurmaDAO();
        txtArea.addKeyListener(this);
        txtNomeArquivo.addKeyListener(this);
        funLog = fun;
        txtArea.setEditable(false);
        this.setLocationRelativeTo(null);
        turmaDao = new TurmaDAO();
        cursoDao = new CursoDAO();
        alunoDao = new AlunoDAO();
        vendaDao = new VendaDAO();
        funDao = new FunDAO();
        btnSalvar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 90), new java.awt.Dimension(0, 90), new java.awt.Dimension(32767, 90));
        jLabel1 = new javax.swing.JLabel();
        txtLogo = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNomeArquivo = new javax.swing.JTextField();
        lblEscolherArquivo = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastrar Turmas");
        setResizable(false);

        txtLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/LOGO_150px.png"))); // NOI18N

        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/backward-arrow.png"))); // NOI18N
        btnVoltar.setToolTipText("Voltar");
        btnVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVoltarMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Simplified Arabic", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(53, 72, 112));
        jLabel4.setText("Selecione um arquivo:");

        lblEscolherArquivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btn_EscolherArquivo.png"))); // NOI18N
        lblEscolherArquivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEscolherArquivoMouseClicked(evt);
            }
        });

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btn_Salvar.png"))); // NOI18N
        btnSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalvarMouseClicked(evt);
            }
        });

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(txtLogo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(178, 178, 178))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblEscolherArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnSalvar)
                        .addGap(60, 60, 60))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNomeArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnVoltar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(164, 164, 164))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(125, 125, 125))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(txtLogo)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNomeArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEscolherArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(142, 142, 142)
                .addComponent(btnVoltar)
                .addGap(63, 63, 63))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        jMenuItem3.setText("[ADMINISTRADOR]");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem3);

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 879, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarMouseClicked
        dispose();
        Inicio newInicio = new Inicio(funLog);
        newInicio.setVisible(true);
    }//GEN-LAST:event_btnVoltarMouseClicked

    public void escolherArquivo() {
        txtArea.setText("");
        txtNomeArquivo.setText("");
        
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
                + "-Código da turma\n"
                + "-Curso ao qual a turma pertence", "Aviso!", JOptionPane.WARNING_MESSAGE);

        //Abre a janela JFileChooser e guarda a resposta na variável 'retornoFileChooser'
        retornoFileChooser = fileChooser.showOpenDialog(this);

        if (retornoFileChooser == JFileChooser.APPROVE_OPTION) {
            arq = fileChooser.getSelectedFile();
            txtNomeArquivo.setText(arq.getName());
            try {
                System.out.println(arq.getPath());
                txt = new BufferedReader(new InputStreamReader(new FileInputStream(arq.getPath()), "UTF8"));
            } catch (FileNotFoundException | UnsupportedEncodingException e) {
                e.printStackTrace();
            }

            try {
                String linha = txt.readLine();
                while (linha != null) {
                    String novaLinha = txtArea.getText() + linha + "\n";
                    txtArea.setText(novaLinha);

                    dadosTurma = linha.split("#");

                    turma = new Turma();
                    turma.setCodigo(dadosTurma[0]);
                    turma.setCurso("" + cursoDao.getCodigoByNome(dadosTurma[1]));
                    listaTurma.add(turma);
                    linha = txt.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            btnSalvar.setEnabled(false);
        }
    }

    private void salvar() {
        if (txt == null) {
            JOptionPane.showMessageDialog(null, "Selecione um arquivo.", "AVISO!", JOptionPane.WARNING_MESSAGE);
        } else {

            for (Turma t : listaTurma) {
                if (turmaDao.addTurma(t) == false) {
                    JOptionPane.showMessageDialog(null, "Erro.", "ERRO!", JOptionPane.ERROR_MESSAGE);
                    break;
                }
            }

            int resposta = JOptionPane.showConfirmDialog(null, "Turmas cadastradas com sucesso. Deseja voltar ao menu principal?", null, JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION) {
                dispose();
                Inicio newInicio = new Inicio(funLog);
                newInicio.setVisible(true);
            }
        }
    }

    private void lblEscolherArquivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEscolherArquivoMouseClicked
            escolherArquivo();
    }//GEN-LAST:event_lblEscolherArquivoMouseClicked

    private void btnSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseClicked
        if (btnSalvar.isEnabled()) {
            salvar();
        }
    }//GEN-LAST:event_btnSalvarMouseClicked

    private void jMenuItem11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem11MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem11MouseEntered

    private void jMenuItem11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem11MouseExited

    }//GEN-LAST:event_jMenuItem11MouseExited

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        if (!alunoDao.verificaBD()) {
            JOptionPane.showMessageDialog(null, "Não há alunos cadastrados.", "Erro!", JOptionPane.ERROR_MESSAGE);
        } else if (!funDao.verificaBD()) {
            JOptionPane.showMessageDialog(null, "Não há funcionários cadastrados.", "Erro!", JOptionPane.ERROR_MESSAGE);
        } else {
            dispose();
            Venda_Ficha newVenda = new Venda_Ficha(funLog);
            newVenda.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        if (!alunoDao.verificaBD()) {
            JOptionPane.showMessageDialog(null, "Não há alunos cadastrados.", "Erro!", JOptionPane.ERROR_MESSAGE);
        } else if (!funDao.verificaBD()) {
            JOptionPane.showMessageDialog(null, "Não há funcionários cadastrados.", "Erro!", JOptionPane.ERROR_MESSAGE);
        } else {
            dispose();
            Venda_Creditos newVenda = new Venda_Creditos(funLog);
            newVenda.setVisible(true);
        }
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
        if (!alunoDao.verificaBD()) {
            JOptionPane.showMessageDialog(null, "Não há alunos cadastrados.", "Erro!", JOptionPane.ERROR_MESSAGE);
        } else {
            dispose();
            Aluno_Cadastro_Beneficiarios newCD = new Aluno_Cadastro_Beneficiarios(funLog);
            newCD.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        if (!alunoDao.verificaBD()) {
            JOptionPane.showMessageDialog(null, "Não há alunos cadastrados.", "Erro!", JOptionPane.ERROR_MESSAGE);
        } else {
            dispose();
            Aluno_Buscar newBuscar = new Aluno_Buscar(funLog);
            newBuscar.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        if (!alunoDao.verificaBD()) {
            JOptionPane.showMessageDialog(null, "Não há alunos cadastrados.", "Erro!", JOptionPane.ERROR_MESSAGE);
        } else {
            dispose();
            Aluno_Foto newFoto = new Aluno_Foto(funLog);
            newFoto.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        if (!alunoDao.verificaBD()) {
            JOptionPane.showMessageDialog(null, "Não há alunos cadastrados.", "Erro!", JOptionPane.ERROR_MESSAGE);
        } else {
            dispose();
            Aluno_ConsultarHistorico consulta = new Aluno_ConsultarHistorico(funLog);
            consulta.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        dispose();
        Funcionario_Cadastro newCD = new Funcionario_Cadastro(funLog);
        newCD.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed
        if (!funDao.verificaBD()) {
            JOptionPane.showMessageDialog(null, "Não há funcionários cadastrados.", "Erro!", JOptionPane.ERROR_MESSAGE);
        } else {
            dispose();
            Login_Cadastro newCD = new Login_Cadastro(funLog);
            newCD.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItem21ActionPerformed

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed
        dispose();
        Login_Cadastro newCD = new Login_Cadastro(funLog);
        newCD.setVisible(true);
    }//GEN-LAST:event_jMenu5ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        if (!vendaDao.verificaBD()) {
            JOptionPane.showMessageDialog(null, "Não há vendas.", "Erro!", JOptionPane.ERROR_MESSAGE);
        } else {
            dispose();
            Relatório_Gerar gerarRelatorio = new Relatório_Gerar(funLog);
            gerarRelatorio.setVisible(true);
        }
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

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        String senha = JOptionPane.showInputDialog(null, "Digite a senha do administrador:", null, JOptionPane.QUESTION_MESSAGE);
        if (funDao.validaSenhaAdm(senha)) {
            dispose();
            Administrador_Menu admMenu = new Administrador_Menu(funLog);
            admMenu.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Senha inválida.", "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
            java.util.logging.Logger.getLogger(Turma_Cadastro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Turma_Cadastro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Turma_Cadastro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Turma_Cadastro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new Turma_Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnSalvar;
    private javax.swing.JLabel btnVoltar;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEscolherArquivo;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JLabel txtLogo;
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
                salvar();
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
