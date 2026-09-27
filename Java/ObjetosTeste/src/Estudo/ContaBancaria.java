package Estudo;

public class ContaBancaria {
    private int numeroConta;
    private String titular;
    private Double saldo = 0.0;
    private Double divida = 0.0;

    public ContaBancaria(String titular) {
        this.titular = titular;
    }
    public void setNumeroConta(int numero){
        if(numero != 0 && numero > 0) {
            this.numeroConta = numero;
        }
    }
    public int getNumeroConta(){
        return this.numeroConta;
    }

    public String getTitular() {
        return this.titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public double getDivida() {
        return this.divida;
    }

    public String depositar(Double valor) {
        if (valor > 0) {
            this.saldo = this.saldo + valor;
            devendo();
        }
        String resultado = "Deposite um valor valido";
        return resultado;
    }

    public void sacar(Double valor) {
        if (saldo >= valor) {
            saldo = saldo - valor;

        } else if (valor > saldo) {
            divida = valor - saldo;
            saldo = 0.0;
        }
    }

    private void devendo() {
        if (saldo > 0 && divida > 0) {

            if (saldo >= divida) {
                saldo = saldo - divida;
                this.divida = 0.0;

            } else {
                divida = divida - saldo;
                saldo = 0.0;
            }
        }
    }
}


