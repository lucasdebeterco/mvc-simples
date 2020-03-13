package com.classes.Main;

import com.classes.BO.MarcaBO;
import com.classes.DAO.MarcaDAOMysql;
import com.classes.DTO.Marca;

public class MainExiste {

    public static void main(String[] args) {

        //MarcaDAOPostgres marcaDAO = new MarcaDAOPostgres();
        MarcaDAOMysql marcaDAO = new MarcaDAOMysql();

        MarcaBO marcaBO = new MarcaBO(marcaDAO);

        Marca marca = new Marca("LG");
        if (marcaBO.existe(marca))
            System.out.println("Marca Encontrada");
        else
            System.out.println("Nao Encontrada");

    }
}