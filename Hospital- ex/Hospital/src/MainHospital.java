import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.PrimitiveIterator;

public class MainHospital {
    public static void main(String[] args) {

        Hospital hospital = new Hospital("Lalala","rua tal","85959959");

        PlanoSaude planoSaude = new PlanoSaude("hOSPITEL dos DEDE","PO", BigDecimal.valueOf(10));

        Paciente paciente = new Paciente(2,"Jose","091","543","81451","jose@","1",
                                            "10/02/2050",planoSaude,true,hospital);
        HistoricoMedico historicoMedico =  new HistoricoMedico("sdauydgasd", LocalDate.now());
        paciente.adicionarHistorico(historicoMedico);

        Medico medico = new Medico(5,"sdfsdfsdf","091","543","81451","jose@","1","8",hospital,"cantar","6565656",
                                        "UFC","lalala");

        Enfermeira enfermeira =  new Enfermeira(5,"sdfsdfsdf","091","543","81451","jose@","1","8",hospital,"correr",
                                                    "apsdkoashdia","oolhar","UFC");

        Consulta consulta = new Consulta(LocalDate.now(),paciente,medico,enfermeira);

        Procedimento procedimento = new Procedimento("andar",BigDecimal.valueOf(300));
        Procedimento procedimento1 = new Procedimento("hello",BigDecimal.valueOf(700));
        Medicamento medicamento =  new Medicamento("paracetamol",BigDecimal.valueOf(150));
        Medicamento medicamento1 =  new Medicamento("paracetamol",BigDecimal.valueOf(200));

        consulta.adcicionarMedicamento(medicamento);
        consulta.adcicionarMedicamento(medicamento1);
        consulta.adicionarProcedimento(procedimento);
        consulta.adicionarProcedimento(procedimento1);

        System.out.println(consulta.getValorTotalConsulta());



    }
}
