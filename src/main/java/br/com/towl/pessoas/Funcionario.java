package br.com.towl.pessoas;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.OneToOne;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(finders = { "findFuncionariosByCpfEquals", "findFuncionariosByCpfLike", "findFuncionariosByNomeEquals", "findFuncionariosByNomeLike", "findFuncionariosByTipoDeFuncionario" })
public class Funcionario {

    /**
     */
    @NotNull
    @Size(min = 2)
    private String nome;

    /**
     */
    @OneToOne
    private Endereco endereco;

    /**
     */
    private String senha;

    /**
     */
    @NotNull
    @Enumerated(EnumType.STRING)
    private TipoDeFuncionario tipoDeFuncionario;

    /**
     */
    @Size(min = 11, max = 14)
    private String cpf;

    /**
     */
    @OneToMany(cascade = CascadeType.ALL)
    private List<Telefone> telefones = new ArrayList<Telefone>();
}
