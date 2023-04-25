public class Enfermeira extends FuncionarioHospital {

    private String especialidade;
    private String corean;
    private String formacao;
    private String instituicao;

    public Enfermeira(Integer id,String nome, String CPF, String RG, String telefone, String email, String cracha, String horario,
                      Hospital hospital, String especialidade, String corean, String formacao, String instituicao) {
        this.especialidade = especialidade;
        this.corean = corean;
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
        return 5.00;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getCorean() {
        return corean;
    }

    public void setCorean(String corean) {
        this.corean = corean;
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
        return "Enfermeira{" +
                "especialidade='" + especialidade + '\'' +
                ", corean='" + corean + '\'' +
                ", formacao='" + formacao + '\'' +
                ", instituicao='" + instituicao + '\'' +
                '}';
    }
}
