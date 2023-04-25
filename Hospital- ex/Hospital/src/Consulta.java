import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Consulta {

    private LocalDate data;
    private Paciente paciente;
    private Medico medico;
    private Enfermeira enfermeira;
    private List<Procedimento> procedimentos = new ArrayList<>();
    private List<Medicamento> medicamentos = new ArrayList<>();

    public Consulta(LocalDate data, Paciente paciente, Medico medico, Enfermeira enfermeira) {
        this.data = data;
        this.paciente = paciente;
        this.medico = medico;
        this.enfermeira = enfermeira;
    }

    public void adcicionarMedicamento(Medicamento medicamento) {
        this.medicamentos.add(medicamento);
    }

    public void adicionarProcedimento(Procedimento procedimento) {
        this.procedimentos.add(procedimento);
    }

    public BigDecimal getValorTotalMedicamentos() {

        BigDecimal valorTotalMedicamentos = BigDecimal.ZERO;
        for (int x = 0; x < medicamentos.size(); x++) {

            valorTotalMedicamentos = valorTotalMedicamentos.add(medicamentos.get(x).getValor());
        }
        return valorTotalMedicamentos;
    }

    public BigDecimal getValorTotalProcedimento() {

        BigDecimal valorTotalProcedimento = BigDecimal.ZERO;
        BigDecimal valorTotalProcedimentoEnfermeiro;
        BigDecimal valorTotalProcedimentoMedico = BigDecimal.ZERO;

        for (int x = 0; x <procedimentos.size(); x++) {

            valorTotalProcedimento = valorTotalProcedimento.add(procedimentos.get(x).getValor());
        }

        valorTotalProcedimentoEnfermeiro = valorTotalProcedimento.multiply
                (BigDecimal.valueOf(enfermeira.getAcrescimoProcedimento() / 100));

        valorTotalProcedimentoMedico = valorTotalProcedimento.multiply
                (BigDecimal.valueOf(medico.getAcrescimoProcedimento() / 100));

        valorTotalProcedimento = valorTotalProcedimento.add(valorTotalProcedimentoEnfermeiro.add(valorTotalProcedimentoMedico));

        return valorTotalProcedimento;
    }

    public BigDecimal getValorTotalConsulta() {

        BigDecimal valortotalConsulta = BigDecimal.ZERO;

        if (paciente.getTemPlanoSaude() == true) {

            valortotalConsulta = getValorTotalProcedimento().add(getValorTotalMedicamentos());
            valortotalConsulta = valortotalConsulta.subtract
                    (valortotalConsulta.multiply(this.paciente.getPlanoSaude().getPercentualDesc().divide(BigDecimal.valueOf(100))));
        } else {

            valortotalConsulta = getValorTotalProcedimento().add(getValorTotalMedicamentos());

        }

        return valortotalConsulta;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Enfermeira getEnfermeira() {
        return enfermeira;
    }

    public void setEnfermeira(Enfermeira enfermeira) {
        this.enfermeira = enfermeira;
    }

    public List<Procedimento> getProcedimentos() {
        return procedimentos;
    }

    public void setProcedimentos(List<Procedimento> procedimentos) {
        this.procedimentos = procedimentos;
    }

    public List<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(List<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }

    @Override
    public String toString() {
        return "Consulta{" +
                "data=" + data +
                ", paciente=" + paciente +
                ", medico=" + medico +
                ", enfermeira=" + enfermeira +
                ", procedimentos=" + procedimentos +
                ", medicamentos=" + medicamentos +
                '}';
    }
}
