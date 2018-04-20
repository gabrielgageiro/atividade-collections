/*
Criado por Gabriel Gageiro;
Data:20/04/18
*/


package banco;

public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca> {

    public ContaPoupanca(String titular,Double saldo,int numero){
        super(titular, saldo, numero);
    }
    @Override
    public int compareTo(ContaPoupanca o) {
        if (this.getSaldo() < o.getSaldo()) {
            return -1;
        }
        if (this.getSaldo() > o.getSaldo()) {
            return 1;
        }
        if (this.getTitular().equals(o.getTitular()))
            return -1;
        else
            return 1;

    }
/*
    @Override
    public String toString() {
        return "Titular: " + getTitular()+"\t"+ "Numero da conta: "+getNumero()+"\t" + "Saldo:" + getSaldo();
    }*/
}

