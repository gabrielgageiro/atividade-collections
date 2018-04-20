/*
Criado por Gabriel Gageiro;
Data:20/04/18
*/


package App;

import banco.Banco;
import banco.Conta;
import banco.ContaCorrente;

import java.util.NoSuchElementException;

public class TesteBanco {
    public static void main(String[] args) {

        Banco banco1 = new Banco("Caixa - Criciuma");
        Banco banco2 = new Banco("Caixa - meleiro");

        banco1.adiciona(new ContaCorrente("eu", 25.00, 123));
        banco1.adiciona(new ContaCorrente("dsad", 3210.00, 2131));

        try {
            System.out.println(banco1.getConta(123));
        } catch (NoSuchElementException e1) {
            System.out.println("Numero invalido");
        }
    }
}
