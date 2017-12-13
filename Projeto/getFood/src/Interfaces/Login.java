package Interfaces;

import Classes.Funcionario;
import DAO.AlunoDAO;
import DAO.LoginDAO;
import javax.swing.JOptionPane;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class Login extends javax.swing.JFrame implements KeyListener {

    Funcionario funLog;
    AlunoDAO alunoDao;

    public Login() {
        initComponents();
        this.setTitle("GetFood - Login");
        funLog = new Funcionario();
        txtLogin.addKeyListener(this);
        txtSenha.addKeyListener(this);
        this.setLocationRelativeTo(null);
        alunoDao = new AlunoDAO();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        txtLogin = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnLogar = new javax.swing.JLabel();
        btnCadastrarLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Simplified Arabic", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(53, 72, 112));
        jLabel1.setText("Login:");

        jLabel2.setFont(new java.awt.Font("Simplified Arabic", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(53, 72, 112));
        jLabel2.setText("Senha:");

        txtSenha.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(53, 72, 112), 2, true));
        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });

        txtLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(53, 72, 112), 2, true));
        txtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/LOGO_150px.png"))); // NOI18N

        btnLogar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Botoes/btn_Logar.png"))); // NOI18N
        btnLogar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogarMouseClicked(evt);
            }
        });

        btnCadastrarLogin.setFont(new java.awt.Font("Simplified Arabic", 0, 18)); // NOI18N
        btnCadastrarLogin.setForeground(new java.awt.Color(53, 72, 112));
        btnCadastrarLogin.setText("Ainda não possui um login ?");
        btnCadastrarLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCadastrarLoginMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel6)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogar))
                .addGap(352, 352, 352))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCadastrarLogin)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel6)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel2)))
                .addGap(37, 37, 37)
                .addComponent(btnLogar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(btnCadastrarLogin)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void txtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoginActionPerformed

    private void btnLogarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogarMouseClicked
        logar();
    }//GEN-LAST:event_btnLogarMouseClicked

    private void btnCadastrarLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarLoginMouseClicked
        if (!alunoDao.verificaBD()) {
            JOptionPane.showMessageDialog(null, "Não há funcionários cadastrados.", "Erro!", JOptionPane.ERROR_MESSAGE);
        } else {
            int resposta = JOptionPane.showConfirmDialog(null, "Deseja executar o cadastro do seu login?");
            if (resposta == JOptionPane.YES_OPTION) {
                dispose();
                Login_Deslogado newCDLogin = new Login_Deslogado();
                newCDLogin.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnCadastrarLoginMouseClicked

    private void logar() {
        LoginDAO loginDAO = new LoginDAO();
        String senha = new String(txtSenha.getPassword());
        String login = txtLogin.getText();
        boolean result;
        if (login.isEmpty() || senha.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Um campo importante está vazio!");
        } else {
            result = loginDAO.logar(login, senha);
            funLog = loginDAO.getFuncionarioLogin(login);
            if (result) {
                dispose();

                Inicio i = new Inicio(funLog);
                i.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Senha/login inválidos.");
            }
        }
    }

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCadastrarLogin;
    private javax.swing.JLabel btnLogar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables

    @Override
    public void keyTyped(KeyEvent ke) {

    }

    @Override
    public void keyPressed(KeyEvent ke) {
        int codigo = ke.getKeyCode();
        if (codigo == KeyEvent.VK_ENTER) {
            logar();
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {

    }

}
