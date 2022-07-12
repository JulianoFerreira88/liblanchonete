package com.github.liblanchonete.model.dao.onconsole;

import com.github.liblanchonete.model.dao.PedidoDao;
import com.github.liblanchonete.model.entities.Pedido;
import com.github.liblanchonete.model.entities.Status;
import com.github.liblanchonete.model.entities.Mensagem;
import java.util.List;

public class PedidoDaoConsole extends PedidoDao {

    @Override
    public void insert(Pedido pedido) {
        System.out.println(Mensagem.SALVO_COM_SUCESSO + pedido);
    }

    @Override
    public void delete(Pedido pedido) {
        System.out.println(Mensagem.DELETADO_COM_SUCESSO);
    }

    @Override
    public void update(Pedido pedido) {
        System.out.println(Mensagem.ATUALIZADO_COM_SUCESSO);
    }

    @Override
    public void deleteById(Integer id) {
        System.out.println(Mensagem.DELETADO_COM_SUCESSO);
    }

    @Override
    public void deleteAll() {
        System.out.println(Mensagem.DELETADO_COM_SUCESSO_TODOS);
    }

    @Override
    public List<Pedido> findALL() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Pedido> findALLByStatus(Status status) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Pedido> findByExamlpe(Pedido example) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
