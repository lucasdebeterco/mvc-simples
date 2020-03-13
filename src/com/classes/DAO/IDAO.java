package com.classes.DAO;

import com.classes.DTO.Marca;

import java.sql.ResultSet;
import java.util.List;

public interface IDAO {
    public boolean inserir(Marca marca);
    public boolean alterar(Marca marca);
    public boolean excluir(Marca marca);
    public Marca procurarPorCodigo(Marca marca);
    public Marca procurarPorDescricao(Marca marca);
    public boolean existe(Marca marca);
    public List<Marca> pesquisarTodos();
    public List<Marca> montarLista(ResultSet rs);

}
