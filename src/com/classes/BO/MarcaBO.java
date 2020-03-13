package com.classes.BO;

import com.classes.DAO.IDAO;
import com.classes.DTO.Marca;

import java.util.List;

public class MarcaBO {

    IDAO con;

    public MarcaBO(IDAO con) {
        this.con = con;
    }

    public boolean inserir(Marca marca){
        if (!existe(marca)) {
            return con.inserir(marca);
        }
        return false;
    }
    public boolean alterar(Marca marca){
        return con.alterar(marca);
    }
    public boolean excluir(Marca marca){
        return con.excluir(marca);
    }
    public Marca procurarPorCodigo(Marca marca){
        return con.procurarPorCodigo(marca);
    }
    public Marca procurarPorDescricao(Marca marca){
        return con.procurarPorDescricao(marca);
    }
    public boolean existe(Marca marca){
        return con.existe(marca);
    }
    public List<Marca> pesquisarTodos(){
        return con.pesquisarTodos();
    }
}