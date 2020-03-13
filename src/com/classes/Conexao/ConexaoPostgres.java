package com.classes.Conexao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoPostgres {

    final static String NOME_DO_BANCO = "mvcsimplesjdbc";
    final static String USUARIO = "postgres";

    public Connection conectar() {
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + NOME_DO_BANCO, USUARIO, "0000");
            return con;
        }
        catch (SQLException | ClassNotFoundException e) {
            System.err.println("Erro: " + e.toString());
            e.printStackTrace();
            return null;
        }
    }

}

