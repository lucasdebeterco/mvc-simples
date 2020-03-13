package com.classes.Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexaoSqlite {

    public Connection conectar() {
        try {
        Connection connection = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\H4nzo\\IdeaProjects\\MVC-Simples-JDBC-V2\\src\\bd\\mvcsimplesjdbc.db");
            return connection;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }

    }
}
