package one.digitalinnovation.desafio.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DadosCadastraisRepository extends CrudRepository<DadosCadastrais, String> {
}
