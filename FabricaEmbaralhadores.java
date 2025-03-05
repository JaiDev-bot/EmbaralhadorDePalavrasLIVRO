package Jogo;

public class FabricaEmbaralhadores {
    public Embaralhador criarEmbaralhador(int tipo) {
        if (tipo == 1) {
            return new EmbaralhadorInverter();
        } else if (tipo == 2) {
            return new EmbaralhadorRandom();
        } else {
            return null; // Ou lançar uma exceção para tipo inválido
        }

    }

}