public class Conta {
    private int numero;
    private double saldo;

    /**
     * Construtora para iniciar o número da conta e saldo zerado.
     * @param numero O número da conta.
     */
    public Conta(int numero) {
        this.numero = numero;
        this.saldo = 0.0;
    }

    /**
     * Realiza um saque na conta, se houver saldo suficiente.
     * @param valor O valor a ser sacado.
     */
    public void sacar(double valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso na conta " + this.numero);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para saque na conta " + this.numero);
        }
    }

    /**
     * Realiza um depósito na conta.
     * @param valor O valor a ser depositado.
     */
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso na conta " + this.numero);
        } else {
            System.out.println("Valor de depósito inválido para a conta " + this.numero);
        }
    }

    /**
     * Retorna o saldo atual da conta.
     * @return O saldo da conta.
     */
    public double getSaldo() {
        return this.saldo;
    }

    /**
     * Retorna o número da conta.
     * @return O número da conta.
     */
    public int getNumero() {
        return this.numero;
    }
}