public class App {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();

        // Reprodutor Musical
        iphone.selecionarMusica();
        iphone.tocar();
        iphone.pausar();

        //Aparelho Telefonico
        iphone.atender();
        iphone.ligar();
        iphone.iniciarCorreioVoz();

        //Navegador de Internet
        iphone.adicionarNovaAba();
        iphone.exibirPagina();
        iphone.atualizarPagina();
    }
}
