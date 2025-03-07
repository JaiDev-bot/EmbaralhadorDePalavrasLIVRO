package Jogo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class EmbaralhadorRandom implements Embaralhador {
    @Override
    public String embaralhar(String palavra) {
        List<Character> letras = new ArrayList<>();
        for (char c : palavra.toCharArray()) {
            letras.add(c);
        }
        Collections.shuffle(letras);
        StringBuilder embaralhada = new StringBuilder();
        for (char c : letras) {
            embaralhada.append(c);
        }
        return embaralhada.toString();
    }

}
