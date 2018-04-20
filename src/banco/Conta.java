/*
Criado por Gabriel Gageiro;
Data:20/04/18
*/


package banco;


public class Conta {

    private String titular;
    private Double saldo;
    private Integer numero;

    public Conta(String titular,Double saldo,int numero){
        this.titular=titular;
        this.saldo = saldo;
        this.numero = numero;
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }


    @Override
    public String toString() {
        return "Titular: " + getTitular()+"\t"+ "Numero da conta: "+getNumero()+"\t" + "Saldo:" + getSaldo();
    }
}
