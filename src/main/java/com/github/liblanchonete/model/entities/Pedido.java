package com.github.liblanchonete.model.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Pedido implements Serializable {
    private Integer id;
    private Date data;
    private List<ItemPedido> itens;
    private Cliente cliente;
    private Status status;

}
