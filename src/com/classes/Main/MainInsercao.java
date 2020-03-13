package com.classes.Main;

import com.classes.BO.MarcaBO;
import com.classes.DAO.MarcaDAOMysql;
import com.classes.DAO.MarcaDAOPostgres;
import com.classes.DAO.MarcaDAOSqlite;
import com.classes.DTO.Marca;

public class MainInsercao {
    public static void main(String[] args) {

        //MarcaDAOPostgres marcaDAO = new MarcaDAOPostgres();
        //MarcaDAOMysql marcaDAO = new MarcaDAOMysql();
        MarcaDAOSqlite marcaDAO = new MarcaDAOSqlite();

        MarcaBO marcaBO = new MarcaBO(marcaDAO);

        Marca marca = new Marca("Dell");

        if (marcaBO.inserir(marca))
            System.out.println("Inserido com Sucesso");
        else
            System.out.println("Erro ao Inserir");

        marca = new Marca("Android");
        if (marcaBO.inserir(marca))
            System.out.println("Inserido com Sucesso");
        else
            System.out.println("Erro ao Inserir");

        marca = new Marca("LG");
        if (marcaBO.inserir(marca))
            System.out.println("Inserido com Sucesso");
        else
            System.out.println("Erro ao Inserir");
    }
}