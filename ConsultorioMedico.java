import java.util.ArrayList;
import java.util.List;

public class ConsultorioMedico {
    private List<Paciente> pacientes = new ArrayList<>();
    private List<Medico> medicos = new ArrayList<>();
    private List<Consulta> consultas = new ArrayList<>();

    public void cadastrarPaciente(String nome, String email) {
        Paciente paciente = new Paciente(nome, email);
        pacientes.add(paciente);
        System.out.println("Paciente " + nome + " cadastrado.");
    }

    public void cadastrarMedico(String nome, String especialidade) {
        Medico medico = new Medico(nome, especialidade);
        medicos.add(medico);
        System.out.println("Médico " + nome + " cadastrado.");
    }

    public Consulta agendarConsulta(String nomePaciente, String nomeMedico, String data) {
        Paciente paciente = buscarPaciente(nomePaciente);
        Medico medico = buscarMedico(nomeMedico);

        if (paciente != null && medico != null) {
            Consulta consulta = new Consulta(paciente, medico, data);
            consultas.add(consulta);
            enviarNotificacaoEmail(paciente.getEmail(), "Consulta agendada com Dr. " + medico.getNome() + " em " + data);
            return consulta;
        } else {
            System.out.println("Paciente ou médico não encontrado.");
            return null;
        }
    }

    public void enviarNotificacaoEmail(String email, String mensagem) {
        System.out.println("Notificação enviada para " + email + ": " + mensagem);
    }

    public void adicionarObservacaoProntuario(String nomePaciente, String observacao) {
        Paciente paciente = buscarPaciente(nomePaciente);
        if (paciente != null) {
            paciente.adicionarObservacao(observacao);
            System.out.println("Observação adicionada ao prontuário de " + paciente.getNome());
        } else {
            System.out.println("Paciente não encontrado.");
        }
    }

    public void emitirReceita(Consulta consulta, String receita) {
        consulta.emitirReceita(receita);
    }

    public void registrarFeedback(Consulta consulta, String feedback) {
        consulta.registrarFeedback(feedback);
    }

    public void registrarPagamento(double valor, String metodo) {
        Pagamento pagamento = new Pagamento(valor, metodo);
        pagamento.registrarPagamento();
    }

    private Paciente buscarPaciente(String nome) {
        for (Paciente paciente : pacientes) {
            if (paciente.getNome().equals(nome)) {
                return paciente;
            }
        }
        return null;
    }

    private Medico buscarMedico(String nome) {
        for (Medico medico : medicos) {
            if (medico.getNome().equals(nome)) {
                return medico;
            }
        }
        return null;
    }
}
