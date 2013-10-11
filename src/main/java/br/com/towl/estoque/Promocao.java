package br.com.towl.estoque;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import java.util.Calendar;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Promocao {

    /**
     */
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Calendar dataDeInicio;

    /**
     */
    @DecimalMin("0")
    @Digits(integer = 7, fraction = 2)
    private double valorDoDesconto;

    /**
     */
    private double quantidadeMaximaDeVendas;

    /**
     */
    private double quantidadeJaVendida;
}
