/*
Criado por Gabriel Gageiro;
Data:20/04/18
*/


package banco;

public class ContaCorrente extends Conta implements Comparable<ContaCorrente> {

    public ContaCorrente(String titular,Double saldo,int numero){
        super(titular, saldo, numero);
    }

    @Override
    public int compareTo(ContaCorrente o) {
        if (this.getNumero() < o.getNumero())
            return -1;
        else if (this.getNumero() > o.getNumero())
            return 1;
        return 0;
    }

}
