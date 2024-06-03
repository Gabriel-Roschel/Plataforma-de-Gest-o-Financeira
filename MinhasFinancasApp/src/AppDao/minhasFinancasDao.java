package AppDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class minhasFinancasDao {

    Connection conectar;
    public int id;

    private void conectar() throws ClassNotFoundException, SQLException {

        // Conectar ao BD
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://minhasfinancasbd.mysql.database.azure.com:3306/minhas_financas_app?useSSL=true";
        conectar = DriverManager.getConnection(url, "rootFinancas", "Babushka06");

    }

    public int acharId(String email) throws ClassNotFoundException, SQLException {
        conectar();

        PreparedStatement st = conectar.prepareStatement("SELECT user_id FROM usuarios WHERE email = ?");
        st.setString(1, email);

        ResultSet rst = st.executeQuery();
        rst.next();
        return rst.getInt(1);
    }

    public void salvarCadastro(String nome, String email, String telefone, String senha) throws ClassNotFoundException, SQLException {
        conectar();

        // Enviar dados para o BD
        PreparedStatement st = conectar.prepareStatement("INSERT INTO usuarios (nome,email,telefone,senha) VALUES(?,?,?,?)");
        st.setString(1, nome);
        st.setString(2, email);
        st.setString(3, telefone);
        st.setString(4, senha);

        // Executa comando INSERT
        st.executeUpdate();
    }

    public ResultSet logar(String email, String senha) throws ClassNotFoundException, SQLException {
        conectar();

        PreparedStatement st = conectar.prepareStatement("SELECT * FROM usuarios WHERE email=? AND senha=?");
        st.setString(1, email);
        st.setObject(2, senha);
        return st.executeQuery();
    }

    // DESPESAS //
    
    public int criarDespesa(String descricaoDesp, Double valorDesp, String dataDesp, String categoriaDesp, int id) throws ClassNotFoundException, SQLException {
        conectar();

        PreparedStatement st = conectar.prepareStatement("INSERT INTO despesas (descricao_desp, valor_desp, data_desp, categoria_desp, fk_user_id) VALUES (?,?,?,?,?)");
        st.setString(1, descricaoDesp);
        st.setDouble(2, valorDesp);
        st.setDate(3, java.sql.Date.valueOf(dataDesp));
        st.setString(4, categoriaDesp);
        st.setInt(5, id);

        return st.executeUpdate();
    }

    public String mostrarDespesa(int id) throws ClassNotFoundException, SQLException {
        conectar();

        PreparedStatement st = conectar.prepareStatement("SELECT despesa_mensal(?)");
        st.setInt(1, id);

        ResultSet rst = st.executeQuery();
        rst.next();
        return rst.getString(1);
    }
    
    public int excluirDespesa(int numDespesa) throws ClassNotFoundException, SQLException {
        conectar();

        PreparedStatement st = conectar.prepareStatement("DELETE FROM despesas where desp_id = ?");
        st.setInt(1, numDespesa);

        return st.executeUpdate();
    }

     // RECEITAS //
    public int criarReceita(String descricaoRec, Double valorRec, String dataRec, String categoriaRec, int id) throws ClassNotFoundException, SQLException {
        conectar();

        PreparedStatement st = conectar.prepareStatement("INSERT INTO receitas (descricao_rec, valor_rec, data_rec, categoria_rec, fk_user_id) VALUES (?,?,?,?,?)");
        st.setString(1, descricaoRec);
        st.setDouble(2, valorRec);
        st.setDate(3, java.sql.Date.valueOf(dataRec));
        st.setString(4, categoriaRec);
        st.setInt(5, id);

        return st.executeUpdate();
    }

    public String mostrarReceita(int id) throws ClassNotFoundException, SQLException {
        conectar();

        PreparedStatement st = conectar.prepareStatement("SELECT receita_mensal(?)");
        st.setInt(1, id);

        ResultSet rst = st.executeQuery();
        rst.next();
        return rst.getString(1);
    }

    public String saldoGeral(int id) throws ClassNotFoundException, SQLException {
        conectar();

        PreparedStatement st = conectar.prepareStatement("SELECT saldo_geral(?)");

        st.setInt(1, id);
        ResultSet rst = st.executeQuery();
        rst.next();

        return rst.getString(1);
    }

    // METAS //
    public int criarMeta(String descricaoMeta, Double valorMeta, String inicioMeta, String fimMeta, int id) throws ClassNotFoundException, SQLException {
        conectar();

        PreparedStatement st = conectar.prepareStatement("INSERT INTO metas (descricao_met, valor_met, data_inicial_met, data_final_met, fk_user_id) VALUES (?,?,?,?,?)");

        st.setString(1, descricaoMeta);
        st.setDouble(2,valorMeta);
        st.setDate(3, java.sql.Date.valueOf(inicioMeta));
        st.setDate(4, java.sql.Date.valueOf(fimMeta));
        st.setInt(5, id);

        return st.executeUpdate();
    }

    public int excluirMeta(int numMeta) throws ClassNotFoundException, SQLException {
        conectar();

        PreparedStatement st = conectar.prepareStatement("DELETE FROM metas where met_id = ?");
        st.setInt(1, numMeta);

        return st.executeUpdate();
    }

    public ResultSet buscarMeta(int id) throws ClassNotFoundException, SQLException {
        conectar();

        PreparedStatement st = conectar.prepareStatement("SELECT * FROM metas WHERE fk_user_id = ?");
        st.setInt(1, id);

        ResultSet metas = st.executeQuery();

        return metas;
    }

    // RELATORIO //
    public ResultSet gerarRelatorio(int id) throws ClassNotFoundException, SQLException {
        conectar();

        PreparedStatement st = conectar.prepareCall("CALL relatorios(?)");
        
        st.setInt(1,id);

        ResultSet relatorio = st.executeQuery();

        return relatorio;
    }

}
