/*
Criado por Gabriel Gageiro;
Data:20/04/18
*/


package App;

import banco.Conta;
import banco.ContaPoupanca;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TesteContaPoupanca {
    public static void main(String[] args) {

        String asteristico = "*************************************************";

        List<ContaPoupanca> contas = new ArrayList<>();

        contas.add(new ContaPoupanca("Gabriel gageiro", 25.00, 4873));
        contas.add(new ContaPoupanca("Marcelo ",23.00,2414 ));
        contas.add(new ContaPoupanca("Lucas claro", 21.00, 1124));

        contas.forEach(n-> System.out.println(n.toString()));

        contas.sort(
                Comparator.comparingInt(Conta::getNumero)
        );

        System.out.println(asteristico+asteristico);

        contas.forEach(n-> System.out.println(n.toString()));

    }
}
