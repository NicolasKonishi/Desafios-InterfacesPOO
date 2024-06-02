package Desafio_Banco;

public class Main {
    public static void main(String[] args) {
        Cliente nicolas = new Cliente();
        nicolas.setNome("Nicolas");

        ContaCorrente contaCorrente = new ContaCorrente(nicolas);
        ContaPoupanca contaPoupanca = new ContaPoupanca(nicolas);

        contaCorrente.depositar(22);
        contaCorrente.sacar(2);
        contaCorrente.imprimirExtrato();

        contaCorrente.transferir(7, contaPoupanca);

        contaPoupanca.imprimirExtrato();

        Banco banco = new Banco();
        banco.adicionarConta(contaCorrente);
        banco.adicionarConta(contaPoupanca);

        banco.exibirContas();
    }
}
