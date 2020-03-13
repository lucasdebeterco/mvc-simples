package com.classes.Conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoMysql {

    final static String NOME_DO_BANCO = "mvcsimplesjdbc";

    public Connection conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/" + NOME_DO_BANCO + "?autoReconnect=true&useSSL=false";
            return DriverManager.getConnection(url,"root","0000");
        }
        catch (Exception e) {
            System.err.println("Erro: " + e.toString());
            e.printStackTrace();
            return null;
        }

    }
}

