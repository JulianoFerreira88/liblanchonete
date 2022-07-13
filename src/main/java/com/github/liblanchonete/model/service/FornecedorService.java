package com.github.liblanchonete.model.service;

import com.github.liblanchonete.model.dao.FornecedorDao;
import com.github.liblanchonete.model.entities.Fornecedor;
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
public class FornecedorService {

    private FornecedorDao dao;

    public void insert(Fornecedor fornecedor) {
        dao.insert(fornecedor);
    }

    public void delete(Fornecedor fornecedor) {
        dao.delete(fornecedor);
    }

    public void update(Fornecedor fornecedor) {
        dao.update(fornecedor);
    }

    public void deleteAll() {
        dao.deleteAll();
    }

    public void deleteById(Integer id) {
        dao.deleteById(id);
    }

    public List<Fornecedor> findALlByExample(Fornecedor example) {
        return dao.findByExamlpe(example);
    }
}
