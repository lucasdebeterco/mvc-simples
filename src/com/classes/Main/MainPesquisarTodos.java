package com.classes.Main;

import java.util.ArrayList;
import java.util.List;
import com.classes.BO.MarcaBO;
import com.classes.DAO.MarcaDAOMysql;
import com.classes.DTO.Marca;

public class MainPesquisarTodos {

    public static void main(String[] args) {

        //MarcaDAOPostgres marcaDAO = new MarcaDAOPostgres();
        MarcaDAOMysql marcaDAO = new MarcaDAOMysql();

        MarcaBO marcaBO = new MarcaBO(marcaDAO);

        List<Marca> lista = new ArrayList<Marca>();
        lista = marcaBO.pesquisarTodos();
        for (Marca marca : lista) {
            System.out.println(marca.toString());
        }

    }
}