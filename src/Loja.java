public class Loja {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();

        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.selecionarMusica("DNA - Kendrick Lamar\n");

        meuIphone.ligar("9990222");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        meuIphone.exibirPagina("github.com/NicolasKonishi");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
