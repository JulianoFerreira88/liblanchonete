package com.github.liblanchonete.model.dao;

import com.github.liblanchonete.model.entities.Cliente;
import com.github.liblanchonete.model.entities.Pedido;
import com.github.liblanchonete.model.entities.Status;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class SamplePedidoDao extends PedidoDao {

    private List<Pedido> pedidos;

    public SamplePedidoDao() {
        pedidos = new ArrayList<>();
        pedidos.add(new Pedido(1, new Date(), new ArrayList<>(), new Cliente("Juliano", 1), Status.PROCESSANDO));
        pedidos.add(new Pedido(2, new Date(), new ArrayList<>(), new Cliente("Fulano", 1), Status.EM_TRANSITO));
    }

    @Override
    public void insert(Pedido pedido) {
        pedidos.add(pedido);
    }

    @Override
    public void delete(Pedido pedido) {
        pedidos.remove(pedido);
    }

    @Override
    public void update(Pedido pedido) {
        System.out.println("implement");
    }

    @Override
    public void deleteById(Integer id) {
        pedidos.forEach(p -> {
            if (Objects.equals(p.getId(), id)) {
                pedidos.remove(p);
            }
        });

    }

    @Override
    public void deleteAll() {
        pedidos.removeAll(pedidos);
    }

    @Override
    public List<Pedido> findALL() {
        return pedidos;
    }

    @Override
    public List<Pedido> findALLByStatus(Status status) {
        List<Pedido> peds = new ArrayList<>();
        pedidos.forEach(p -> {
            if (p.getStatus().equals(status)) {
                peds.add(p);
            }
        });
        return peds;
    }

    @Override
    public List<Pedido> findByExamlpe(Pedido example) {
        return null;
    }

}
