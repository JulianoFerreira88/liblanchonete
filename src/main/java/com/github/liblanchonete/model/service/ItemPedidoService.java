package com.github.liblanchonete.model.service;

import com.github.liblanchonete.model.dao.ItemPedidoDao;
import com.github.liblanchonete.model.entities.ItemPedido;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class ItemPedidoService {

    private ItemPedidoDao dao;

    public void insert(ItemPedido itemPedido) {
        dao.insert(itemPedido);
    }

    public void delete(ItemPedido itemPedido) {
        dao.delete(itemPedido);
    }

    public void update(ItemPedido itemPedido) {
        dao.update(itemPedido);
    }

    public void deleteAll() {
        dao.deleteAll();
    }

    public void deleteById(Integer id) {
        dao.deleteById(id);
    }

    public List<ItemPedido> findALlByExample(ItemPedido example) {
        return dao.findByExamlpe(example);
    }
}
