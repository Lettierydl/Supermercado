package br.com.towl.pessoas;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Funcionario implements Pessoa {

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
}
