package one.digitalinnovation.desafio.service.impl;

import one.digitalinnovation.desafio.model.Cliente;
import one.digitalinnovation.desafio.model.ClienteRepository;
import one.digitalinnovation.desafio.model.DadosCadastrais;
import one.digitalinnovation.desafio.model.DadosCadastraisRepository;
import one.digitalinnovation.desafio.service.ClienteService;
import one.digitalinnovation.desafio.service.ReceitaWs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {
    // Singleton: Injetar os componentes do Spring com @Autowired.
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private DadosCadastraisRepository dadosCadastraisRepository;
    @Autowired
    private ReceitaWs receitaWs;

    // Strategy: Implementar os métodos definidos na interface.
    // Facade: Abstrair integrações com subsistemas, provendo uma interface simples.
    @Override
    public Iterable<Cliente> buscarTodos() {
        // Buscar todos os Clientes.
        return clienteRepository.findAll();
    }
    @Override
    public Cliente buscarPorId(Long id) {
        // Buscar Cliente por ID.
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.get();
    }
    @Override
    public void inserir(Cliente cliente) {
        salvarClienteComCnpj(cliente);
    }
    @Override
    public void deletar(Long id) {
        // Deletar Cliente por ID.
        clienteRepository.deleteById(id);
    }
    private void salvarClienteComCnpj(Cliente cliente) {
        // Verificar se o CNPJ do Cliente já existe (pelo CNPJ).
        String cnpj = cliente.getDados().getCnpj();
        DadosCadastrais dadosCadastrais = dadosCadastraisRepository.findById(cnpj).orElseGet(() -> {
            // Caso não exista, integrar com o ReceitaWs e persistir o retorno.
            DadosCadastrais novoDadosCadastrais = receitaWs.consultarCnpj(cnpj);
            dadosCadastraisRepository.save(novoDadosCadastrais);
            return novoDadosCadastrais;
        });
        cliente.setDados(dadosCadastrais);
        // Inserir Cliente, vinculando os Dados (novo ou existente).
        clienteRepository.save(cliente);
    }
}
