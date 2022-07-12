package com.github.liblanchonete;

import com.github.liblanchonete.model.entities.Pedido;
import com.github.liblanchonete.model.entities.Status;

public class Main {

    public static void main(String[] args) {

        Pedido p = new Pedido();
        p.setStatus(Status.CANCELADO);
        System.out.println(p.getStatus());
    }
}
