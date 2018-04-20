/*
Criado por Gabriel Gageiro;
Data:20/04/18
*/


package App;

import banco.Conta;
import banco.ContaCorrente;
import banco.ContaPoupanca;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TesteContaCorrente {

    public static void main(String[] args) {


        String asteristico = "*************************************************";

        List<ContaCorrente> contas = new ArrayList<>();

        contas.add(new ContaCorrente("Gabriel gageiro", 25.00, 4873));
        contas.add(new ContaCorrente("Marcelo milioli",23.00,2414 ));
        contas.add(new ContaCorrente("Lucas claro", 21.00, 1124));

        exibirConta(contas);

        contas.sort(
                Comparator.comparingInt(Conta::getNumero)
        );

        System.out.println(asteristico+asteristico);

        exibirConta(contas);

    }

    static void exibirConta(List<ContaCorrente> contas){
        contas.forEach(n-> System.out.println(n.toString()));

    }
}
