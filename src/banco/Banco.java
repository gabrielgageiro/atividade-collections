/*
Criado por Gabriel Gageiro;
Data:20/04/18
*/


package banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contas = new ArrayList<>();

    public Banco(String nome) {
        this.nome = nome;
    }


    public void adiciona(Conta c) {
        contas.add(c);
    }

    public Conta getConta(int numero) {

        return contas.stream().filter((c) -> c.getNumero() == numero).findFirst().get();
    }

    public void fecharConta(Conta conta) {
        if (verificarConta(conta)) {
            contas.remove(conta);
            statusRemocao(1);
        } else
            statusRemocao(0);
    }

    private boolean verificarConta(Conta c ){
        return contas.contains(c);
    }

    private void statusRemocao(int c) {

        if (c==1)
            System.out.println("Conta removida!");
        else
            System.err.println("Conta inexistente!");

    }

    public void fecharConta(Integer numero) {
        contas.forEach(c -> {
            if (c.getNumero() == numero) {
                contas.remove(c);
                statusRemocao(1);

                return;
            }
        });
        statusRemocao(0);
    }

    public Double getSaldoContas() {
        return contas.stream().mapToDouble(c -> c.getSaldo()).sum();
    }

    public int getNumeroContas() {
        return contas.size();
    }

    public void imprimirListagemContas() {
        contas.forEach(System.out::println);
    }

}
