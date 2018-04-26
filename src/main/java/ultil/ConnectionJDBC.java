/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author js005984
 */
public class ConnectionJDBC {
    private static Connection connection;

    public static Connection getConnection() throws Exception {

        if (connection == null) {
            // Carregar o Driver JDBC
            try {
                Class.forName("org.firebirdsql.jdbc.FBDriver");
            } catch (ClassNotFoundException ex) {
                throw new Exception(ex);
            }

            /**
             * Conectar ao Banco de Dados URL:
             * jdbc:nomeDoProduto:servidor:porta:nomeDoBanco
             */
            
            String servidor = "192.168.21.108";
            String database = "/databases/aula07.fdb";
             String url = "jdbc:firebirdsql:" + servidor + "/3050:" + database + "?encoding=win1252";
            String user = "SYSDBA";
            String password = "masterkey";

            try {
                // Obter uma conexao
                connection = DriverManager.getConnection(url, user, password);
            } catch (SQLException ex) {
                throw new Exception(ex);
            }
        }

        return connection;
    }

    public static void main(String[] args) {
        System.out.println("Teste!");
        try {
            ConnectionJDBC.getConnection();
        } catch (Exception ex) {
            System.out.println(""+ex.getMessage());
        }
    }
}
