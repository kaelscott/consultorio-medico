public class Paciente {
    private String nome;
    private String email;
    private String prontuario;

    public Paciente(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.prontuario = "";
    }

    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public String getProntuario() { return prontuario; }

    public void adicionarObservacao(String observacao) {
        prontuario += observacao + "\n";
    }
}
