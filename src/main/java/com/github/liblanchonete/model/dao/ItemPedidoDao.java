package com.github.liblanchonete.model.dao;

import com.github.liblanchonete.model.entities.ItemPedido;
import java.util.List;

public abstract class ItemPedidoDao {

    public abstract void insert(ItemPedido itemPedido);

    public abstract void delete(ItemPedido itemPedido);

    public abstract void update(ItemPedido itemPedido);

    public abstract void deleteById(Integer id);

    public abstract void deleteAll();

    public abstract List<ItemPedido> findALL();

    public abstract List<ItemPedido> findByExamlpe(ItemPedido example);
}
