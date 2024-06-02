package Desafio_Banco;

public class Main {
    public static void main(String[] args) {
        Cliente nicolas = new Cliente();
        nicolas.setNome("Nicolas");

        Conta contaCorrente = new ContaCorrente(nicolas);
        Conta contaPoupanca = new ContaPoupanca(nicolas);

        contaCorrente.depositar(22);
        contaCorrente.sacar(2);
        contaCorrente.imprimirExtrato();


        contaCorrente.transferir(10,contaPoupanca);

        contaPoupanca.imprimirExtrato();

    }
}
