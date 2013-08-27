package br.com.towl.estoque;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import org.springframework.beans.factory.annotation.Value;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import br.com.towl.pessoas.Representante;
import javax.persistence.ManyToOne;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Produto {

    /**
     */
    @NotNull
    @Column(unique = true)
    @Size(max = 13)
    private String codigoDeBarras;

    /**
     */
    @NotNull
    private String descricao;

    /**
     */
    @NotNull
    @Value("0")
    @DecimalMin("0")
    @Digits(integer = 7, fraction = 2)
    private double valorDeCompra;

    /**
     */
    @NotNull
    @Value("0")
    @Digits(integer = 7, fraction = 2)
    private double valorDeVenda;

    /**
     */
    @NotNull
    @Value("0")
    @Digits(integer = 10, fraction = 4)
    private double quantidadeEmEstoque;

    /**
     */
    @NotNull
    @Value("0")
    @Digits(integer = 10, fraction = 4)
    private double limiteMinimoEmEstoque;

    /**
     */
    @Enumerated(EnumType.STRING)
    private CategoriaProduto categoria;

    /**
     */
    @ManyToOne
    private Representante fabricante;

    /**
     */
    @OneToMany(cascade = CascadeType.ALL)
    private List<Promocao> promocoesValidas = new ArrayList<Promocao>();
}
