
package View;

import AppDao.minhasFinancasDao;
import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.ColorUIResource;


public class Cadastro extends javax.swing.JFrame {

    public Cadastro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Tela_Cadastro = new javax.swing.JPanel();
        lblLogo2 = new javax.swing.JLabel();
        lblEmailCad = new javax.swing.JLabel();
        txtSenhaCad = new javax.swing.JTextField();
        lblSenhaCad = new javax.swing.JLabel();
        txtEmailCad = new javax.swing.JTextField();
        lblTelefoneCad = new javax.swing.JLabel();
        lblUsuarioCad = new javax.swing.JLabel();
        txtUsuarioCad = new javax.swing.JTextField();
        btnEntrar1 = new javax.swing.JButton();
        btnLinkCadastro1 = new javax.swing.JButton();
        txtTelefoneCad = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro - MinhasFinanças");
        setResizable(false);
        getContentPane().setLayout(null);

        Tela_Cadastro.setBackground(new java.awt.Color(20, 33, 56));
        Tela_Cadastro.setForeground(new java.awt.Color(123, 194, 145));
        Tela_Cadastro.setToolTipText("");
        Tela_Cadastro.setLayout(null);

        lblLogo2.setBackground(new java.awt.Color(123, 194, 145));
        lblLogo2.setFont(new java.awt.Font("Gill Sans MT", 0, 48)); // NOI18N
        lblLogo2.setForeground(new java.awt.Color(255, 217, 210));
        lblLogo2.setText("MinhasFinanças");
        lblLogo2.setToolTipText("");
        Tela_Cadastro.add(lblLogo2);
        lblLogo2.setBounds(130, 20, 300, 50);

        lblEmailCad.setBackground(new java.awt.Color(123, 194, 145));
        lblEmailCad.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 24)); // NOI18N
        lblEmailCad.setForeground(new java.awt.Color(255, 217, 210));
        lblEmailCad.setText("Email:");
        lblEmailCad.setToolTipText("");
        Tela_Cadastro.add(lblEmailCad);
        lblEmailCad.setBounds(100, 190, 70, 28);

        txtSenhaCad.setBackground(new java.awt.Color(255, 255, 255));
        txtSenhaCad.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        txtSenhaCad.setForeground(new java.awt.Color(0, 0, 0));
        txtSenhaCad.setToolTipText("Insira sua senha");
        txtSenhaCad.setAutoscrolls(false);
        txtSenhaCad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 10, 27)));
        txtSenhaCad.setCaretColor(new java.awt.Color(153, 153, 153));
        txtSenhaCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaCadActionPerformed(evt);
            }
        });
        Tela_Cadastro.add(txtSenhaCad);
        txtSenhaCad.setBounds(90, 380, 380, 30);

        lblSenhaCad.setBackground(new java.awt.Color(123, 194, 145));
        lblSenhaCad.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 24)); // NOI18N
        lblSenhaCad.setForeground(new java.awt.Color(255, 217, 210));
        lblSenhaCad.setText("Senha:");
        lblSenhaCad.setToolTipText("");
        Tela_Cadastro.add(lblSenhaCad);
        lblSenhaCad.setBounds(100, 350, 80, 28);

        txtEmailCad.setBackground(new java.awt.Color(255, 255, 255));
        txtEmailCad.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        txtEmailCad.setForeground(new java.awt.Color(0, 0, 0));
        txtEmailCad.setToolTipText("Insira seu Email");
        txtEmailCad.setAutoscrolls(false);
        txtEmailCad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 10, 27)));
        txtEmailCad.setCaretColor(new java.awt.Color(153, 153, 153));
        txtEmailCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailCadActionPerformed(evt);
            }
        });
        Tela_Cadastro.add(txtEmailCad);
        txtEmailCad.setBounds(90, 220, 380, 30);

        lblTelefoneCad.setBackground(new java.awt.Color(123, 194, 145));
        lblTelefoneCad.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 24)); // NOI18N
        lblTelefoneCad.setForeground(new java.awt.Color(255, 217, 210));
        lblTelefoneCad.setText("Numero de Telefone:");
        lblTelefoneCad.setToolTipText("");
        Tela_Cadastro.add(lblTelefoneCad);
        lblTelefoneCad.setBounds(100, 270, 220, 28);

        lblUsuarioCad.setBackground(new java.awt.Color(123, 194, 145));
        lblUsuarioCad.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 24)); // NOI18N
        lblUsuarioCad.setForeground(new java.awt.Color(255, 217, 210));
        lblUsuarioCad.setText("Nome:");
        lblUsuarioCad.setToolTipText("");
        Tela_Cadastro.add(lblUsuarioCad);
        lblUsuarioCad.setBounds(100, 110, 190, 28);

        txtUsuarioCad.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuarioCad.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        txtUsuarioCad.setForeground(new java.awt.Color(0, 0, 0));
        txtUsuarioCad.setToolTipText("Insira seu nome");
        txtUsuarioCad.setAutoscrolls(false);
        txtUsuarioCad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 10, 27)));
        txtUsuarioCad.setCaretColor(new java.awt.Color(153, 153, 153));
        txtUsuarioCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioCadActionPerformed(evt);
            }
        });
        Tela_Cadastro.add(txtUsuarioCad);
        txtUsuarioCad.setBounds(90, 140, 380, 30);

        btnEntrar1.setBackground(new java.awt.Color(1, 10, 27));
        btnEntrar1.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        btnEntrar1.setForeground(new java.awt.Color(255, 217, 210));
        btnEntrar1.setText("Cadastrar-se");
        btnEntrar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(53, 71, 102)));
        btnEntrar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrar1ActionPerformed(evt);
            }
        });
        Tela_Cadastro.add(btnEntrar1);
        btnEntrar1.setBounds(180, 430, 190, 50);

        btnLinkCadastro1.setBackground(new java.awt.Color(1, 10, 27));
        btnLinkCadastro1.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 24)); // NOI18N
        btnLinkCadastro1.setForeground(new java.awt.Color(255, 217, 210));
        btnLinkCadastro1.setText("Retornar");
        btnLinkCadastro1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(53, 71, 102)));
        btnLinkCadastro1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLinkCadastro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLinkCadastro1ActionPerformed(evt);
            }
        });
        Tela_Cadastro.add(btnLinkCadastro1);
        btnLinkCadastro1.setBounds(210, 490, 130, 30);

        txtTelefoneCad.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefoneCad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 10, 27)));
        txtTelefoneCad.setForeground(new java.awt.Color(0, 0, 0));
        try {
            txtTelefoneCad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefoneCad.setToolTipText("Insira seu telefone");
        txtTelefoneCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneCadActionPerformed(evt);
            }
        });
        Tela_Cadastro.add(txtTelefoneCad);
        txtTelefoneCad.setBounds(90, 300, 380, 30);

        getContentPane().add(Tela_Cadastro);
        Tela_Cadastro.setBounds(0, 0, 560, 610);

        setSize(new java.awt.Dimension(575, 613));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSenhaCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaCadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaCadActionPerformed

    private void txtEmailCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailCadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailCadActionPerformed

    private void txtUsuarioCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioCadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioCadActionPerformed

    private void btnEntrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrar1ActionPerformed
        
        // Salvar dados em variaveis
        String nome = txtUsuarioCad.getText();
        String email = txtEmailCad.getText();
        String telefone = txtTelefoneCad.getText();
        String senha = txtSenhaCad.getText();
        
        if (nome.isBlank()|| email.isBlank()|| telefone.isBlank()|| senha.isBlank()) {
            JOptionPane.showMessageDialog(rootPane, "Os espaços devem ser preenchidos corretamente.", "Erro de cadastro", JOptionPane.WARNING_MESSAGE);
        } else try {
            
            // Chama Classe Dao
            new minhasFinancasDao().salvarCadastro(nome,email,telefone,senha);
            JOptionPane.showMessageDialog(rootPane, "Usuário cadastrado com sucesso!");
            
            //Limpar os campos
            txtUsuarioCad.setText("");
            txtEmailCad.setText("");
            txtTelefoneCad.setText("");
            txtSenhaCad.setText("");
            
            //posiciona o cursor no campo usuário
            btnEntrar1.requestFocus(); 
        }catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Entre em contato com o suporte e informe o erro: " + ex.getMessage(), "Erro", JOptionPane.WARNING_MESSAGE);
            
             String erro = ex.getMessage();
            if (erro.contains("Duplicate entry")) {
                JOptionPane.showMessageDialog(null, "Usuário já cadastrado");
        } 
        }
    }//GEN-LAST:event_btnEntrar1ActionPerformed

    private void btnLinkCadastro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLinkCadastro1ActionPerformed
        new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnLinkCadastro1ActionPerformed

    private void txtTelefoneCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneCadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneCadActionPerformed

   
    public static void main(String args[]) {
    FlatDarculaLaf.setup();
        UIManager.put("TitlePane.unifiedBackground", false);
        UIManager.put("TitlePane.background", new ColorUIResource(1,10,27));
        UIManager.put("TitlePane.foreground", Color.WHITE);
    try {
        UIManager.setLookAndFeel(new FlatIntelliJLaf());
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Cadastro().setVisible(true);
        });
    } catch (UnsupportedLookAndFeelException ex) {
    }

      
      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Tela_Cadastro;
    private javax.swing.JButton btnEntrar1;
    private javax.swing.JButton btnLinkCadastro1;
    private javax.swing.JLabel lblEmailCad;
    private javax.swing.JLabel lblLogo2;
    private javax.swing.JLabel lblSenhaCad;
    private javax.swing.JLabel lblTelefoneCad;
    private javax.swing.JLabel lblUsuarioCad;
    private javax.swing.JTextField txtEmailCad;
    private javax.swing.JTextField txtSenhaCad;
    private javax.swing.JFormattedTextField txtTelefoneCad;
    private javax.swing.JTextField txtUsuarioCad;
    // End of variables declaration//GEN-END:variables
}
