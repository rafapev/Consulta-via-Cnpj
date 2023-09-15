package one.digitalinnovation.desafio.service;

import one.digitalinnovation.desafio.model.Cliente;

public interface ClienteService {
    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void deletar(Long id);
}
