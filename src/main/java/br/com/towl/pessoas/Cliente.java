package br.com.towl.pessoas;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.OneToOne;
import javax.validation.constraints.Digits;
import java.util.Calendar;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(finders = { "findClientesByCpfEquals", "findClientesByCpfLike", "findClientesByDataDeNascimentoBetween", "findClientesByNomeEquals", "findClientesByNomeLike" })
public class Cliente {

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
    @NotNull
    @Digits(integer = 7, fraction = 2)
    private double debito;

    /**
     */
    @Size(min = 11, max = 14)
    private String cpf;

    /**
     */
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Calendar dataDeNascimento;

    /**
     */
    @OneToMany(cascade = CascadeType.ALL)
    private List<Dependente> dependentes = new ArrayList<Dependente>();

    /**
     */
    @OneToMany(cascade = CascadeType.ALL)
    private List<Telefone> telefones = new ArrayList<Telefone>();
}
