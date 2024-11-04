public class Consulta {
    private Paciente paciente;
    private Medico medico;
    private String data;
    private String receita;
    private String feedback;

    public Consulta(Paciente paciente, Medico medico, String data) {
        this.paciente = paciente;
        this.medico = medico;
        this.data = data;
        this.receita = "";
        this.feedback = "";
    }

    public void emitirReceita(String receita) {
        this.receita = receita;
        System.out.println("Receita emitida para " + paciente.getNome() + ": " + receita);
    }

    public void registrarFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getDetalhes() {
        return "Consulta com " + medico.getNome() + " em " + data + "\nReceita: " + receita + "\nFeedback: " + feedback;
    }
}
