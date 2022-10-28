public abstract class Conta implements IConta, IOperacoes {
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numeroDaConta;
    protected double saldo;
    protected String banco;
    protected String cliente;

    public Conta() {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numeroDaConta = SEQUENCIAL++;
    }

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
    public String cliente(String nome) {
        return cliente = nome;
    }

    @Override
    public String banco(String nome) {
        return banco = nome;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;

    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;

    }

    @Override
    public double verificarSaldo(double valor) {
        return getSaldo();

    }

    @Override
    public void transferir(double valor, final IConta contaDestino) {
        saldo -= valor;
        contaDestino.depositar(valor);
    }

    protected void informacoesDaConta() {
        System.out.println("Cliente: " + this.cliente);
        System.out.println("Banco: " + this.banco);
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Número: %d", this.numeroDaConta));
        System.out.println(String.format("Saldo atual da conta: %2f", this.saldo));
    }
}
