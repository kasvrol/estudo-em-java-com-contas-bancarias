public interface IConta {
    String cliente(String nome);

    String banco(String nome);

    void depositar(double valor);
}
