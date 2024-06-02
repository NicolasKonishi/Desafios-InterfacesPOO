package Desafio_Banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    public List<Conta> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

    public void exibirContas() {
        for (Conta conta : contas) {
            conta.imprimirExtrato();
        }
        System.out.println("\n------------Total de contas: ----------------\n" + contas.size());
    }

    public void adicionarConta(Conta conta) {
        this.contas.add(conta);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
