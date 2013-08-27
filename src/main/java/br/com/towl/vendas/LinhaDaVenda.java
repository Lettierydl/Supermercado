package br.com.towl.vendas;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import br.com.towl.estoque.Produto;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Digits;
import org.springframework.beans.factory.annotation.Value;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class LinhaDaVenda {

    /**
     */
    @NotNull
    @ManyToOne
    private Produto produto;

    /**
     */
    @NotNull
    @Value("0")
    @Digits(integer = 10, fraction = 3)
    private double quantidadeVendida;

    /**
     */
    @NotNull
    @Value("0")
    @Digits(integer = 10, fraction = 3)
    private double valorDoDesconto;

    /**
     * Valor que o produto foi vendido quando aconteceu a venda
     */
    @NotNull
    @Value("0")
    @Digits(integer = 10, fraction = 3)
    private double valorDoProdutoVendido;

    /**
     * Este valor serve apenas para demostracao na GUI
     */
    private double valorTotalDaLinhaSemDesconto;

    /**
     * Este valor serve apenas para demostracao na GUI
     */
    private double valorTotalDaLinhaComDesconto;
}
