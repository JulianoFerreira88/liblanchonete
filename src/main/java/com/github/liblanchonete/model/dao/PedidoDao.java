package com.github.liblanchonete.model.dao;

import com.github.liblanchonete.model.entities.Pedido;
import com.github.liblanchonete.model.entities.Status;
import java.util.List;

public abstract class PedidoDao {

    abstract void insert(Pedido pedido);

    abstract void delete(Pedido pedido);

    abstract void update(Pedido pedido);

    abstract void deleteById(Integer id);

    abstract void deleteAll();

    abstract List<Pedido> findALL();

    abstract List<Pedido> findALLByStatus(Status status);

}
