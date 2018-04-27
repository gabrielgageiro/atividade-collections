/*
Criado por Gabriel Gageiro;
Data:20/04/18
*/


package App;

import banco.Banco;
import banco.ContaCorrente;
import banco.ContaPoupanca;

import java.util.NoSuchElementException;

public class TesteBanco {
    public static void main(String[] args) {

        Banco banco1 = new Banco("Caixa - Criciuma");
        Banco banco2 = new Banco("Caixa - meleiro");

        System.out.println("BANCO 1");

        banco1.adiciona(new ContaCorrente("Maria", 500.50, 15));
        banco1.adiciona(new ContaPoupanca("Paulo",340.00,4));
        banco1.adiciona(new ContaCorrente("Pedro", 4550.50, 9));

        banco1.imprimirListagemContas();

        System.out.println("BANCO 2");
        banco2.adiciona(new ContaCorrente("Maria", 500.50, 15));
        banco2.adiciona(new ContaPoupanca("Paulo",340.00,4));
        banco2.adiciona(new ContaCorrente("Pedro", 4550.50, 9));

        banco2.fecharConta(15);

        banco2.imprimirListagemContas();
        System.out.println("BANCO 1 AGORA:");
        banco1.imprimirListagemContas();


    }
}
