package com.classes.Main;

import com.classes.BO.MarcaBO;
import com.classes.DAO.MarcaDAOMysql;
import com.classes.DTO.Marca;

public class MainExclusao {

    public static void main(String[] args) {

        //MarcaDAOPostgres marcaDAO = new MarcaDAOPostgres();
        MarcaDAOMysql marcaDAO = new MarcaDAOMysql();

        MarcaBO marcaBO = new MarcaBO(marcaDAO);

        Marca marca = new Marca(1);
        if (marcaBO.excluir(marca))
            System.out.println("Excluido com Sucesso");
        else
            System.out.println("Erro ao Excluir");

    }
}