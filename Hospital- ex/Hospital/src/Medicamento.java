import java.math.BigDecimal;

public class Medicamento {

    private String descricao;
    private BigDecimal valor;


    public Medicamento(String descricao, BigDecimal valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Medicamento{" +
                "descricao='" + descricao + '\'' +
                ", valor=" + valor +
                '}';
    }
}
