package Jogo;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class BancoDePalavras {
    private List<String> palavras;

    public BancoDePalavras() {
        palavras = new ArrayList<>();
        palavras.add("Anna Karenina");
        palavras.add("O pequeno principe");
        palavras.add("O idiota");
        palavras.add("Harry Potter");
        palavras.add("Os sete maridos de Evelyn hugo");
        palavras.add("A cor púrpura");
        palavras.add("estamos bem");
        palavras.add("O conde de monte cristo");
        palavras.add("Os miseráveis");
        palavras.add("Orgulho e preconceito");
        palavras.add("Drácula");

    }

    public String pegarPalavraAleatoria() {
        Random random = new Random();
        return palavras.get(random.nextInt(palavras.size()));
    }

}
