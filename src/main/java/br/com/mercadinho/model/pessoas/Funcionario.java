package br.com.mercadinho.model.pessoas;

import br.com.mercadinho.model.enums.TipoDeFuncionario;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Funcionario extends Pessoa {

    @NotNull
    @Size(min = 3)
    private String senha;

    @Enumerated
    private TipoDeFuncionario tipo;

    @NotNull
    @Column(unique = true)
    @Size(min = 11, max = 11)
    @Pattern(regexp = "[0-9]*")
    private String cpf;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Registro> registros = new HashSet<Registro>();
}
