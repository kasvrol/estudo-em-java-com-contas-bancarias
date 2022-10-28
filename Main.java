public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();

        ContaPoupanca contaPoupanca = new ContaPoupanca();

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();
    }
}
