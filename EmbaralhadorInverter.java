package Jogo;

public class EmbaralhadorInverter implements Embaralhador {
    @Override
    public String embaralhar(String palavra) {
        return new StringBuilder(palavra).reverse().toString();
    }
}
