public class Medico extends FuncionarioHospital {

    private String especialidade;
    private String CRM;
    private String formacao;
    private String instituicao;



    public Medico(Integer id,String nome, String CPF, String RG, String telefone, String email, String cracha, String horario,
                  Hospital hospital,String especialidade, String CRM, String formacao, String instituicao) {
        this.especialidade = especialidade;
        this.CRM = CRM;
        this.formacao = formacao;
        this.instituicao = instituicao;
        this.setId(id);
        this.setNome(nome);
        this.setCpf(CPF);
        this.setRg(RG);
        this.setTelefone(telefone);
        this.setEmail(email);
        this.setCracha(cracha);
        this.setHorario(horario);
        this.setHospital(hospital);

    }

    @Override
    public Double getAcrescimoProcedimento() {
        return 15.00;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getCRM() {
        return CRM;
    }

    public void setCRM(String CRM) {
        this.CRM = CRM;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "especialidade='" + especialidade + '\'' +
                ", CRM='" + CRM + '\'' +
                ", formacao='" + formacao + '\'' +
                ", instituicao='" + instituicao + '\'' +
                '}';
    }
}
