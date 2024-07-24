public class ContaCorrente extends Conta {
    private double taxaManutencao;

    public ContaCorrente(String numeroConta, double saldoInicial, double taxaManutencao) {
        super(numeroConta, saldoInicial);
        this.taxaManutencao = taxaManutencao;
    }

    @Override
    public boolean sacar(double valor) {
        double valorASacar = valor + taxaManutencao;
        if (saldo >= valorASacar) {
            saldo -= valorASacar;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
            return true;
        } else {
            System.out.println("Saldo insuficiente para saque de R$" + valor);
            return false;
        }
    }
}
