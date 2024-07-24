public abstract class Conta {
    protected String numeroConta;
    protected double saldo;

    public Conta(String numeroConta, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    // Método abstrato para saque
    public abstract boolean sacar(double valor);

    // Método para depósito
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
    }

    // Método para transferência entre contas do mesmo banco
    public boolean transferir(Conta destino, double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            destino.depositar(valor);
            System.out.println("Transferência de R$" + valor + " realizada com sucesso para a conta " + destino.getNumeroConta());
            return true;
        } else {
            System.out.println("Saldo insuficiente para transferência de R$" + valor);
            return false;
        }
    }
}
