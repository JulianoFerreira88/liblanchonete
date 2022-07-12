package com.github.liblanchonete.model.dao;

import java.util.List;

public abstract class Fornecedor {

    public abstract void insert(Fornecedor fornecedor);

    public abstract void delete(Fornecedor fornecedor);

    public abstract void update(Fornecedor fornecedor);

    public abstract void deleteById(Integer id);

    public abstract void deleteAll();

    public abstract List<Fornecedor> findALL();

    public abstract List<Fornecedor> findByExamlpe(Fornecedor example);
}
