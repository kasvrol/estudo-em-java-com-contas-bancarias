public interface IOperacoes {
    void sacar(double valor);

    void depositar(double valor);

    double verificarSaldo(double valor);

    void transferir(double valor, IConta contaDestino);
}
