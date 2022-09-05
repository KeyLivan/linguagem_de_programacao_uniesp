package banco;

public class ContaCorrente {
    private int nConta;
    private double saldo;

    public void depositar(double valorDeposito) {
        saldo = saldo + valorDeposito;
    }

    public void saque (double valorSaque){
        if (valorSaque <= saldo) {
            saldo = saldo - valorSaque;
        } else {
            System.out.println("Valores precisam ser maior que zero!");
        }
    }

    public int getnConta() {
        return nConta;
    }

    public void setnConta(int nConta) {
        this.nConta = nConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


}

