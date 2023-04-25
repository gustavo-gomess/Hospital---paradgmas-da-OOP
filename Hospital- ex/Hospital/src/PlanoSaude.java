import java.math.BigDecimal;

public class PlanoSaude {
    private String descricao;
    private String nomeOperadora;
    private BigDecimal percentualDesc;

    public PlanoSaude(String descricao, String nomeOperadora, BigDecimal percentualDesc) {
        this.descricao = descricao;
        this.nomeOperadora = nomeOperadora;
        this.percentualDesc = percentualDesc;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNomeOperadora() {
        return nomeOperadora;
    }

    public void setNomeOperadora(String nomeOperadora) {
        this.nomeOperadora = nomeOperadora;
    }

    public BigDecimal getPercentualDesc() {
        return percentualDesc;
    }

    public void setPercentualDesc(BigDecimal percentualDesc) {
        this.percentualDesc = percentualDesc;
    }
}
