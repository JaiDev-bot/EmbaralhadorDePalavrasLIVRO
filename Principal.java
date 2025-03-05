package Jogo;

public class Principal {

    public static void main(String[] args) {
        FabricaMecanicaDoJogo fabricaMecanica = new FabricaMecanicaDoJogo();
        MecanicaDoJogo jogo = fabricaMecanica.criarMecanicaDoJogo();

        jogo.iniciarJogo();
        while (!jogo.jogoAcabou()) {
            jogo.jogarRodada();
        }
        jogo.mostrarResultado();
    }

}
