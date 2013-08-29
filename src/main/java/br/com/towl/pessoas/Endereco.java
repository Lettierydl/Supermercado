package br.com.towl.pessoas;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Endereco {

    /**
     */
    @NotNull
    @Size(min = 2)
    private String rua;

    /**
     */
    @Size(min = 1, max = 10)
    private String numero;

    /**
     */
    @Size(min = 2)
    private String bairro;

    /**
     */
    @Size(min = 2)
    private String cidade;

    /**
     */
    @Size(min = 8, max = 9)
    private String cep;

    /**
     */
    @Enumerated(EnumType.STRING)
    private UF uf;
}
