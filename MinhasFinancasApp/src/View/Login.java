package View;

import AppDao.minhasFinancasDao;
import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.ColorUIResource;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Tela_Login = new javax.swing.JPanel();
        lblSenha = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        pswSenha = new javax.swing.JPasswordField();
        btnLinkCadastro = new javax.swing.JButton();
        lblEmail = new javax.swing.JLabel();
        btnEntrar = new javax.swing.JButton();
        chckMostrarSenha = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login - MinhasFinanças");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(0, 102, 102));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(0, 51, 51));
        setIconImages(null);
        setLocationByPlatform(true);
        setResizable(false);
        getContentPane().setLayout(null);

        Tela_Login.setBackground(new java.awt.Color(20, 33, 56));
        Tela_Login.setForeground(new java.awt.Color(123, 194, 145));
        Tela_Login.setToolTipText("");
        Tela_Login.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Tela_Login.setMinimumSize(new java.awt.Dimension(32767, 32767));
        Tela_Login.setName("MinhasFinanças"); // NOI18N
        Tela_Login.setLayout(null);

        lblSenha.setBackground(new java.awt.Color(123, 194, 145));
        lblSenha.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 24)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(255, 217, 210));
        lblSenha.setLabelFor(Tela_Login);
        lblSenha.setText("Senha:");
        lblSenha.setToolTipText("");
        Tela_Login.add(lblSenha);
        lblSenha.setBounds(50, 200, 80, 28);

        lblLogo.setBackground(new java.awt.Color(123, 194, 145));
        lblLogo.setFont(new java.awt.Font("Gill Sans MT", 0, 48)); // NOI18N
        lblLogo.setForeground(new java.awt.Color(255, 217, 210));
        lblLogo.setLabelFor(Tela_Login);
        lblLogo.setText("MinhasFinanças");
        lblLogo.setToolTipText("");
        Tela_Login.add(lblLogo);
        lblLogo.setBounds(90, 20, 300, 50);

        txtEmail.setBackground(new java.awt.Color(239, 248, 255));
        txtEmail.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(0, 0, 0));
        txtEmail.setToolTipText("Insira seu email de login ");
        txtEmail.setAutoscrolls(false);
        txtEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 10, 27)));
        txtEmail.setCaretColor(new java.awt.Color(153, 153, 153));
        txtEmail.setName(""); // NOI18N
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailKeyPressed(evt);
            }
        });
        Tela_Login.add(txtEmail);
        txtEmail.setBounds(50, 140, 380, 30);

        pswSenha.setBackground(new java.awt.Color(239, 248, 255));
        pswSenha.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        pswSenha.setForeground(new java.awt.Color(0, 0, 0));
        pswSenha.setToolTipText("Insira sua senha de login");
        pswSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 10, 27)));
        pswSenha.setCaretColor(new java.awt.Color(153, 153, 153));
        pswSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pswSenhaKeyPressed(evt);
            }
        });
        Tela_Login.add(pswSenha);
        pswSenha.setBounds(50, 230, 380, 30);

        btnLinkCadastro.setBackground(new java.awt.Color(1, 10, 27));
        btnLinkCadastro.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        btnLinkCadastro.setForeground(new java.awt.Color(255, 217, 210));
        btnLinkCadastro.setText("Cadastrar-se");
        btnLinkCadastro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(53, 71, 102)));
        btnLinkCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLinkCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLinkCadastroActionPerformed(evt);
            }
        });
        Tela_Login.add(btnLinkCadastro);
        btnLinkCadastro.setBounds(170, 350, 130, 30);

        lblEmail.setBackground(new java.awt.Color(123, 194, 145));
        lblEmail.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 24)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 217, 210));
        lblEmail.setLabelFor(Tela_Login);
        lblEmail.setText("Email:");
        lblEmail.setToolTipText("");
        Tela_Login.add(lblEmail);
        lblEmail.setBounds(50, 110, 80, 28);

        btnEntrar.setBackground(new java.awt.Color(1, 10, 27));
        btnEntrar.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(255, 217, 210));
        btnEntrar.setText("Entrar");
        btnEntrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(53, 71, 102)));
        btnEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        btnEntrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnEntrarKeyPressed(evt);
            }
        });
        Tela_Login.add(btnEntrar);
        btnEntrar.setBounds(140, 290, 190, 50);

        chckMostrarSenha.setBackground(new java.awt.Color(20, 33, 56));
        chckMostrarSenha.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        chckMostrarSenha.setForeground(new java.awt.Color(255, 217, 210));
        chckMostrarSenha.setText("Mostrar Senha");
        chckMostrarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chckMostrarSenhaActionPerformed(evt);
            }
        });
        Tela_Login.add(chckMostrarSenha);
        chckMostrarSenha.setBounds(50, 260, 110, 20);

        getContentPane().add(Tela_Login);
        Tela_Login.setBounds(0, 0, 480, 470);
        Tela_Login.getAccessibleContext().setAccessibleName("");

        setSize(new java.awt.Dimension(496, 456));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnLinkCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLinkCadastroActionPerformed
        new Cadastro().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnLinkCadastroActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed

        // Obter usuario e senha
        String email = this.txtEmail.getText();
        String senha = new String(pswSenha.getPassword()).trim();

        // Conectar com o banco de dados
        try {
            ResultSet entrar = new minhasFinancasDao().logar(email, senha);

            if (entrar.next() && entrar.getString("senha").equals(senha)) {
                int id = new minhasFinancasDao().acharId(email);
                new PaginaPrincipal(id).setVisible(true);
                dispose();

               
            } else {
                JOptionPane.showMessageDialog(rootPane, "Preencha os campos corretamente!", "erro", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Entre em contato com o suporte e informe o erro: " + ex.getMessage(), "Erro", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnEntrarActionPerformed

    private void txtEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            pswSenha.requestFocus();
        }
    }//GEN-LAST:event_txtEmailKeyPressed

    private void btnEntrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnEntrarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEntrarKeyPressed

    private void pswSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pswSenhaKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            btnEntrar.doClick();
        }
    }//GEN-LAST:event_pswSenhaKeyPressed

    private void chckMostrarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chckMostrarSenhaActionPerformed
        if (chckMostrarSenha.isSelected()) {
            pswSenha.setEchoChar((char) 0);
        } else {
            pswSenha.setEchoChar('*');
        }
    }//GEN-LAST:event_chckMostrarSenhaActionPerformed

    public static void main(String args[]) {
        FlatDarculaLaf.setup();
        UIManager.put("TitlePane.unifiedBackground", false);
        UIManager.put("TitlePane.background", new ColorUIResource(1, 10, 27));
        UIManager.put("TitlePane.foreground", Color.WHITE);
        try {
            UIManager.setLookAndFeel(new FlatIntelliJLaf());
            /* Create and display the form */
            java.awt.EventQueue.invokeLater(() -> {
                new Login().setVisible(true);
            });
        } catch (UnsupportedLookAndFeelException ex) {
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Tela_Login;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnLinkCadastro;
    private javax.swing.JCheckBox chckMostrarSenha;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JPasswordField pswSenha;
    private javax.swing.JTextField txtEmail;
    // End of variables declaration//GEN-END:variables
}
