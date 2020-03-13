package com.classes.Main;

import com.classes.BO.MarcaBO;
import com.classes.DAO.MarcaDAOMysql;
import com.classes.DTO.Marca;

public class MainProcurarPorCodigo {

    public static void main(String[] args) {

        //MarcaDAOPostgres marcaDAO = new MarcaDAOPostgres();
        MarcaDAOMysql marcaDAO = new MarcaDAOMysql();

        MarcaBO marcaBO = new MarcaBO(marcaDAO);

        Marca marca = new Marca(1,"");
        marca = marcaBO.procurarPorCodigo(marca);
        System.out.println(marca);

    }
}