public class Iphone {
    // public static void reprodutorMusical() {
    //     System.out.println("Reproduzindo musica!");
    // }

    // public static void fazerLigação() {
    //     System.out.println("Ligando para alguém");
    // }

    // public static void navegarNaNet() {
    //     System.out.println("Navegando na internet");
    // }

    public static void main(String[] args) {
        fazerLigacao ligacao = new fazerLigacao();

        ligacao.ligar();

        fazerLigacao receberLigacao = new fazerLigacao();

        receberLigacao.atenderLigacao();

        fazerLigacao correioV = new fazerLigacao();

        correioV.iniciarCorreiodeVoz();

        reprodutorMusical tocarMusica = new reprodutorMusical();

        tocarMusica.tocarMusica();

        reprodutorMusical pausar = new reprodutorMusical();

        pausar.pausarMusica();

        reprodutorMusical mudarMusica = new reprodutorMusical();

        mudarMusica.selecionarMusica();
        
        Net exibirNet = new Net();

        exibirNet.exibirPagina();

        Net adcionarAba = new Net();

        adcionarAba.adicionarNovaAba();

        Net atualizarP = new Net();

        atualizarP.atualizarPagina();


    }
}
