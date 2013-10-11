package br.com.towl.pessoas;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.OneToOne;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(finders = { "findRepresentantesByNomeEquals", "findRepresentantesByNomeLike", "findRepresentantesByRazaoSocialDaEmpresaEquals", "findRepresentantesByRazaoSocialDaEmpresaLike" })
public class Representante {

    /**
     */
    @NotNull
    @Size(min = 2)
    private String razaoSocialDaEmpresa;

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
    @OneToMany(cascade = CascadeType.ALL)
    private List<Telefone> telefones = new ArrayList<Telefone>();
}
