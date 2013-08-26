package br.com.towl.pessoas;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

public interface Pessoa {

    /**
     */
    @NotNull
    @Size(min = 2)
    private String nome;

    /**
     */
    @OneToMany(cascade = CascadeType.ALL)
    private List<Telefone> telefones = new ArrayList<Telefone>();

    /**
     */
    @OneToOne
    private Endereco endereco;
}
