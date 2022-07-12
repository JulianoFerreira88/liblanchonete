package com.github.liblanchonete.model.dao;

import com.github.liblanchonete.model.entities.Cliente;
import java.util.List;

public abstract class ClienteDao {

    public abstract void insert(Cliente cliente);

    public abstract void delete(Cliente cliente);

    public abstract void update(Cliente cliente);

    public abstract void deleteById(Integer id);

    public abstract void deleteAll();

    public abstract List<Cliente> findALL();

    public abstract List<Cliente> findByExamlpe(Cliente example);
}
