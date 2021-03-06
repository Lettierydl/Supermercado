package br.com.towl.pessoas;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(finders = { "findDependentesByNomeEquals", "findDependentesByNomeLike" })
public class Dependente {

    /**
     */
    @NotNull
    private String nome;
}
