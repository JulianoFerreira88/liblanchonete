package com.github.liblanchonete.model.dao;

import com.github.liblanchonete.model.entities.Pedido;
import com.github.liblanchonete.model.entities.Status;
import java.util.List;

public abstract class PedidoDao {

    public abstract void insert(Pedido pedido);

    public abstract void delete(Pedido pedido);

    public abstract void update(Pedido pedido);

    public abstract void deleteById(Integer id);

    public abstract void deleteAll();

    public abstract List<Pedido> findALL();

    public abstract List<Pedido> findALLByStatus(Status status);

    public abstract List<Pedido> findByExamlpe(Pedido example);

}
