public class Pagamento {
    private double valor;
    private String metodo;

    public Pagamento(double valor, String metodo) {
        this.valor = valor;
        this.metodo = metodo;
    }

    public void registrarPagamento() {
        System.out.println("Pagamento de R$" + valor + " registrado com " + metodo);
    }
}
