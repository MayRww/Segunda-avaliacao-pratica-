

// Demonstra a aplicacao do padrao Strategy em um sistema de
// processamento de risco financeiro.


import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        System.out.println(" SISTEMA DE PROCESSAMENTO DE RISCO \n");

        // Parâmetros financeiros compartilhados entre algoritmos
        Map<String, Double> parametros = new HashMap<>();
        parametros.put("volatilidade", 0.25);
        parametros.put("confianca", 0.99);
        parametros.put("juros", 12.5);

        // Criação do contexto
        ContextoRisco contexto = new ContextoRisco();

        // Estratégia 1: Value at Risk
        contexto.setEstrategia(new ValueAtRisk());
        contexto.processar(parametros);

        // Estratégia 2: Expected Shortfall
        contexto.setEstrategia(new ExpectedShortfall());
        contexto.processar(parametros);

        // Estratégia 3: Stress Testing
        contexto.setEstrategia(new StressTesting());
        contexto.processar(parametros);

        System.out.println("FIM DO PROCESSAMENTO");
    }
}
