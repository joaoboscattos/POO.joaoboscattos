public class Atividade05_06 {

    private double saldo;
    private String numeroConta;

    public Atividade05_06(String numeroConta) {
        this.numeroConta = numeroConta;
        this.saldo = 0.0; /* Saldo inicial é zero*/
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("valor inválido para depósito.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("saldo insuficiente para realizar o saque ou valor inválido.");
        }
    }

    public double consultarSaldo() {
        return this.saldo;
    }

    public void exibirInfo() {
        System.out.println("numero da Conta: " + numeroConta);
        System.out.println("saldo: R$" + saldo);
    }

    public static void main(String[] args) {
        Atividade05_06 conta = new Atividade05_06("35789-7");

        System.out.println("informações da Conta:");
        conta.exibirInfo();

        conta.depositar(2000.0);
        conta.sacar(1500.0);

        System.out.println("\nsaldo Atualizado:");
        System.out.println("saldo: R$" + conta.consultarSaldo());
    }
}
