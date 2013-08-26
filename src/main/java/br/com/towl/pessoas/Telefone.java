package br.com.towl.pessoas;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import javax.validation.constraints.NotNull;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.Size;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Telefone {

    /**
     */
    @Size(min = 2, max = 3)
    private String ddd;

    /**
     */
    @NotNull
    @Size(min = 8, max = 9)
    private String telefone;

    /**
     */
    @Size(min = 2)
    private String operadora;
}
