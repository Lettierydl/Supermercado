package br.com.mercadinho.model.pessoas;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Cliente extends Pessoa {

    @NotNull
    private double debito;

    @Size(min = 11, max = 11)
    @Pattern(regexp = "[0-9]*")
    private String cpf;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date dataDeNascimento;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Dependente> dependentes = new HashSet<Dependente>();
}
