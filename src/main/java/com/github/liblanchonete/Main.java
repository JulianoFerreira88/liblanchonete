package com.github.liblanchonete;

import com.github.liblanchonete.model.dao.SamplePedidoDao;
import com.github.liblanchonete.model.entities.Cliente;
import com.github.liblanchonete.model.entities.Pedido;
import com.github.liblanchonete.model.entities.Status;
import java.util.Date;


public class Main {
    
    public static void main(String[] args) {
        SamplePedidoDao dao = new SamplePedidoDao();
        dao.insert(new Pedido(3, new Date(), null, new Cliente(), Status.PAGO));
        dao.findALL().forEach(p -> {
            System.out.println("Pedido: " + p);
        });
    }
}
