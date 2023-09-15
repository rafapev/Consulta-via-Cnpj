package one.digitalinnovation.desafio.model;

import javax.persistence.*;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    private DadosCadastrais dadosCadastrais;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DadosCadastrais getDados() {
        return dadosCadastrais;
    }

    public void setDados(DadosCadastrais dadosCadastrais) {
        this.dadosCadastrais = dadosCadastrais;
    }
}
