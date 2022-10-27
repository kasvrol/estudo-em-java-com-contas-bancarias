public abstract class Conta implements IConta {
    protected int agencia;
    protected int numeroDaConta;
    protected double saldo;

    public int getAgencia() {
        return agencia;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        // TODO Auto-generated method stub

    }

    @Override
    public void depositar(double valor) {
        // TODO Auto-generated method stub

    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        // TODO Auto-generated method stub

    }

}
