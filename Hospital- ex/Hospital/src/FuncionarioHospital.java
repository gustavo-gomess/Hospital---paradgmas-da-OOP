public class FuncionarioHospital extends Pessoa {
    private String cracha;
    private String horario;
    private Hospital hospital;

    public Double getAcrescimoProcedimento(){
        return 0.00;
    }

    public String getCracha() {
        return cracha;
    }

    public void setCracha(String cracha) {
        this.cracha = cracha;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

}
