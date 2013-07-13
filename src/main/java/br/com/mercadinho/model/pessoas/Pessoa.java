package br.com.mercadinho.model.pessoas;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public abstract class Pessoa {

    @NotNull
    @Size(min = 2)
    @Pattern(regexp = "[a-z]*")
    private String nome;

    @ManyToOne
    private Endereco endereco;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Telefone> telefones = new HashSet<Telefone>();
}
