package br.com.mercadinho.model.pessoas;

import javax.validation.constraints.Size;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Representante extends Pessoa {

    @Size(min = 2)
    private String razaoSocialDaEmpresa;
}
