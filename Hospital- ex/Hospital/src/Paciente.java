import java.util.ArrayList;
import java.util.List;

public class Paciente extends Pessoa {
    private String codigoPaciente;
    private String dataCadastro;
    private PlanoSaude planoSaude;
    private Boolean temPlanoSaude;
    private Hospital hospital;
    private List<HistoricoMedico> historicoMedico = new ArrayList<>();

    public Paciente(Integer id, String nome, String CPF, String RG, String telefone, String email, String codigoPaciente, String dataCadastro, PlanoSaude planoSaude, Boolean temPlanoSaude, Hospital hospital) {
        this.codigoPaciente = codigoPaciente;
        this.dataCadastro = dataCadastro;
        this.planoSaude = planoSaude;
        this.temPlanoSaude = temPlanoSaude;
        this.hospital = hospital;
        this.setId(id);
        this.setNome(nome);
        this.setCpf(CPF);
        this.setRg(RG);
        this.setTelefone(telefone);
        this.setEmail(email);
    }

    public void adicionarHistorico(HistoricoMedico historicoMedico){
        this.historicoMedico.add(historicoMedico);

    }

    public String getCodigoPaciente() {
        return codigoPaciente;
    }

    public void setCodigoPaciente(String codigoPaciente) {
        this.codigoPaciente = codigoPaciente;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public PlanoSaude getPlanoSaude() {
        return planoSaude;
    }

    public void setPlanoSaude(PlanoSaude planoSaude) {
        this.planoSaude = planoSaude;
    }

    public Boolean getTemPlanoSaude() {
        return temPlanoSaude;
    }

    public void setTemPlanoSaude(Boolean temPlanoSaude) {
        this.temPlanoSaude = temPlanoSaude;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public List<HistoricoMedico> getHistoricoMedico() {
        return historicoMedico;
    }

    public void setHistoricoMedico(List<HistoricoMedico> historicoMedico) {
        this.historicoMedico = historicoMedico;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "codigoPaciente='" + codigoPaciente + '\'' +
                ", dataCadastro='" + dataCadastro + '\'' +
                ", planoSaude=" + planoSaude +
                ", temPlanoSaude=" + temPlanoSaude +
                ", hospital=" + hospital +
                ", historicoMedico=" + historicoMedico +
                '}';
    }
}
