package one.digitalinnovation.desafio.service;

import one.digitalinnovation.desafio.model.DadosCadastrais;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "receitaWs", url = "https://receitaws.com.br/v1/cnpj")
public interface ReceitaWs {
    @GetMapping("/{cnpj}")
    DadosCadastrais consultarCnpj(@PathVariable("cnpj") String cnpj);
}
