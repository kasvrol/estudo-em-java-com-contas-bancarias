public class Conta {
    private int agencia;
    private int numeroDaConta;
    private double saldo;

    public int getAgencia() {
        return agencia;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) {
        double novoSaldo = getSaldo() - valor;
        System.out.println(novoSaldo);
    }

    public void depositar(double valor) {
        double novoSaldo = getSaldo() + valor;
        System.out.println(novoSaldo);
    }

    public void transferir(double valor) {
        double novoSaldo = getSaldo() - valor;
        System.out.println(novoSaldo);
    }
}
