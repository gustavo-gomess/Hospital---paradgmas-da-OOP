import java.time.LocalDate;

public class HistoricoMedico {


    private String descricao;
    private LocalDate dataHistorico;

    public HistoricoMedico(String descricao, LocalDate dataHistorico) {
        this.descricao = descricao;
        this.dataHistorico = dataHistorico;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataHistorico() {
        return dataHistorico;
    }

    public void setDataHistorico(LocalDate dataHistorico) {
        this.dataHistorico = dataHistorico;
    }

    @Override
    public String toString() {
        return "HistoricoMedico{" +
                "descricao='" + descricao + '\'' +
                ", dataHistorico=" + dataHistorico +
                '}';
    }
}
