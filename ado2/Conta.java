
package ado2;

public class Conta {
    private int numero;
    private double saldo;
    private double limite;
    private String nome;

    public Conta(int numero, double saldo, double limite, String nome) {
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
        this.nome = nome;
    }

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean depositar(double valor) {
        if (valor > 0 && valor <= (limite - saldo)) {
            saldo += valor;
            return true;
        }
        return false;
    }

    public String toString() {
        return "Conta numero: " + numero +", Saldo Atual: R$" + saldo +", Limite: R$" + limite +", Titular da conta: '" + nome + "'\n";
    }

    public int getNumero() {
        return numero;
    }
}
