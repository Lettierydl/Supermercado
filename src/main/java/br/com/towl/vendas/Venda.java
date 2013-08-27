package br.com.towl.vendas;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import java.util.Calendar;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;
import br.com.towl.pessoas.Funcionario;
import javax.persistence.ManyToOne;
import br.com.towl.pessoas.Cliente;
import br.com.towl.pessoas.Dependente;
import javax.validation.constraints.Digits;
import org.springframework.beans.factory.annotation.Value;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

@RooJavaBean
@RooToString
@RooJpaActiveRecord(finders = { "findVendasByCliente", "findVendasByDiaBetween", "findVendasByDiaGreaterThanEquals", "findVendasByFormaDePagamento", "findVendasByFuncionario" })
public class Venda {

    /**
     */
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(pattern = "dd-MM-yyyy hh:mm:ss")
    private Calendar dia;

    /**
     */
    @ManyToOne
    private Funcionario funcionario;

    /**
     */
    @ManyToOne
    private Cliente cliente;

    /**
     */
    @ManyToOne
    private Dependente dependente;

    /**
     */
    @Value("0")
    @Digits(integer = 7, fraction = 2)
    private double valorTotalDeDesconto;

    /**
     */
    @Value("0")
    @Digits(integer = 7, fraction = 2)
    private double valorTotalDaVendaComDesconto;

    /**
     */
    @Value("0")
    @Digits(integer = 7, fraction = 2)
    private double valorTotalDaVendaSemDesconto;

    /**
     */
    @Enumerated(EnumType.STRING)
    private FormaDePagamento formaDePagamento;

    /**
     */
    @OneToMany(cascade = CascadeType.ALL)
    private List<LinhaDaVenda> linhasDaVenda = new ArrayList<LinhaDaVenda>();
}
