package Jogo;
import java.util.Random;
import java.util.Scanner;

public class MecanicaDoJogoPadrao implements MecanicaDoJogo {
        private BancoDePalavras bancoDePalavras;
        private FabricaEmbaralhadores fabricaEmbaralhadores;
        private Embaralhador embaralhador;
        private String palavraCorreta;
        private String palavraEmbaralhada;
        private int tentativas;
        private int pontuacao;
        private Scanner scanner;

    public MecanicaDoJogoPadrao() {
            bancoDePalavras = new BancoDePalavras();
            fabricaEmbaralhadores = new FabricaEmbaralhadores();
            scanner = new Scanner(System.in);
        }

        @Override
        public void iniciarJogo() {
            tentativas = 3;
            pontuacao = 0;
        }

        @Override
        public void jogarRodada() {
            palavraCorreta = bancoDePalavras.pegarPalavraAleatoria();
            embaralhador = fabricaEmbaralhadores.criarEmbaralhador(new Random().nextInt(2) + 1); // Escolhe embaralhador aleatório
            palavraEmbaralhada = embaralhador.embaralhar(palavraCorreta);

            System.out.println("Palavra embaralhada: " + palavraEmbaralhada);
            System.out.println("Tentativas restantes: " + tentativas);

            String tentativa = scanner.nextLine();

            if (tentativa.equalsIgnoreCase(palavraCorreta)) {
                System.out.println("Você acertou!");
                pontuacao++;
            } else {
                System.out.println("Você errou!");
                tentativas--;
            }
        }

        @Override
        public boolean jogoAcabou() {
            return tentativas == 0;
        }

        @Override
        public void mostrarResultado() {
            System.out.println("Pontuação final: " + pontuacao);
        }
}
