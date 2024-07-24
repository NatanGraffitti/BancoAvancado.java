public class ContaPoupanca extends Conta {
    private double limiteSaque;

    public ContaPoupanca(String numeroConta, double saldoInicial, double limiteSaque) {
        super(numeroConta, saldoInicial);
        this.limiteSaque = limiteSaque;
    }

    @Override
    public boolean sacar(double valor) {
        if (saldo >= valor && valor <= limiteSaque) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
            return true;
        } else if (valor > limiteSaque) {
            System.out.println("Valor de saque excede o limite diário de R$" + limiteSaque);
            return false;
        } else {
            System.out.println("Saldo insuficiente para saque de R$" + valor);
            return false;
        }
    }
}
