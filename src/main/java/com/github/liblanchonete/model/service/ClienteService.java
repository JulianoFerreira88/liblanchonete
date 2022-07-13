package com.github.liblanchonete.model.service;

import com.github.liblanchonete.model.dao.ClienteDao;
import com.github.liblanchonete.model.entities.Cliente;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class ClienteService {

    private ClienteDao dao;

    public void insert(Cliente cliente) {
        dao.insert(cliente);
    }

    public void delete(Cliente cliente) {
        dao.delete(cliente);
    }

    public void update(Cliente cliente) {
        dao.update(cliente);
    }

    public void deleteAll() {
        dao.deleteAll();
    }

    public void deleteById(Integer id) {
        dao.deleteById(id);
    }

    public List<Cliente> findALlByExample(Cliente example) {
        return dao.findByExamlpe(example);
    }

}
