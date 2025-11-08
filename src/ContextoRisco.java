
// Responsavel por armazenar a estrategia ativa e executar
// o calculo de acordo com o algoritmo selecionado.


import java.util.Map;

public class ContextoRisco {

    private RiscoStrategy estrategia;

    // Define a estrategia em tempo de execucaoo
    public void setEstrategia(RiscoStrategy estrategia) {
        this.estrategia = estrategia;
    }

    // Executa o calculo conforme a estrategia atual
    public void processar(Map<String, Double> parametros) {
        if (estrategia == null) {
            System.out.println("Nenhum algoritmo de risco foi selecionado.");
        } else {
            estrategia.calcular(parametros);
        }
    }
}
