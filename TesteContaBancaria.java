public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente("12345-6", 1000.0, 10.0);
        ContaPoupanca contaPoupanca = new ContaPoupanca("54321-0", 500.0, 200.0);

        // Testando depósito
        contaCorrente.depositar(500.0);
        contaPoupanca.depositar(300.0);

        // Testando saque
        contaCorrente.sacar(200.0);
        contaPoupanca.sacar(100.0);

        // Testando transferência
        contaCorrente.transferir(contaPoupanca, 300.0);
    }
}
