package com.github.liblanchonete.model.service;

import com.github.liblanchonete.model.dao.PedidoDao;
import com.github.liblanchonete.model.entities.Pedido;
import com.github.liblanchonete.model.entities.Status;
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
public class PedidoService {

    private PedidoDao dao;

    public List<Pedido> findAll() {
        return dao.findALL();
    }

    public void insert(Pedido pedido) {
        dao.insert(pedido);
    }

    public void delete(Pedido pedido) {
        dao.delete(pedido);
    }

    public void update(Pedido pedido) {
        dao.update(pedido);
    }

    public void deleteAll() {
        dao.deleteAll();
    }

    public void deleteById(Integer id) {
        dao.deleteById(id);
    }

    public List<Pedido> findAllByStatus(Status status) {
        return dao.findALLByStatus(status);
    }

    public List<Pedido> findALlByExample(Pedido example) {
        return dao.findByExamlpe(example);
    }

}
