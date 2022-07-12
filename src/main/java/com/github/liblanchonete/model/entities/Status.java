package com.github.liblanchonete.model.entities;

import java.io.Serializable;
import lombok.Getter;
import lombok.ToString;

@Getter

@ToString
public enum Status implements Serializable {
    ENTREGUE,
    PROCESSANDO,
    CANCELADO,
    PAGO,
    EM_TRANSITO;
}
