public class Main {
    public static void main(String[] args) {
        ConsultorioMedico consultorio = new ConsultorioMedico();

        // Cadastrar pacientes e médicos
        consultorio.cadastrarPaciente("João", "joao@gmail.com");
        consultorio.cadastrarMedico("Dra. Ana", "Cardiologia");

        // Agendar consulta e manipular dados de consulta e pagamento
        Consulta consulta = consultorio.agendarConsulta("João", "Dra. Ana", "10/11/2024");

        if (consulta != null) {
            // Adicionar observação e emitir receita
            consultorio.adicionarObservacaoProntuario("João", "Paciente com pressão alta.");
            consultorio.emitirReceita(consulta, "Tomar medicamento X duas vezes ao dia");

            // Registrar feedback e pagamento
            consultorio.registrarFeedback(consulta, "Muito satisfeito com o atendimento");
            consultorio.registrarPagamento(250.0, "Cartão de Crédito");
        }
    }
}
