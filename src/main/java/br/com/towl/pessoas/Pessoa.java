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
    String nome = null;

    /**
     */
    @OneToMany(cascade = CascadeType.ALL)
    List<Telefone> telefones = new ArrayList<Telefone>();

    /**
     */
    @OneToOne
    Endereco endereco = null;
}
